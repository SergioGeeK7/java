public class Persona {

    
    private String nombres;
    private String apellidos;
    private String cedula;
    private Fecha anoContratacion;
    private Fecha anoNacimiento;

    public Persona(String nombres, String apellidos, String cedula, Fecha anoNacimiento,Fecha anoContratacion) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.anoContratacion = anoContratacion;
        this.anoNacimiento = anoNacimiento;
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

    public Fecha getAnoContratacion() {
        return anoContratacion;
    }

    public void setAnoContratacion(Fecha anoContratacion) {
        this.anoContratacion = anoContratacion;
    }

    public Fecha getAnoNacimiento() {
        return anoNacimiento;
    }

    public void setAnoNacimiento(Fecha anoNacimiento) {
        this.anoNacimiento = anoNacimiento;
    }

    @Override
    public String toString() {
        return String.format("Nombres : %s\nApellidos : %s\nCedula : %s\nFecha de nacimiento %s\nFecha de contratacion %s",
                nombres,apellidos,cedula,anoNacimiento,anoContratacion);
    }

    
    
    
    
    
    
    
}
