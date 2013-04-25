
package applet_farenheit;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Math.*;



public class Applet_farenheit extends Applet {

  
    public Applet_farenheit () {
    
        
        
        
    
    
}
 
    
    
    public void paint (Graphics g){
        
        double c=30;
        double f=c*9/5 + 32;
        
        g.drawString("Centigrados = "+c +" Farenheit "+f,100,100);
        
        
    }
    
    
    
    
}