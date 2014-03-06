package examen1a;

public class ProductoPesoVariable extends Producto{

    // que atributos tiene de especial este producto
    
    private String unidadDeMedida;
    private double cantidad;
    private double precioPorUnidadDeMedida;

    public ProductoPesoVariable(String id, String descripcion, double tarifaIva,String unidadDeMedida, double cantidad, double precioPorUnidadDeMedida) {
        super(id, descripcion, tarifaIva);
        this.unidadDeMedida = unidadDeMedida;
        this.cantidad = cantidad;
        this.precioPorUnidadDeMedida = precioPorUnidadDeMedida;
    }

    public String getUnidadDeMedida() {
        return unidadDeMedida;
    }

    public void setUnidadDeMedida(String unidadDeMedida) {
        this.unidadDeMedida = unidadDeMedida;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioPorUnidadDeMedida() {
        return precioPorUnidadDeMedida;
    }

    public void setPrecioPorUnidadDeMedida(double precioPorUnidadDeMedida) {
        this.precioPorUnidadDeMedida = precioPorUnidadDeMedida;
    }
    
    @Override
    public double obtenerValorIva() {
        // MIRAR COMO SE CALCULA EL IVA PARA UN PRODUCTO COMPUESTO
        return precioPorUnidadDeMedida * cantidad* getTarifaIva();
    }

    @Override
    public double obtenerValorVenta() {
        return precioPorUnidadDeMedida * cantidad + obtenerValorIva();
    }
    
    
       @Override
    public String toString() {
        return String.format("Producto Precio Variable: %s\n\t"
                + "Unidad de media........................: %s\n\t"
                + "Cantidad.....................: %,10.2f\n\t"
                + "Precio Por Unidad De Medida.....................: $%,10.2f\n\t"
                + "Valor Iva.....................: $%,10.2f\n\t"
                + "Valor Venta...................: $%,10.2f\n\t"
                , super.toString(),unidadDeMedida,cantidad,precioPorUnidadDeMedida,obtenerValorIva(),obtenerValorVenta());
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
