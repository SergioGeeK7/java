
package javaapplication13;

import java.util.Scanner;


public class testvector {

    
    public static void main(String[] args) {
       
        
           Scanner meta=new Scanner (System.in);
        
        System.out.println("cuantas posiciones desea que tenga el vector ?");
        int pos=meta.nextInt();
        int vec[]=new int[pos];
        
        
        System.out.println(vec[1]);
        
        
        
        for (int cont=0;cont==pos;cont++){
            
            System.out.println("ingrese un numero para la posicion"+cont);
            vec[cont]=meta.nextInt();
            
        }
        
        
        
        
        
        
        
        
    }
}
