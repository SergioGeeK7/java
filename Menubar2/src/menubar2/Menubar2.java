
package menubar2;
import java.lang.*; import java.awt.*; import java.awt.event.*;

public class Menubar2 {

//declaracion, creacion e inicializacion de componentes, objetos y variables

static Frame ventana= new Frame();

static TextField t1= new TextField(25);

//se ocupa una barra para los menus

static MenuBar barra = new MenuBar();

// se ocupa un menu por cada columna

static Menu cambios = new Menu("casa cambio");

static Menu temp= new Menu("temperaturas");

static Menu salir = new Menu("salir");

// se ocupan items para cada menu o columna

static MenuItem pd = new MenuItem("pes-dlr");

static MenuItem dp = new MenuItem("dlr-pesos");

static MenuItem cf = new MenuItem("cen-far");

static MenuItem fc = new MenuItem("far-cent");

static MenuItem exit=new MenuItem("Quit");

public static void main(String[] args)

{ // area de definicion de propiedades de el objeto

ventana.setTitle("mi programa");

// agregando items a ira columna

cambios.add(pd);cambios.add(dp);

//agregando items a 2da columna

temp.add(cf);temp.add(fc);

// agregando items a 3ra columna

salir.add(exit);

//agregando columnas o menus a la barra de menus

barra.add(cambios);barra.add(temp);barra.add(salir);

//agregando barra de menus y textfield a frame, en awt no hay contentpane()

ventana.add(t1); ventana.setMenuBar(barra);

ventana.pack(); ventana.setVisible(true);

// en awt tampoco hay windows-on-close

ventana.addWindowListener( new WindowAdapter()

{ public void windowClosing(WindowEvent e){

ventana.dispose(); System.exit(0);}});

// agregando el unico escuchador que permite menuitem a cada item

exit.addActionListener( new ActionListener()

{ public void actionPerformed( ActionEvent e )

{ System.exit(0); } } );

pd.addActionListener( new ActionListener()

{ public void actionPerformed( ActionEvent e )

{ t1.setText("pesos a dolares"); } } );

cf.addActionListener( new ActionListener()

{ public void actionPerformed( ActionEvent e )

{ t1.setText("cent a far"); } } );

}; // termina main

} // termina clase
