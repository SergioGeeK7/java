

package ejemplo_hilo2;



    public class Ejemplo_hilo2{
      public static void main(String[] args){
          Hilo1 h1 = new Hilo1("Uno");
          Hilo1 h2 = new Hilo1("Dos");
          Thread t1 = new Thread(h1);
          Thread t2 = new Thread(h2);
          t1.start();
          t2.start();
      }
}
class Hilo1 implements Runnable{
         String s;

         public Hilo1(String s){
              this.s = s;
         }

public void run(){
     for(int i=0; i<10; i++){
          System.out.println(s+" "+i);
          try{
              Thread.sleep(Math.round(Math.random()*1000));           }catch(InterruptedException e){}
      }
  }
}
