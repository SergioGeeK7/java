/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package barrat;

//importa librerías
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

	//crea la clase barra de herramientas sin texto
	public  class Barrat extends JFrame{   //crea la clase barra de herramientas
public  Barrat(){   //crea el constructor barrat
	super("Barra de Herramientas"); //asigna a la barra de herramientas un título
	setSize(400,200); //tamaño del frame
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //botón cerrar de la ventana
	//construir botones de la barra de herramientas y los iconos de los botones
	ImageIcon   im1=new   ImageIcon("agregar.GIF"); //crea imagen
	JButton       b1=new    JButton(im1); //agrega imagen al boton
	ImageIcon   im2=new   ImageIcon("guardar.GIF");
	JButton       b2=new    JButton(im2);
	ImageIcon   im3=new   ImageIcon("eliminar.GIF");
	JButton       b3=new    JButton(im3);
	ImageIcon   im4=new   ImageIcon("buscar.GIF");
	JButton       b4=new    JButton(im4);

	//agrega los botones a la barra de herramientas y crea la barra
	JToolBar  barra=new    JToolBar();
	barra.add(b1);
	barra.add(b2);
	barra.add(b3);
	barra.add(b4);
	// construir area de texto
        
        

	JTextArea  editor=new  JTextArea(10,40);  //creo el objeto area
	JScrollPane    scroll=new  JScrollPane(editor);  //creo barras de desplazamiento al component TextArea.
	
	//construir marco y diseñador
        BorderLayout borde = new BorderLayout ();
	setLayout(borde);
	add("North",barra);
	add("Center",scroll);
        pack();
	setVisible(true);
}
	// crea la clase main para el constructor

      public static void main(String[] args){
	Barrat      herramientas=new  Barrat();
      }
}