
package paneles;
import java.awt.*;
import javax.swing.*;

public class Paneles extends JFrame {

    
    public Paneles () {
        
        super("nombre de mi panel");
        setSize(500,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
     
        
        JPanel p1 = new JPanel ();
        
        
      
        BoxLayout box =new BoxLayout(p1,BoxLayout.X_AXIS);
        p1.setLayout(box);
      
        
        JButton b1=new JButton ("Pulsa aqui");
        JButton b2=new JButton ("Pulsa aqui");
        JButton b3=new JButton ("Pulsa aqui");
        JButton b4=new JButton ("Pulsa aqui");
          
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
        
        // Crear panel inferior
        
        
        JPanel p2 = new JPanel ();
        JTextArea txt = new JTextArea(4,70);
        JScrollPane scroll = new JScrollPane (txt);
        
        FlowLayout diseñador = new FlowLayout();
        setLayout(diseñador);
        
        //añadir paneles al marco... en este caso a "Paneles" constructor
        
        add(p1);
        add(scroll);
        
        
        
          setVisible(true);
    }
    
    
    
    
 
    public static void main(String[] args) {
       Paneles p = new Paneles ();
    }
}
