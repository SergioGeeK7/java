/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package applet_copiar_texto2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author sergio
 */
public class Applet_copiar_texto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
         BufferedReader ent = new BufferedReader(new FileReader("datos.txt"));
	PrintWriter sal = new 	PrintWriter(System.out,true); 
	PrintWriter salErr = new 	PrintWriter(System.err, true);
        
        String contenido;
        
        String linea="";
       boolean n = false;
       String l;
        
       
       
       while ((l = ent.readLine())!=null) {
            linea +=l+"\n";
}
       
       System.out.println(linea);
       
       
       
       
       
        /*
      while (!n){
          
          l = ent.readLine();
          if (l!=null )
            
         linea +=l+"\n"; 
         
          else {
              n=true;
          }
         
          }
        System.out.println(linea);
        
        */
        
        /*
         while (ent.ready()){
            
         linea   +="\n"+ent.readLine(); 
          }
        System.out.println(linea);
        */
        
       
    }
}
