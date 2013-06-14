
package metodorecursivo;

 import java.io.*;

public class METODORECURSIVO {
	private static BufferedReader ent = new BufferedReader(
			new InputStreamReader(System.in));
	private static PrintWriter sal = new PrintWriter(System.out,true);
	private static PrintWriter salErr = new PrintWriter(System.err,true);
	
        
        
        
	private static int factorial (int n) {
		if (n  == 0) {
			return 1;
		}
		else {
			return n * factorial (n-1);
	
                }
                
        }
        
        
        
        public static void main(String[] args) throws IOException {
		int numero;
		
	    salErr.println("Da el numero");
	    numero = Integer.parseInt(ent.readLine());
	    sal.println("Factorial de " + numero + " = " + factorial(numero));
	}
     
        
}
