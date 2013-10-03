
package multiplicarmatris;

public class MultiplicarMatris {

    public static void main(String[] args) {
         // para poder multiplicarlas el numero de columnas de la matriz 
        // tiene que ser igual al numero de filas de la segunda matris
        
        int matrizdim1  =5;
        int matrizdim2 = 5;
        int matriz2dim1 =5;
        int matriz2dim2 =5;
               
        int  matri1 [][] = new int [matrizdim1][matrizdim2];
        int  matri2 [][] = new int [matriz2dim1][matriz2dim2];
        int  matri3 [][] = new int [matrizdim1][matriz2dim2];
        
        
        for (int i=0;i<matrizdim1;i++){
            
            for (int j=0;j<matrizdim2;j++){
                
                matri1 [i][j]=i + 1;
                matri2 [i][j]=i + 1;
            }
            
        }
        
        // columnas de la matriz 1 iguales a las filas de la matriz 2
        if (matrizdim2 != matriz2dim1){
            System.out.println("No se pueden multiplicar las matrices");
        }else {
            // recorre las filas de la matriz 1
          for (int l=0;l<matrizdim1;l++){
              
              // numero de columnas de la matriz 2 (por la cual se va a multiplicar)
              
              for (int m=0;m<matriz2dim2;m++){
                  
                  // recorre las filas
                  for (int n=0;n<matrizdim2;n++){
                      //end for next column matri3
                
                      
                      // m en columnas  n columnas     n filas  // m en filas
                      matri3 [l][m] += matri1[l][n] * matri2[n][m];
                      
                      
                  }
                  
              }
              
              
          }
          
          
          
          for (int i=0;i<matrizdim1;i++){
              
              System.out.println(" ");
              
          for (int j=0;j<matriz2dim2;j++){
              
              System.out.print(matri3 [i][j]+" ");
              
              
          }
          
              
          }
          
          
            
        }
        
        
        
    }
}
