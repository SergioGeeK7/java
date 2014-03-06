

package colasimple;


public class ColaConReuso {
    
    private Object arr[];
    private int max;
    private int p;//primero
    private int u;//ultimo

    public ColaConReuso(int max) {
        this.max = max;
        arr = new Object [max];
        p = u = 0 ;
    }
    
    
    private boolean estaVacia(){
        return p==u;
    }
    
    private boolean estaLlena(){
        return u==max;
    }
    
    
    public String encolar(Object dato){
        
        if (estaLlena()) {
            return "Cola LLena";
        }
        
        arr[u]=dato;
        u++;
        return "Se encolo \t"+dato+"\tP= "+p+"\tu =) "+u;
        
    }
    
    public String desencolar(){
        
        if (estaVacia()) {
            return "Cola Vacia";
        }
        
        Object aux = arr[p];
        p++;
        
        return "Se desencolo \t"+aux+"\tP= "+p+"\tu =) "+u;
        
    }
    
    

    
    
    
    
}
