
package letrae;
import java.util.*;
public class Letrae {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        
        Scanner meta=new Scanner(System.in);
        
        
        int f=meta.nextInt(),c=meta.nextInt();
        int[][] letra_g=new int [f][c];
        
        
        for (c=letra_g.length-1,f=0;c>0;c--){
//EL PARA ES UNA AFIRMACION.... MIENTRAS ESO SEA VERDADERO SE EJECUTARA ... SI ESO ES VERDADERO SE EJECUTA
            System.out.println(c);
            
            letra_g[f][c]=1;
           
            letra_g[letra_g.length-1][c]=1;
            
            if (c>=letra_g.length/2){
               letra_g[letra_g.length/2][c]=1;
            }
         
        }
        
         c=letra_g.length-1;
         for (int aux=letra_g.length/2;aux<letra_g.length;aux++){
                
                letra_g[aux][c]=1;
              
            }
        
        
        
        for (f=0,c=0;f<letra_g.length;f++){
            
            letra_g[f][c]=1;
            
            
            
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // mostrar letra
        
        for (f=0;f<letra_g.length;f++){
            
            for (c=0;c<letra_g.length;c++){
                
                System.out.print("\t"+letra_g[f][c]);
                
            }
            
            System.out.println("");
            
        }
        
        
    }
}
