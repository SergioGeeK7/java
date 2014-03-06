
import java.io.*;

public class AplicacionArrObjeto2 {

    private static Cuenta arreglo[];

    // para pedir los valores de teclado de el  arreglo de cuentas ya creada
    public static void pide_arreglo() throws IOException {
        BufferedReader in
                = new BufferedReader(new InputStreamReader(System.in));

        int n;
        int numero;
        String nombre;
        double saldo;
        System.out.println("¿Cuantos objetos deseas crear?");
        n = Integer.parseInt(in.readLine());

        // creamos el arreglo de cuentas
        arreglo = new Cuenta[n];

        // pedimos cada valor para crear un objeto cuenta 
        for (int i = 0; i < n; i++) {
            System.out.print("Da el numero de la cuenta " + (i + 1) + " : ");
            numero = Integer.parseInt(in.readLine());
            System.out.print("Da el nombre de la cuenta " + (i + 1) + " : ");
            nombre = in.readLine();
            System.out.print("Da el saldo de la cuenta " + (i + 1) + " : ");
            saldo = Double.parseDouble(in.readLine());
            // se crea el objeto de la clase Cuenta como elemento del arreglo
            arreglo[i] = new Cuenta(numero, nombre, saldo);
        }
    }

    // para desplegar los datos del arreglo de cuentas
    public static void despliega_arreglo() {
        System.out.println("Numero     Nombre           Saldo");
        for (Cuenta objeto : arreglo) {
            System.out.println(" " + objeto.obtenNumero() + " "
                    + objeto.obtenNombre() + " " + objeto.obtenSaldo());
        }
    }

    
    public static Cuenta lookForId() throws IOException{
        
        Cuenta mayor= arreglo[0];
        BufferedReader meta
                = new BufferedReader(new InputStreamReader(System.in));
        
        int id = new Integer(meta.readLine());
        
        for (Cuenta objeto : arreglo) {
			if (objeto.obtenNumero() == id) {
				return objeto;
			}
        }
        return null;
        
    }
    
     public static Cuenta lookForUser() throws IOException{
        
        Cuenta mayor= arreglo[0];
        BufferedReader meta
                = new BufferedReader(new InputStreamReader(System.in));
        
        String username = meta.readLine();
        
        for (Cuenta objeto : arreglo) {
			if (objeto.obtenNombre().equals(username)) {
				return objeto;
			}
        }
        return null;
        
    }
    
    
    
    // obteniendo la suma de los saldos de todas las cuentas
    public static double suma() {
        double total = 0.0d;

        for (Cuenta objeto : arreglo) {
            total += objeto.obtenSaldo();
        }
        return total;
    }

    // para calcular el promedio de la matriz cualquiera que sea
    public static double promedio() {
        double total = 0.0d;

        for (Cuenta objeto : arreglo) {
            total += objeto.obtenSaldo();
        }
        return total / arreglo.length;
    }

    // pedir un saldo y desplegar que tienen un saldo mayor o igual
    public static void despliega_saldos() throws IOException {
        BufferedReader in
                = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("¿Arriba de cual saldo?");
        double saldo = Double.parseDouble(in.readLine());

        // buscamos en cada objeto Cuenta del arreglo
        for (Cuenta objeto : arreglo) {
            if (objeto.obtenSaldo() >= saldo) {
                System.out.println(" Nombre " + objeto.obtenNombre()
                        + " Cuenta " + objeto.obtenNumero()
                        + " Saldo " + objeto.obtenSaldo());
            }
        }
    }

    public static void main(String[] args) throws IOException {

        char opcion;
        BufferedReader in
                = new BufferedReader(new InputStreamReader(System.in));

        arreglo = null;
        opcion = ' ';
        while (opcion != '0') {
            System.out.println(" Menu de Cuentas");
            System.out.println();
            System.out.println("1. Pedir datos para crear Cuentas");
            System.out.println("2. Desplegar todas las cuentas");
            System.out.println("3. Desplegar Suma de los saldos");
            System.out.println("4. Desplegar Promedio de los saldos");
            System.out.println("5. Desplegar Cuentas arriba de un Saldo");
            System.out.println("6. Buscar cuenta por numero");
            System.out.println("7. Buscar cuenta por nombre");
            System.out.println("0. Fin");
            System.out.println("¿Opcion deseada (1-6) ?");
            opcion = in.readLine().charAt(0);
            switch (opcion) {
                case ('1'):
                    System.out.println("Pidiendo datos arreglo Cuentas");
                    pide_arreglo();
                    System.out.println(" " + arreglo.length);
                    break;
                case ('2'):
                    System.out.println("Desplegando arreglo de Cuentas");
                    despliega_arreglo();
                    break;
                case ('3'):
                    System.out.println("Suma de los saldos = " + suma());
                    break;
                case ('4'):
                    System.out.println("Promedio de los saldos = " + promedio());
                    break;
                case ('5'):
                    System.out.println("Desplegando Cuentas arriba de saldo");
                    despliega_saldos();
                    break;
                case ('6'):
                    
                    Cuenta tosearch= lookForId();
                    if (tosearch != null) {
                        System.out.println(" Nombre " + tosearch.obtenNombre() +
				  " Cuenta " +  tosearch.obtenNumero() +
				  " Saldo " + tosearch.obtenSaldo());
                    }else{
                        System.out.println("No se encuentra esa cuenta");
                    }
                    
                    break;
                case ('7'):
                    
                    Cuenta tosearch2= lookForUser();
                    if (tosearch2 != null) {
                        System.out.println(" Nombre " + tosearch2.obtenNombre() +
				  " Cuenta " +  tosearch2.obtenNumero() +
				  " Saldo " + tosearch2.obtenSaldo());
                    }else{
                        System.out.println("No se encuentra esa cuenta");
                    }
                    
                    
                    break;
                    
                    
                case ('0'):
                    System.out.println("Hasta Luego!");
                    break;
                default:
                    System.out.println("Opcion debe ser de 1 a 5");
                    break;
            };

        }

    }

}
