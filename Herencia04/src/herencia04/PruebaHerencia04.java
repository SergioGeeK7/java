package herencia04;
public class PruebaHerencia04 {
    
    
      public static void main(String[] args) {
        UsuarioPrepago u1 = new UsuarioPrepago("45678434", "Maria", "Gutierrez",
                "300 456 7898", "Calle 80 #34 43");
        u1.adicionarSaldo(10000);
        u1.restarSaldo(36);
        System.out.println(u1);

        UsuarioPostPago u2 = new UsuarioPostPago("98622480", "Juan", "Zuluaga",
                "300 678 6688", "Avenida 34 #34 78", 50000); 
        u2.restarSaldo(158);
        System.out.println(u2);

        UsuarioPrepagoMasNavegacion u3 = new UsuarioPrepagoMasNavegacion(
                "5948948", "Valery", "Cardona",
                "300 433 5430", "Carrera 15 #48 56", 20000); 
        u3.restarSaldo(15);
        System.out.println(u3);
    }

}
