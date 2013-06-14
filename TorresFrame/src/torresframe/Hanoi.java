package TorresFrame;
import java.awt.*;
    
/**
 * Soluci�n gr�fica para el problema de las Torres de Hanoi
 * El juego acepta entre 1 y 10 discos
 * 
 * @author Maestros computaci�n II
 * @version Primavera 2003
 */
public class Hanoi {

	private int n;
	private Poste izq, cen, der;

	/**
	 * Constructor 
	 * @param n     n�mero de discos en la torre inicial
	 */
	public Hanoi(int n) {
		this.n = n;
		izq = new Poste(n, 80);
		cen = new Poste(0, 250);
		der = new Poste(0, 420);        
	}

	//-------------------------------------------------------------
	// INTERFAZ
    
	/**
	 * Resolver el problema
	 * Pre: hay discos en poste izquierdo
	 * @param g     el espacio grafico
	 */
	public void resuelve(Graphics g) {

        solucion(n, izq, cen, der, g);
	}
    
	/**
	 * Dibujar el tablero de juego
	 * @param g     el espacio gr�fico
	 */
	public void dibuja(Graphics g) {

		izq.dibuja(g);
		cen.dibuja(g);
		der.dibuja(g);
	}
    
	/**
	 * Regresa los discos al estado inicial
	 */
	public void reinicia() {

		izq.ponDiscos(n);
		der.ponDiscos(0);
		cen.ponDiscos(0);
	}

	//-------------------------------------------------------------
	// Logica
    
	/**
	 * Algoritmo para resolver el problema de las torres de Hanoi
         * 
	 * @param n     numero de discos a mover
	 * @param f     poste fuente
	 * @param d     poste destino
	 * @param a     poste auxiliar
	 * @param g     ambiente grafico
	 */ 
	public void solucion(int n, Poste f, Poste d, Poste a, Graphics g) {
         
            if (n==1){
            Disco auxx = f.quitaDisco();
	    a.agregaDisco(auxx);
            dibuja(g);
            mover(f,d,g);
                
            }else{
               solucion(n-1,f,a,d,g);
               Disco auxx=f.quitaDisco();
               a.agregaDisco(auxx);
               dibuja(g);
               mover(f,d,g);
               solucion(n-1,d,f,a,g);
             }
           
	} 
    
	/**
	 * Pasar un disco del poste a al poste b
	 * mostrando el resultado en la pantalla gr�fica
	 * Pre: a tiene al menos un disco
	 * @param a     poste fuente
	 * @param b     poste destino
	 * @param g     ambiente gr�fico
	 */
	public void mover(Poste a, Poste b, Graphics g) {

		//esperar para que los movimientos se vean con claridad
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {
			g.drawString("Error en sleep", 100, 100);
		}

		Disco d;
        //toma un disco de a y gu�rdalo

        //pon el disco que guardaste en b

        //dibuja los postes a y b
 
	}
}
