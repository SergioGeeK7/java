/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

/**
 *
 * @author sergio
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println("hellow");
        
        Nodo nodoSimple= new Nodo();
        
        nodoSimple.insertar(4);
        nodoSimple.insertar(8);
        nodoSimple.insertar(9);
        nodoSimple.insertar("alberto");
        nodoSimple.insertar(9);
        nodoSimple.insertar("carlos");
        System.out.print(nodoSimple.toString());
        
        
        
    }
    
}
