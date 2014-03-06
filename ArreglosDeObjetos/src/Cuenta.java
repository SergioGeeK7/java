
public class Cuenta {

    private String nombre; // nombre del cliente
    private int numero;   // numero de la cuenta
    private double saldo; // saldo de la cuenta

// método para construir una cuenta vacía
    public Cuenta() {
        nombre = "";
        numero = 0;
        saldo = 0.0d;
    }

// método para construir una cuenta con valores
    public Cuenta(int numero, String nombre, double saldo) {
        this.nombre = nombre;
        this.numero = numero;
        this.saldo = saldo;
    }

// método que te dá el nombre de la cuenta 
    public String obtenNombre() {
        return nombre;
    }

// método que te dá el número de la cuenta 
    public int obtenNumero() {
        return numero;
    }

// método que te dá el saldo de una cuenta 
    public double obtenSaldo() {
        return saldo;
    }

// método que sirve para cambiar el valor del nombre
    public void cambiaNombre(String nombre) {
        this.nombre = nombre;
    }

// método que sirve para cambiar el valor del saldo
    public void cambiaNumero(int numero) {
        this.numero = numero;
    }

// método que sirve para cambiar el valor del saldo
    public void cambiaSaldo(double saldo) {
        this.saldo = saldo;
    }

// método para depositar
    public void deposita(double cantidad) {
        cambiaSaldo(obtenSaldo() + cantidad);
    }

// método para retirar
    public boolean retira(double cantidad) {
        if (cantidad <= obtenSaldo()) {
            cambiaSaldo(obtenSaldo() - cantidad);
            return true;
        }
        return false;
    }
}
