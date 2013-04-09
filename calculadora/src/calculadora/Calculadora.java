
package calculadora;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Calculadora extends JFrame implements FocusListener {
    JLabel sumar = new JLabel ("Sumar ");
    JTextField c1 = new JTextField ("0",5);
    JTextField c2 = new JTextField ("0",5);
    JLabel mas = new JLabel (" + ");
    JLabel igual = new JLabel (" = ");
    JTextField resultado = new JTextField (10) ;
    
    
    
    
    
    public Calculadora (){
        
    super ("Calculadora");
    setSize(500,300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    c1.addFocusListener(this);
    c2.addFocusListener(this);
    resultado.setEditable(false);// hace no editable al jtextfield
    
    FlowLayout diseñador = new FlowLayout ();
    setLayout(diseñador);
    
    add(sumar);
    add(c1);
    add(mas);
    add(c2);
    add(igual);
    add(resultado);
    pack();
    setVisible(true);
         
        
    }
    
    
    
    public void focusGained (FocusEvent even){
        
        try{      // INTENTARA HACER ALGO.. SI NO ES POSIBLE IRA POR EL CATCH ... PERO SIN MANDAR ERROR. lol
//convertimos valores campos de String a numeros y los sumamos
float total=Float.parseFloat(c1.getText())      +        Float.parseFloat(c2.getText());  // CONVERTIRA LO QUE HAY EN EL CAMPO C1 Y C2 EN NUMEROS Y LOS SUMARA.

//añadimos el resultado al campo resultado
resultado.setText("" +total);
} catch(NumberFormatException nfe){
        
        c1.setText("0");
        c2.setText("0");
        resultado.setText("0");
        
    }
    
    }
    
    public void focusLost (FocusEvent even){
        
     focusGained(even);
        
    }
    
    
    
   
    public static void main(String[] args) {
       
        
        
        Calculadora sum = new Calculadora ();
        
        
        
        
        
    }
}
