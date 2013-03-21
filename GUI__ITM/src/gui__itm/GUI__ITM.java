
package gui__itm;



   import javax.swing.*;      
   import java.awt.*;

public class GUI__ITM extends JFrame{   
        public GUI__ITM() {       
         super("creación nueva ventana");   
	setSize(400,400);    
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setVisible(true);  
}
	public static void main(String[] args){
		GUI__ITM   nv=new GUI__ITM();
}
}   