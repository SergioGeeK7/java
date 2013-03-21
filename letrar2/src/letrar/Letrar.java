
package letrar;
import java.util.*;

public class Letrar {

    public static void main(String[] args) {
      
        
        Scanner meta=new Scanner (System.in);
        int f=meta.nextInt(),c=meta.nextInt();
        int letra_r[][]=new int [f][c];
        
        
        for (c=1,f=0;c<letra_r.length-1;c++){
            
            letra_r[f][c]=1;
            letra_r[letra_r.length/2][c]=1;
           
            
        }
        
        
        for (f=letra_r.length/2,c=f;f<letra_r.length;f++,c++){
            
            letra_r[f][c]=1;
            
            
        }
        
        
        for (f=0,c=0;f<letra_r.length;f++){
            
            letra_r[f][c]=1;
            
             if (f<=letra_r.length/2){
                
               letra_r[f][letra_r.length-1]=1;
                
            }
            
            
        }
        
        
        //mostrar
        
        for(f=0;f<letra_r.length;f++){
            
            
            for (c=0;c<letra_r.length;c++){
                
                System.out.print("\t"+letra_r[f][c]);
                
            }
            System.out.println("");
        }
        
        
    }
}
