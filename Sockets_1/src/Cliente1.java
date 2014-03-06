import java.io.*;
import java.net.*; 
public class Cliente1{
   	public static void main(String[] args){
   		Socket yo = null;
   		try {
   			yo = new Socket(InetAddress.getLocalHost(),5000); // socket a quien se va a conectar
   		} catch (UnknownHostException e){
   			System.out.println(e.getMessage());
   			System.exit(1);
   		} catch (IOException e){
   			System.out.println(e.getMessage());
   			System.exit(1);
   		}
   		System.out.println("Ya se conecto al Servidor");
   		try {
   			yo.close(); 
   		} catch (IOException e){
   			System.out.println(e.getMessage());
   			System.exit(1);
   		}
   	}
}