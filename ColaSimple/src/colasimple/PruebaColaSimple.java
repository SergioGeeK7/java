
package colasimple;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PruebaColaSimple {
    public static void main(String[] args) {


        ColaSimple miCola = new ColaSimple(10);
        
        Encolador encolador = new Encolador(miCola);
        Desencolador desencolador = new Desencolador(miCola);
       
        
        ExecutorService ejecutor = Executors.newCachedThreadPool();
        ejecutor.execute(encolador);
        ejecutor.execute(desencolador);
        
        
        
    }
    
}
