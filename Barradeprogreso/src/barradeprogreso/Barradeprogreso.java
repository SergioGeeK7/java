
package barradeprogreso;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Barradeprogreso extends JFrame {

    
    JProgressBar actual;   // utilizaremos la variable actual para nuestra barra de progreso
    int num=0;             //contador nos ayudara a avanzar el progreso de actual... (barradeprogreso)
    
    public Barradeprogreso (){   // constructor
        
        
       super ("barra de progreso") ;   // nombre de la barra aplicacion
       setSize(200,400);  // tamaño
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // para cerrar
       
       setLayout(new FlowLayout());  // set y diseñador... todo en uno LOL xD.... FLOW 
       
       actual=new JProgressBar(0,2000);  // establecemos nuestra barra de progreso de 0 a 2000
        
       actual.setValue(0) ; // seteamos la barra en 0
       actual.setStringPainted(true); // esto sirve para que muestre el progreso en un string %30  es un string
       add(actual) ;  // añadira a actual(barradeprogreso) a el diseñador
        
       setVisible(true);  // ara visible
        
        
    }
    
 
    // si se ejecuta no andara... es necesario algo que lo haga avanzar a nuestra barra. 
    
    public void go (){  // este metodo sirve para hacer avanzar nuestra barra.
        
        while(num<2000){   //   while que ira desde num ( nuestro contador ) hasta 2000 que es la variable hasta donde llegara nuestra barra de progreso... (arriba)
        
        actual.setValue(num); // dira que avanze a lo que tenga num... por ahora 0
        
        try{  
            
            Thread.sleep(1000);  // esperara un segunro y continuara
        }catch(InterruptedException e){}  
        
        num +=95;  // sumara a num + 95 == 0+ 95  siempre ... hasta que llegue a 2000 y terminara la barra de progreso
        }
    }
    
    
    public static void main(String[] args) {
      
        Barradeprogreso br = new Barradeprogreso (); // se llama a la barra de progreso
        br.go(); // se llama a el metodo que nos avanzara la barra de progreso
        
        
        
        
    }
}
