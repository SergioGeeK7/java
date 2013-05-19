
package applet_leerarchivo;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Applet_leerarchivo {

    
    public static void main(String[] args) {
        
        
        try {
	//Construye la cadena de entrada
	FileInputStream fis = new FileInputStream("nombre_archivo");
	DataInputStream dis = new DataInputStream(fis);
	
	//lee
	double d = dis.readDouble();
	int i = dis.readInt();
	String s = dis.readUTF();
	
	//cierra
	dis.close();
	fis.close();
        } catch (IOException e) {}

        
        
        
    }
}
