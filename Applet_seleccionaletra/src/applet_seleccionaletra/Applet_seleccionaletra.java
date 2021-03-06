/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package applet_seleccionaletra;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.*;

public class Applet_seleccionaletra extends JPanel implements ActionListener {
  private Style estiloMorado,estiloGris,estiloCeleste,estiloRojo,estiloAzul;
  private JTextPane texto;
    
  public Applet_seleccionaletra() {
    setLayout( new BorderLayout() );
    JMenuBar menu = new JMenuBar();
    JMenu estilo = new JMenu( "Estilo" );
    menu.add( estilo );
    
    JMenuItem mi = new JMenuItem( "Morado" );
    estilo.add( mi );
    mi.addActionListener(this);    
    mi = new JMenuItem( "Gris" );
    estilo.add( mi );
    mi.addActionListener(this);    
    mi = new JMenuItem( "Celeste" );
    estilo.add( mi );
    mi.addActionListener(this);    
    mi = new JMenuItem( "Rojo" );
    estilo.add( mi );
    mi.addActionListener(this);    
	mi = new JMenuItem( "Azul" );
    estilo.add( mi );
    mi.addActionListener( this );
    add( menu,BorderLayout.NORTH );
    
    StyleContext sc = new StyleContext();    
    estiloMorado = sc.addStyle( null,null );
    StyleConstants.setForeground( estiloMorado,Color.magenta );
    estiloGris = sc.addStyle( null,null );
    StyleConstants.setForeground( estiloGris,Color.gray );
    StyleConstants.setFontSize( estiloGris,24 );
    estiloCeleste = sc.addStyle( null,null );
    StyleConstants.setForeground( estiloCeleste,Color.cyan );
    estiloRojo = sc.addStyle( null,null );
    StyleConstants.setForeground( estiloRojo,Color.red );
    estiloAzul = sc.addStyle( null,null );
    StyleConstants.setForeground( estiloAzul,Color.blue );
    
    DefaultStyledDocument doc = new DefaultStyledDocument(sc);
	
    JTextPane texto = new JTextPane(doc);
    add( texto,BorderLayout.CENTER );      
  }
      
  public void actionPerformed( ActionEvent e ) {
    Style estilo = null;
    String color = (String) e.getActionCommand();
    
    if( color.equals( "Morado" ) ) {
      estilo = estiloMorado;
    } else if( color.equals( "Celeste" ) ) {
      estilo = estiloCeleste;
    } else if( color.equals( "Gris" ) ) {
      estilo = estiloGris;
    } else if( color.equals( "Rojo" ) ) {
      estilo = estiloRojo;
    } else if( color.equals( "Azul" ) ) {
      estilo = estiloAzul;
    }
    texto.setCharacterAttributes( estilo,false );
  }
  
  
  
  public  void paint (Graphics g){
        
        setSize(700,300);
        g.drawString("Sergio Andres Arboleda", 210,180);
        g.drawRect(50, 100, 500, 150);

        
  
        
    }
    
  public static void main( String argv[] ) {
    JFrame app = new JFrame( "Tutorial de Java, Swing" );
    
    app.addWindowListener( new WindowAdapter() {
      public void windowClosing( WindowEvent evt ){
			System.exit( 0 );
      }
    } );
    app.getContentPane().add( new Applet_seleccionaletra(),BorderLayout.CENTER );
    app.setSize( 300,180 );
    
    app.setVisible( true );
  }
}


