package herencia04;
public class UsuarioPrepago extends Usuario{

    
    // aparte del usuario NORMAL que mas tiene
    // se juntan las dos clases en una ... POR DECIRLO ASI
    
    private int saldoCuenta;

    public UsuarioPrepago(String apellidos, String nombres, String idUsuario, String direccion, String numeroTelefono) {
        super(apellidos, nombres, idUsuario, direccion, numeroTelefono);
        this.saldoCuenta = 0;
    }

    public int getSaldoCuenta() {
        return saldoCuenta;
    }

    public void setSaldoCuenta(int saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }

   public boolean restarSaldo(int menos){
       
       
       // debe restar en minutos
       
        if (menos*150<=saldoCuenta) {
             
             this.saldoCuenta-=menos*150;
             return true;
         
         }
       //9934
       return false;
       
   }
   
   public void adicionarSaldo(double mas){
       this.saldoCuenta+=mas;
   }
    
    
    
    
    @Override
    public int saldo() {
        // como se le calcula el saldo en minutos a un usuarioPrepago
        return saldoCuenta/150;
        
    }

    @Override
    public double valorAPagar() {
        return 0.0;
    }
    
     public String toString() {
        return "Usuario Prepago "+super.toString();
    }

    
    
    
    
    
}
