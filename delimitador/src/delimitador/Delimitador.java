
package delimitador;

import java.util.StringTokenizer;

public class Delimitador {

   
    public static void main(String[] args) {
       
        String nombre="sergio_andres_arboleda_cardona";
        
        StringTokenizer token = new StringTokenizer(nombre,"_");
           System.out.println(token.countTokens());
        while (token.hasMoreTokens()){
         
            
            System.out.print(token.nextToken()+" ");
            
            
        }
        
        
        System.out.print(token.nextToken()+" ");
        
    }
}
