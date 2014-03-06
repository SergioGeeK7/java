
package interfaz_01;


public class EmpleadoAsalariado extends Empleado {
    
    
    private double salarioSemanal;

    public EmpleadoAsalariado(String nombres, String apellidos, String cedula,double salarioSemanal) {
        super(nombres, apellidos, cedula); // como estoy heredando tengo que llamar al constructor de la superclase
        this.salarioSemanal = salarioSemanal;
    }

    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    public void setSalarioSemanal(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }

    @Override
    public double obtenerMontoPago() {
        return salarioSemanal;
    }

    
    
    

    @Override
    public String toString() {
        return String.format("Empleado Asalariado: %s\n\tIngresos: $%,.2f", super.toString(),obtenerMontoPago());
    }

   
    
    
    
}
