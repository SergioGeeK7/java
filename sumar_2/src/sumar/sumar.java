
package sumar;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

//creamos la clase sumar subclase de jframe e implementar la herencia focus
public class sumar extends JFrame implements FocusListener{
//creamos los campos de texto y las etiquetas para la calculadora
JTextField  valor1=new JTextField("0",5);
JLabel  mas=new  JLabel(""+"");
JTextField  valor2=new JTextField("0",5);
JLabel  igual=new  JLabel("=");
JTextField  resultado=new  JTextField("0",5);

//creamos el constructor
public sumar(){
super("suma de dos numeros");
setSize(350,90);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
FlowLayout  diseño=new  FlowLayout(FlowLayout.CENTER);
setLayout(diseño);

//añadimos listiners a los dos campos de entrada de textos
valor1.addFocusListener(this);
valor2.addFocusListener(this);

//configuramos el campo resultado y lo hacemos no editable

resultado.setEditable(false);

//añadimos los componentes

add(valor1);
add(mas);
add(valor2);
add(igual);
add(resultado);
setVisible(true);
valor1.addFocusListener(this);
}

//implementamos el método FocusGained de la interface FocusListener

public void FocusGained(FocusEvent  event){
try{
//convertimos valores campos de String a numeros y los sumamos
float total=Float.parseFloat(valor1.getText())+Float.parseFloat(valor2.getText());

//añadimos el resultado al campo resultado
resultado.setText(" " +total);
} catch(NumberFormatException nfe){
//añadimos excepcion si  los valores de texto no pueden convertirse a números, cuando gane el focus los convierte a número y los coloca en el campo resultado sino coloque cero

valor1.setText("0");
valor2.setText("0");
resultado.setText("0");
}
}

//hacemos que el método resultado haga lo mismo llamando al método focusGained si pierde el cursor

public void focusLost(FocusEvent  event){
FocusGained(event);
}

//creamos el main

public static void main(String[] args){
sumar  rest=new  sumar();  //creamos el objeto de la clase
}

    @Override
    public void focusGained(FocusEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
} 