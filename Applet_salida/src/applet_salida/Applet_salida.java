
package applet_salida;
import java.io.*;

public class Applet_salida {

   
    public static void main(String[] args) {
       
        
        int [] datos = {41,52,64,54,82,94,61,11,55,66,44,88,99,101,15,156,211,110};  // datos binarios para un icono o archivo que se va a insertar
        
        
        try {
            
            FileOutputStream archivo = new FileOutputStream("pic.gif"); // al escribir el objeto ya podemos utilizar su metodo read para leer byte a byte
            
            
            for (int i=0;i<datos.length;i++)
            {
                archivo.write(datos[i]);
              
            }
            
              archivo.close();
        }catch (IOException ex){
            System.out.println("Error -->" + ex.toString());
        }
        
        
        
        
        
    }
}
