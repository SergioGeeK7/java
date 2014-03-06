

import java.awt.*;
public class AppletMenu extends Frame {

    
    
    
    public AppletMenu () {
        
        
        setTitle( "Mi primer menú" );
        
        MenuBar miBarra = new MenuBar();
        
        Menu archivo = new Menu ("Archivo");
        Menu guardar = new Menu ("Guardar");
        
        MenuItem m1 = new MenuItem ("Nuevo");
        MenuItem m2 = new MenuItem ("Guardar");
        MenuItem m3 = new MenuItem ("Guardar Como");
        MenuItem m4 = new MenuItem ("Salir");
        
        
        Menu ayuda = new Menu ("Ayuda");
        MenuItem a1 = new MenuItem ("AcercaDe");
        MenuItem a2 = new MenuItem ("Ayuda");
        
        
        archivo.add(m1);
        archivo.add(guardar);
        guardar.add(m2);
        guardar.add(m3);
        archivo.addSeparator();
        archivo.add(m4);
        
        ayuda.add(a1);
        ayuda.add(a2);
        
        miBarra.add( archivo );
        miBarra.add( ayuda );
        
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

        if( "Nuevo".equals( evt.arg ) ) 
            System.out.println( "Opcion -Nuevo-" );
        if( "Guardar".equals( evt.arg ) ) 
            System.out.println( "Opcion -Guardar-" );
        if( "Guardar Como".equals( evt.arg ) ) 
            System.out.println( "Opcion -Guardar Como-" );
        if( "AcercaDe".equals( evt.arg ) ) 
            System.out.println( "Opcion -AcercaDe-" );
        if( "Ayuda".equals( evt.arg ) ) 
            System.out.println( "Opcion -Ayuda-" );
       //Si la opción seleccionada es Salir terminar la aplicación
       if( "Salir".equals( evt.arg ) ) 
            System.exit( 0 );
        }
     }
   }
	return true;
 }
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        Frame frame = new AppletMenu();
        frame.resize( 250,250 );
        frame.show();
    }
    
}
