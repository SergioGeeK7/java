
package javaapplication10;
import java.util.Scanner;

public class SW {

   
    public static void main(String[] args) {
       
         Scanner entrar=new Scanner (System.in);
         
         
            
         
         
         System.out.println("ingrese un numero");
         int num=entrar.nextInt();
        
         
         System.out.println("desea continuar S/n ");
         
         String apellido=entrar.nextLine();
      
         
         if (apellido=="s"||apellido=="S") {
             
             llamar(entrar);
         }else {
             
             System.out.println("Okay");
             
             
         }
         
         
         
         
         switch (num) {
             
              
             
             case -1: 
                 System.out.println("el caso es -1");
                 break;
             case 2:
                 System.out.println("el caso es 2");
                 break;
             case 3:
                 System.out.println("el caso es 3");
                 break;
                
             case 4:
                 
                 System.out.println ("soy el case 4");
                break; 
                 
             default:
                 
                 System.out.println("error intente de nuevo");
             
             
         }
        
        
        
        
    }
    
    public static void llamar (Scanner entrar) {
    
        
        
 System.out.println("ingrese una de las siguientes opciones (1) para sumar (2) para restar o (3) para dividir");
 int a=entrar.nextInt();
 int b,c;
        switch (a){
            
            case 1: 
                
                System.out.println("ingrese un numero");
                b=entrar.nextInt();
                System.out.println("ingrese otro numero");
                c=entrar.nextInt();
                System.out.printf("la suma entre %d y %d es %d",b,c,b+c);
            break;
                
                
            case 2:
                
                System.out.println("ingrese un numero");
                b=entrar.nextInt();
                System.out.println("ingrese otro numero");
                c=entrar.nextInt();
                System.out.printf("la resta entre %d y %d es %d",b,c,b-c);
            break;
                
            case 3:
                
                System.out.println("ingrese un numero");
                b=entrar.nextInt();
                System.out.println("ingrese otro numero");
                c=entrar.nextInt();
                System.out.printf("la division entre %d y %d es %d",b,c,b/c);
                break;
                
            default : 
                
                System.out.println("usted a cometido un error");
                
        }
        
    
}
    
    
}
