
package letrao;
import java.util.*;
public class Letrao {

    
    public static void main(String[] args) {
      
        Scanner meta=new Scanner (System.in);
        int f=meta.nextInt(),c=meta.nextInt();
        int letra_o[][]=new int [f][c];
        
        for (c=0,f=0;c<letra_o.length;c++){
            
           letra_o[f][c]=1;
           letra_o[letra_o.length-1][c]=1;
            
        }
        
        
       for (f=1,c=0;f<letra_o.length-1;f++){
           
           letra_o[f][c]=1;
           letra_o[f][letra_o.length-1]=1;
           
       }
        
      
        
        // mostrar
        
        for (f=0;f<letra_o.length;f++){
            
            for (c=0;c<letra_o.length;c++){
                
                System.out.print("\t"+letra_o[f][c]);
                
                
            }
            
            System.out.println("");
            
        }
        
        
        
        
        
        
    }
}
