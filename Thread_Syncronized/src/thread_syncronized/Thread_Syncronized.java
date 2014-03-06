 

package thread_syncronized;
public class Thread_Syncronized {
    
    
    public static void main(String[] args) {
        Contador c = new Contador();
        Suma s = new Suma(c);
        Resta r = new Resta(c);
        s.start();
        r.start();
    }
    
}

class Contador{
    public int contador = 0;

    synchronized void sumaUno(){
        contador++;
        System.out.print("Suma: ");
        System.out.println(contador);
    }

    synchronized void restaUno(){
        contador--;
        System.out.print("Resta: ");
        System.out.println(contador);
    }
}

class Suma extends Thread{
    Contador c;

    public Suma(Contador c){
        this.c = c;
    }

    public void run(){
        for(int i=0;i<10;i++)
            c.sumaUno();
    }
}

class Resta extends Thread{
    Contador c;

    public Resta(Contador c){
        this.c = c;
    }

    public void run(){
        for(int i=0;i<10;i++)
            c.restaUno();
    }
}
