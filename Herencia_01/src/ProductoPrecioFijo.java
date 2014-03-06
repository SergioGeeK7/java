
public class ProductoPrecioFijo extends Producto {

    
    
    
    private double precio;

    
    public ProductoPrecioFijo(double precio, String id, String descripcion, double tarifaiva) {
        
        super(id, descripcion, tarifaiva); // yo no puedo crear un producto sino le mando ID PRECIO E IVA
        // si la clase que eredo tiene constructor TENGO que mandarle y ejecutarle el super
        
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        // variable flotante %,f  separadores de miles
        // %s String
        // %d entero
        //%02d entero mas dos decimales
        
        return String.format("Producto Precio Fijo: %s\n\tValor venta : $%,.2f", super.toString(),obtenerValorVenta());
    }
    
    @Override
    public double obtenerValorIva() {
        return precio*getTarifaiva();
    }

    @Override
    public double obtenerValorVenta() {
        return precio + obtenerValorIva();
    }
    
    
    
    
}
