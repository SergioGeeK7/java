
package gestiondeusuarios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Writer;

    



public class Read {
    
    private Object FileReaderfr;
    private Object BufferedReaderbr;
    private FileReader fr;
    private BufferedReader br;
    private Object FileWriterfw;
    private Writer fw;
    
    
    public static void main(String[] args){
        
        Read rr = new Read();
        rr.cargarUsuarios();
    }
    
    
    
    
    
    public void cargarUsuarios() {
        
    File archivo = null;
    FileReaderfr = null;
    BufferedReaderbr = null;
    System.out.println("leyendo...");
    try {
        
        archivo = new File("hellow.txt");
        fr = new FileReader(archivo);
        br = new BufferedReader(fr);

        int pos;
        String aux;
        String linea;

        String idUsuario;
        String nombres;
        String apellidos;
        String clave;
        int perfil;

        while ((linea = br.readLine()) != null) {
            // Extraemos ID Usuario
            pos = linea.indexOf('|'); // le dice la posicion en donde esta el PY
            aux = linea.substring(0, pos); // extrae de la 0 a la pos 
            idUsuario = aux; 
            linea = linea.substring(pos + 1); // avanza linea 

            // Extraemos Nombres
            pos = linea.indexOf('|');
            aux = linea.substring(0, pos);
            nombres = aux;
            linea = linea.substring(pos + 1);

            // Extraemos Apellidos
            pos = linea.indexOf('|');
            aux = linea.substring(0, pos);
            apellidos = aux;
            linea = linea.substring(pos + 1);

            // Extraemos Clave y perfil
            pos = linea.indexOf('|');
            aux = linea.substring(0, pos);
            clave = aux;
            linea = linea.substring(pos + 1);
            
            
            
            
            System.out.println(idUsuario);
            System.out.println(nombres);
            System.out.println(apellidos);
            System.out.println(clave);
            
            
            //Usuario miUsuario = new Usuario(idUsuario,nombres,apellidos,clave,perfil);
            //misUsuarios[conUsu] = miUsuario;
            //conUsu++;
         }
     }catch (Exception e1) {
        e1.printStackTrace();
      } finally {
            
            try {
                if (fr != null) {
                 fr.close();
                 }
            }catch(Exception e2) {
              e2.printStackTrace();
             }
        } // fin finally
    }// Fin metodo
    
}