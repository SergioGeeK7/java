



import java.util.Scanner;

public class Matrizes_Se {
    
    public static void main(String[] args) {
        
        
        Scanner meta = new Scanner(System.in);
        
        System.out.println("Ingrese numero de filas");
        int f = meta.nextInt();
        System.out.println("Ingrese numero de columnas");
        int c = meta.nextInt();
        
        int matri1 [][] = new int[f][c];
        
        
        for (int i = 0; i < f; i++) {
            
            for (int j = 0; j < c; j++) {
                
                System.out.println("Ingrese un numero para la posicion "+(i+1)+" "+(j+1));
                matri1[i][j]=meta.nextInt();
            }
            
            
        }
        
        int matri2 [][] = new int[f][c];
        System.out.print("Matriz original \n");
        for (int i = 0; i < f; i++) {
            
            for (int j = 0; j < c; j++) {
                
                matri2 [f-1-i][c-1-j] =  matri1[i][j];
                System.out.print(matri1[i][j]+" ");
            }
            System.out.println("");
            
        }
        
        
        System.out.print("Matriz al revez \n");
        for (int i = 0; i < f; i++) {
            
            for (int j = 0; j < c; j++) {
                
                
                System.out.print(matri2[i][j]+" ");
            }
            System.out.println("");
            
        }
        
        
        
        
    }
    
}
