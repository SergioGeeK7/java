package examen1a;

public class ProductoPrecioFijo extends Producto {

    
    // QUE TIENE ADICIONAL UN PRODUCTO PRECIO FIJO QUE NO TENGA UNO GENERICO
    private double precio;

    public ProductoPrecioFijo(String id, String descripcion, double tarifaIva,double precio) {
        super(id, descripcion, tarifaIva); // constructor de producto GENERICO
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    @Override
    public double obtenerValorIva() {
        // COMO SE OBTIENE EL VALOR DE UN IVA DE UN PRODUCTO PRECIO FIJO
        
        return precio*getTarifaIva(); // tarifaiva de la clase producto
        
    }

    @Override
    public double obtenerValorVenta() {
        return precio+obtenerValorIva();
    }

    @Override
    public String toString() {
        return String.format("Producto Precio Fijo: %s\n\t"
                + "Precio........................: $%,10.2f\n\t"
                + "Valor Iva.....................: $%,10.2f\n\t"
                + "Valor Venta...................: $%,10.2f\n\t"
                , super.toString(),precio,obtenerValorIva(),obtenerValorVenta());
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
