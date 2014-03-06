
package ejemplo_hilo3;

import java.awt.TextField;

class Cuenta extends Thread{
long deltaT;
int cuenta=0;
TextField caja;
boolean contando = true;

        public Cuenta(long deltaT, TextField caja){
            this.deltaT = deltaT;
            this.caja = caja;
        }

        public void run(){
                while(contando){
                    cuenta ++;
                    caja.setText(Integer.toString(cuenta));
                    try{
                        sleep(deltaT);
                    } catch (InterruptedException e){}
                }
                caja.setText("Ya se murió");
        }

}
