
package letrae;
import java.util.*;
public class Letrae {

   
    public static void main(String[] args) {
        
        
        Scanner meta=new Scanner(System.in);
        int f=meta.nextInt(),c=meta.nextInt();
        int [][] letra_e=new int [f][c];
        
        
        for (c=1;c<letra_e.length;c++){
            
            letra_e[0][c]=1;
            letra_e[letra_e.length/2][c]=1;
            letra_e[letra_e.length-1][c]=1;
            
            
        }
        
        for (f=0;f<letra_e.length;f++){
            
            letra_e[f][0]=1;
            
            
        }
        
        
        
        //Mostrar
        
        
        for (f=0;f<letra_e.length;f++){
            
            for (c=0;c<letra_e.length;c++){
                
                System.out.print("\t"+letra_e[f][c]);
                
            }
            System.out.println("");
            
        }
        
        
        
        
        
    }
}
