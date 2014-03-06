/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aplicacionarreglo2;
public class AplicacionArreglo2 {
	
	private static final int MAX = 10;
    
    public static void main(String[] args) {
    	   // se define el arreglo a utilizar
        int arreglo[] = {12, 75, -5, 99, 124, 8, -45, 12, 25, 0};
        int posicion;  // para las posiciones
        int mayor, menor; // para el mayor y el menor
		double promedio;  // para obtener el promedio
		int suma = 0;  // se inicializa la suma en cero

        // se despliegan los valores
        for (int i=0; i < arreglo.length; i++) {
        	System.out.println("Elemento " + (i+1) + " = " + arreglo[i]);
		}
	  mayor = arreglo[0];  // se toma el primer valor como el mayor
        posicion = 0;  // para definir mayor en la posicion primera
        // se revisa cada elemento en el arreglo desde el segundo
        for (int i=1; i < arreglo.length; i++) {
               	// si el elemento del arreglo es mayor
			if (arreglo[i] > mayor) {  
           		mayor = arreglo[i];   // cambiamos el valor del mayor
				posicion = i;  // se actualiza la posicion
			}
        }
	  System.out.println("El valor mayor es " + mayor);
	  System.out.println("Y esta en la posicion " + (posicion + 1));
        menor = arreglo[0];  // se toma el primer valor como el mayor
        posicion = 0;  // para definir menor como el primer valor
        // se revisa cada elemento en el arreglo desde el segundo
        for (int i=1; i < arreglo.length; i++) {
                  // si el elemento del arreglo es mayor
			if (arreglo[i] < menor) {  
           		menor = arreglo[i];   // cambiamos el valor del mayor
				posicion = i;  // se actualiza la posicion
			}
        }
	  System.out.println("El valor menor es " + menor);
	  System.out.println("Y esta en la posicion " + (posicion+1));
        // se tomara cada elemento para sumarlo
        for (int i=0; i < arreglo.length; i++) {
			suma += arreglo[i];
        }
	  promedio = suma / arreglo.length;
	  System.out.println("El promedio es " + promedio);
	}
}
