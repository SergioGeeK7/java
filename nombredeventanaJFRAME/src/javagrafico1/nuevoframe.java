
package javagrafico1;
import javax.swing.*;      
import java.awt.*;


public class nuevoframe extends JFrame{   
        public nuevoframe() {       
        super("creación nueva ventana");   
	setSize(400,400);    
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setVisible(true);  
}
	public static void main(String[] args){
		nuevoframe   nv=new nuevoframe();
                
                
}
}   