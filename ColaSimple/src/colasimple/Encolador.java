package colasimple;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Encolador implements Runnable{

    
    private ColaConReuso cola;

    public Encolador(ColaConReuso cola) {
        this.cola = cola;
    }

    @Override
    public void run() {
     
        
        
     Random rd = new Random();
     int time = rd.nextInt(500);
        try {
            while (true) {
                Thread.sleep(time);
                int dato = rd.nextInt(100);
                System.out.println(cola.encolar(dato));
            }
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Encolador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
    
    
}
