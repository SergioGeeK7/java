package basededatos;

import java.io.*;

public class Teclado {
   public static void main(String[] args){
   		String linea="";
   		InputStreamReader entrada = new InputStreamReader(System.in);
   		BufferedReader teclado = new BufferedReader(entrada);
		System.out.println("Teclea líneas de texto");
		System.out.println("Teclea q y <enter> para terminar");
		try{	
			while(linea.compareTo("q")!=0){
				linea = teclado.readLine();
				System.out.println(">> "+linea);
			}
		}catch(IOException e){
			System.out.println(e.getMessage());
		}
		System.out.println("Fin del Programa");
		try{
			teclado.close();
			entrada.close();
		}catch(IOException e){
			System.out.println(e.getMessage());
		}
	}
}