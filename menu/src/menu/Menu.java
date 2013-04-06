/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

   public class Menu  extends   JFrame{
	public Menu(){
	super("barra de menu");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(230,80);

ImageIcon   iagregar=new  ImageIcon("Agregar.GIF");
ImageIcon   iguardar=new  ImageIcon("Guardar.GIF");
ImageIcon   ieliminar=new  ImageIcon("Eliminar.GIF");
ImageIcon   ibuscar=new  ImageIcon("Buscar.GIF");

JButton  bagregar=new  JButton("Agregar",iagregar);
JButton  bguardar=new  JButton("Guardar",iguardar);
JButton  beliminar=new  JButton("Eliminar",ieliminar);
JButton  bbuscar=new  JButton("Buscar",ibuscar);

JToolBar  barra=new  JToolBar();
	barra.add(bagregar);
	barra.add(bguardar);
	barra.add(beliminar);
	barra.add(bbuscar);

JMenu  j1=new  JMenu("Agregar");
JMenuItem  j2=new  JMenuItem("Guardar");
JMenuItem  j3=new  JMenuItem("Eliminar");
JMenuItem  j4=new  JMenuItem("Buscar");

JMenuItem  j5=new  JMenuItem("Copiar");
JMenuItem  j6=new  JMenuItem("Pegar");
JMenuItem  j7=new  JMenuItem("Cortar");

JMenuItem  j8=new  JMenuItem("Insertar Imagen");
JMenuItem  j9=new  JMenuItem("Insertar Video");


j1.add(new JMenuItem("Nuevo"));

	JMenu menu=new   JMenu("menu de base de datos");
			menu.add(j1);
			menu.add(j2);
			menu.addSeparator();
			menu.add(j3);
			menu.add(j4);

	JMenu editar=new   JMenu("Editar");

			editar.add(j5);
			editar.addSeparator();
			editar.add(j6);
			editar.addSeparator();
			editar.add(j7);

	JMenu insertar=new   JMenu("Editar");

			insertar.add(j8);
			insertar.add(j9);


JMenuBar   menubar=new  JMenuBar();
	menubar.add(menu);
	menubar.add(editar);
	menubar.add(insertar);

JTextArea  editor=new JTextArea(10,40);
JScrollPane scroll=new   JScrollPane(editor);
BorderLayout  borde=new BorderLayout();
	setLayout(borde);
	add("North",barra);
	add("Center",scroll);
	setJMenuBar(menubar);
	pack();
	setVisible(true);
}
	public static void main(String[] args){
		Menu todomenu=new  Menu();
}
}