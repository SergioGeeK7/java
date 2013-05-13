/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package applet_exception2;

import java.io.*;

public class Applet_Exception2 {
	public static void main(String args[]) throws IOException  {
		
		boolean error = true;  //asumimos que hay error
		
		while (error) {		
			try {
				BufferedReader in = 
					new BufferedReader(new InputStreamReader(System.in));
		
				int n1, n2, n;
				System.out.println("Da un numero");
				n1 = Integer.parseInt(in.readLine());  // SI HAY ERROR EN ALGUNA DE ESTAS LINEAS PARARA EL PROGRAMA Y NO AVANZARA MAS.
				System.out.println("Da otro numero");
				n2 = Integer.parseInt(in.readLine());
				System.out.println("La division = " + n1/n2);
				error = false;   // al llegar aqui no hubo error
                                
			}
			catch (NumberFormatException nfe) {
				System.out.println("Numero invalido " + nfe.toString());
			}
			catch (ArithmeticException ae) {
				System.out.println("Division invalida " + ae.toString());
			}
		}
			
	}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
}
