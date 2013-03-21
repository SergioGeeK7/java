
package my;
import java.util.*;
public class My {

    public static void main(String[] args) {
       
        Scanner meta=new Scanner(System.in);
        
        System.out.println("ingrese numero de filas");
        int f=meta.nextInt(),c=meta.nextInt();
        int letra_s[][]=new int[f][c];
        //int mita=f/2;
        
        
        for (c=0,f=0;c<letra_s.length;c++){
            
            letra_s[f][c]=1;
            letra_s[letra_s.length/2][c]=1;
            letra_s[letra_s.length-1][c]=1;
        }
        
        for (f=1,c=0;f<(letra_s.length/2);f++){
            
            letra_s[f][c]=1;
            letra_s[f+(letra_s.length/2)][letra_s.length-1]=1;
            
            
            
        }
        
     
        
        
        // MOSTRAR
        
      for (f=0;f<letra_s.length;f++){
          
          for (c=0;c<letra_s.length;c++){
              
              System.out.print("\t"+letra_s[f][c]);
              
          }
          
          System.out.println("");
          
      }  
        
     
        
    }
}
