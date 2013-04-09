
package barra2gui;



import java.awt.*;
import javax.swing.*;
public class Barra2GUI extends JFrame {
    
    
    public Barra2GUI () {
    
        super ("barra herramientas");
        setSize(500,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        ImageIcon nn = new ImageIcon ("kratos.gif");
        
        
        JButton j1 = new JButton ("Ejecutar",nn);
        JButton j2 = new JButton ("Parar");
        JButton j3= new JButton ("Salir");
        
        JToolBar tool = new JToolBar ();
        
        tool.add(j1);
        tool.add(j2);
        tool.add(j3);
        
        
        JTextArea text = new JTextArea (10,40);
        JScrollPane scroll = new JScrollPane (text);
        
        
        BorderLayout diseño = new BorderLayout ();
        setLayout(diseño);
        
        add("North",tool);
        add("South",scroll);
        pack();
        setVisible(true);
        
        
}

    
    public static void main(String[] args) {
        
       
        Barra2GUI m = new Barra2GUI ();
        
        
    }
}
