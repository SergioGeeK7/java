/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangulo;

/**
 *
 * @author andres
 */
public class Rectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int n = 10;

        for (int i = 0; i < n; i++) {

            System.out.print("*");
        }
        System.out.println("");
        for (int i = 0; i < n; i++) {

            System.out.print("*");
            for (int j = 0; j < n - 2; j++) {
                System.out.print(" ");
            }
            System.out.print("*\n");
        }

        for (int i = 0; i < n; i++) {

            System.out.print("*");
        }

    }

}
