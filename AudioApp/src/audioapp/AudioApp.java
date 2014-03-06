
package audioapp;

import java.applet.*;
import java.awt.Button;
public class AudioApp extends Applet implements Runnable{


   Button b1,b2,b3;

    AudioClip sonido;
    Thread miThread;
    
    public AudioApp (){
        
        b1 = new Button ("one");
        b2 = new Button ("bell");
        b3 = new Button ("eminem");
        
        add(b1);
        add(b2);
        add(b3);
        
        
    }
    
    
    
    
    
    public void init() {
	sonido = getAudioClip(getDocumentBase(), "one.wav");
    }
    public void start() {
        if (miThread == null) {
            miThread = new Thread(this);
            miThread.start();
        }
    }   
    public void stop() {
        if     (miThread!= null) {
	    if (sonido != null) {
	        sonido.stop();
		sonido  = null;
	    }
	    miThread.stop();	
	    miThread = null;
    }	}
    public void run() {
        if (sonido != null) {
            sonido.loop();
    }	
    }
}


    

