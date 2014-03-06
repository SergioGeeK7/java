

package interfaz_01;

public abstract class Empleado implements PorPagar {
   
    
    // no vamos a implementar el metodo, porque la clase Empleado es abstracta
    
    private String nombres;
    private String apellidos;
    private String cedula;

    public Empleado(String nombres, String apellidos, String cedula) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return String.format("%s %s \n\tCedula: %s", nombres,apellidos,cedula);
        
    }
    
    
    
    
    
    
}
