
package gestiondeusuarios;

import java.util.Scanner;


public class ListaDoblementeLigada {
    private static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
       listadobleligada lista=new listadobleligada();
       int opc=0,pos;
       do{
           opc=menu();
           switch(opc){
               case 1:
                   System.out.println("Ingrese dato: ");
                   int dato=sc.nextInt();
                   System.out.println("Ingrese posicion");
                   lista.add(dato);
                   break;
               case 3:
                   System.out.println("ingrese posicion a eliminar");
                   dato = sc.nextInt();
                   System.out.println(lista.delete(dato));
                   break;
               case 2:
                   System.out.println("Ingrese dato: "); // array list
                   dato=sc.nextInt();
                   System.out.println("Ingrese posicion");
                   pos = sc.nextInt();
                   lista.insert(dato,pos);
                   break;
               case 4:
                   System.out.println(lista);
                   break;               
           }
           
       }while(opc!=0);
    }
    public static int menu(){
        System.out.println("1. Adicionar");
        System.out.println("2. Insertar");
        System.out.println("3. Borrar");
        System.out.println("4. Mostrar");
        System.out.println("5. Salir");
        System.out.println("Su pocion es: ");
        return sc.nextInt();
    }
}
