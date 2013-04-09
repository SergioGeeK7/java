
package listas;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;



public class Listas extends JFrame implements ItemListener {

    
    
    String acciones [] = {" (Seleccione una Obcion) ","Bañarme","Acostarme","Comida","Computador"};
    JComboBox list = new JComboBox ();
    String respuestas [] = {"Me Mojare","Me Dormire","Me llenare","Me Frikiare xD"};
    
    JLabel res = new JLabel("") ;
    
    
    
    public Listas (){
        
        
        super ("lista");
        setSize(500,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        for (int i=0;i<acciones.length;i++){
            list.addItem(acciones[i]);
        }
        
        list.addItemListener(this);
        
        setLayout(new FlowLayout());
        add(list);
        add(res);
        
       
        setVisible(true);
        
        
        
    }
    
   
    public void itemStateChanged(ItemEvent even){
        
        
        
      //  Object answer =even.getItem();
        
        int eleccion = list.getSelectedIndex();//obtenemos index del item seleccionado // OBTENEMOS EL NUMERO DEL ITEM SELECCIONADO
        
        if (eleccion != 0){ 
        
        res.setText(respuestas[eleccion-1]);
        
        }else {
            res.setText("");  // LO PONGO ASI PORQUE AL VOLVER A SELECCIONAR EL ITEM, SE QUEDA LA ANTERIOR ACCION.
        }
        
        
        //System.out.println(respuestas[eleccion-1]);
        
        
        
    }
    
    
    
    
    
    public static void main(String[] args) {
       
        Listas ls = new Listas (); 
        
        
    }
}
