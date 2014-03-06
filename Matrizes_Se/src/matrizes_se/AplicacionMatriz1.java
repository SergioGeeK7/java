


import java.util.Scanner;

public class AplicacionMatriz1 {
    
    
    public static void main(String[] args) {
        
        
        Scanner meta = new Scanner(System.in);
        
        System.out.println("Ingrese numero de filas/columnas");
        int f = meta.nextInt(),c = f;
        
        int matri1 [][] = new int[f][c];
        int constanteMagica=0;
        int sum=0;
        boolean sw=true;
        
        
        for (int i = 0; i < f; i++) {
            
            for (int j = 0; j < c; j++) {
                
                System.out.println("Ingrese un numero para la posicion "+(i+1)+" "+(j+1));
                matri1[i][j]=meta.nextInt();
                sum+=matri1[i][j];
                
                
            }
            if (i==0)
                constanteMagica = sum;
            if (sum!=constanteMagica)
                sw=false;
            
            sum=0;
        }
        
        
         for (int i = 0; i < c; i++) {
            
            for (int j = 0; j < f; j++) {
                
                sum+=matri1[j][i];
                
            }
            if (sum!=constanteMagica)
                sw=false;
            
            sum=0;
        }
         
       
       System.out.println(sw+"\n");
       
       
       int mitad = f/2;
       
       if (f%2 == 1) {
          sum =  matri1[mitad][mitad];
       }
       
       for (int i = 0; i < mitad; i++) {

            sum += matri1[i][i] + matri1[c-1-i][c-1-i];
       }
       
       
       if (sum!=constanteMagica)
            sw=false; 
       
        if (sw) 
            System.out.println("ES UN CUADRADO MAGICO !!!");
        else
            System.out.println("No es un cuadrado magico");
        
        
    }
    
    
    
}
