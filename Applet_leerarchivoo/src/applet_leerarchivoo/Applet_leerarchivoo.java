/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package applet_leerarchivoo;
import java.io.*;
public class Applet_leerarchivoo {
	public static void main(String[] args) throws IOException {
		BufferedReader ent = new BufferedReader(new FileReader("datos.txt"));
		PrintWriter sal = new 	PrintWriter(System.out,true); 
		PrintWriter salErr = new 	PrintWriter(System.err, true);
		String linea = ent.readLine();
		int numero;
		while (linea != null) {
			numero = Integer.parseInt(linea);
			sal.println("" + numero);
			linea = ent.readLine();
		}
		salErr.println("Fin");
		ent.close();
	}
}
