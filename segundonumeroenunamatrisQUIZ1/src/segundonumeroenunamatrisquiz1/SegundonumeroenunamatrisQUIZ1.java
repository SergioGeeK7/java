/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package segundonumeroenunamatrisquiz1;


import java.util.*;
/**
 *
 * @author salaf409
 */
public class SegundonumeroenunamatrisQUIZ1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
      Scanner meta=new Scanner(System.in);
      
      
      System.out.println("ingrese numero de filas ");
     
      
      
      
      
      
      
      int f=meta.nextInt();
       System.out.println("ingrese numero de columnas ");
      int c=meta.nextInt();
      int matriz [][]=new int [f][c];
      
      int cont=0,cont2=0;
      
      int cc=c;
      
      for (f=0;f<matriz.length;f++){
          
          for (c=0;c<cc;c++){
              
              System.out.println("ingrese un numero");
              matriz[f][c]=meta.nextInt();
              
              if (matriz[f][c]>99 && matriz[f][c]<1000){
                  
                  
                  cont++;
                  
              }
              
              
                if (matriz[f][c]>999 && matriz[f][c]<10000){
              
               cont2++;
                    
          }
          
      }
      
      }
        
      
      double vectres []=new double [cont];
      int veccuatro []=new int [cont2];
      
      int aux;
      double aux2;
      
      cont=0;
      cont2=0;
      
      for (f=0;f<matriz.length;f++){
          
          for (c=0;c<cc;c++){
              
           
              
              if (matriz[f][c]>99 && matriz[f][c]<1000){
                  
                  
                  
                  aux2=matriz[f][c]%10;
                  vectres [cont]=Math.sqrt(aux2);
                  
                  
                  
                  cont++;
                  
                  
                  
              }
              
              
                if (matriz[f][c]>999 && matriz[f][c]<10000){
              
                    
                 aux=matriz[f][c]/10; 
                 aux=aux/10;
                 aux=aux%10;   
                    
                 veccuatro[cont2]=aux;
                    
               cont2++;
                    
          }
          
      }
      
      }
      
      
      
      
      for (aux=0;aux<vectres.length;aux++){
          
          
          System.out.print(vectres[aux]+" ");
          
          
      }
      
      
      System.out.println("");
   for (aux=0;aux<veccuatro.length;aux++){
          
          
          System.out.print(veccuatro[aux]+" ");
          
          
      }
        
        
        
    }
}