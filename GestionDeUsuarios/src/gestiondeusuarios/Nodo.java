
package gestiondeusuarios;

public class Nodo {
    private User dato;
    private Nodo li;
    private Nodo ld;

    public Nodo(User dato) {
        this.dato = dato;
        li=ld=null;
    }

    public User getDato() {
        return dato;
    }

    public void setDato(User dato) {
        this.dato = dato;
    }

    public Nodo getLi() {
        return li;
    }

    public void setLi(Nodo li) {
        this.li = li;
    }

    public Nodo getLd() {
        return ld;
    }

    public void setLd(Nodo ld) {
        this.ld = ld;
    }

    @Override
    public String toString() {
        return dato.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
