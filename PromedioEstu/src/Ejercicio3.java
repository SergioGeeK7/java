/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import javax.swing.JOptionPane;

public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Ésta es una aplicación para calular el area de algunas figuras geométricas.", "Acerca de:", JOptionPane.INFORMATION_MESSAGE);
        String a = JOptionPane.showInputDialog(null, "1 para Triángulo.\n2 para Círculo.\n3 para Cuadrado.", "Escoja un opción", JOptionPane.PLAIN_MESSAGE);
        int opcion = Integer.parseInt(a);
        if (opcion == 1) {
            String h = JOptionPane.showInputDialog(null, "Ingrese la altura.", "Triángulo", JOptionPane.INFORMATION_MESSAGE);
            double altura = Integer.parseInt(h);
            String b = JOptionPane.showInputDialog(null, "Ingrese la base");
            double base = Integer.parseInt(b);
            double area = ((altura * base) / 2);
               
            
            
            
            int fab=4;
            int fab2=6;
            
            double fab4=fab/fab2;  
            
            
            
            JOptionPane.showMessageDialog(null, "El area del triángulo es: " + area, "Area", JOptionPane.INFORMATION_MESSAGE);
        }
        if (opcion == 2) {
            String d = JOptionPane.showInputDialog(null, "Ingrese el radio", "");
        }

    }

}
