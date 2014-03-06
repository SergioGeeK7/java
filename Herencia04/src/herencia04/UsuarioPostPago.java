package herencia04;
public class UsuarioPostPago extends Usuario{

    private int saldoCuenta;
    private int valorMensual;

    public UsuarioPostPago(String apellidos, String nombres, String idUsuario, String direccion, String numeroTelefono, int valorMensual) {
        super(apellidos, nombres, idUsuario, direccion, numeroTelefono);
        this.valorMensual = valorMensual;
        
        
        switch (valorMensual) {
            case 10000:this.saldoCuenta=80;
            break;
            case 20000:this.saldoCuenta=180;
            break;
            case 50000:this.saldoCuenta=600;
            break;
            default:
                throw new AssertionError();
        }
        
        
    }
    
     public boolean restarSaldo(int menos){
       // 158 resta en minutos
       
         if (this.saldoCuenta>=menos) {
             
             this.saldoCuenta-=menos;
             return true;
         
         }
       
       return false;
       
     }
     
    @Override
    public int saldo() {
        // como se calcula el saldo para un UsuarioPostPago
        
        return saldoCuenta;
    }

    @Override
    public double valorAPagar() {
        return this.valorMensual;
    }

    @Override
    public String toString() {
        return "Usuario Post Pago "+super.toString();
    }

   
    
    
    
}
