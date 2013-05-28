/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jtogglebutton4;



  import java.awt.*;
import javax.swing.*;

public class JToggleButton4 extends JFrame {
  
  public static void main( String argv[] ) {
    JToggleButton4 app = new JToggleButton4();
    app.setSize( 300,150 );
	app.setVisible( true );

  }  
  
  public JToggleButton4() {
  	setLayout(new GridLayout(4,1,5,5));
  	JButton boton1 = new JButton("JButton");
  	JToggleButton boton2 = new JToggleButton("JToggleButton");
  	JCheckBox boton3 = new JCheckBox("JCheckBox");
  	JRadioButton boton4 = new JRadioButton("JRadioButton");
  	add(boton1);
  	add(boton2);
  	add(boton3);
  	add(boton4);
   }
}

