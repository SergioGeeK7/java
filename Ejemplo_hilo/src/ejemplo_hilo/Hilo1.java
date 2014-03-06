package ejemplo_hilo;


import static java.lang.Thread.sleep;

public class Hilo1 extends Thread{
     String s;

     public Hilo1(String s){
          this.s = s;
     }

     public void run(){
          for(int i=0; i<10; i++){
             System.out.println(s+" "+i);
              try{
                    sleep(Math.round(Math.random()*1000));               }catch(InterruptedException e){}
          }
     }
}
