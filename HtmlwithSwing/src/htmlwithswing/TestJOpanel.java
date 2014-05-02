
package htmlwithswing;

import javax.swing.JOptionPane;

public class TestJOpanel {
    
    
     private static  String HTML_HEAD_STYLE = 
      "<head> <style>" 
    + "p { color:red; }"
    + "sup { color:yellow; }" 
    + "</style> </head>";
    
    
    public static void main(String[] args) {
        
        
        
//        
//        JOptionPane.showMessageDialog(null,"<html>" +
//       HTML_HEAD_STYLE+       // especifica la hoja de estilo
//       "<h1>1<sup>st</sup></h1>" +
//       "<hr> <p> Use Blue</p></html>");
        
        
        
        JOptionPane.showMessageDialog(null, "<html><head></head> <body> <h1 style='color:red'> hellow </h1> <br> "
                                     + "<h4>this is a test</h4> </body> </html>");
        
        
    }
    
    
}
