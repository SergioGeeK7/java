package gestiondeusuarios;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Writer;



public class Reading {
    
    private Object FileReaderfr;
    private Object BufferedReaderbr;
    private FileReader fr;
    private BufferedReader br;
    private Object FileWriterfw;
    private Writer fw;
    private listadobleligada lista = new listadobleligada();
    
    public void cargarUsuarios() {
        
        File archivo = null;
        FileReaderfr = null;
        BufferedReaderbr = null;
        System.out.println("leyendo...");
        try {

            archivo = new File("hellow.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            
            String linea;
            int pos;
            String [] datos = new String [7];

            while ((linea = br.readLine()) != null) {
                
                for(int i=0;i<7;i++){
                    pos = linea.indexOf('|'); // le dice la posicion en donde esta el PY
                    datos[i] = linea.substring(0, pos); // extrae de la 0 a la pos 
                    linea = linea.substring(pos + 1); // avanza linea  
                }
                System.out.println(datos[1]);
                lista.add(new User(datos));
                
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
    
    
    public String find (int id){
        
       User toFind = lista.find(id);
       
        if (toFind == null) {
            
            return "No encontrado";
            
        }
        
       return toFind.toString();
        
    }
    
    
    public void remove (int id){
        lista.delete(id);
    }
    
    
    
    
    public String tesss (){
        
        
        return lista.toString();
        
    } 
    
    
    
    
    
    
    
}



