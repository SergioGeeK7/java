/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package thread1;

public class Thread1 {
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
	 public void sumaUno(){
		contador++;	
		System.out.print("Suma: ");
		try{
			Thread.sleep(500);
		}catch(InterruptedException e){}
        	System.out.println(contador);
    	}


     public void restaUno(){
        	contador--;
        	System.out.print("Resta: "); // cuando se ejecuta este medoto se ejecutara otro hilo 
                try{                        // ya que es un metodo entrada salida
			Thread.sleep(500);
		}catch(InterruptedException e){}
                
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
