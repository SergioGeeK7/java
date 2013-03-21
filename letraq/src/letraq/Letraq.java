
package letraq;
import java.util.*;
public class Letraq {

 
    public static void main(String[] args) {
      
        Scanner meta=new Scanner(System.in);
        
        System.out.println("ingrese numero de columnas y filas");
        int f=meta.nextInt(),c=f;
        int letra_q[][]=new int [f][c];
        
        
        for (f=0;f<letra_q.length-1;f++){
            
            letra_q[f][0]=1;
            
            letra_q[f][letra_q.length-1]=1;
            
      }
        
        
        
        for (c=0;c<letra_q.length;c++){
            
            letra_q[0][c]=1;
            letra_q[letra_q.length-2][c]=1;
            
            
            
        }
        
        
        
        for (c=0,f=letra_q.length/2;f<letra_q.length;c++,f++){
            
            letra_q[letra_q.length/2+c][letra_q.length/2+c]=1;
            
            
            
            
        }
        
        
        
        
        
        
        for (f=0;f<letra_q.length;f++){
            
            for (c=0;c<letra_q.length;c++){
                
                System.out.print("\t"+letra_q[f][c]);
                
                
            }
            
            System.out.println(" ");
        }
        
        
        
        
    }
}
