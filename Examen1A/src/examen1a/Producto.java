package examen1a;
public abstract class Producto {

    
    private String id;
    private String descripcion;
    private double tarifaIva;
    
    // ESTOS ATRIBUTOS SON GENERICOS PARA TODOS LOS PRODUCTOS
    // TODOS LOS PRODUCTOS TIENEN ID ,IVA,DESCRIPCION
    public Producto(String id, String descripcion, double tarifaIva) {
        this.id = id;
        this.descripcion = descripcion;
        this.tarifaIva = tarifaIva;
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

    public double getTarifaIva() {
        return tarifaIva;
    }

    public void setTarifaIva(double tarifaIva) {
        this.tarifaIva = tarifaIva;
    }
    
    
    public abstract double obtenerValorIva();
    public abstract double obtenerValorVenta();

    @Override
    public String toString() {
        return String.format("%s %s\n\tTarifa Iva....................: %.2f",
                id,descripcion,tarifaIva);
    }
    
    
    
    
}
