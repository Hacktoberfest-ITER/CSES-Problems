import 'dart:convert';
import 'dart:ui';

import 'package:flutter/material.dart';
import 'package:getwidget/getwidget.dart';
import 'package:http/http.dart' as http;
import 'package:line_awesome_icons/line_awesome_icons.dart';
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
  bool showAll = false;
  int totcont = 0;

  @override
  void initState() {
    _mainContributors();
    super.initState();
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text(widget.title),
        leading: GFAvatar(
          radius: 15,
          backgroundImage: AssetImage('assets/hackodex.png'),
        ),
        actions: [
          Row(
            children: [
              Text(
                'Show All  ',
                style: TextStyle(color: Colors.white),
              ),
              GFToggle(
                onChanged: (val) {
                  setState(() {
                    showAll = !showAll;
                  });
                },
                value: showAll,
                type: GFToggleType.square,
              ),
            ],
          )
        ],
        backgroundColor: Color(0xFF072540),
        automaticallyImplyLeading: false,
      ),
      body: Stack(
        children: [
          RotatedBox(
            quarterTurns: 1,
            child: Container(
              // color: Color(0xFF93C2DB),
              decoration: BoxDecoration(
                  gradient: LinearGradient(
                      colors: [Color(0xFFFF8AE2), Color(0xFF93C2DB)],
                      tileMode: TileMode.mirror)),
            ),
          ),
          Center(
            child: SingleChildScrollView(
              child: Column(
                mainAxisAlignment: MainAxisAlignment.start,
                children: <Widget>[
                  Wrap(
                    direction: Axis.horizontal,
                    children: [
                      GFCard(
                        borderRadius: BorderRadius.circular(20),
                        borderOnForeground: true,
                        // boxFit: BoxFit.fill,
                        // height: MediaQuery.of(context).size.width / 2,
                        color: Color(0xFF072541),
                        image: Image.network(
                          'https://github.com/Hackodex-ITER/Hackodex-ITER/blob/master/Hacktober.png?raw=true',
                          fit: BoxFit.scaleDown,
                          width: MediaQuery.of(context).size.width / 2,
                        ),
                      ),
                      GFCard(
                        boxFit: BoxFit.fitHeight,
                        color: Color(0xFF072541),
                        // gradient: Gradient(color: [Color(0xFF072541)]),
                        borderOnForeground: true,
                        borderRadius: BorderRadius.circular(20),
                        elevation: 50,
                        title: GFListTile(
                          title: Text(
                            'About Us:',
                            style: TextStyle(color: Colors.white),
                          ),
                        ),
                        content: Text(
                          "We Code We Explore !\nThe only coding club of ITER, SOA University.",
                          textAlign: TextAlign.center,
                          style: TextStyle(color: Colors.white),
                        ),
                        buttonBar: GFButtonBar(
                          direction: Axis.horizontal,
                          //  alignment: MainAxisAlignment.spaceEvenly,

                          children: <Widget>[
                            GFButton(
                              onPressed: () =>
                                  openUrl('https://github.com/codex-iter'),
                              text: 'GitHub',
                              icon: Icon(LineAwesomeIcons.github),
                            ),
                            GFButton(
                              onPressed: () => openUrl(
                                  'https://www.youtube.com/channel/UCu1S3gm2ODknxDlkpPX2RrA'),
                              text: 'YouTube',
                              icon: Icon(LineAwesomeIcons.youtube),
                            ),
                            GFButton(
                              onPressed: () => openUrl(
                                  'https://www.instagram.com/codexiter/'),
                              text: 'Instagram',
                              icon: Icon(LineAwesomeIcons.instagram),
                            ),
                            GFButton(
                              onPressed: () => openUrl(
                                  'https://www.linkedin.com/company/codexiter/'),
                              text: 'LinkedIn',
                              icon: Icon(LineAwesomeIcons.linkedin),
                            ),
                            GFButton(
                              onPressed: () => openUrl(
                                  'https://www.facebook.com/codexiter/'),
                              text: 'Facebook',
                              icon: Icon(LineAwesomeIcons.facebook),
                            ),
                          ],
                        ),
                      ),
                    ],
                  ),
                  Text(
                    showAll
                        ? 'All Contributors of Hackodex - CSES Problems'
                        : 'Contributors Who have Completed 5 PRs',
                    overflow: TextOverflow.visible,
                    textAlign: TextAlign.center,
                  ),
                  Text(
                    showAll
                        ? 'Total Contributors: $totcont'
                        : 'Contributors: ${contributors.length}',
                    overflow: TextOverflow.visible,
                    style: TextStyle(fontSize: 25),
                  ),
                  Text(
                    'Double click to see user profile\n',
                    overflow: TextOverflow.visible,
                    style: TextStyle(fontSize: 10),
                  ),
                  buildFutureBuilder(),
                  SizedBox(
                    height: 20,
                  ),
                  Text(
                    'THANKS FOR VISITING! 😁😎\nMADE WITH LOVE FOR HACKTOBERFEST BY Ayush Kejariwal💖✌',
                    textAlign: TextAlign.center,
                  ),
                  SizedBox(
                    height: 10,
                  ),
                ],
              ),
            ),
          ),
        ],
      ),
    );
  }

  void openUrl(String url) async {
    if (await canLaunch(url)) {
      await launch(url, forceSafariVC: false);
    } else {
      throw 'Could not launch $url';
    }
  }

  FutureBuilder<List> buildFutureBuilder() {
    return FutureBuilder(
      future: _getData(),
      builder: (BuildContext context, AsyncSnapshot snapshot) {
        if (snapshot.data != null) {
          return SingleChildScrollView(
            child: Wrap(
              // spacing: 8.0, // gap between adjacent chips
              // runSpacing: 4.0, // gap between lines
              direction: Axis.horizontal,
              children: snapshot.data
                  .map((item) => !showAll
                      ? ml.contains(item['login'])
                          ? profileCard(item)
                          : SizedBox()
                      : profileCard(item))
                  .toList()
                  .cast<Widget>(),
            ),
          );
        } else {
          return Container(
            child: Center(
              child: GFLoader(
                size: 100,
              ),
            ),
          );
        }
      },
    );
  }

  Widget profileCard(var i) {
    return SizedBox(
      width: 250,
      //   child: ExpansionTile(
      //     title: i['login'],
      //     leading: GFAvatar(
      //       backgroundImage: NetworkImage(i['avatar_url']),
      //       radius: 45,
      //     ),
      //     childrenPadding: EdgeInsets.all(10),
      //     subtitle: Text('Contributions:  ${i['contributions']}'),
      //     trailing: ml.contains(i['login'])
      //         ? Icon(
      //             Icons.star,
      //             color: Colors.orangeAccent,
      //           )
      //         : SizedBox(),
      //     initiallyExpanded: false,
      //     // onExpansionChanged: (value) {
      //     //   profileData = getProfile(i['url']);
      //     // },
      //     children: [
      //       FutureBuilder(
      //         future: getProfile(i['url']),
      //         builder: (BuildContext context, AsyncSnapshot snapshot) {
      //           if (snapshot.data != null) {
      //             return InkWell(
      //               onTap: () => openUrl(snapshot.data['url']),
      //               child: Container(
      //                 child: Wrap(
      //                   alignment: WrapAlignment.spaceEvenly,
      //                   children: [
      //                     Text('Name: ${snapshot.data['name']}'),
      //                     Text('Followers: ${snapshot.data['followers']}'),
      //                     Text('Following: ${snapshot.data['following']}'),
      //                     Text('PublicRepos: ${snapshot.data['public_repos']}'),
      //                   ],
      //                 ),
      //               ),
      //             );
      //           } else {
      //             return Container(
      //               child: Center(
      //                 child: GFLoader(
      //                   size: 30,
      //                 ),
      //               ),
      //             );
      //           }
      //         },
      //       ),
      //     ],
      //   ),
      // );
      child: InkWell(
        onDoubleTap: () => openUrl(i['html_url']),
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
                    text: i['login'],
                    style: TextStyle(
                      color: Colors.black,
                      fontWeight: FontWeight.bold,
                    ),
                    children: [
                      TextSpan(text: '\nContributions:  ${i['contributions']}'),
                      TextSpan(
                          text: ml.contains(i['login'])
                              ? '\nCompleted 5 PRs 🌟!'
                              : '\n'),
                    ]),
              ),
            ],
          ),
          buttonBar: GFButtonBar(
            alignment: WrapAlignment.spaceEvenly,
            crossAxisAlignment: WrapCrossAlignment.start,
            spacing: 5,
            children: <Widget>[
              FutureBuilder(
                future: getProfile(i['url']),
                builder: (context, snapshot) {
                  if (snapshot.hasData) {
                    return Column(
                      children: [
                        Text('Followers: ${snapshot.data['followers']}'),
                        Text('Following: ${snapshot.data['following']}'),
                        Text('PublicRepos: ${snapshot.data['public_repos']}'),
                      ],
                    );
                  } else
                    return GFLoader(
                      type: GFLoaderType.custom,
                      loaderIconOne: Text('Please'),
                      loaderIconTwo: Text('Wait'),
                      loaderIconThree: Text('a moment'),
                    );
                },
              ),
              // Text('Followers: ${i['followers']}'),
              // Text('Following: ${i['following']}'),
              // Text('PublicRepos: ${i['public_repos']}'),
            ],
          ),
        ),
      ),
    );
  }

  Future<List> _getData() async {
    Map<String, dynamic> linkMap;

    List allData = [];
    data = [];
    final mainurl = 'https://api.github.com/repos/Hackodex-ITER/CSES-Problems';
    var resp = await http.get(mainurl + '/contributors');
    // print(resp.statusCode);
    if (resp.statusCode == 200) {
      var jsonData = json.decode(resp.body);
      setState(() {
        totcont = jsonData.toString().split('},').length;
      });
      for (var item in jsonData) {
        data.add(item);
        // await getProfile(item, linkMap, allData);
      }

      return data;
    }
    return data;
  }

  Future getProfile(String url) async {
    var response = await http.get(url);
    if (response.statusCode == 200) {
      var jd = json.decode(response.body);
      var linkMap = ({
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
      return (json.decode(json.encode(linkMap)));
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
  }
}
