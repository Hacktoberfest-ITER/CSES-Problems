import 'dart:convert';
import 'dart:ui';

import 'package:flutter/material.dart';
import 'package:getwidget/getwidget.dart';
import 'package:hackodex/MarkdownView.dart';
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
  Future<List> data;
  List allData = [];
  List<String> contributors = [];
  String ml = '';
  bool showAll = false;
  bool onSearch = false;
  int totcont = 0;

  String mdContributing;
  @override
  void initState() {
    setState(() {
      data = _mainContributors();
    });
    super.initState();
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Container(
          child: buildGfSearchBar(),
          width: MediaQuery.of(context).size.width * 0.4,
        ),
        centerTitle: true,
        leadingWidth: MediaQuery.of(context).size.width * 0.2,
        leading: Container(
          padding: EdgeInsets.symmetric(horizontal: 2, vertical: 5),
          child: Wrap(
            alignment: WrapAlignment.center,
            crossAxisAlignment: WrapCrossAlignment.center,
            runAlignment: WrapAlignment.spaceEvenly,
            children: [
              GFAvatar(
                radius: 15,
                backgroundImage: AssetImage('assets/hackodex.png'),
              ),
              Text(
                'HACKODEX',
                style: TextStyle(
                    // fontSize: 10,
                    fontWeight: FontWeight.bold),
                overflow: TextOverflow.ellipsis,
                textAlign: TextAlign.center,
              )
            ],
          ),
        ),
        backgroundColor: Color(0xFF072540),
        automaticallyImplyLeading: false,
        actions: [
          Column(
            children: [
              Text(
                'Show Details  ',
                style: TextStyle(color: Colors.white),
              ),
              GFToggle(
                onChanged: (val) {
                  setState(() {
                    showAll = !showAll;
                  });
                },
                value: showAll,
                type: GFToggleType.android,
              ),
            ],
          ),
        ],
      ),
      body: Stack(
        children: [
          RotatedBox(
            quarterTurns: 1,
            child: Container(
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
                        color: Color(0xFF072541),
                        image: Image.network(
                          'https://github.com/Hackodex-ITER/Hackodex-ITER/blob/master/Hacktober.png?raw=true',
                          fit: BoxFit.scaleDown,
                          width: MediaQuery.of(context).size.width / 2,
                        ),
                      ),
                      InkWell(
                        onTap: () => Navigator.push(
                          context,
                          MaterialPageRoute(
                            builder: (context) =>
                                MarkdownViewer(mdContributing),
                          ),
                        ),
                        child: Center(
                          child: Text(
                            'Click here! to know how to CONRIBUTE in this repo',
                            textAlign: TextAlign.center,
                            style: TextStyle(
                                color: Color(0xFF072540),
                                fontStyle: FontStyle.italic,
                                fontWeight: FontWeight.bold),
                          ),
                        ),
                      ),
                      GFCard(
                        boxFit: BoxFit.fitHeight,
                        color: Color(0xFF072541),
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
                    'Click on card to see user profile\n',
                    overflow: TextOverflow.visible,
                    style: TextStyle(fontSize: 10),
                  ),
                  SingleChildScrollView(
                    child: Wrap(
                        // spacing: 8.0, // gap between adjacent chips
                        // runSpacing: 4.0, // gap between lines
                        direction: Axis.horizontal,
                        children: [
                          for (var item in allData) profileCard(item),
                        ]),
                  ),
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

  Widget buildGfSearchBar() {
    return GFSearchBar(
      searchBoxInputDecoration: InputDecoration(
          hintText: 'Your Name',
          hintStyle:
              TextStyle(fontWeight: FontWeight.w400, color: Colors.white54)),
      searchList: allData,
      searchQueryBuilder: (query, allData) {
        return allData
            .where((item) =>
                item['name'].toLowerCase().contains(query.toLowerCase()))
            .toList();
      },
      overlaySearchListItemBuilder: (item) {
        return Container(
          padding: const EdgeInsets.all(8),
          child: Text(
            item['name'],
            style: const TextStyle(fontSize: 18),
          ),
        );
      },
      onItemSelected: (item) {
        setState(() {
          openUrl('http://github.com/${item['login']}');
          print('${item['login']}');
        });
      },
    );
  }

  void openUrl(String url) async {
    if (await canLaunch(url)) {
      await launch(url, forceSafariVC: false);
    } else {
      throw 'Could not launch $url';
    }
  }

  Widget profileCard(var i) {
    return SizedBox(
      width: 250,
      child: InkWell(
        onTap: () => openUrl(i['html_url']),
        child: GFCard(
          boxFit: BoxFit.cover,
          borderRadius: BorderRadius.circular(20),
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
                      TextSpan(
                          text: '\n${i['login']}',
                          style: TextStyle(fontWeight: FontWeight.normal))
                    ]),
              ),
            ],
          ),
          buttonBar: !showAll
              ? GFButtonBar()
              : GFButtonBar(
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
                              if (snapshot.data['bio'] != null)
                                Text(
                                  'Bio: ${snapshot.data['bio'].trim()}',
                                  overflow: TextOverflow.ellipsis, maxLines: 2,
                                  textAlign: TextAlign.justify,
                                  // style: TextStyle(fontWeight: FontWeight.bold),
                                ),
                              Text('Followers: ${snapshot.data['followers']}'),
                              Text('Following: ${snapshot.data['following']}'),
                              Text(
                                  'PublicRepos: ${snapshot.data['public_repos']}'),
                            ],
                          );
                        } else
                          return GFLoader();
                      },
                    ),
                  ],
                ),
        ),
      ),
    );
  }

  Future<List> _mainContributors() async {
    final contributing =
        'https://raw.githubusercontent.com/Hackodex-ITER/CSES-Problems/master/CONTRIBUTING.md';
    var r = await http.get(contributing);
    if (r.statusCode == 200)
      setState(() {
        mdContributing = r.body;
      });

    final contriurl =
        'https://raw.githubusercontent.com/Hackodex-ITER/CSES-Problems/master/CONTRIBUTORS.md';
    var resp = await http.get(contriurl);
    // print(resp.statusCode);
    if (resp.statusCode == 200) {
      var pdata = resp.body;

      String s =
          pdata.toString().trim().split('### We have Completed 5 Problems')[1];
      contributors = s.split('> <img src="');
      setState(() {
        totcont = contributors.length;
      });
      for (var i = 1; i < contributors.length; i++) {
        // print(contributors[i]);
        if (contributors[i] == null) continue;
        var avtUrl =
            contributors[i].substring(0, contributors[i].indexOf("\""));
        var name = contributors[i].substring(
            contributors[i].indexOf("[") + 1, contributors[i].indexOf("]"));
        var x =
            contributors[i].split('https://github.com/')[1].toString().trim();
        var githubId = x.substring(0, x.length - 1);
        if (githubId.contains('/'))
          githubId = githubId.substring(0, githubId.length - 1);
        // print(githubId);
        var linkMap = ({
          'avatar_url': avtUrl,
          'name': name,
          'html_url': 'https://github.com/$githubId',
          'url': 'https://api.github.com/users/$githubId',
          'login': githubId
        });
        // print(linkMap.toString() + '\n\n');
        setState(() {
          allData.add(json.decode(json.encode(linkMap)));
        });
      }
      return allData;
    }
    return allData;
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
}
