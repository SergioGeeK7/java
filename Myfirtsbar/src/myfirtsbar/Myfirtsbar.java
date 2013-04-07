
package myfirtsbar;
import java.awt.*;
import javax.swing.*;

public class Myfirtsbar extends JFrame{

    public Myfirtsbar () {
    
    super("My firts bar");
    setSize(500,400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    
    
    // objetos de las imagenes
    
    ImageIcon image1= new ImageIcon ("nombree.gif");
   
    
    JButton boton = new JButton ("boton",image1);
    
    JToolBar barrah = new JToolBar ();
    
    barrah.add(boton);
    
    JTextArea text = new JTextArea (10,60);
    JScrollPane scroll = new JScrollPane (text);
    
    BorderLayout diseño = new BorderLayout();
    setLayout(diseño);
    
    add("North",barrah);
    add("Center",scroll);
    pack();
    setVisible(true);
    
    
}
   
    public static void main(String[] args) {
       
  
        Myfirtsbar mbar = new Myfirtsbar ();
        
        
    }
}
