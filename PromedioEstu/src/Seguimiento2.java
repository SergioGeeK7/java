/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguimiento2;

import javax.swing.JOptionPane;

public class Seguimiento2 {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Se hara una pirámide creciente a base de asteríscos");
        String a = JOptionPane.showInputDialog(null, "¿Cuál es la base de la piramide?");
        int b = Integer.parseInt(a);

        for (int j = 0; j < b; j++) {

            for (int i = 0; i <= j; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

}
