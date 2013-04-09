
package pestañas;
import java.awt.*;
import javax.swing.*;



public class Pestañas extends JFrame {  // o importar JPanel

    
   public Pestañas (){
       
      super("aaaa");
    
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
     
       
      
      ImageIcon img = new ImageIcon ("pain.jpg");
        
       JPanel p1 = new JPanel ();     /// CREACION DE PANEL (CUANDO LE DES CLICK A LA PESTAÑA)
       JButton b1=new JButton ("hola");  // CREACION DE CONTENIDO DE LA PESTAÑA
       p1.add(b1);  // añado el JButton al JPannel de la pestaña 1
       
       JPanel p2= new JPanel ();
       JButton b2=new JButton("hola 2");
       p2.add(b2);
       
       JPanel p3 = new JPanel ();
       JButton b3=new JButton("hola 3");
       p3.add(b3);
       
       JPanel p4 = new JPanel ();
       JButton b4=new JButton("hola 4");
       p4.add(b4);
       
       JTabbedPane pestañas = new JTabbedPane (); // el contenedor de las pestañas
       p1.setPreferredSize(new Dimension(610,110)); 
       pestañas.addTab("tabla 1",img,p1);
       pestañas.addTab("tabla 2",img,p2); // añadimos al contenedor de pestañas, las pestañas ya creadas arriba
       pestañas.addTab("tabla 3",img,p3);// titulo imagen objeto(pestaña)
       pestañas.addTab("tabla 4",img,p4);
       
      
       /*
       pestañas.add(p1);
       pestañas.add(p2);  // asocio las pestañas al contenedor de pestañas.
       pestañas.add(p3);
       pestañas.add(p4);
       
       */
       
        // establecer las dimenciones a cada pestaña ( en este caso la misma a todas)
       
       
       add(pestañas);  // añadira pestañas al diseñador por default "flow"
       pestañas.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);  // configurar si hay mas pestañas mostrar con flechas para avanzar entre pestaña
     
       
       
       BorderLayout diseñador = new BorderLayout ();
       setLayout(diseñador);
       add("Center",pestañas);
       pack();
       setVisible(true);
       
       
   } 
    
    
    
   
   // metodo para ejecutar varias de las declaraciones que utilizabamos en main o directamente en el constructor
   
   private static void crearYMostrarGUI (){
       
       JFrame marco = new JFrame (" BARRA DE TITULO ");
       marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
       
       marco.add(new Pestañas(),BorderLayout.CENTER);
       marco.pack();
       marco.setVisible(true);
       
   }
    
    
    
    
  
    public static void main(String[] args) {
       
        Pestañas ps = new Pestañas ();
       // crearYMostrarGUI();
        
        
        
    }
}
