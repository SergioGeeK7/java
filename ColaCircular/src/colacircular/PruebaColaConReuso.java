package colacircular;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PruebaColaConReuso {

    
    public static void main(String[] args) {
        
           ColaCircular miCola = new ColaCircular(10);
        
        Encolador encolador = new Encolador(miCola);
        Desencolador desencolador = new Desencolador(miCola);
       
        
        ExecutorService ejecutor = Executors.newCachedThreadPool();
        ejecutor.execute(encolador);
        ejecutor.execute(desencolador);
        
        
        
        
        
        
    }
    
}
