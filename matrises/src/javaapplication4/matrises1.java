
package javaapplication4;
import java.util.*;

public class matrises1 {

 
    
    
    
    
    
    public static void main(String[] args) {
      
        
    
        
        
        
        // si se quiere 10 posiciones se pone 10 pero se escribira del 0 al 9 contando ya las 10 posiciones. y no se puede escribir en la ultima posicion
        
        // matrises tiene filas y columnas. Primero FILAS Y Columnas
        
        // filas y columnas siempre empezando de CERO... 0
        
         
        /*      
          
               0    1   2
            0  A    B   C         ej: buscar vec [0][2] == C
              
            1  D    E   F         Si voy a buscar la I esta en la fila dos columna dos =2,2
                                  porque siempre empieza desde 0, asi que se resta siempre 1 a la fila y columna que se encuentre el elemento            
            2  G    H   I
        
                    
          */          
        // --- PARA SUMAR UN ELEMENTO SIEMPRE SUMAR 1 PARA BUSCAR GRAFICAMENTE , EN LA MENTE
        
        // Utilizaremos vecM   F=Filas     C=Columnas
        
        //Ej == SIEMPRE EMEZAR A CONTAR DESDE CERO  EJ : 2 = 0,1,2  = 3
        // F=2; C=1;
        // vecM[F][C] == H
        
        
        
        // LEST GO!!!
        
        
        
        
        
        Scanner meta=new Scanner(System.in);
        Random random=new Random();
        
       // int vecM[]=new int[7];
        
        
         int F=7,C=7;
         
         
         
        int vecMatris[][]=new int[F][C];
        
        // indices que recorreran la matris
        
       
        
        
      //  for (F=0;F<7;F++){
            
        
        // va a ejecutarse mientras sea menor a la matris.length
        // .length es equivalente a las filas
        
        
        
        // PRIMERO NECESITAMOS UN FOR QUE RECORRERA LAS FILAS *** FILAS ** 
        for (F=0;F<vecMatris.length;F++){
            
         for (C=0;C<vecMatris.length;C++){
             
             vecMatris[F][C]=random.nextInt(9);
             
            // System.out.println("ingrese un numero "+F+"|"+C);
            // vecMatris[F][C]=meta.nextInt();
             
             
             
         }
            
            
            
        }
        
        
            
            
       // Imprimir matris
        
          for (F=0;F<vecMatris.length;F++){
         
         for (C=0;C<vecMatris.length;C++){
             
            // vecMatris[F][C]=random.nextInt(9);
             
           //  System.out.println("ingrese un numero"+F+""+C);
            // vecMatris[F][C]=meta.nextInt();
             
             // OJO PRINTLN SIEMPRE DEJA ESPACIO. PARA IMPRIMIR SEGUIDO UTILIZE PRINT
             
             System.out.print("\t" + vecMatris[F][C]+" ");
             
            // System.out.print("["+F+"]"+"["+C+"]="+vecMatris[F][C]);
             
             
             
         } // fin del ciclo recorrecolumnas
         
            //ahoracambio de fila para imprimir
             System.out.println(" ");
            
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
