
package sw2;


import java.util.Scanner;

public class sw2 {

   
    public static void main(String[] args) {
        
        
        condicionalesanadidas();
        
        
        
    }
    
    
    public static void condicionalesanadidas(){
        
        Scanner meta=new Scanner(System.in);
        int a,b,c,d,e;
        
        
        System.out.println("ingrese un numero");
        a=meta.nextInt();
        System.out.println("ingrese otro numero");
        b=meta.nextInt();
        System.out.println("que desea hacer con ese numero digite 1= sumar 2= dividir 3 = multiplicar  4 restar o 5 para salir");
        e=meta.nextInt();
        
        if (e == 5  ) {
            
            System.out.println("Okay");
            System.out.println("este es el fin del programa");
            
        }else if (e > 5 && e<=0)  {
            
            System.out.println("Opcion Incorrecta");
            
        } else {
             opciones(e,a,b);
            
        }
        
        
        
        
        
        
    }
    
    
    public static void opciones (int e,int a,int b){
        
        switch (e){
            
            
            case 1: System.out.printf("la suma de %d y %d es %d",a,b,a+b);
                break;
            case 2: 
                
                double aa,bb;
                
                aa=a;
                bb=b;
                
                System.out.printf("la division entre %d y %d es %f ",a,b,aa/bb);
            break;
           case 3: System.out.printf("la multiplicacion de %d y %d es %d",a,b,a*b);
               break;
           case 4: System.out.printf("la resta entre %d y %d es %d ",a,b,a-b);
               break;
           default: System.out.println ("opcion incorrecta");
            
        } 
            
            
                
                
        
    }
    
    
    
    
}
