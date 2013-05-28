
package applet_jtable;



    import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;

class Applet_JTable extends JPanel {
  private JTable tabla;
  private JScrollPane panelScroll;
  private String tituloColumna[];
  private String datoColumna[][];
  
  public Applet_JTable() {
    setLayout( new BorderLayout() );
    // se crean las columnas con su titulo por separado
    tituloColumna = new String[8];
    
    for( int i=0; i < 8; i++ ) {
      tituloColumna[i] = "Col: "+i;
    }
    datoColumna = new String[100][8];
    // se cargan los valores en cada celda para lo que queremos que aparezca
    for( int i=0; i < 100; i++ ) {
      for( int j=0; j < 8; j++ ) {
		datoColumna[i][j] = "" + j + "," + i;
      }
    }
    // se crea una instancia del componente Swing
    tabla = new JTable( datoColumna,tituloColumna );
    // se cambia la presentación a la tabla
    tabla.setShowHorizontalLines( false );
    tabla.setRowSelectionAllowed( true );
    tabla.setColumnSelectionAllowed( true );
    // se cambia el color de la zona seleccionada (rojo/blanco)
    tabla.setSelectionForeground( Color.white );
    tabla.setSelectionBackground( Color.red );
    // la tabla se añade a un objeto de la clase JScrollPane
    // para que tenga la facilidad de barras deslizadoras
    panelScroll = new JScrollPane( tabla );
    add( panelScroll, BorderLayout.CENTER );
  }
  
  
  
  
  public static void main( String args[] ) {
    JFrame ventana = new JFrame( "Utilizando JTable" );
    
    ventana.addWindowListener( new WindowAdapter() {
      public void windowClosing( WindowEvent evt ){
	System.exit( 0 );
      }
    } );
    ventana.getContentPane().add( new Applet_JTable(),BorderLayout.CENTER );
    ventana.setSize( 300,180 );
    
    ventana.setVisible( true );
  }
}


