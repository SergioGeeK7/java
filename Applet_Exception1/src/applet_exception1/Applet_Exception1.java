
package applet_exception1;

import java.io.*;

public class Applet_Exception1 {
    
    
    
	public static void main(String args[]) throws IOException  {
		
		try {
			BufferedReader in = 
                        new BufferedReader(new InputStreamReader(System.in));
	
			int n1, n2, n;
			System.out.println("Da un numero");
			n1 = Integer.parseInt(in.readLine());
			System.out.println("Da otro numero");
			n2 = Integer.parseInt(in.readLine());
			System.out.println("La division = " + n1/n2);
		}catch (NumberFormatException nfe) {
			System.out.println("Numero invalido " + nfe.toString());
		}catch (ArithmeticException ae) {
			System.out.println("Division invalida " + ae.toString());
		}
	}
}


