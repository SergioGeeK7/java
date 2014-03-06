package interfaz_01;

public class PruebaInterfazPorPagar {

    public static void main(String[] args) {
        
        // los metodos de una interfaz todos hay que implementarlos
        
        Factura f1 = new Factura("001","Llantas Good Year",123700,4);
        Factura f2 = new Factura("002","Vino Gato Negro",34000,4);
        //Factura f1 = new Factura("001","Llantas Good Year",123700,4);
        
        EmpleadoAsalariado em1 = new EmpleadoAsalariado("Bob", "Marley", "12345678", 1234540);
        EmpleadoAsalariado em2 = new EmpleadoAsalariado("Hector", "Lavoe", "654654", 34700);
        
        
        
        
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(em1);
        System.out.println(em2);
        
        
    }
    
}
