/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionarrobjeto3;

public class Cuenta {
	private int numero;
	private String nombre;
	private double saldo;

	public Cuenta(int numero, String nombre, double saldo) {
		this.numero = numero;
		this.nombre = nombre;
		this.saldo = saldo;
	}

	public int obtenNumero() {
		return this.numero;
	}
	
	public double obtenSaldo(){
		return this.saldo;
	}
	public String obtenNombre(){
		return this.nombre;
	}

}