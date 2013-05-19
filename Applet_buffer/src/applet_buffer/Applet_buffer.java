
package applet_buffer;
import java.io.*;

public class Applet_buffer {

  

    public static void main(String[] arguments) {
        int inicio = 0;
        int fin = 255;
        if (arguments.length > 1) {
            inicio = Integer.parseInt(arguments[0]);
            fin = Integer.parseInt(arguments[1]);
        } else if (arguments.length > 0)
            inicio = Integer.parseInt(arguments[0]);
        ArgStream as = new ArgStream(inicio, fin);  // controlo los numeros abajo de 255 
        System.out.println("\nEscribiendo: ");
        boolean exito = as.escribirStream();  // as
        System.out.println("\nLeyendo: ");
        boolean exitoLectura = as.leerStream();
    }
}

class ArgStream {
    int inicio;
    int fin;

    ArgStream(int st, int f) {
        inicio = st;
        fin = f;
    }

    boolean escribirStream() {
        try {
            FileOutputStream archivo = new FileOutputStream("numeros.dat");
            BufferedOutputStream buff = new BufferedOutputStream(archivo);   // lo filtramos al archivo 
            for (int salida = inicio; salida <= fin; salida++) {
                buff.write(salida);
                System.out.print(" " + salida);
            }
            buff.close();
            return true;
        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
            return false;
        }
    }

    boolean leerStream() {
        try {
            FileInputStream archivo = new FileInputStream("numeros.dat");
            BufferedInputStream buff = new BufferedInputStream(archivo);
            int in = 0;
            do {
                in = buff.read();
                if (in != -1)
                    System.out.print(" " + in);
            } while (in != -1);
            buff.close();
            return true;
        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
            return false;
        }
    }
}