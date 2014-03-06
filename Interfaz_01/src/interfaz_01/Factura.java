package interfaz_01;

public class Factura implements PorPagar{
    
    
    private String codigo;
    private String descripcion;
    private double precio;
    private double cantidad;

    public Factura(String codigo, String descripcion, double precio, double cantidad) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public double obtenerMontoPago() {
        // como implemento yo el monto pago de una FACTURA es diferente para cada instancia
        return precio*cantidad;
        
        
    }

    @Override
    public String toString() {
        return String.format("Factura : \n\t"
                + "Codigo : %s\n\t"
                + "Descripcion : %s\n\t"
                + "Precio : $%,12.2f\n\t"
                + "Cantidad : %,12.2f\n\t"
                + "Valor : $%,12.2f\n\t"
                ,codigo,descripcion,precio,cantidad,obtenerMontoPago());
    }
    
    
    
    
}
