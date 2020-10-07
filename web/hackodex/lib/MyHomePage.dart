import 'dart:convert';

import 'package:flutter/material.dart';
import 'package:getwidget/getwidget.dart';
import 'package:html/parser.dart';
import 'package:http/http.dart' as http;

class MyHomePage extends StatefulWidget {
  MyHomePage({Key key, this.title}) : super(key: key);

  final String title;

  @override
  _MyHomePageState createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {
  List data = [];

  // @override
  // void initState() {
  //   // getData();
  //   super.initState();
  // }

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
                'You have pushed the button this many times:',
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
                        child: Text("Loading"),
                      ),
                    );
                  }
                },
              ),
            ],
          ),
        ),
      ),
      floatingActionButton: FloatingActionButton(
        onPressed: () {
          print('Pressed');
          _getData();
        },
        tooltip: 'Increment',
        child: Icon(Icons.add),
      ), // This trailing comma makes auto-formatting nicer for build methods.
    );
  }

  Widget profileCard(var i) {
    return SizedBox(
      // height: 150,
      width: 300,
      child: GFCard(
        boxFit: BoxFit.cover,
        padding: EdgeInsets.all(10),
        elevation: 5,
        titlePosition: GFPosition.start,
        title: GFListTile(
          avatar: GFAvatar(
            backgroundImage: NetworkImage(i['avatar_url']),
          ),
          titleText: i['login'],
          subtitleText: 'Contributions:  ${i['contributions']}',
        ),
        // content:
        //     Text("Some quick example text to build on the card"),
        // buttonBar: GFButtonBar(
        //   children: <Widget>[
        //     GFAvatar(
        //       backgroundColor: GFColors.PRIMARY,
        //       child: Icon(
        //         Icons.share,
        //         color: Colors.white,
        //       ),
        //     ),
        //     GFAvatar(
        //       backgroundColor: GFColors.SECONDARY,
        //       child: Icon(
        //         Icons.search,
        //         color: Colors.white,
        //       ),
        //     ),
        //     GFAvatar(
        //       backgroundColor: GFColors.SUCCESS,
        //       child: Icon(
        //         Icons.phone,
        //         color: Colors.white,
        //       ),
        //     ),
        //   ],
        // ),
      ),
    );
  }

  Future<List> _getData() async {
    final mainurl = 'https://api.github.com/repos/Hackodex-ITER/CSES-Problems';
    var resp = await http.get(mainurl + '/contributors');
    print(mainurl + '/contributors');
    print(resp.statusCode);
    if (resp.statusCode == 200) {
      var jsonData = json.decode(resp.body);
      for (var item in jsonData) {
        data.add(item);
      }
    }
    return data;
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
