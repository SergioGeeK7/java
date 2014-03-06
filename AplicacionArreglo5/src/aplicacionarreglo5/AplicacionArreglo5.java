/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aplicacionarreglo5;

public class AplicacionArreglo5 {
	
	public static void main(String[] args) {
		char arreglo1[] = { 'a', 't', 'e', 'n', 'i' , 'd', 'a', 's'};
		char arreglo2[] = new char[arreglo1.length];
		
		for (int i = 0; i < arreglo1.length; i++) {
			arreglo2[arreglo1.length - i - 1] = arreglo1 [i];
		}
		System.out.println("Palabra Inicial");
		for (int i = 0; i < arreglo1.length; i++) {
			System.out.println("Caracter " + (i+1) + " = " + arreglo1[i]);
		}
		System.out.println();
		System.out.println("Palabra Final");
		for (int i = 0; i < arreglo2.length; i++) {
			System.out.println("Caracter " + (i+1) + " = " + arreglo2[i]);
		}
	}
}