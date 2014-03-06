import java.io.*;
import static java.lang.System.in;
import static java.lang.System.out;
import java.net.*; 
import java.util.StringTokenizer;
public class ServidorM2{
   	public static void main(String[] args){
   		ServerSocket yo = null;
   		Socket cliente = null;
   		boolean escuchando = true;
 		try{
   			yo = new ServerSocket(5000);
   			System.out.println("Socket escuchando en puerto 5000");
 			while(escuchando){
   				cliente = yo.accept();
   				System.out.println("Ya se conecto un cliente desde: " + 
									cliente.getInetAddress().getHostName()+ 
									"("+cliente.getPort()+")");
   				new Atiende(cliente).start();  // atiendame ese cliente
   			} // se devuelve por mas
	 		yo.close();
   		}catch (IOException e){
   			System.err.println(e.getMessage());
   			System.exit(1);
   		}
   	}
}


class Atiende extends Thread{
   	private BufferedReader entrada;
   	private DataOutputStream salida;
   	private String llego;
        private String texto="";
   	private Socket cliente = null;
   	private String nombreyDirIP;
 	public Atiende(Socket cliente){
   		this.cliente = cliente;
   		nombreyDirIP = this.cliente.getInetAddress().toString();
   	}
 	public void run(){
   		try{
   			Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
  			entrada = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
   			salida = new DataOutputStream(cliente.getOutputStream());
                        String whole;
 			do{
   				
                          String inputLine;
                          whole="";
                          int conLines=0;
                          int conWords=0;
                            while (!(inputLine = entrada.readLine()).equals("")) {
                                out.println(inputLine);
                                whole+=inputLine+"\n";
                                conLines++;
                            }
   				salida.writeInt(new StringTokenizer(whole).countTokens());
   				salida.writeInt(conLines);
   			}while(whole.length()!=0);
 			entrada.close();
   			cliente.close();
   		}catch(IOException e){
   			System.out.println(e.getMessage());
   			System.exit(1);
   		}
   			System.out.println("Ya se desconecto"+"("+nombreyDirIP+")");
	}
}