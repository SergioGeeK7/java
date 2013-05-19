/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package applet_archivo;

import java.io.*;

public class Applet_archivo {
	public static void main(String[] args) throws IOException {
		BufferedReader ent = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter sal = new 	PrintWriter(new FileWriter("datos.txt")); 
		PrintWriter salErr = new 	PrintWriter(System.err, true);
		salErr.println("Da el número");
		int numero = Integer.parseInt(ent.readLine());
		while (numero > 0) {
			sal.println("" + numero);
			salErr.println("Da el número");
			numero = Integer.parseInt(ent.readLine());
		}
		salErr.println("Fin");
		sal.close();
	}
}
