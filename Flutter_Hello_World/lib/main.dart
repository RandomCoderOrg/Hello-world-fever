import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    // Material App
    return MaterialApp(

      // Scaffold Widget
        home: Scaffold(
          appBar: AppBar(
            // AppBar takes a Text Widget
            // in it's title parameter
            title: const Text('Flutter'),
          ),
          body:  Center(child: Text('Hello World!',
          style: TextStyle(fontSize: 50,fontWeight: FontWeight.bold,
          foreground: Paint()
              ..style = PaintingStyle.stroke
              ..strokeWidth = 3
              ..color = Colors.indigo[400]!,

          ),)),
        ));
  }
}
