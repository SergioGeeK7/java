
package herencia_02;

public class PruebaSistemaNomina {

    public static void main(String[] args) {

        
        EmpleadoAsalariado em1 = new EmpleadoAsalariado("Bob", "Marley", "12345678", 1234540);
        EmpleadoPorHoras em2 = new EmpleadoPorHoras("Freddy", "Mercury","202020202", 48, 123000);
        EmpleadoPorComision em3 = new EmpleadoPorComision("Celia", "Cruz","30303030", 0.03, 160000000);
        EmpleadoBaseMasComision em4 = new EmpleadoBaseMasComision("Paulina", "Rubio","40404040", 0.02, 32000000,380000);
        EmpleadoBaseMasComision em0 = new EmpleadoBaseMasComision("Ruben", "Blades","50505050", 0.02, 63000000,413000);
        
        Empleado empleados []= new Empleado[5];
        
        empleados[0] = em0;
        empleados[1] = em1;
        empleados[2] = em2;
        empleados[3] = em3;
        empleados[4] = em4;
        
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
            // subirle a los empleadosbasemascomision 10% en sus ventas
            if (empleado instanceof EmpleadoBaseMasComision) { // si es instancia de la clase empleadomascomision
                
                // es un generico de la clase empleado no es un especifico de la clase, ya que el arreglo es hecho con la clase base Empleados
                //EmpleadoBaseMasComision current = empleado;
                EmpleadoBaseMasComision current = (EmpleadoBaseMasComision)empleado;
                
                current.setSalarioBase(current.getSalarioBase() * 1.33); // le subimos el sueldo a ese empleado
                System.out.println("******Aumento de sueldo******");
                System.out.println(empleado);
            }
        }
        
        
    }
    
}
