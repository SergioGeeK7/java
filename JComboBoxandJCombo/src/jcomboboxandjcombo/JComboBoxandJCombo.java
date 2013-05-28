
package jcomboboxandjcombo;


import java.awt.*;
import javax.swing.*;

public class JComboBoxandJCombo extends JFrame {
  private static String datos[] = { 
    "Uno","Dos","Tres", 
    "Cuatro","Cinco","Seis",
  };
  public static void main( String argv[] ) {
    JComboBoxandJCombo app = new JComboBoxandJCombo();
    app.setSize( 300,150 );
	app.setVisible( true );

  }  
  
  public JComboBoxandJCombo() {
  	setLayout(new GridLayout(2,1,5,5));
  	JList lista = new JList( datos );
    add( new JScrollPane( lista ) );    
    JComboBox combo = new JComboBox();
    for( int i=0; i < 100; i++ )
      combo.addItem( Integer.toString( i ) );
    add( combo );
  }
}
