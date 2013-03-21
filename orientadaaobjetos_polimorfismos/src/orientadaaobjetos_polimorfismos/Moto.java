
package orientadaaobjetos_polimorfismos;


public class Moto {
    
    private String nombre;
    private int puertas;
    private int ruedas;
    
    
    // constructor1 , el constructor 1 se diferencia del dos, si cuando lo llaman (creando el objeto en main) lo llaman con parametros, si lo llaman sin parametros entrara a luzir el segundo constructor
    
    public Moto (String nombre,int puertas,int ruedas) {
    
    this.nombre=nombre;
    this.puertas=puertas;
    this.ruedas=ruedas;
    
    
}
    
    
    // constructor 2 , el constructor dos se diferencia de no tener parametros de entrada, asi el sabe que lo estan llamando a el
    
    public Moto (){
        
        this.nombre="seryo";
        this.ruedas=2;
        this.puertas=10;
        
        
    }
    
    
    public String nom () {
    
    return nombre;
    
    
}
    
    
     public int rued () {
    
    return ruedas;
    
    
}
     public int puert () {
    
    return puertas;
    
    
}
    
  
    
    
}
