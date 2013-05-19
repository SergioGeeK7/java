
package applet_leaarchivo;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;


public class Applet_leaarchivo {

   
    public static void main(String[] args) {
      
        try {
	//Construye la cadena de entrada
	FileInputStream fis = new FileInputStream("nombrearchivo.txt");
	DataInputStream dis = new DataInputStream(fis);
	
	//lee
	double d = dis.readDouble();
	int i = dis.readInt();
	String s = dis.readUTF();
	System.out.println(s);
	//cierra
	dis.close();
	fis.close();
} catch (IOException e) {}

        
        
        
        
    }
}
