import 'package:flutter/material.dart';
import 'package:hackodex/MyHomePage.dart';

void main() {
  runApp(MyApp());
}
// TODO: add md reader and use it for displaying contributing.md

class MyApp extends StatelessWidget {
  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'HACKODEX',
      debugShowCheckedModeBanner: false,
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      home: MyHomePage(title: 'HACKODEX'),
    );
  }
}
