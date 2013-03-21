
package metodos3;
import java.util.*;

public class metodos3 {

    public static void main(String[] args) {
        
        
        Scanner e = new Scanner(System.in);
        
        
        int a=e.nextInt();
        int b=e.nextInt();
        String nombre;
        
        
        
        //double a=e.next.Int();
        //double salario = e.nextDouble();
        
        
        
        System.out.println(lasuma(a,b));
        System.out.println("su nombre es "+nom());
        System.out.println("ingrese un numero");
        
        int c=e.nextInt();
        System.out.println("el numero que ingresaste fue"+c);
        
        
        
        
        System.out.println("el promedio de las notas es"+promedio());
        
        
        
        
        
    }
    
    public static int lasuma (int a,int b) {
        
        return a+b;
        
        
    }
    
    
    public static String nom (){
        
        
        Scanner e = new Scanner(System.in);
        String nombre;
        
        
        System.out.println("ingrese su nombre");
        nombre=e.nextLine();
        return nombre;
        
        
    }
    
    public static double promedio (){
    
        Scanner e=new Scanner(System.in);
        
        double ent1,ent2,ent3,ent4,ent5;
        //double salario;
        System.out.println("ingrese sus 5 notas");
        
        
        //salario = e.nextDouble();
        
        ent1=e.nextDouble();
        ent2=e.nextDouble();
        ent3=e.nextDouble();
        ent4=e.nextDouble();
        ent5=e.nextDouble();
        
        return ent1+ent2+ent3+ent4+ent5/5;
        
        
        
        
        
        
    }
    
    
    
}
