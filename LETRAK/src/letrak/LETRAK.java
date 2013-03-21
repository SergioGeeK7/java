
package letrak;
import java.util.*;

public class LETRAK {

    

    
    
    
    
    public static void main(String[] args) {
        
        
        Scanner meta= new Scanner (System.in);
        System.out.println("ingrese el numero de filas y columnas");
        int f=meta.nextInt(),c=f;
        int letra_k[][]=new int [f][c];
        
        for (c=0;c<letra_k.length;c++){
            
            
            letra_k[0][c]=1;
            letra_k[letra_k.length-2][c]=1;
            
        }
        
        
        
        
        for (f=0;f<letra_k.length-1;f++){
            
            
            letra_k[f][0]=1;
            letra_k[f][letra_k.length-1]=1;
            
        }
        
        
        for (f=letra_k.length/2;f<letra_k.length;f++){
            
            letra_k[f][f]=1;
            
            
            
        }
        
        for (f=0;f<letra_k.length;f++){
            
            
            
            for (c=0;c<letra_k.length;c++){
                
                
                System.out.print("\t"+letra_k[f][c]);
                
                
            }
            
            System.out.println("");
            
        }
        
        
    }
}
