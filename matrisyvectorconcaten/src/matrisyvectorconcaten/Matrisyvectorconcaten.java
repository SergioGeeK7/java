
package matrisyvectorconcaten;
import java.util.*;
public class Matrisyvectorconcaten {

 
    public static void main(String[] args) {
       
        Scanner meta=new Scanner (System.in);
        
        System.out.println("ingrese numero de columnas y filas");
        int f=meta.nextInt(),c=meta.nextInt();
        int matris[][]=new int [f][c]; 
        
        
        int cont=0,cont2=0,cont3=0,cc=c;
        
        for (f=0;f<matris.length;f++){
            
            
            for (c=0;c<cc;c++){
                
                
                System.out.println("ingrese un numero");
                matris[f][c]=meta.nextInt();
               
                
                if (matris[f][c]%2==0){
                    
                    cont++;
                    
                   
                }else {
                    
                    cont2++;
                    
                }
                
                if (matris[f][c]%10==0){
                    
                    cont3++;
                    
                }
                
                
            }
            
        }
        
        
        
        int vecpar []=new int [cont];
        double vecimpar []=new double [cont2];
        int vecmultip []=new int [cont3];
        double vecconcaten []=new double [cont+cont2+cont3];
        
        int aux=0,aux2=0,aux3=0;
        
        
           for (f=0;f<matris.length;f++){
            
            
            for (c=0;c<cc;c++){
                
                
             
                
                if (matris[f][c]%2==0){
                    
                    
                    vecpar[aux]=matris[f][c];
                    vecconcaten[aux]=matris[f][c];
                    aux++;
                    
                    
                    
                    
                }else {
                    
                    
                    vecimpar[aux2]=Math.sqrt(matris[f][c]);
                    vecconcaten[cont+aux2]=vecimpar[aux2];
                    // sacar la raiz
                    
                    aux2++;
                    
                }
                
                if (matris[f][c]%10==0){
                    
                    vecconcaten[cont+cont2+aux3]=matris[f][c];
                    
                    vecmultip[aux3]=matris[f][c];
                    
                    aux3++;
                    
                }
                
                
            }
            
        }
       
           
           for (aux=0;aux<vecpar.length;aux++){
               
               
               System.out.print(vecpar[aux]+" ");
           }
           System.out.println(" ");
        
         for (aux=0;aux<vecimpar.length;aux++){
               
               
               System.out.print(vecimpar[aux]+" ");
           }
           System.out.println(" ");
         for (aux=0;aux<vecmultip.length;aux++){
               
               
               System.out.print(vecmultip[aux]+" ");
           }
           System.out.println(" ");
        
           
           
           // mostrar concaten
           
           
          for (aux=0;aux<vecconcaten.length;aux++){
               
               
               System.out.print(vecconcaten[aux]+" ");
           }
           
         
        
    }
}
