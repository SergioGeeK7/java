package herencia_02;


public class EmpleadoBaseMasComision extends EmpleadoPorComision{

    
    private double salarioBase;

    public EmpleadoBaseMasComision(String nombres, String apellidos, String cedula, double tarifaComision, double ventasBrutas,double salarioBase) {
        super(nombres, apellidos, cedula, tarifaComision, ventasBrutas);
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public double ingresos() {
        return super.ingresos()+salarioBase; 
    }
    
    
    
    
     @Override
    public String toString() {
       // return String.format("Empleado Base Y %s\n\tIngresos: $%,.2f", super.toString(),ingresos());
        return String.format("Empleado Base Y %s",super.toString());
    }
    
    
}
