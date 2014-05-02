package htmlwithswing;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class HTMLSwing extends JFrame {

   private static  String HTML_HEAD_STYLE = 
      "<head> <style>" 
    + "p { color:red; }"
    + "sup { color:yellow; }" 
    + "</style> </head>";

   //  <link href="./jbutton.css" rel="stylesheet" type="text/css">
   
   public HTMLSwing() {
     setSize(300, 200);
     setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
     getContentPane().setLayout(new GridLayout(1, 3));
     getContentPane().add(new JButton("<html>" +
       HTML_HEAD_STYLE+       // especifica la hoja de estilo
       "<h1>1<sup>st</sup></h1>" +
       "<hr> <p> Use Blue</p></html>"));

     getContentPane().add(new JButton( "<html>" +
     HTML_HEAD_STYLE+
       "<h1>2<sup>nd</sup></h1>" +
       "<hr> <p>Use <b>Red</b></p></html>"));

     getContentPane().add(new JButton(
       "<html><h1>3<sup>rd</sup></h1><hr>" +
       "<p color=green> Use <u>Green</u></p></html>"));
   }

   public static void main(String[] args) {
     new HTMLSwing().setVisible(true);
   }
}
