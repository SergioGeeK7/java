
package gui__1;


// se importaran todas las clases de la carpeta swing
// las clases, no las carpetas que estan dentro de las carpetas

import javax.swing.*;


// utilizaremos erencia;; la clase JFrame  que se encuentra en la libreria swing y esta clase nos va a permitir eredar ventanas
// recordar que cuando eredamos la clase, estamos eredando atributos y metodos,por ende ya tenemos creadas un monton de cosas.



public class ventanaprincipal extends JFrame{
    
    
    // primero aremos un constructor, porque atributos no necesitamos ninguno, por ahora
    
    
    
    
    public ventanaprincipal (){
        
        
        // llame el constructor de la super clase, en este caso va a ser JFrame o clase padre, esto siempre hay que hacerlo
        // este comando le pase el nombre a la ventana de JFrame que es la clase padre
        
        
        super ("esto es una ventana");
        
        // ponemos " this. " porque estoy llamando los metodos que erede de esta clase, entonces es como si los tubiera presente aqui
        
        this.setSize(400,400);
        
        // linea que verifica que el programa se cierre, si no se pone el programa seguira activo asi se cierre la GUI con el procego .javaw
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // permitira que mi ventana sea visible
        
        this.setVisible(true);
        
        
        // crear un objeto en la clase principal para llamar a esta clase.
        
        
    }
    
    
    
    
}
