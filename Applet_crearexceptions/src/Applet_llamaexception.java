
import java.io.*;

public class Applet_llamaexception { 
	
		public static void metodo(String s) throws Applet_crearexceptions {	// herencia a Applet_crearexceptions				
                    
                    if ("feliz".equals(s)) { 
				System.out.println("Son iguales."); 
	  		} else { 
				throw new Applet_crearexceptions(); //se lanza
			}
		} 
		
		public static void main(String[] args) throws IOException, Applet_crearexceptions {
			BufferedReader in = 
			new BufferedReader(new InputStreamReader(System.in));
			String s;
			System.out.println("Da la palabra");
			s = in.readLine();
			metodo(s);
		}
}
