
package barraherramientas;

import java.awt.*;
import javax.swing.*;
public class Barraherramientas extends JFrame {

    
    public Barraherramientas (){
        
        
        super ("barra de herramientas");
        setSize(500,250);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        // creando menus
        
        
        JMenuItem mu1 = new JMenuItem ("hola");
        JMenuItem mu2 = new JMenuItem ("hola 2");
        JMenuItem mu3 = new JMenuItem ("hola 3");
        JMenuItem mu4 = new JMenuItem ("hola 4");
        
        
        
        
        JMenu m1 = new JMenu ("Metallica");
        m1.add(mu1);
        JMenu m2 = new JMenu ("Iron Maiden");
        m2.add(mu2);
        JMenu m3= new JMenu ("Slayer");
        m3.add(mu3);
        JMenu m4= new JMenu ("Black Eyed Peas");
        m4.add(mu4);
        
        
        JMenuBar menu = new JMenuBar ();
        
        menu.add(m1);
        menu.add(m2);
        menu.add(m3);
        menu.add(m4);
        
        
        JTextField text = new JTextField (10);
        JTextArea text2 = new JTextArea (10,40);
        JScrollPane scroll = new JScrollPane (text2);
        
        JCheckBox chek = new JCheckBox ("hola",true);
        
        
        
        JRadioButton chekra = new JRadioButton ("tr",true);
        
        
        
        JComboBox mark = new JComboBox ();
        
        mark.addItem("maria");
        
        
        
        
        
        BorderLayout diseño = new BorderLayout ();
        setLayout (diseño);
        add("North",menu);
      //  add("West",scroll);
        pack();
        setVisible(true);
        
        
        
        
        
        
        
    }
   
    public static void main(String[] args) {
       
        Barraherramientas bartool = new Barraherramientas ();
        
    }
}
