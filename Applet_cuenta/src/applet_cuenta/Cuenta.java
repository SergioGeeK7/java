
package applet_cuenta;



public class Cuenta {
    
 private   int numero;
 private   String nombre;
 private   double saldo;
    
    public Cuenta (){
        
        this.nombre="Sergio";
        this.numero=0000000;
        this.saldo=0000000;
        
        
    }
    
     public Cuenta (String nombre,int numero,double saldo){
        
        this.nombre=nombre;
        this.numero=numero;
        this.saldo=saldo;
        
    }
     
     
     
     public int numerodecuenta (){
         
         
         return this.numero;
         
         
     }
     
     
     public double saldodecuenta (){
         
         return this.saldo;
     }
     
     
     public String nombredecuenta (){
         return this.nombre;
     }
    
     
     
     public void actualizanumero (int numero){
         
         this.numero=numero;
         
     }
     
     public void actualizanombre (String nombre){
         this.nombre=nombre;
     }
     
     public void actualizasaldo (double saldo){
         this.saldo=saldo;
     }
    
    
    
}
