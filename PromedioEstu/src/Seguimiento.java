/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package seguimiento;
import javax.swing.JOptionPane;
public class Seguimiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       JOptionPane.showMessageDialog(null,"Esta aplicacion dibuja con asteríscos el perímetro de un cuadrado. ");
       String a = JOptionPane.showInputDialog(null,"Ingrese lado del cuadrado");
       int b=Integer.parseInt(a); 
       
       String lala="";
       
       for (int i = 0; i < b ; i++) {
           System.out.print("*");
           lala = lala + "*" ;
        }
        System.out.println("");
        lala = lala + "\n" ;
        for (int j = 0; j < b-2; j++) {
            System.out.print("*");
            lala  += "*" ;
            for (int k = 0; k < b-2; k++) {
                System.out.print(" ");
                lala = lala + " " ;
            }
            System.out.println("*");
            lala = lala + "*\n" ;
        }
        for (int l = 0; l < b; l++) {
            System.out.print("*");
            lala = lala + "*" ;
        }
        
        JOptionPane.showMessageDialog(null, lala);
 
    }
    
}
