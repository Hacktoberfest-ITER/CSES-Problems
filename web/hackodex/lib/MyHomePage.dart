import 'dart:convert';

import 'package:flutter/material.dart';
import 'package:getwidget/getwidget.dart';
import 'package:html/parser.dart';
import 'package:http/http.dart' as http;
import 'package:url_launcher/url_launcher.dart';

class MyHomePage extends StatefulWidget {
  MyHomePage({Key key, this.title}) : super(key: key);

  final String title;

  @override
  _MyHomePageState createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {
  List data = [];
  List<String> contributors = [];
  String ml = '';

  @override
  void initState() {
    _mainContributors();
    // getData();
    super.initState();
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text(widget.title),
      ),
      body: Center(
        child: SingleChildScrollView(
          child: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: <Widget>[
              Text(
                'All Contributors of Hackodex - CSES Problems',
                overflow: TextOverflow.visible,
                style: TextStyle(fontSize: 20),
              ),
              FutureBuilder(
                future: _getData(),
                builder: (BuildContext context, AsyncSnapshot snapshot) {
                  if (snapshot.data != null) {
                    return Container(
                      height: MediaQuery.of(context).size.height,
                      color: Color(0xfffF7F7F7),
                      child: SingleChildScrollView(
                        child: Wrap(
                          spacing: 8.0, // gap between adjacent chips
                          runSpacing: 4.0, // gap between lines
                          direction: Axis.horizontal,
                          children: snapshot.data
                              .map((item) => profileCard(item))
                              .toList()
                              .cast<Widget>(),
                        ),
                      ),
                    );
                  } else {
                    return Container(
                      child: Center(
                        child: GFLoader(
                          type: GFLoaderType.circle,
                          size: 100,
                        ),
                      ),
                    );
                  }
                },
              ),
            ],
          ),
        ),
      ),
    );
  }

  Widget profileCard(var i) {
    return SizedBox(
      // height: 150,
      width: 250,
      child: InkWell(
        onDoubleTap: () async {
          if (await canLaunch(i['url'])) {
            await launch(i['url']);
          } else {
            throw 'Could not launch ${i['url']}';
          }
        },
        child: GFCard(
          boxFit: BoxFit.cover,
          padding: EdgeInsets.all(10),
          elevation: 5,
          gradient:
              LinearGradient(colors: [Colors.deepPurple[200], Colors.white30]),
          content: Column(
            children: [
              GFAvatar(
                backgroundImage: NetworkImage(i['avatar_url']),
                radius: 45,
              ),
              RichText(
                softWrap: true,
                textAlign: TextAlign.center,
                text: TextSpan(
                    text: i['name'],
                    style: TextStyle(
                      color: Colors.black,
                      fontWeight: FontWeight.bold,
                    ),
                    children: [
                      TextSpan(text: '\nContributions:  ${i['contributions']}'),
                      TextSpan(
                          text: ml.contains(i['github_id'])
                              ? '\nCompleted 5 PRs 🌟!'
                              : ''),
                    ]),
              ),
            ],
          ),
          buttonBar: GFButtonBar(
            alignment: WrapAlignment.spaceEvenly,
            crossAxisAlignment: WrapCrossAlignment.start,
            spacing: 5,
            children: <Widget>[
              Text('Followers: ${i['followers']}'),
              Text('Following: ${i['following']}'),
              Text('PublicRepos: ${i['public_repos']}'),
            ],
          ),
        ),
      ),
    );
  }

  Future<List> _getData() async {
    Map<String, dynamic> linkMap;
    List allData = [];
    final mainurl = 'https://api.github.com/repos/Hackodex-ITER/CSES-Problems';
    var resp = await http.get(mainurl + '/contributors');
    // print(resp.statusCode);
    if (resp.statusCode == 200) {
      var jsonData = json.decode(resp.body);
      for (var item in jsonData) {
        data.add(item);
        var response = await http.get(item['url']);
        if (response.statusCode == 200) {
          var jd = json.decode(response.body);
          linkMap = ({
            'contributions': item['contributions'],
            'name': jd['name'],
            'github_id': jd['login'],
            'avatar_url': jd['avatar_url'],
            'public_repos': jd['public_repos'],
            'public_gists': jd['public_gists'],
            'followers': jd['followers'],
            'following': jd['following'],
            'bio': jd['bio'],
            'url': jd['html_url']
          });
          allData.add(json.decode(json.encode(linkMap)));
        }
      }
      // for (var item in linkMap) {
      //   allData.add(json.encode(item));
      // }
      // debugPrint(allData[0]);
      return allData;
    }
  }

  Future<void> _mainContributors() async {
    String names = '';
    final contriurl =
        'https://raw.githubusercontent.com/Hackodex-ITER/CSES-Problems/master/CONTRIBUTORS.md';
    var resp = await http.get(contriurl);
    // print(resp.statusCode);
    if (resp.statusCode == 200) {
      var pdata = resp.body;
      String s =
          pdata.toString().trim().split('### We have Completed 5 Problems')[1];
      // print(s.split('> <img'));
      contributors = s.split('https://github.com/');
      for (var i = 1; i < contributors.length; i++) {
        contributors[i] = contributors[i].split(')')[0];
        if (contributors[i].contains('/'))
          contributors[i] =
              contributors[i].substring(0, contributors[i].length - 1);
        setState(() {
          names += contributors[i] + ',';
        });
      }
    }
    setState(() {
      ml = names;
    });
    print('Main Contributors Fetched!');
    // print(ml.contains('KejariwalAyush'));
    // return ml;
  }
}

// Widget listWidget() {
//   return FutureBuilder(
//     future: getData(),
//     builder: (context, snapshot) {
//       if (snapshot.connectionState == ConnectionState.none &&
//           snapshot.hasData == null) return Container();
//       return ListView.builder(
//         itemCount: snapshot.data.length,
//         itemBuilder: (context, index) {
//           return profileCard(index);
//         },
//         shrinkWrap: true,
//         scrollDirection: Axis.horizontal,
//       );
//     },
//   );
// }
