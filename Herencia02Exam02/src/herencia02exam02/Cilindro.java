package herencia02exam02;
 
public class Cilindro extends Esfera{
    
    
    // Cilindro recto base circular
    
    private double h;

    public Cilindro( double r,double h) {
        super(r);
        this.h = h;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public double getVolumen() {
        return (Math.PI*Math.pow(getR(), 2) )*h;
    }

    @Override
    public double getArea() {
        return (2*Math.PI)*getR()*h+(2*Math.PI)*Math.pow(getR(), 2);
        // es diferente 2 * x que x ala dos

    }
    
    
    
    @Override
    public String toString() {
        return String.format("Cilindro \n\tr...........: %,.2f\n\th...........: %,.2f\n\t"
                + "Area............: %,.2f\n\tVolumen..........: %,.2f",getR(),h,getArea(),getVolumen());
    }
    
    
    
    
}
