
package gui__2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.*;

// awt maneja el formato de la ventana, una de las clases de awt manejara mi formato de ventana
// y event manejara los eventos de la misma, una de las tantas clases de event va a manejar mis eventos de la ventana
public class Ventana extends JFrame implements ActionListener{
    
    
    // creacion de los objetos,
    
    // primero creacion de un boton que es de la clase JButton
    
    private JButton jb_botton;
   // segundo agrega un cuadro de texto
    private JTextField jt_texto;
    // tercero un label,un componente en donde mostraremos el texto
    private JLabel label;
  
    
   
    
    public Ventana (){
        
        
        
        super ("hello I am window");
        
        
        // esto llamara al metodo definir ventana para que defina la ventana antes de todo
        
        this.definirventana();
        
        
        
        
        this.setSize(600,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
        
    }
    
    
    
    
     // ahora crearemos un metodo para definir una ventana
    // agregar estos objetos, instanciarlos , agregarlos a la ventana , tambien definir el orden de la ventana y que la ventana escuche siertos eventos, ejemplo
    // cuando se toca un boton pase tal cosa
    
    
    public void definirventana () {
    
    
    // primero definir la forma en que se ordenaran los objetos
        
        // " this. " porque llamaremos a un objeto de esta clase de JFrame
    
        
        
        // establecer el orden de los componentes
        
        // se hace asi porque nunca mas utilizare a flowlayout
//--------  this.setLayout(new FlowLayout());
        
        
        
        // tambien se puede hacer asi
        
        FlowLayout fl = new FlowLayout ();
        this.setLayout(fl);
        
        // siguiente es empezar a crear los botones
        
        // estos botones ya estan definidos arriba , por eso no hace falta poner la clase
        
        jb_botton = new JButton("puchale aqui");
        
        // cuadro de texto, en este caso tendra 20 columnas
        
        jt_texto = new JTextField(20);
        label = new JLabel  ();
        
        // la particularidad de flowlayout sera que en el orden que añadimos los botones (add(, sera el mismo orden en que apareceran. uno al lado del otro
        
        add(jt_texto);
        add(jb_botton);
        add(label);
        
    
}

    @Override
    public void actionPerformed(ActionEvent e) {
      
        // verificara si la variable (e) .getsource que verificara si es igual a el jb_botton , asi se verificara si se hizo click en el mismo
        
        if (e.getSource()==jb_botton){
            
            label.setText(null);
            
            
        }
        
        
        
    }
    
    
    
    
    
}
