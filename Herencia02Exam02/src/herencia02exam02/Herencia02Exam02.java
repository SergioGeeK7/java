package herencia02exam02;
public class Herencia02Exam02 {

    
    public static void main(String[] args) {
Figura Figurafiguras [] = {
new Cubo(5),
new Paralelepipedo(10, 7, 6),
new Esfera(12),
new Cilindro(8, 13),
new Cono(15, 9, 10)
        };

        for (Figura figura : Figurafiguras) {
            System.out.println(figura);
        }


    }
}

