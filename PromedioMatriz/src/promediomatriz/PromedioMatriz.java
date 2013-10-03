package promediomatriz;

import java.util.Scanner;

public class PromedioMatriz {

 
    
    public static void main(String[] args) {
        
        Scanner meta = new Scanner (System.in);
        
        System.out.println("ingrese numero de filas");
        int f=meta.nextInt();
        System.out.println("ingrese numero de columnas");
        int c=meta.nextInt();
        int matriz [][] = new int [f][c];
        double promedio []= new double [f];
        double suma =0;
        
        int cc;
        
        for (int ff=0;ff<f;ff++){
            
            
            for (cc=0;cc<c;cc++){
                
                System.out.println("ingrese un numero");
                matriz[ff][cc]= meta.nextInt();
                suma += matriz[ff][cc];
                
                
            }
            
            promedio[ff] = suma/c;
            suma=0;
            //System.out.println("El Promedio de la Fila "+ff+" es "+ promedio[ff]);
            
        }
        
        
        for(double prome:promedio){
            
            System.out.println("El Promedio de la Fila  es "+ prome);
            
        }
          
        
    }
}