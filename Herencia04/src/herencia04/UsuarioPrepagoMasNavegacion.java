package herencia04;
    public class UsuarioPrepagoMasNavegacion extends UsuarioPostPago{

    public UsuarioPrepagoMasNavegacion(String apellidos, String nombres, String idUsuario, String direccion, String numeroTelefono, int valorMensual) {
        super(apellidos, nombres, idUsuario, direccion, numeroTelefono, valorMensual);
    }

    @Override
    public double valorAPagar() {
        return super.valorAPagar()+20000;
    }

    @Override
    public String toString() {
        return "Usuario Prepago Mas Navegacion "+super.toString();
    }
    
        
        
        
        
}
