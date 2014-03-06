package herencia04;
public abstract class Usuario {

    
    private String apellidos;
    private String direccion;
    private String idUsuario;
    private String nombres;
    private String numeroTelefono;

    public Usuario(String idUsuario,String nombres,String apellidos,String numeroTelefono,String direccion) {
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.idUsuario = idUsuario;
        this.nombres = nombres;
        this.numeroTelefono = numeroTelefono;
    }
    
    
    
    
    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String toString() {
        return String.format("%s %s %s \n\tTelefono : %s\n\tDireccion : %s\n\tSaldo: %d\n\tValor a pagar Mensual: $%,.2f",
                idUsuario,nombres,apellidos,numeroTelefono,direccion,saldo(),valorAPagar());
    }
    
    
    public abstract int saldo();
    public abstract double valorAPagar();
    
    
    
}
