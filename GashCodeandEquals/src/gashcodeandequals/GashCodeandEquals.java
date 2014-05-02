package gashcodeandequals;

public class GashCodeandEquals {

    public static void main(String[] args) {

        NewClass instancia1 = new NewClass("nombre1", "apellido1", 456);
        NewClass instancia2 = new NewClass("nombre2", "apellido2", 456);
        NewClass instancia3 = new NewClass("nombre1", "apellido1", 456);

        NewClass instancia4 = instancia2;

        if (instancia1 == instancia2) {
            System.out.println("hellow");
        }

        if (instancia1 == instancia3) {
            System.out.println("hellow");
        }

        if (instancia1.equals(instancia2)) {
            System.out.println("hellow 3");
        }

        if (instancia1.equals(instancia3)) {
            System.out.println("hellow 4");
        }

        if (instancia1.getApellidos() == "apellido1") {
            System.out.println("hellow 5");
        }

        if (instancia4 == instancia2) {
            System.out.println("hellow6 copia ==");
        }

        if (instancia4.equals(instancia2)) {
            System.out.println("hellow6 copia equals");
        }

        System.out.println(instancia1);
        System.out.println(instancia1);

    }

}
