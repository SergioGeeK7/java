/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package applet_leer_archivo;

import java.io.*;
import java.util.*;

public class Applet_leer_archivo {
	public static void main(String[] args) throws IOException {
		BufferedReader ent = new BufferedReader(new FileReader("datos.txt"));
		PrintWriter sal = new 	PrintWriter(System.out,true); 
		PrintWriter salErr = new 	PrintWriter(System.err, true);
		int numero;
		String nombre;
		double saldo;
		StringTokenizer stt;
		
		String linea = ent.readLine();
		while (linea != null) {
			// se tokeniza la linea leida del archivo
			stt = new StringTokenizer(linea, "_");
			// se extrae cada uno de los tokens de la línea
			numero = Integer.parseInt(stt.nextToken());
			nombre = stt.nextToken();
			saldo = Double.parseDouble(stt.nextToken());
			sal.println("" + numero + " " + nombre + " " + saldo);
			linea = ent.readLine();
		}
		salErr.println("Fin");
		ent.close();
	}
}
