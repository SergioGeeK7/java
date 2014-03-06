
package changecolorwithoutthread;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;

public class ChangeColorWithoutThread extends JFrame implements ActionListener {

    
    JButton b1,b2;
    JTextArea txa;
    boolean sw;
    
    public ChangeColorWithoutThread (){
        
        super("Change Color Activity 1");
        setSize(230,650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        
        b1 = new JButton("Cambiar Color");
        b2 = new JButton("Detener");
        txa = new JTextArea(10,18);
        
        add(b1);
        add(b2);
        add(txa);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        pack();
        
    }
    
    
    
    
    public static void main(String[] args) {
        ChangeColorWithoutThread cc = new ChangeColorWithoutThread ();
        cc.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
        
        if (sw) {
            
            
                // hilo que cambia a rojo y dormir and fight
                b1.setBackground(Color.red);
                
                // hilo que cambia a azul y dormir and fight
                b1.setBackground(Color.black);
               
          
                
        }else{
            // matar el hilo que cambia de color LOL
        }
        
        
        
        
        
    }
    
}
