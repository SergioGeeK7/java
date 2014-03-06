
package examen1a;

// ANCHETA

public class ProductoCompuesto extends Producto{

    
    // que atributo tiene un producto compuesto que no tienen los demas
    
    private Producto [] productos; // un producto compuesto tiene un arreglo de productos

    public ProductoCompuesto(String id, String descripcion, double tarifaIva,Producto[] productos) {
        super(id, descripcion, tarifaIva);
        this.productos = productos;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    @Override
    public double obtenerValorIva() {
        double val=0;
        for (Producto producto : productos) {
            val +=producto.obtenerValorIva();
        }
        return val;
    }

    @Override
    public double obtenerValorVenta() {
        double val=0;
        for (Producto producto : productos) {
            val +=producto.obtenerValorVenta();
        }
        return val;
    }
    
     @Override
    public String toString() {
        
        
        String aux="";
        
         for (Producto producto : productos) {
            aux +=producto.getDescripcion()+", ";
        }
        aux = aux.substring(0,aux.length()-2); // quitarle los ultimos dos caracteres
        
        return String.format("Producto Precio Compuesto: %s\n\t"
                + "Componentes...................: %s\n\t"
                + "Valor Iva.....................: $%,10.2f\n\t"
                + "Valor Venta...................: $%,10.2f\n\t"
                , super.toString(),aux,obtenerValorIva(),obtenerValorVenta());
    }
    
    
    
    
    
    
    
    
}
