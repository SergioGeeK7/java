
package orientadaaobjetos_polimorfismos;


public class Orientadaaobjetos_polimorfismos {

   
    public static void main(String[] args) {
        
       
     Moto polimorfi = new Moto ("seryino",20,40);
     Moto polimorfi2 = new Moto ();  
     
     System.out.println("primer constructor con parametros");
     
     System.out.println("nombre "+polimorfi.nom());
     System.out.println("ruedas "+polimorfi.rued());
     System.out.println("puertas "+polimorfi.puert());
        
     System.out.println("");
     System.out.println("ahora te mostrare el segundo constructor que tiene el mismo nombre pero sin parametros");
     
     
     System.out.println("nombre "+polimorfi2.nom());
     System.out.println("ruedas "+polimorfi2.rued());
     System.out.println("puertas "+polimorfi2.puert());     
     
     
     
    
    }
}
