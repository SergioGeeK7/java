

package javaapplication1;


public class Nodo {
    
    
    Object dato;
    Nodo nodo;
    
     public Nodo() {
        
        nodo = null;
        dato = null;
    }

    public Nodo(Object dato) {
        this.dato = dato;
        nodo = null;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Nodo getNodo() {
        return nodo;
    }

    public void setNodo(Nodo nodo) {
        this.nodo = nodo;
    }
    
    public void insertar (Object dato){
        Nodo nodo = new Nodo(dato);
        
        if (this.nodo==null) {
            
            this.nodo = nodo;
            return;
        }
        
        Nodo aux = this.nodo;
        
        while(aux.getNodo() != null){
            
            aux = aux.getNodo();
            
        }
        
        aux.setNodo(nodo);
        
        
        
    }

    
    public String toString() {
        
        String aux="";
        
        Nodo aux2 = nodo;
        
        while(aux2 != null){
            aux +="\n"+aux2.getDato().toString();
            aux2 = aux2.getNodo();
        }
        
        
        
        return aux;
    }
    
    
    
    
    
    
}
