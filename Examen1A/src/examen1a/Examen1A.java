package examen1a;

public class Examen1A {

    public static void main(String[] args) {

        

        ProductoPrecioFijo pro1 = new ProductoPrecioFijo("1", "Aguardiente Antioqueño", 0.16, 23000.0);
        ProductoPrecioFijo pro2 = new ProductoPrecioFijo("2", "Ron Medellín", 0.16, 25000.0);
        ProductoPesoVariable pro3 = new ProductoPesoVariable("3", "Cabano", 0.16, "Kilo", 0.980, 7800.0);
        ProductoPesoVariable pro4 = new ProductoPesoVariable("4", "Queso Holandés", 0.16, "Kilo", 0.567, 9500.0);

        Producto productos[] = {pro1, pro2, pro3, pro4};
        ProductoCompuesto pro5 = new ProductoCompuesto("5", "Ancheta Don Ebrio", 0.16, productos);

        System.out.println(pro1);
        System.out.println(pro2);
        System.out.println(pro3);
        System.out.println(pro4);
        System.out.println(pro5);

        System.out.println("hellow");
        
        
    }

}
