
package applet_escriba;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class Applet_escriba {

 
    public static void main(String[] args) {
        
        
        try {
	//Construye la cadena de salida
	FileOutputStream fos = new FileOutputStream("nombrearchivo.txt");
	DataOutputStream dos = new DataOutputStream(fos);
	
	//lee
	dos.writeDouble(123.456);
	dos.writeInt(55);
	dos.writeUTF("Mary tiene un pequeño borreguito");
	
	//cierra
	dos.close();
	fos.close();
} catch (IOException e) {}

        
        
        
        
        
    }
}
