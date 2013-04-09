/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;



import  java.awt.event.*;
import  javax.swing.*;
import  java.awt.*;

public class ejemplo extends JFrame implements ActionListener{   // se implementa lo necesario implements actionlistener y jframe
    JButton  boton1=new  JButton("Agregar"); // se crea la interfaz grafica como globales. para poderlos vigilarmediante metodos.
    JButton  boton2=new  JButton("Guardar");

    
    // se crean metodos equivalente a los objetos a vigilar.
    
	public ejemplo() {
	super("ejemplo de eventos");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	boton1.addActionListener(this); // los añade a eventos a vigilar.....
	boton2.addActionListener(this);//  lo añade a evento a vigilar....
	FlowLayout  diseño=new FlowLayout();
	setLayout(diseño);
	add(boton1);
	add(boton2);
	//pack();
	setVisible(true);
	}




public void actionPerformed(ActionEvent evt) {  // se implementan los métodos de la interface
        
        Object  codigo=evt.getSource();  //  //el método nos devuelve un objeto event, que podemos usar para detectar el componente que lo ha producido
	if (codigo==boton1){  // en codigo se guardara la variable boton1 o boton 2 .... y se ara la comparacion
		setTitle("Agregar registro");
	} else if (codigo==boton2) {  
		setTitle("Guardar  registro");
	}
	repaint();
	}




public static void main(String[] args){
ejemplo eventos=new ejemplo();
}
}
