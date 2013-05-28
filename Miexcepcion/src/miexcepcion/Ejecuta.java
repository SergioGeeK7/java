package miexcepcion;


import java.io.*;
import java.util.Scanner;
import static miexcepcion.Ejecuta.metodo;
public class Ejecuta { 
	
		public static void metodo(int s) throws Miexcepcion {	// herencia a Miexcepcion		
                    
                    
                    
                    
                    if (s<11 && s>0 ) { 
				System.out.println("El mio tambien !!"); 
	  		} else { 
				throw new Miexcepcion(s); //se lanza
			}
		} 
		
		public static void main(String[] args) throws IOException, Miexcepcion {
			Scanner meta = new Scanner (System.in);
			int s;
			System.out.println("Escribe un numero tu numero favorito del 1 al 10");
			s = meta.nextInt();
                        System.out.println(s);
			metodo(s);
		}
}