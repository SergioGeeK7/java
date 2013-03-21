
package javaapplication14;

import java.util.Scanner;


public class proye {

   
    public static void main(String[] args) {
       
        
       Scanner meta=new Scanner (System.in);
       int vec[]=new int [5];
       int vec2[]=new int [5];
       double vec3[]=new double [10];
       int cont2;
       double sum=0;
       
       
       for (int cont=0;cont<5;cont++ ) {
           
           cont2=2;
           vec[cont]=meta.nextInt();
           vec2[cont]=meta.nextInt();
           
           while (cont2>1) {
               
            vec3[cont]=vec[cont]; 
            
            vec3[cont+5]=vec2[cont];
            
            cont2=0;
            
            sum=sum+vec3[cont]+vec3[cont+5];
           }
           
       }
           
           for (int con=0;con<5;con++){
               
               System.out.println("el vector 1 se encuentra en "+vec[con]);
               
               System.out.println("el vector 2 se encuentra en "+vec2[con]);
               
              
           }
           
             for (int con=0;con<10;con++){
               System.out.printf("el vector 3 se encuentra en %1.0f%n",vec3[con]);
               //System.out.println("el vector 3 se encuentra en "+vec3[con]);
             }
             
             System.out.println(sum);
             System.out.printf("el promedio del vector concatenado es %f%n",sum/10);
             
          
             
             
       }
      
  
    
    
    }
