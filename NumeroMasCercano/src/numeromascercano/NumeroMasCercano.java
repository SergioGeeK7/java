

package numeromascercano;

import java.util.Scanner;

public class NumeroMasCercano {

  
    public static void main(String[] args) {
        Scanner meta=new Scanner (System.in);
        //int [][] matriz = {{2,4,4},{6,6,9},{8,10,12}};
        // o comparar numero por numero y asi sacar un valor mas exacto Lgn
        System.out.println("Ingrese el valor a comparar");
        int compara = meta.nextInt();
        
        int array [] = {6,7,8,11};
        int aux;
        int aux2=999999999;
        int Maproximado=0;
        
        for (int i :array){
            
            if(i>compara){
                
                aux= i-compara;
            }else{
                
                aux = compara-i;
            }
            
            if(aux<aux2){
                aux2=aux;
                Maproximado=i;
            }
            
            
            
        }
        
        System.out.println(Maproximado);
        

    }
      
    
}