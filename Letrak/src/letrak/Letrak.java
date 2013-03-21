
package letrak;
import java.util.*;
public class Letrak {

  
    public static void main(String[] args) {
       
        Scanner meta=new Scanner(System.in);
        System.out.println("ingrese el numero de filas y columnas");
        int f=meta.nextInt(),cc=f-(f/2-1);
        int letra_k [][]=new int [f][cc];
        
        int c;
        
       if (f%2==1 && f>2 ){
        
       for (c=2,f=1;c<cc;c++,f++){
           
           letra_k [letra_k.length/2+f][c]=1;
           letra_k [letra_k.length/2-f][c]=1;
           
           
       }
        
        letra_k[letra_k.length/2][1]=1;
        
        
        for (f=0;f<letra_k.length;f++){
            
            letra_k[f][0]=1;
            
            
        }
        
        
        
       
       for (f=0;f<letra_k.length;f++){
           
           for(c=0;c<cc;c++){
               
               
            System.out.print("\t"+letra_k[f][c]);
               
           }
           
           System.out.println();
           
       }
        
       } 
        
    }
}
