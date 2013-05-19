/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package applet_leer_archivo2;
import java.io.*;
public class Applet_separador {
	public static void main(String[] args) throws IOException {
		BufferedReader ent = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter sal = new 	PrintWriter(new FileWriter("datos.txt")); 
		PrintWriter salErr = new 	PrintWriter(System.err, true);
		salErr.println("Da el numero (negativo para salir)");
		int numero = Integer.parseInt(ent.readLine());
		String nombre;
		double saldo;
		while (numero > 0) {
			salErr.println("Da el nombre");
			nombre = ent.readLine();
			salErr.println("Da el saldo");
			saldo = Double.parseDouble(ent.readLine());
			// se graba la linea pero usando el delimitador guion bajo
			sal.println("" + numero + "_" + nombre + "_" + saldo );
			salErr.println("Da el número (negativo para salir)");
			numero = Integer.parseInt(ent.readLine());
		}
		salErr.println("Fin");
		sal.close();
	}
}
