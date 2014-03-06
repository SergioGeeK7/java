package herencia02exam02;


public class Esfera implements Figura{

    private double r;

    public Esfera(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return (4*Math.PI)*Math.pow(r, 2);
    }

    @Override
    public double getVolumen() {
        return (4/3)*(Math.PI*Math.pow(r, 3));
    }

    @Override
    public String toString() {
        return String.format("Esfera \n\tr...........: %,.2f\n\tArea............: %,.2f\n\tVolumen..........: %,.2f",r,getArea(),getVolumen());
    }
    
    
    
    
    
}
