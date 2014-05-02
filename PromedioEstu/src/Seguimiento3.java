/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguimiento3;

import javax.swing.JOptionPane;

public class Seguimiento3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Esta aplicación le permitira "
                + "calcular promedios de los estudiantes", "Señor usuario:", JOptionPane.INFORMATION_MESSAGE);

        int x = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Confirmar", JOptionPane.YES_NO_OPTION);

        int y;
        if (x == JOptionPane.YES_OPTION) {
            do {

                String a = JOptionPane.showInputDialog(null, "Nombre del nombre del estudiante", "Ingrese dato.", JOptionPane.PLAIN_MESSAGE);
                String b = JOptionPane.showInputDialog(null, "¿Cual fue la nota final del estudiante?");
                int b2 = Integer.parseInt(b);
                y = JOptionPane.showConfirmDialog(null, "¿Desea finalizar?", "Confirmar", JOptionPane.YES_NO_OPTION);
            } while (y == JOptionPane.NO_OPTION);

            // 0 si
        }

        
        System.out.println(x);
        System.out.println(JOptionPane.NO_OPTION);
        if (x == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "buuu!", "no se vaya", JOptionPane.INFORMATION_MESSAGE);
        }

    }

}
