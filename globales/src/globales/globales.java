
package globales;

import java.util.*;
public class globales {

    
    public static Scanner meta=new Scanner(System.in);
    public static int resultado;
    
    public static void main(String[] args) {
      
        System.out.println("ingrese 3 valores");
        int a=meta.nextInt(),b=meta.nextInt(),c=meta.nextInt();
        
        
        
        resultado(a,b,c);
        
        System.out.printf("el resultado de la suma de %d,%d y %d es %d%n",a,b,c,resultado);
        
        
        
    }
    
    public static void resultado (int a,int b,int c){
        
        
        resultado=a+b+c;
        
        
        
        
    }
    
}
