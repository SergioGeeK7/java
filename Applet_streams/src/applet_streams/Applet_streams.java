/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package applet_streams;

import java.io.*;

public class Applet_streams {
	public static void main(String[] args) throws IOException {
		BufferedReader ent = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter sal = new 	PrintWriter(System.out, true); 
		PrintWriter salErr = new 	PrintWriter(System.err, true);
		salErr.println("Da el número");
		int numero = Integer.parseInt(ent.readLine());
		if (numero < 0) {
			salErr.println("Error numero negativo");
		}
		else {
			sal.println("" + (Math.pow(numero,2)));
		}
	}
}
