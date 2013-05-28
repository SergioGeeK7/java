/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package applet_circulos;




import java.awt.*;
import java.applet.*;
import java.awt.event.*;
 
// <applet width="150" height="200" code="AppletCirculos"></applet>
public class Applet_circulos extends Applet implements ActionListener {
   Label l1;
   TextField t1;
   Button b1,b2;
   boolean dibuja = false;  // se inicializa dibuja en falso para no dibujar
 
   public Applet_circulos() {
      l1 = new Label("Circulos");
      t1 = new TextField(8);
      b1 = new Button("Dibuja");
      b2 = new Button("Limpia");
      add(l1);
      add(t1);
      add(b1);
      add(b2);
      b1. addActionListener(this);
      b2. addActionListener(this);
   }
 
   public void actionPerformed(ActionEvent ae) {
      if (ae.getSource() == b1) {
         dibuja = true;      // si el usuario selecciona dibujar se pone verdadero
      }
      if (ae.getSource() == b2) {
         dibuja = false;    // si el usuario selecciona limpiar se pone en falso
      }
      repaint();
   }
   
   public void paint(Graphics g) {
   	   if (dibuja) {   // si dibuja es verdadero se dibuja
   	   	   g.setColor(Color.red);  // se cambia a rojo el color de dibujo
   	   	   int circulos = Integer.parseInt(t1.getText());  // se toma el numero del texto
   	   	   for (int i = 1; i <= circulos ; i++) {  // ciclo de circulos
   	   	   		int x1 = (int) (Math.random()*100)+60;
   	   	   		int y1 = (int) (Math.random()*100)+80;
   	   	   	    g.drawOval(x1,y1, 50, 50);  // se dibuja un circulo en
   	   	   	    		// una posición al azar
   	   	    }         
        }
        else {  // si dibuja es falso se limpia el applet
        	g.setColor(Color.white);
        	g.fillRect(0,0,200,200);
        } 
    }
}
