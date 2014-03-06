
package menuapplet;

    import java.awt.*;

public class MenuApplet extends Frame {
	//Constructor de la clase
	public MenuApplet () {
       // Definir título de la ventana
        setTitle( "Mi primer menú" );

        // Crear la barra de menú
        MenuBar miBarra;
        miBarra = new MenuBar();

        // Crear el primer elemento de la barra
        Menu miMenu;
        miMenu = new Menu( "Menu" );
        
        //Crear y Agregar la primer opción del primer elemento de la barra
        Menu opcion1;
        opcion1 = new Menu( "Opcion1" );
        opcion1.add( new MenuItem( "primero" ) );
        
        opcion1.add( new MenuItem( "segundo" ) );
        miMenu.add( opcion1 );

        //Crear y Agregar la segunda opción del primer elemento de la barra
        Menu opcion2;
        opcion2 = new Menu( "Opcion2" );
        opcion2.add( new MenuItem( "primero" ) );
        miMenu.addSeparator();
        opcion2.add( new MenuItem( "segundo" ) );
        miMenu.add( opcion2 );
 
        //Agregar el primer elemento a la barra de menú
        miBarra.add( miMenu );
        
        //Colocar la barra
        setMenuBar( miBarra );
	}

    public static void main( String args[] ) {
        Frame frame = new MenuApplet();
        frame.resize( 250,250 );
        frame.show();
        }
}

