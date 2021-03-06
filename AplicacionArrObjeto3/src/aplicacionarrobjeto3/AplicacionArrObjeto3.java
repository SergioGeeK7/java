
package aplicacionarrobjeto3;

import java.io.*;

/**
 * Generador de cuentas y consultas
 * 
 * @author nolfin
 * @version 1.0
 */
public class AplicacionArrObjeto3 {
	
	private static Cuenta arreglo[];
	
	/**
	 * para pedir los valores de teclado de el  arreglo de cuentas ya creada
         * 
	 * @thorwos IOException
	 */
	public static void pide_Arreglo() throws IOException{
            
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n;
        int numero;
        String nombre;
        double saldo;
        
        System.out.println("¿Cuantos objetos deseas crear?");
        n = Integer.parseInt(in.readLine());
        arreglo = new Cuenta[n];
        for (int i = 0; i< n; i++) {
       		System.out.print("Da el numero de la cuenta " + (i+1)+ " : ");
       		numero = Integer.parseInt(in.readLine());
       		System.out.print("Da el nombre de la cuenta " + (i+1)+ " : ");
       		nombre = in.readLine();
       		System.out.print("Da el saldo de la cuenta " + (i+1)+ " : ");
       		saldo = Double.parseDouble(in.readLine());
       		arreglo [i] = new Cuenta(numero, nombre, saldo);
        }				
	}
	
	/**
	 * para desplegar los datos del arreglo de cuentas
	 */
	public static void despliega_Arreglo() {
            
	System.out.println("Numero     Nombre           Saldo");
        for (Cuenta objeto : arreglo) {
           	System.out.println(" " + objeto.obtenNumero() + " " +
           	objeto.obtenNombre() + " " + objeto.obtenSaldo());
        }
	}
	
	/**
	 * Obteniendo la suma de los saldos de todas las cuentas
         * 
	 * @return <code>double</code>  suma total de saldos
	 */
	public static double suma() {
            
            double total = 0.0d;
		
        for (Cuenta objeto : arreglo) {
            
        	total += objeto.obtenSaldo();
        }
        
		return total;
	}
	
	/**
	 * Para calcular el promedio de la matriz cualquiera que sea
         * 
	 * @return <code>double</code> retorna el promedio total delos saldos
	 */
	public static double promedio() {
            
		double total = 0.0d;
                
	 for (Cuenta objeto : arreglo) {
        	total += objeto.obtenSaldo();
        }
        
		return total/arreglo.length;
	}
	
	/**
	 * Pedir un saldo y desplegar que tienen un saldo mayor o igual
	 */
	public static void despliega_Saldos() throws IOException{
            
        BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("¿Arriba de cual saldo?");
        double saldo = Double.parseDouble(in.readLine());
        
        for (Cuenta objeto : arreglo) {
			if (objeto.obtenSaldo() >= saldo) {
				System.out.println(" Nombre " + objeto.obtenNombre() +
				  " Cuenta " +  objeto.obtenNumero() + " Saldo " + objeto.obtenSaldo());
			}
        }				
	}
	
	/**
	 * Ordenamos el arreglo en base al numero de cuenta
         * 
         * @throws IOException 
	 */
	public static void ordena() throws IOException{
        
	   for (int i = 0; i < arreglo.length-1; i++ ) {
	    	for (int j = i+1; j < arreglo.length; j++) {
				if (arreglo[i].obtenNumero() > arreglo[j].obtenNumero()) {
					Cuenta temp = arreglo[i];
					arreglo[i] = arreglo[j];
					arreglo[j] = temp;
				}
		}
	    }				
	}
	
        /**
	 * Interfaz del programa 
         * Seleccionador de menu
         * 
         * @param args <code>array</code> para pasar parametros mediante linea de comandos
	 * @thorwos IOException
	 */
	public static void main(String[] args) throws IOException {

	    char opcion;
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    arreglo = null;
	    opcion = ' ';
            
	    while (opcion != '7') {
	    	System.out.println(" Menu de Cuentas");
	    	System.out.println();
	    	System.out.println("1. Pedir datos para crear Cuentas");
	    	System.out.println("2. Desplegar todas las cuentas");
	    	System.out.println("3. Desplegar Suma de los saldos");
	    	System.out.println("4. Desplegar Promedio de los saldos");
	    	System.out.println("5. Desplegar Cuentas arriba de un Saldo");
	    	System.out.println("6. Ordenar el arreglo");
	    	System.out.println("7. Fin");
	    	System.out.println("¿Opcion deseada (1-6) ?");
	    	opcion = in.readLine().charAt(0);
	    	switch (opcion) {
	    		case ('1') :
	    			System.out.println("Pidiendo datos arreglo Cuentas");
	    			pide_Arreglo();
	    			System.out.println(" " + arreglo.length);
	    			break;
	    		case ('2') :
	    			System.out.println("Desplegando arreglo de Cuentas");
	    			despliega_Arreglo();
	    			break;
	    		case ('3') :
	    			System.out.println("Suma de los saldos = " + suma());
	    			break;
	    		case ('4') :
	    			System.out.println("Promedio de los saldos = " + promedio());
	    			break;
	    		case ('5') :
	    		    System.out.println("Desplegando Cuentas arriba de saldo");
	    			despliega_Saldos();
	    			break;
	    		case ('6') :
	    		    System.out.println("Ordenando Cuentas por numero");
	    			ordena();
	    			break;
	    		case ('7') :
	    		    System.out.println("Hasta Luego!");
	    		    break;
	    		default:
	    		    System.out.println("Opcion debe ser de 1 a 5");
	    		    break;
	    	}
	    	
	    }

  	}

}