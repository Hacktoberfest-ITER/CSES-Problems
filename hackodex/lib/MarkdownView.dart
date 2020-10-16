import 'package:flutter/material.dart';
import 'package:flutter_markdown/flutter_markdown.dart';
import 'package:getwidget/components/avatar/gf_avatar.dart';
import 'package:url_launcher/url_launcher.dart';

class MarkdownViewer extends StatefulWidget {
  final data;

  MarkdownViewer(this.data);
  @override
  _MarkdownViewerState createState() => _MarkdownViewerState();
}

class _MarkdownViewerState extends State<MarkdownViewer> {
  ScrollController controller;

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        actions: [
          InkWell(
              onTap: () => Navigator.pop(context),
              child: Container(
                  padding: EdgeInsets.all(10), child: Icon(Icons.close))),
        ],
        title: Text('Contribute'),
        centerTitle: true,
        leadingWidth: MediaQuery.of(context).size.width * 0.8,
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
        automaticallyImplyLeading: true,
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
          SingleChildScrollView(
            child: Container(
                child: Markdown(
              selectable: true,
              controller: controller,
              onTapLink: (href) => openUrl(href),
              padding: EdgeInsets.all(20),
              shrinkWrap: true,
              data: widget.data,
            )),
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
}
