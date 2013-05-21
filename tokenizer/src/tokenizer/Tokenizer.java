
package tokenizer;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;

public class Tokenizer {

    
    public static void main(String[] args) throws IOException {
       
        
   
   try
      {
         File f=new File("datos.txt");
            if(f.exists())
	       {
	       StreamTokenizer tokenizer=new StreamTokenizer(new FileReader(f));
			
               int lexema=tokenizer.nextToken();
              while(lexema!=StreamTokenizer.TT_EOF)
	       {
	          switch (lexema) 
	       {
                  case StreamTokenizer.TT_WORD: System.out.println("campo: "+tokenizer.sval);
               }	  
	lexema=tokenizer.nextToken();
         }
      }
   }
   catch(Exception e)
	{
	throw new IOException("Error al leer el fichero");
	}
        
        
    }
}
