
package applet_miexcepcion;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Applet_miexcepcion extends Applet implements ActionListener {

 
    
    
    Label title ;
    TextField txt1;
    TextField txt2;
    Button btn;
    
    public Applet_miexcepcion (){
        
        
        txt1 = new TextField (7);
        txt2 = new TextField (7);
        title = new Label ("Escribe tu numero favorito del 1 al 10");
        btn = new Button("Escoger");
        txt2.setEnabled(false);
        add(title);
        add(txt1);
        add(txt2);
        add(btn);
        btn.addActionListener(this);
        
    }

   
    public void actionPerformed(ActionEvent e) {
          
        
        
        int a =Integer.parseInt(txt1.getText());
        try {
            metodo(a);
        } catch (Miexcepcion ex) {
            Logger.getLogger(Applet_miexcepcion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
    
    
    public void metodo(int s) throws Miexcepcion {	// herencia a Miexcepcion		
                    
                    
                    
                    
                    if (s<11 && s>0 ) { 
				System.out.println("El mio tambien !!"); 
                                txt2.setText("El mio tambien !!");
	  		} else { 
				throw new Miexcepcion(s); //se lanza
                             //   txt2.setText("El mio tambien !!");
                                
			}
		} 
    
    }
