



import java.io.*;
import java.net.*; 
public class Cliente2{
   	public static void main(String[] comandos){
   		Socket yo = null;
   		PrintWriter alServidor;
   		BufferedReader delTeclado;
   		DataInputStream delServidor;
   		String tecleado;
                String [] comandoss = {"192.168.1.64"};
   		try{
   			try{
   				yo = new Socket(comandoss[0],5000);
   			}catch (UnknownHostException e){
   				System.out.println(e.getMessage());
   				System.exit(1);
   			} 
   			System.out.println("Ya se conecto al Servidor");
   
   			delTeclado = new BufferedReader(new InputStreamReader(System.in));  // tengo que guardar strings con esto
   			alServidor = new PrintWriter(yo.getOutputStream(),true); // para mandar al servidor
   			delServidor = new DataInputStream(yo.getInputStream()); // resivir del servidor
   
  	 		do{
   				System.out.print("Teclea un string: ");
   				tecleado = delTeclado.readLine();
   				alServidor.println(tecleado);
   				System.out.println("Longitud = "+delServidor.readInt()); 
   			}while(tecleado.length()!=0);
   
   			System.out.println("Ya termine de enviar");
   
   			delServidor.close();
   			delTeclado.close();
   			alServidor.close();
   			yo.close();
   
   		}catch (IOException e){
   			System.err.println(e.getMessage());
   			System.exit(1);
   		}
   	}
}