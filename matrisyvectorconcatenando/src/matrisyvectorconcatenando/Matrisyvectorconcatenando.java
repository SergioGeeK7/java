
package matrisyvectorconcatenando;
import java.util.*;
public class Matrisyvectorconcatenando {

   
    public static void main(String[] args) {
        
        Scanner meta=new Scanner (System.in);
        System.out.println("ingrese numero de filas y columnas");
        int f=meta.nextInt(),c=meta.nextInt();
        int matri[][]=new int [f][c];
        int aux=0,aux2=0,aux3=0,ff=f,cc=c;
       
        
        for (f=0;f<ff;f++){
            
            for (c=0;c<cc;c++){
                
                System.out.println("ingrese un numero numero");
                matri[f][c]=meta.nextInt();
                
                if (matri[f][c] != 0 && matri[f][c]%2==0){
                    
                    aux++;
                } else {
                    
                    aux2++;
                }
                
                if (matri[f][c]%10==0) {
                    aux3++;
               
                    
            }
            
            
        }
        
        }
        
        
        int pares[]=new int [aux],multiplos[]= new int [aux3],cont=0,cont2=0,cont3=0;
        double raiz[] =new double [aux2],contaten[]=new double [aux+aux2+aux3];
       
        
         for (f=0;f<ff;f++){
            
            for (c=0;c<cc;c++){
                      
                  if (matri[f][c] != 0 && matri[f][c]%2==0){
                      
                    pares [cont]=matri[f][c];
                    
                    contaten[cont]= matri[f][c];
                    
                    cont++;
                    
                }else {
                    
                   raiz [cont2]=Math.sqrt(matri[f][c]);
                   contaten[aux+cont2]= raiz [cont2];
                   cont2++;
                   
                }
                
                if (matri[f][c]%10==0) {
                    
                    multiplos [cont3]=matri[f][c];
                    contaten[aux+aux2+cont3]= matri[f][c];
                    cont3++;
                    
                }
          
                
            }
        
         }
        
    
         
         System.out.println("vector pares");
         
         for (cont=0;cont<pares.length;cont++){
             
             System.out.print(" "+pares[cont]+" ");
             
         }
          System.out.println("");
          System.out.println("vector raiz");
          
           for (cont=0;cont<raiz.length;cont++){
             
             System.out.print(" "+raiz[cont]+" ");
             
         }
           
            System.out.println("");
            System.out.println("vector multiplos");
         
           for (cont=0;cont<multiplos.length;cont++){
             
             System.out.print(" "+multiplos[cont]+" ");
             
         }
            System.out.println("");
            System.out.println("vector concatenado");
           
            for (cont=0;cont<contaten.length;cont++){
             
             System.out.print(" "+contaten[cont]+" ");
             
         }
        
        
    }
}
