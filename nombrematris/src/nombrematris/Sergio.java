
package nombrematris;
import java.util.*;
public class Sergio {

  
    public static void main(String[] args) {
        
        Scanner meta=new Scanner (System.in);
        Letras nextletra= new Letras ();
        System.out.println("ingrese numero de Filas y Columnas");
        int f=meta.nextInt(),c=meta.nextInt();
        
        if (f>2 && f==c && f%2==1 ){
            
           nextletra.s(f, c);
           nextletra.e(f, c);
           nextletra.r(f, c);
           nextletra.g(f, c);
           nextletra.i(f, c);
           nextletra.o(f, c);
        } else  System.out.println("Lo siento no cumplio las condiciones");
        
        
    }
}
