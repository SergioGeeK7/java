
package applet_excepcion_1;


import java.io.*;

public class Applet_excepcion_1 {
	public static void main(String args[]) throws IOException  {
		
		BufferedReader in = 
			new BufferedReader(new InputStreamReader(System.in));

		int n;
		System.out.println("Da el numero");
		n = Integer.parseInt(in.readLine());
		System.out.println("El cuadrado del numero = " + n*n);	
                
                
                
                // pedir un numero y que sea una letra NumberFormatException
                // al dividir un numero por otro ArithmeticException
                
        
        }

}

