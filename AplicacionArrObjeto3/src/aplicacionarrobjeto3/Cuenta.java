
package aplicacionarrobjeto3;

/**
 * Clase generadora de cuentas
 * 
 * @author nolfin
 * @version 1.0
 */
public class Cuenta {
    
   private String   nombre; 
   private int      numero;   
   private double   saldo; 
   
  /**
 * Clase genera una cuenta vacia
 */
   public Cuenta() { 
       
      nombre = "";
      numero = 0;
      saldo = 0.0d;
   }
 
 /**
 * método para construir una cuenta con valores
 * 
 * @param  numero <code>String</code> numero de la cuenta  
 * @param  nombre <code>int</code> nombre de la cuenta
 * @param  saldo <code>double</code> saldo de la cuenta
 */
   public Cuenta(int numero, String nombre,  double saldo) { 
       
      this.nombre = nombre;
      this.numero = numero;
      this.saldo = saldo;
   }
 
  /**
 * método que te dá el nombre de la cuenta 
 * 
 * @return <code>String</code> retorna el nombre de la cuenta
 */
   public String obtenNombre() { 
       
      return nombre;
   }
   
 /**
 * método que te dá el numero de la cuenta 
 * 
 * @return <code>int</code> retorna el numero de la cuenta
 */
   public int obtenNumero() { 
       
      return numero;
   }
   
 /**
 * método que te dá el saldo de la cuenta 
 * 
 * @return <code>double</code> retorna el saldo de la cuenta
 */
   public double obtenSaldo() { 
       
      return saldo;
   }
    
 /**
 * método que sirve para cambiar el valor del nombre
 * 
 * @param nombre <code>String</code> nuevo nombre de la cuenta
 */
   public void cambiaNombre(String nombre) { 
       
		this.nombre = nombre;
   }

 /**
 * método que sirve para cambiar el numero de la cuenta
 * 
 * @param numero <code>int</code> nuevo numero de la cuenta
 */
   public void cambiaNumero(int numero) { 
       
		this.numero = numero;
   }

 /**
 * método que sirve para cambiar el valor del saldo
 * 
 * @param saldo <code>double</code> nuevo saldo de la cuenta
 */
   public void cambiaSaldo(double saldo) { 
       
		this.saldo = saldo;
   }
   
 /**
 * metodo para depositar
 * 
 * @param cantidad <code>double</code> cantidad a depositar a la cuenta
 */
   public void deposita(double cantidad) {
       
   	    cambiaSaldo(obtenSaldo() + cantidad);
   }
   
 /**
 * metodo para retirar
 * 
 * @param cantidad <code>double</code> cantidad que desea retirar
 * @return si tiene saldo suficiente
 */
   public boolean retira(double cantidad) {
       
   	    if (cantidad <= obtenSaldo()) {
   	    	cambiaSaldo(obtenSaldo() - cantidad);
   	    	return true;
   	    }
            
   	    return false;
   }
   
   /**
 * metodo para regresar un String como objeto
 * 
 * @return numero nombre y saldo de la cuenta
 */
   public String toString() {
       
   	    return obtenNumero() + " " + obtenNombre() + " " + obtenSaldo();
   }
}