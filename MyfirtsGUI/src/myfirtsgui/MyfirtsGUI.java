
package myfirtsgui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyfirtsGUI extends JFrame implements ActionListener {  // extends JFrame para interfaz y actionlistener para eventos (en el metodo)

  JButton b1=new JButton("Pulsa aqui para sumar");
  JButton b2=new JButton("Pulsa aqui para restar");
  JTextField txt = new JTextField (5);
    
    //constructor
    public MyfirtsGUI (){
        
            super ("My Primer GUI" );
            setSize(500,300);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            JLabel titulo = new JLabel ("Programing");
            b1.addActionListener(this);
            b2.addActionListener(this);
            
            setLayout(new FlowLayout());
            add(titulo);
            add(b1);
            add(b2);
            add(txt);
            pack();
            setVisible(true);
            
        
    }
    
    
    public void actionPerformed (ActionEvent even){
        
        Object respuesta = even.getSource();   // se esta diciendo que respuesta sea un objeto.
        
        if (respuesta == b1){
                 
            txt=new JTextField (4+4);
            setTitle("sumar");
        }else if (respuesta == b2){
            
            //txt=new JTextField (4-1);
            
            txt.setActionCommand("4");
            setTitle("Restar");
        }
       
        
        // cambiar el boton b2
       
        b2.setActionCommand("LOL");
        b2.setLabel(b2.getActionCommand());
        
        repaint();
        
        
        
    }
    
    
    
    public static void main(String[] args) {
       
        
        MyfirtsGUI GUI = new MyfirtsGUI ();
        
        
        
    }
}
