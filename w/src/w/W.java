/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package w;


import java.util.*;
/**
 *
 * @author salaf409
 */
public class W {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

      Scanner  leer=new Scanner(System.in);
      
      int i, j, f, c, mf, mc;
      System.out.print("dijite el tamño de las filas");
       f= leer.nextInt(); 
       System.out.print("dijite el tamño de las filas");
       c= leer.nextInt(); 
       
       
       
       if (c==0){
           
           
           
       }
       
       
       if ((c>2)&&(c==f)&&(c%2==1)&&(f%2==1)){
           
           int mat [][] =new int [f][c];
           
           for (i=0; i<f;i++){
               
           for (j=0;j<c;j++){
               
               mat [i][j]=0; 
               
           }// for (j=0;j<c;j++){  
           }//for (i=0; i<f;i++){ 
           
           j=0;
           
           for (i=0; i<f;i++){
               mat [i][j]=1; 
               
           }//for (i=0; i<f;i++){
           
           mf=((f+1)/2)-1;
           mc=((c+1)/2)-1; 
           
           j=mc;
           
           for (i=mf;i<f;i++){
               mat[i][j]=1; 
               
               j=j-1;
               
               
           }//for (i=mf;i<c;i++){
           
           j=mc;
           for (i=mf;i<f;i++){
               mat[i][j]=1; 
               j=j+1;
               
           }
           
           j=c-1;
           
           for (i=0;i<f;i++){
               
                 mat[i][j]=1; 
               
           }
           
           for (i=0;i<f;i++){
               for (j=0;j<c;j++){
                   
                   System.out.print("\t" + mat[i][j]);
               }
               
                System.out.println("");
           }
           
      }//if ((c>2)&&(c==f)&&(c%2==1)&&(f%2==1)){
           
        
        
    }
}
