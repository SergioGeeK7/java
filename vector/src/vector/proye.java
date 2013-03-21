
package javaapplication1;



import java.util.Scanner;
public class proye {

   
    public static void main(String[] args) {
       
        
       Scanner meta=new Scanner (System.in);
       int vec[]=new int [5];
       int vec2[]=new int [5];
       int vec3[]=new int [10];
       int cont2;
       
       System.out.println("hh");
       
       for (int cont=0;cont>=5;cont++ ) {
           
           cont2=0;
           vec[cont]=meta.nextInt();
           vec2[cont]=meta.nextInt();
           
           while (cont2>=0){
               
            vec3[cont]=vec[cont]; 
            
            vec3[cont+1]=vec2[cont];
            
            cont2=0;
            
           }
           
           
           for (int con=0;con>=5;con++){
               
               System.out.println("el vector 1 se encuentra en"+vec[con]);
               
               System.out.println("el vector 2 se encuentra en"+vec2[con]);
               
               System.out.println("el vector 3 se encuentra en"+vec3[con]);
           }
           
           
       }
        
        
        
        
    }
}
