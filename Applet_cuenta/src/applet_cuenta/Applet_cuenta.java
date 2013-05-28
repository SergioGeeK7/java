
package applet_cuenta;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;


public class Applet_cuenta extends Applet implements ActionListener {

  
    Label num;
    Label nom;
    Label sal;
    Button btn;
    TextField txt1,txt2,txt3;
    TextArea txta1;
   
    
    public Applet_cuenta () {
    
    
    
    num= new Label ("Numero de la cuenta");
    nom= new Label ("Nombre del cliente");
    sal= new Label ("Saldo de la cuenta");
    
    txt1 = new TextField(15);
    txt2 = new TextField(15);
    txt3 = new TextField(15);
    
    btn= new Button ("Despliega");
    txta1 = new TextArea (10,40);
    txta1.setEnabled(false);
    
    add(num);
    add(txt1);
    add(nom);
    add(txt2);
    add(sal);
    add(txt3);
    add(btn);
    add(txta1);
    
    btn.addActionListener(this);
    
    
    
    
}
    
    
    
    public void actionPerformed (ActionEvent ev){
        
        
        if (txt1.getText().length() == 0 && txt2.getText().length() == 0 && txt3.getText().length() == 0  ){
            
              
         Cuenta cn = new Cuenta();
            txta1.setText(cn.nombredecuenta() +"          "+cn.numerodecuenta()+"         "+cn.saldodecuenta() );
            
        }else{
            int numero=Integer.parseInt(txt1.getText());
        String nombre=txt2.getText();
        double saldo = Double.parseDouble(txt3.getText());
        
        
        Cuenta cn = new Cuenta(nombre,numero,saldo);
        
        
        txta1.setText(cn.nombredecuenta() +"          "+cn.numerodecuenta()+"         "+cn.saldodecuenta() );
            
            
           
        }
        
        
        
      
        
    }
    
    
    public static void arr(){
        
    }
    
    
    public static void arr(int a){
        
    }
    
    
    
    
}
