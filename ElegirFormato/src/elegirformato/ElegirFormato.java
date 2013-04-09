/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package elegirformato;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ElegirFormato extends JFrame implements ItemListener {
    //creamos String para ComboBox
    String[] formatos = { "(seleccione opcion)", "Atom", "athlon x2",
        "AM3", "CORE I3" };
    //creamos String para etiquetas
    String[] descripciones = {
        "SELECCIONO UN EQUIPO INTEL",
        "SELECCIONO UN EQUIPO DE AMD",
        "SELECCIONO UN EQUIPO DE AMD",
        "SELECCIONO UN EQUIPO INTEL"
    };
    //Creamos Combo y Etiqueta
    JComboBox cajaFormato = new JComboBox();
    JLabel etiquetaDescripcion = new JLabel("");

    public ElegirFormato() {
        super("TIPOS DE PROCESADORES");
        setSize(420, 125);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        //añadimos a Combo items del String Formatos
        for (int i = 0; i < formatos.length; i++) {
            cajaFormato.addItem(formatos[i]);
        }
        cajaFormato.addItemListener(this); // Añadimos listener a Combo
        add(BorderLayout.NORTH, cajaFormato); //Añadimos Combo arriba en gestor diseño
        add(BorderLayout.CENTER, etiquetaDescripcion);//Añadimos etiqueta a centro en gestor diseño
        setVisible(true);
    }
    // implementamos método itemStateChanged de interface ItemListener
    public void itemStateChanged(ItemEvent event) {
        int eleccion = cajaFormato.getSelectedIndex();//obtenemos index del item seleccionado
        if (eleccion > 0) {
             etiquetaDescripcion.setText(descripciones[eleccion-1]); //configuramos texto de etiqueta según index del combo.
        }
    }

   

    public static void main(String[] arguments) {
        ElegirFormato fc = new ElegirFormato();
    }
}
