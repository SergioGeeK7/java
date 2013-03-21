
package pruebafor;

import java.util.Scanner;
public class pruebafor {

 
    public static void main(String[] args) {
       
        Scanner meta=new Scanner (System.in);
        
        int a=meta.nextInt(),b=meta.nextInt();
        int c=3;
        
        System.out.printf("sumare %d y %d 3 veces%n",a,b);
        ciclo(a,b,c);
        
        
        
                
        
        
        
        
        
    }
    
    public static void ciclo (int a,int b,int c){
        
        int suma=0;
        
        for (int cont=0;cont<c;cont++){
            
            System.out.println(cont);
            suma=suma+a+b;
            
        }
        
        System.out.println("el resultado de la suma es "+suma);
        
    }
    
}
