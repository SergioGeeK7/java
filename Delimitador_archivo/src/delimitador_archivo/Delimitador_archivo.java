
package delimitador_archivo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;


public class Delimitador_archivo {

    
    public static void main(String[] args) throws IOException {
                                              
        
          FileReader n= new FileReader("datos.txt");
        
          StreamTokenizer token = new StreamTokenizer (n);
        
   for (int i=0;i<10;i++){
       
          System.out.println( token.nextToken()); 
   }
   
      
    }
}
