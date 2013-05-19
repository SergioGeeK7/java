
package applet_copiar_texto;

import java.io.*;
import java.util.*;
public class Applet_copiar_texto {

  
    public static void main(String[] args) throws IOException {
        
        
        
       // if (args.length>1){
            
        
        
        
        try {
        
        BufferedReader ent = new BufferedReader(new FileReader(args[0]));
         
        String linea="";
        String l;
        
        linea   +=ent.readLine(); 
      
          
       while ((l = ent.readLine())!=null) {
             
         linea   +="\n"+l; 
            
}
       
        ent.close();
       System.out.println(linea);
       
      
       // escribir
       PrintWriter sal = new 	PrintWriter(new FileWriter(args[1])); 
       PrintWriter salErr = new 	PrintWriter(System.err, true);
        
       
       sal.print(linea);
       sal.close();
	
        }catch(FileNotFoundException e){
            System.out.println("Archivo no encontrado.");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("No se ha especificado el nombre del archivo");
            }catch (IOException e){
                System.out.println("error en acceso al archivo");
                    }
        
       
       
  /*   } else {
            System.out.println("Error. falta de parametros");
        }*/
       
    }
}