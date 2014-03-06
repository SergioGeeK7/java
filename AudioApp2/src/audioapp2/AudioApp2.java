
package audioapp2;

import java.applet.*;
import java.net.*;


   


public class AudioApp2 extends Applet {
    
    public void init() {
	URL url;
        try {
        	     url = new URL("http://sharemobile.ro/data/share/Eminem_Mockingbird_.wav");
	} catch (MalformedURLException e) {
	    return;
	}
	play(url);
    }
}
    
    
    
    

