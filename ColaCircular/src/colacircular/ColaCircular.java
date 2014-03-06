

package colacircular;


public class ColaCircular {
    
    private Object arr[];
    private int max;
    private int p;//primero
    private int u;//ultimo

    public ColaCircular(int max) {
        this.max = max;
        arr = new Object [max];
        p = 0;
        u = 1;
    }
    
    
    private boolean estaVacia(){
        return u>p && u-p==1;
    }
    
    private boolean estaLlena(){
        return p==u;
    }
    
    
    public String encolar(Object dato){
        
        if (estaLlena()) {
                return "Cola LLena";
        }
        
        arr[u]=dato;
        u++;
        if (u==max) {
            u=0;
        }
        return "Se encolo \t"+dato+"\tP= "+p+"\tu =) "+u;
        
    }
    
    public String desencolar(){
        
        if (estaVacia()) {
            return "Cola Vacia";
        }
        p++;
        if (p==max) {
            p=0;
        }
        return "Se desencolo \t"+arr[p]+"\tP= "+p+"\tu =) "+u;
        
    }
    
    
    
    
    
}
