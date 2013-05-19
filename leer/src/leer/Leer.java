
package leer;

import java.io.*;

public class Leer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        
       leerGrafico();
        
        
    }
    
    public static  String leerGrafico()

{

File f;

javax.swing.JFileChooser j= new javax.swing.JFileChooser();

j.showOpenDialog(j);

try{

String path= j.getSelectedFile().getAbsolutePath();

String lectura="";

f = new File(path);

try{

FileReader fr = new FileReader(f);

BufferedReader br = new BufferedReader(fr);

String aux;

while((aux = br.readLine())!=null)

lectura = lectura+aux+"n";

}catch(IOException e){}

return lectura;

}catch(NullPointerException e){

javax.swing.JOptionPane.showMessageDialog(j, "Has seleccionado cerrar programa, saliendo...");

System.exit(0);

}return null;

}
    
    
}
