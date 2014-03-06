public abstract class Producto {

    private String id;
    private String descripcion;
    private double tarifaiva;

    public Producto(String id, String descripcion, double tarifaiva) {
        this.id = id;
        this.descripcion = descripcion;
        this.tarifaiva = tarifaiva;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getTarifaiva() {
        return tarifaiva;
    }

    public void setTarifaiva(double tarifaiva) {
        this.tarifaiva = tarifaiva;
    }

    @Override
    public String toString() {
        
        return String.format("%s %s\n\tTarifa Iva : %.2f", id,descripcion,tarifaiva);
    }
    
    
    
    //Metodos Abstractos
    public abstract double obtenerValorIva();
    public abstract double obtenerValorVenta();
        
    
    
    
    
    
    
    
    
    
    
}
