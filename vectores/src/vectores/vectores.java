
package javaapplication7;
import java.util.Scanner;

public class vectores {

   
    public static void main(String[] args) {
       
        
        
        int a[]=new int[7];
       
        a[0]++;
        a[1]++;
        a[2]=7;
        a[3]=4;
        a[4]=9;
        a[5]=1;
        a[6]=2;
        //a[7]=7;
        
        
        mostrar(a,3);
        vector2();
        
        
        
    }
    
    
    public static void mostrar (int v[],int p){
        
        System.out.println("el vector en posicion tres, es de valor"+v[p]);
        
        p=0;
        
        System.out.println("el vector en posicion tres, es de valor"+v[p]);
        
        
    }
    
    
    public static void vector2 (){
        
        
        Scanner entrar=new Scanner(System.in);
        
        System.out.println("ingrese numero de posiciones que desea en el vector");
        //int vect[]=entrar.nextFloat();
        
        int t=entrar.nextInt();
        int vec[]=new int [t];
        
        
    
        
        
        
        
    }
    
    
    
}
