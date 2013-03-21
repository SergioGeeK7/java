
package condicionales;
import java.util.Scanner;


public class condicionales {

  
    public static void main(String[] args) {
        
        Scanner pantalla=new Scanner (System.in);
        int x=7;
        
        System.out.println("ingrese un numero");
        x=pantalla.nextInt();
        
        
        
        if (x==3) {
            
            
            System.out.println("el x es igual :P");
            
            
        }
        
        
        if (x<3) {
            
            System.out.println("la x es menor que 3");
            
            
       }
        
        multiplo(x);
        
        multiplo2(x);
        
        clase9(x);
       
    }
    
    
    public static void multiplo (int x){
        
    
        
        if (x%2==0&x>9&x<22) {
            
            System.out.println("el numero es par");
            
        }
        
            if (x!=0) { 
                
               System.out.println("no hacer nada");
               
            }
            
          
            
           
                
        
            
        
        
        
    }
    
    
    public static void multiplo2 (int a){
        
        
        if (a>=7){
            
            System.out.println("soy mayor a 7");
            
        } else {
            
            System.out.println("soy menor que 7 srry");
            
        }
            
            
            
            
        
            
            
            
            
            
            
            
        if (a<30&a>=0) {
            
        System.out.println("soy menor a 30");
        
        }
        
    }    
    
    
    public static void clase9 (int x) {
        
        
        
        if (x>100&&x<500){
            
            
            System.out.println("cumpli la condicion soy mayo a 100 lala");
            
        }else if (x!= 501 || x == 151) {
            
            
            System.out.println("soy un numero xxx");
            
        }else { 
            System.out.println("soy gay y no cumpli");
            
        }
            
         
            
            
            
        
        
    }
    
    
    
    
}
