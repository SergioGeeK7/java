
package scannerymetodos;

import java.util.Scanner;

public class prueba {

    
    public static void main(String[] args) {
       
        Scanner e=new Scanner(System.in);
        
        System.out.println("ingrese un numero");
        int y=e.nextInt();
        System.out.println("ingrese otro numero");
        int t=e.nextInt();
        System.out.println("la resta de los dos numeros es"+sumar(y,t));
    }
    
    
    public static int sumar (int a,int b) {
        
        
        return a-b;
        
        
        
    }
    
    
    
}
