package colasimple;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Desencolador implements Runnable{

    
    private ColaConReuso cola;

    public Desencolador(ColaConReuso cola) {
        this.cola = cola;
    }

    @Override
    public void run() {
     
        
        
     Random rd = new Random();
     int time = rd.nextInt(2000);
        try {
            while (true) {
                Thread.sleep(time);
                System.out.println(cola.desencolar());
            }
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Desencolador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
    
    
}
