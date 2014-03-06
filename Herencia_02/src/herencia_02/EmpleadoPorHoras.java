package herencia_02;

public class EmpleadoPorHoras extends Empleado {

    private double horasTrabajadas;
    private double valorHora;

    public EmpleadoPorHoras(String nombres, String apellidos, String cedula, double horasTrabajadas,double valorHora) {
        super(nombres, apellidos, cedula); // obligatorio hacer el constructor... PENSAR QUE LA HERENCIA ES JUNTAR TODO EL CODIGO DE LA CLASE y hacer instancia
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public double ingresos() {
        if (horasTrabajadas <= 40) {
            return horasTrabajadas * valorHora;
        } else {
            return 40 * valorHora + (horasTrabajadas - 40) * valorHora * 1.5;
        }
    }
    
    
     @Override
    public String toString() {
        return String.format("Empleado Por Horas: %s\n\tIngresos: $%,.2f", super.toString(),ingresos());
    }

    

}
