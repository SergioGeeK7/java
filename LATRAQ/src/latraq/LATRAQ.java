/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package latraq;
import java.util.*;


/**
 *
 * @author MCARDONF
 */
public class LATRAQ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        
        Scanner variable =new Scanner (System.in);
        System.out.println("ingrese numero de filaas y columnas");
        int f=variable.nextInt(),cc=f-((f/2)-1);
        int c;
        int letra_q [][]= new int [f][cc];
        
        
        for (c=2,f=1;c<cc;c++,f++){
            
            letra_q[letra_q.length/2+f][c]=1;
            letra_q[letra_q.length/2-f][c]=1;
           
            
        }
        
        letra_q[letra_q.length/2][1]=1;
        
        
        
        for (f=0;f<letra_q.length;f++){
            
            
            letra_q[f][0]=1;
            
            
            
        }
        
        
        
        
        for (f=0;f<letra_q.length;f++){
            
            
            
            for (c=0;c<cc;c++){
                
                
                System.out.print("\t"+letra_q[f][c]);
                
                
            }
            
            System.out.println("");
        }
        
        
        
        
        
        
        
        
        
        
    }
}
