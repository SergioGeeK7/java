
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
        
        
        
    }
}
