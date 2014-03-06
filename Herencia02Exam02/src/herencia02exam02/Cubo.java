package herencia02exam02;


public class Cubo implements Figura{
    
    private double a;

    public Cubo(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public double getArea() {
        return 6*Math.pow(this.a,2);
    }

    @Override
    public double getVolumen() {
        return Math.pow(this.a, 3);
    }

    @Override
    public String toString() {
        return String.format("Cubo \n\ta...........: %,.2f\n\tArea............: %,.2f\n\tVolumen..........: %,.2f",a,getArea(),getVolumen());
    }

    
   
    
}
