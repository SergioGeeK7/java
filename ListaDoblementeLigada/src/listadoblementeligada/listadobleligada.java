
package listadoblementeligada;

import java.util.logging.Level;
import java.util.logging.Logger;


public class listadobleligada {
   private Nodo p;
   private Nodo u;
   private int contadorNodos;

    public listadobleligada() {
        p=u=null;
        contadorNodos=0;
    }
    public boolean estaVacia(){
        return p==null;
    }
    public void add(Object dato){
        contadorNodos++;
        Nodo nodo=new Nodo(dato);
        if(estaVacia()){
            p=u=nodo;
            return;
        }
        nodo.setLi(u);
        u.setLd(nodo);
        u=nodo;
    }
    
    public void insert (Object dato,int pos){
        
        if(pos > contadorNodos){ // si la posicion a insertar es mayor a el de el 
            add(dato);
            return;
        }
        Nodo nodo = new Nodo(dato);
        contadorNodos++;
        if(pos == 1){
            nodo.setLd(p);
            p.setLi(nodo);
            p = nodo;
            return;
        }
        
        Nodo i = p;
        int conNod = 1; // empezamos en el primer nodo
        
        //while(i.getLd() != null && )
        while (conNod != pos){ // cuando llege a 4 se sale
            
            i = i.getLd();
            conNod++;
            
        }
        
        i.getLi().setLd(nodo);
        nodo.setLi(i.getLi());
        i.setLi(nodo);
        nodo.setLd(i);
        
        
        
    }
    
    
    public String delete (int pos){
        if (pos>contadorNodos) {
            return "Posicion invalida";
        }
        
        
        Nodo i= p;
        
        if (pos == 1) {
            
        p = p.getLd();
            try {
                i.finalize();
            } catch (Throwable ex) {
                Logger.getLogger(listadobleligada.class.getName()).log(Level.SEVERE, null, ex);
            }
            contadorNodos--;
            return "Fue eliminado";
        }
         if (pos == contadorNodos) {
             i = u;
             u = u.getLi();
            try {
                u.finalize();
            } catch (Throwable ex) {
                Logger.getLogger(listadobleligada.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        
        int con=1;
        while(con != pos){
            i = i.getLd();
            con++;
        }
        
        
        i.getLi().setLd(i.getLd());
        i.getLd().setLi(i.getLi());
        
       try {
           i.finalize();
       } catch (Throwable ex) {
           Logger.getLogger(listadobleligada.class.getName()).log(Level.SEVERE, null, ex);
       }
       contadorNodos--;
       return "Fue eliminado" ;
        
        
    }

    @Override
    public String toString() {
        String aux="";
        Nodo i=p;
        while(i!=null){
            aux+=String.format("%5s", i.toString());
            i=i.getLd();
        }
        return aux;
    }
    
   
}
