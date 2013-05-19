
package applet_lectorbyte;
import java.io.*;
public class Applet_lectorbyte {


    public static void main(String[] args) {
      
        
        
        try {
            
            // primero se crea un objeto
            FileInputStream archivo = new FileInputStream ("clase.dat");  // archivo donde vamos a recuperar los datos
            boolean eof = false;
            int contador=0; // contar el numero de bytes que se llevan leidos del archivo
            
            
            while (!eof){ // mientras sea falsa 
                int entrada = archivo.read();  // archivo.read para ir leyendo el archivo [de byte en byte]
                System.out.print(entrada + " ");
                if (entrada == -1){
                    
                    eof=true;
                 }else 
                    contador++;
                
                }
            
            
            archivo.close(); // para cerrar el archivo al dejar de leer
            System.out.println("\n Bytes leidos :"+ contador);
            
            
         
        }catch(IOException ex){
            
            System.out.println("Error ---* " + ex.toString());
            
        }
        
        
        
        
        
        
        
        
    }
}
