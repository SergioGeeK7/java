
package applet_convercion;




import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Applet_convercion extends Applet implements ActionListener {         

   Label t1;
   Label t2;
   TextField c1;
   TextField c2;
   Button resultado; 
    
    public Applet_convercion (){
        
        
        t1 = new Label("Centigrados");
        t2 = new Label("Farenheit");
        c1 = new TextField(5);
        c2 = new TextField(5);
        c2.setEditable(false);
        resultado = new Button ("Calcular");
        
        add(t1);
        add(c1);
        add(t2);
        add(c2);
        add(resultado);
        resultado.addActionListener(this);
        
        
        
    }
    
    
    public void actionPerformed (ActionEvent e){
        
        
        double c = Double.parseDouble(c1.getText());
        double f=c*9/5 + 32;
        
        
        c2.setText(""+f);
         
        
    }
    
   
}

