/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestiondeusuarios;

import java.util.Scanner;

/**
 *
 * @author sergio
 */
public class EjercicioListas {
    
    static Scanner meta = new Scanner(System.in);
    
    public static void main (String[] args){
        
        int opc;
        
        Reading rr = new Reading ();
        
        
        do{
         opc=menu();
         switch(opc)   {
             case 1:
                 break;
             case 2:
                 break;
             case 3:
                 break;
             case 4:
                 break;
             case 5:
                 break;        
             
         }
            
        }while(opc != 0);
        
        
        
    }
    
    
    
    static int menu (){
        System.out.println("1 Consultar por ID");
        System.out.println("2 Modificar");
        System.out.println("3 Ingresar");
        System.out.println("4 Borrar");    
        System.out.println("5 Listar");
        System.out.println("0 Salir");
        System.out.println("Su Opcion es :");
        return meta.nextInt();
        
        
    }
    
    
}
