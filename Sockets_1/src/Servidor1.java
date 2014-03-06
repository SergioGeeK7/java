import java.io.*;
import java.net.*; 
public class Servidor1{
   	public static void main(String[] args){
   		ServerSocket yo = null;  // esperara por conexion
   		Socket cliente = null; // se utiliza para la comunicacion
   		try{
   			yo = new ServerSocket(5000); // el escuchador
   		} catch (IOException e){
   			System.out.println(e.getMessage());
   			System.exit(1);
   		} 
   		System.out.println("Socket escuchando en puerto 5000");
   		try{
   			cliente = yo.accept();  // aqui se pausa y espera conexion con este socket || listo para intercambio de datos
   		} catch (IOException e){
   			System.out.println(e.getMessage());
   			System.exit(1);
   		} 
   		System.out.println("Ya se conecto el cliente");
   		try{
   			cliente.close();
   			yo.close(); 
   		} catch (IOException e){
   			System.out.println(e.getMessage());
   			System.exit(1);
   		}
   	}
}