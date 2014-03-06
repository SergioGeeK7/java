
package herencia_02;


public class EmpleadoAsalariado extends Empleado {
    
    
    private double salarioSemanal;

    public EmpleadoAsalariado(double salarioSemanal, String nombres, String apellidos, String cedula) {
        super(nombres, apellidos, cedula); // como estoy heredando tengo que llamar al constructor de la superclase
        this.salarioSemanal = salarioSemanal;
    }
    
    
    
    
    
}
