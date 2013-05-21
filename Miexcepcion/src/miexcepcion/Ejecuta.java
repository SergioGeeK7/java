
package miexcepcion;


import java.io.*;
import java.util.Scanner;
public class Ejecuta { 
	
		public static void metodo(int s) throws Miexcepcion {	// herencia a Miexcepcion		
                    
                    
                    
                   
		} 
		
		public static void main(String[] args) throws IOException, Miexcepcion {
			Scanner meta = new Scanner (System.in);
			int s;
			System.out.println("Escribe tu numero favorito del 1 al 10");
			s = meta.nextInt();
                        System.out.println(s);
			
                        
                        
                         
                    if (s<11 && s>0 ) { 
				System.out.println("El mio tambien !!"); 
	  		} else { 
                        
                        try{
                        
				//throw new Miexcepcion(s); //se lanza
                        }catch(Exception ex){
                            System.out.println(ex);
                        }
			}
                        
		}
}
