package ejemplo_hilo;


        
    public class Ejemplo_hilo{
     public static void main(String[] args){
          Hilo1 h1 = new Hilo1("Uno");
          Hilo1 h2 = new Hilo1("Dos");
          Hilo1 h3 = new Hilo1("Tres");
          Hilo1 h4 = new Hilo1("Cuatro");
          h1.start(); h2.start();h3.start();h4.start();
     }
}

