

package menuevento;

    import java.awt.*;

public class MenuEvento extends Frame {
	//Constructor de la clase
	public MenuEvento () {
       // Definir título de la ventana
        setTitle( "Mi primer menú" );

        // Crear la barra de menú
        MenuBar miBarra;
        miBarra = new MenuBar();

        // Crear el primer elemento de la barra
        Menu miMenu;
        miMenu = new Menu( "Menu" );
        
        //Crear y Agregar la primera opción del primer elemento de la barra
        Menu opcion1;
        opcion1 = new Menu( "Opcion1" );
        opcion1.add( new MenuItem( "primero" ) );
        opcion1.add( new MenuItem( "segundo" ) );
        miMenu.add( opcion1 );

        //Crear y Agregar la segunda opción del primer elemento de la barra
        Menu opcion2;
        opcion2 = new Menu( "Opcion2" );
        opcion2.add( new MenuItem( "tercero" ) );
        opcion2.add( new MenuItem( "cuarto" ) );
        miMenu.add( opcion2 );

        //Crear y Agregar la tercera opción del primer elemento de la barra
        MenuItem opcion3;
        opcion3 = new MenuItem( "Salir" );
        miMenu.add(opcion3);

        //Agregar el primer elemento a la barra de menú
        miBarra.add( miMenu );
        
        //Colocar la barra
        setMenuBar( miBarra );
     }

        @Override
    public boolean handleEvent( Event evt ) {
      
       // Si la ventana se cerró salir de la aplicación
        if( Event.WINDOW_DESTROY == evt.id  &&  this == evt.target )
            System.exit( 0 );

     //Si el evento es del tipo ACTION_EVENT?
    switch( evt.id ) {
    case Event.ACTION_EVENT: 
    {

     //Si el evento proviene de una opción el menú?	
    if( evt.target instanceof MenuItem )
        {

        if( "primero".equals( evt.arg ) ) 
            System.out.println( "Opcion -primero-" );
        if( "segundo".equals( evt.arg ) ) 
            System.out.println( "Opcion -segundo-" );
        if( "tercero".equals( evt.arg ) ) 
            System.out.println( "Opcion -tercero-" );
        if( "cuarto".equals( evt.arg ) ) 
            System.out.println( "Opcion -cuarto-" );

       //Si la opción seleccionada es Salir terminar la aplicación
       if( "Salir".equals( evt.arg ) ) 
            System.exit( 0 );
        }
     }
   }
	return true;
 }

    public static void main( String args[] ) {
        Frame frame = new MenuEvento();
        frame.resize( 250,250 );
        frame.show();
    }
}

