
package letrai;
import java.util.*;

public class Letrai {

    public static void main(String[] args) {
       
        
        Scanner meta=new Scanner (System.in);
        
        int f=meta.nextInt(),c=meta.nextInt();
        int [][] letra_i=new int [f][c];
        
        
        for (c=0,f=0;c<letra_i.length;c++){
            
            letra_i[f][c]=1;
            letra_i[letra_i.length-1][c]=1;
            
        }
        
        
        for (f=1;f<letra_i.length-1;f++){
            
            
            letra_i[f][letra_i.length/2]=1;
         
        }
        
        
        
        
        
        /// mostrar
        
        for (f=0;f<letra_i.length;f++){
            
            for (c=0;c<letra_i.length;c++){
                
                System.out.print("\t"+letra_i[f][c]);
                
            }
            
            System.out.println("");
        }
                
        
        
    }
}
