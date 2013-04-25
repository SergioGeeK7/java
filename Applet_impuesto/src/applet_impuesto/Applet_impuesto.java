
package applet_impuesto;
import javax.swing.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Applet_impuesto extends Applet implements ActionListener {

    Label t1;
    Label t2;
    TextField txt1;
    TextField txt2;
    Button btn;
    public Applet_impuesto (){
        
        t1= new Label("Precio Articulo");
        t2= new Label("Impuesto a pagar");
        txt1 = new TextField(10);
        txt2 = new TextField(10);
        btn= new Button("Calcular");
        
        add(t1);
        add(txt1);
        add(btn);
        add(t2);
        add(txt2);
        
        btn.addActionListener(this);
        
        
        
    }
    
    
    
    
    
    
  
    public void actionPerformed(ActionEvent e) {
      
        
        
     //   double valor;
        
      //  valor=Double.parseDouble(txt1.getText());
        
      int valor=Integer.parseInt(txt1.getText());
        
        if (valor>=25000){
            
            valor=(15*valor/100)+valor;
             valor=15*valor/100;
        }else if (valor>=10000 && valor<25000){
            
          //  valor=(10*valor/100)+valor;
            valor=10*valor/100;
        }else {
            
           // valor=(5*valor/100) + valor;
             valor=5*valor/100;
        }
        
        txt2.setText(""+valor);
        
        
    }
    
    
    
    
   
}
