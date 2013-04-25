
package applet_ecuacioncuadratica;


import java.awt.*;
import java.awt.event.*;
import java.lang.Math.*;
import java.applet.*;

public class Applet_EcuacionCuadratica extends Applet implements ActionListener {

      Label a;
      Label b;
      Label c;
      Label ra1;
      Label ra2;
      TextField c1;
      TextField c2;
      TextField c3;
      TextField c4;
      TextField c5;
      Button resultado;
    
    
    public Applet_EcuacionCuadratica (){
        
        
        a=new Label ("a");
        b=new Label ("b");
        c=new Label ("c");
        ra1=new Label ("Raiz 1");
        ra2=new Label ("Raiz 2");
        c1=new TextField (5);
        c2=new TextField (5);
        c3=new TextField (5);
        c4=new TextField (5);
        c5=new TextField (5);
        resultado = new Button ("Calcular");
        c4.setEditable(false);
        c5.setEditable(false);
        
        
        add(a);
        add(c1);
        add(b);
        add(c2);
        add(c);
        add(c3);
        add(resultado);
        add(ra1);
        add(c4);
        add(ra2);
        add(c5);
        
        resultado.addActionListener(this);
        
        
    }
    
    
    
    public void actionPerformed (ActionEvent e){
        
        
        // alias
        
        double a_a=Double.parseDouble(c1.getText());
        double b_b=Double.parseDouble(c2.getText());
        double c_c=Double.parseDouble(c3.getText());
    
      double ara1,ara2,rai;

        rai = Math.pow(b_b,2.0)-(4*a_a*c_c);
        ara1 = (-b_b + Math.sqrt(rai))/(2*a_a);
        ara2 = (-b_b - Math.sqrt(rai))/(2*a_a);
        
        c4.setText(""+ara1);
        c5.setText(""+ara2);
     
    }
    
 
}
