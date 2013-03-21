
package gui_itm_3;
import java.awt.*;
import javax.swing.*;


public class GUI_ITM_3 extends JFrame {


    public GUI_ITM_3 (){
        
        super ("nombre de la ventana");
        
        // llamar metodos para configurar la ventana
        setSize(500,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
     
        FlowLayout diseño = new FlowLayout ();    // creando el diseñador
        
        JButton puchale =new JButton("puchale rapido ");     // creando los componentes
        JButton aquientonces = new JButton("aqui entonces");
        JButton nomames = new JButton ("nomames");
        
        setLayout(diseño); // activa el diseño en el frame
        
         add (puchale);  // añadiendo botones en orden
         add (aquientonces);
         add (nomames);
         
       
         setVisible(true); // y los pone visible en el  frame  los objetos
         
         
         
         
        
    }
   
    
    
    
    
    
    
    
    public static void main(String[] args) {
        
        
        GUI_ITM_3 vn = new GUI_ITM_3 ();
        
        
        
        
    }
}
