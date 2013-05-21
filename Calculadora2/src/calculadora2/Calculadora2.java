/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora2;


import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.KeyStroke;



public class Calculadora2 extends JFrame {

private static final long serialVersionUID = 1L;

private static final String[] labels = {
"Copiar", "Pegar", "Acerca de ...",
"Dec",	"Bin",
"Inv",
"CE",	"C",
//8
"Log",	"(",	")",
"Sen",	"Cos",	"Tan",
"x^y",	"n!",	"1/x",
//17
"MC",	"MR",	"MS",	"M+",
//21
"7",	"8",	"9",	"+",
"4",	"5",	"6",	"-",
"1",	"2",	"3",	"*",
"0",	"+/-",	".",	"/",
//37
"Mod",	"And",
"Or",	"Xor",
"Not",	"Int",
"=",	"PI"
//45
};

private static final String[] toolTip = {
"Copiar", "Pegar", "Acerca de ...",
"Decimal",	"Binario",
"Inverso",
"Borra valor actual",	"Borra operaciones y valor actual",
//8
"Logaritmo natural",	"(",	")",
"Seno",	"Coseno",	"Tangente",
"Potencia",	"Factorial",	"Inverso",
//17
"Limpiar memoria",	"Obtener de memoria",	"Guardar en memoria",	"Sumar a memoria",
//21
"7",	"8",	"9",	"Suma",
"4",	"5",	"6",	"Resta",
"1",	"2",	"3",	"Multiplicación",
"0",	"Cambia de signo",	".",	"Divición",
//37
"Division entera",	"AND",
"OR",	"XOR",
"NOT",	"Parte entera",
"Resultado",	"pi"
//45
};

private JTextField txtDisplay;
private JTextField txtMemoria;
private AbstractButton[] controles = new AbstractButton[ labels.length ];
private JLabel lblReloj;

public Calculadora2() {
super("Calculadora Científica");
setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
}

public static void main(String[] args) {
Calculadora2 app = new Calculadora2();
app.init();
app.setVisible(true);
}

public void init() {
int i;
controles = new AbstractButton[ labels.length ];
txtMemoria = new JTextField(2);
for(i=0; i<3; i++)
controles[i] = new JMenuItem( labels[i] );
for(; i<5; i++)
controles[i] = new JRadioButton( labels[i] );
controles[i] = new JCheckBox( labels[i] );
for(i++; i<controles.length; i++)
controles[i] = new JButton( labels[i] );
txtDisplay = new JTextField( "0" );
lblReloj = new JLabel( "xx:xx:xx" );

Font f = new Font( Font.MONOSPACED, Font.PLAIN, 10);
txtDisplay.setHorizontalAlignment( JTextField.RIGHT );
txtDisplay.setEditable( false );
txtDisplay.setFont( f );
txtMemoria.setHorizontalAlignment( JTextField.CENTER );
txtMemoria.setEditable( false );
( (JMenuItem) controles[0] ).setAccelerator( KeyStroke.getKeyStroke( "control C" ) );
( (JMenuItem) controles[1] ).setAccelerator( KeyStroke.getKeyStroke( "control V" ) );
for(i=0; i<3; i++)
controles[ 2 ].setText( labels[2] );
controles[ 0 ].setMnemonic( KeyEvent.VK_C );
controles[ 1 ].setMnemonic( KeyEvent.VK_P );
controles[ 2 ].setMnemonic( KeyEvent.VK_A );

controles[3].setSelected( true );
ButtonGroup group = new ButtonGroup();
group.add( controles[3] );
group.add( controles[4] );

JMenuBar menuBar = new JMenuBar();
JMenu menu = new JMenu( "Edición" );
menu.setMnemonic( KeyEvent.VK_E );
menu.add( controles[0] );
menu.add( controles[1] );

menuBar.add( menu );
menu = new JMenu( "Ayuda" );
menu.setMnemonic( KeyEvent.VK_A );
menu.add( controles[2] );
menuBar.add( menu );
setJMenuBar( menuBar );
JPanel panel1, panel2;
Container container = getContentPane();
panel1 = new JPanel( new BorderLayout() );
panel2 = new JPanel();
panel2.add( controles[3] );
panel2.add( controles[4] );
panel2.add( controles[5] );
panel2.add( txtMemoria );
panel1.add( panel2, BorderLayout.WEST );
panel1.add( new JPanel() );
panel2 = new JPanel();
panel2.add( controles[6] );
panel2.add( controles[7] );
panel1.add( panel2, BorderLayout.EAST );
container.add( panel1 );
panel1 = new JPanel( new GridLayout(3,3) );
for(i=8; i<17; i++)
panel1.add( controles[i] );
panel2 = new JPanel( new BorderLayout() );
panel2.add( panel1, BorderLayout.NORTH );
panel2.add( new JPanel());
panel2.add( lblReloj, BorderLayout.SOUTH );
panel1 = new JPanel();
panel1.add( panel2 );
panel2 = new JPanel( new GridLayout(4,1) );
for(i=17; i<21; i++)
panel2.add( controles[i] );
panel1.add( panel2 );
panel2 = new JPanel( new GridLayout(4,4) );
for(i=21; i<37; i++)
panel2.add( controles[i] );
panel1.add( panel2 );
panel2 = new JPanel( new GridLayout(4,2) );
for(i=37; i<45; i++)
panel2.add( controles[i] );
panel1.add( panel2 );
container.add( txtDisplay, BorderLayout.NORTH );
container.add( panel1, BorderLayout.SOUTH );
pack();
setResizable( false );

for(i=0; i<controles.length; i++)
{
controles[ i ].setName( String.valueOf(i) );
controles[ i ].setToolTipText( toolTip[i] );
}
}


}