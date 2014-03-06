package herencia02exam02;

public class Paralelepipedo extends Cubo{

    
    
    private double b;
    private double h;

    public Paralelepipedo( double a,double b, double h) {
        super(a);
        this.b = b;
        this.h = h;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public double getVolumen() {
        return getA()*b*h;
    }

    @Override
    public double getArea() {
        return 2*(getA()*b + b*h + getA()*h);
    }
    
    
    @Override
    public String toString() {
         return String.format("Paralepipedo \n\ta...........: %,.2f\n\tb...........: %,.2f\n\th...........: %,.2f\n\t"
                + "Area............: %,.2f\n\tVolumen..........: %,.2f",getA(),b,h,getArea(),getVolumen());
    }
    
    
    
    
    
}
