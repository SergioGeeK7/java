
package applet_calculadora;

import java.awt.*;
import java.applet.*;

public class Applet_calculadora extends Applet {

    Panel p1;
    Button b1, b2, b3, b4, b5 ,b6,b7,b8,b9,b11,b22,b33,b44,b55,b66,b77,b88,b99;
  
    TextArea calcula;
    
    public Applet_calculadora (){
        
        setLayout(new BorderLayout());
        calcula = new TextArea(1,1);
        p1 = new Panel(new GridLayout(6,3,5,5));
        
        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");
        b11 = new Button(".");
        b22 = new Button("0");
        b33 = new Button("CE");
        b44 = new Button("+");
        b55 = new Button("-");
        b66 = new Button("=");
        b77 = new Button("*");
        b88 = new Button("/");
        b99 = new Button("C");
      
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
        p1.add(b5);
        p1.add(b6);
        p1.add(b7);
        p1.add(b8);
        p1.add(b9);
        p1.add(b11);
        p1.add(b22);
        p1.add(b33);
        p1.add(b44);
        p1.add(b55);
        p1.add(b66);
        p1.add(b77);
        p1.add(b88);
        p1.add(b99);
        
       
        add(calcula, BorderLayout.NORTH);
        add(p1, BorderLayout.SOUTH);
        
        
        
        
        
        
    }
    
    
    
}
