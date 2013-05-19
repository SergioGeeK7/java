
package applet_archivodetexto;

import java.io.FileInputStream;
import java.io.IOException;


public class Applet_archivodetexto {

   
    public static void main(String[] args) {
       
        
        byte b;
        byte bytes[] = new byte[100];
        byte morebytes[] = new byte[50];
        
        
        try {
	FileInputStream fis = new FileInputStream("nombre.txt");
	b=(byte)fis.read(); // lee un byte
	fis.read(bytes); //llena el arreglo
	fis.read(morebytes, 0, 20); //lee 20 elementos
} catch (IOException e) {}
 

        
        
        
    }
}
