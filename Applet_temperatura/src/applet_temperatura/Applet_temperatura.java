/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package applet_temperatura;

// programa corregido...Graciias amigos me sirvio de mucho. 
import java.awt.*; 
import java.applet.*; 
import java.awt.event.*; 
import java.lang.Math; 

public class Applet_temperatura extends Applet implements ActionListener { 
Label l1, l2; 
TextField Txt1, Txt2; 
Button boton; 
Double Centigrados,Farenheit; 

public Applet_temperatura() { 
l1 = new Label("Centigrados: "); 
Txt1 = new TextField(10); 
l2 = new Label("Farenheit"); 
Txt2 = new TextField(10); 
boton = new Button("Convertir"); 
add(l1); 
add(Txt1); 
add(l2); 
add(Txt2); 
add(boton); 
boton. addActionListener(this); 
} 
public void actionPerformed(ActionEvent ae) { 

double Centigrados = Double.parseDouble(Txt1.getText()); 
Farenheit=((Centigrados*5)/9)+32; 
Txt2.setText(String.valueOf(Farenheit)); 

} 
}


/*la formula de conversion grados celsius a farenheit es incorrecta
la que si funciona es:

(1.8*Centigrados)+32;

la que usted tiene funciona pero el resutado es incorrecto.*/