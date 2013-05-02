
package applet_factorial;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Applet_factorial extends Applet implements ActionListener {

    
    Label titlenumero;
    Label titlefactorial;
    TextField txtnumero;
    TextField txtfactorial;
    Button btn;
    public Applet_factorial (){
        
        
        titlenumero = new Label ("Numero");
        btn = new Button ("Calcular");
        titlefactorial = new Label("Factorial");
        txtnumero = new TextField (10);
        txtfactorial = new TextField(10);
        
        
        
        add(titlenumero);
        add(txtnumero);
        add(btn);
        add(titlefactorial);
        add(txtfactorial);
        btn.addActionListener(this);
        
        
    }
    
    
    
    public void actionPerformed (ActionEvent e){
        
        int numero = Integer.parseInt(txtnumero.getText());
        int factorial=1;
        
        for (int cont=2;cont<=numero;cont++){
            
            
            factorial=factorial*cont;
            
            }
        
        
        txtfactorial.setText(""+factorial);
        
        
        
        
    }
    
    
    
    
}
