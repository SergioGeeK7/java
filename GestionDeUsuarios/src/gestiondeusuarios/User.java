

package gestiondeusuarios;


public class User {
    
    private int id;
    private String nombres;
    private String apellidos;
    private double salario;
    private int anos;
    private int nhijos;
    private String estado;
    
    
    
    
    public User(String datos[]){
        
        this.id =new Integer(datos[0]);
        this.nombres =datos[1];
        this.apellidos = datos[2];
        this.salario = new Double(datos[3]);
        this.anos =new Integer(datos[4]);
        this.nhijos =new Integer(datos[5]);
        this.estado = datos[6];
        
     }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", nombres=" + nombres + ", apellidos=" + apellidos + ", salario=" + salario + ", anos=" + anos + ", nhijos=" + nhijos + ", estado=" + estado + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getAnos() {
        return anos;
    }

    public void setAnos(int anos) {
        this.anos = anos;
    }

    public int getNhijos() {
        return nhijos;
    }

    public void setNhijos(int nhijos) {
        this.nhijos = nhijos;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
    
    
    
    
}
