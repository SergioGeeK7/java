
package javaapplication5;
import java.util.*;

public class matris2 {

   
    public static void main(String[] args) {
      
        
        
        Scanner meta=new Scanner(System.in);
        //Random random=new Random();
        System.out.println("ingrese numero de filas");
        int F=meta.nextInt();
        int C=meta.nextInt();
        
        int mita;
        
        
       mita=F/2;
       
        
        int matri[][]=new int[F][C];
        
            
        for (F=0,C=0;F<matri.length;F++){
            
            matri[F][C]= 1;
            matri[F][matri.length-1]= 1; 
         
        }
        
        for (F=matri.length-2,C=2;F>mita;F--,C++){
            
            matri[F][C-1]= 1;
            matri[F][matri.length-C]= 1;
            
            
        }
        
        matri[mita][mita]=1;
     
        for (F=0;F<matri.length;F++){
            
            
            for (C=0;C<matri.length;C++){
                
                
                System.out.print("\t" + matri[F][C]);
                
                
            }
            
            System.out.println("");
            
        }
        
     
        
        
        
    }
}
