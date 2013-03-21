
package javaapplication3;


public class clasesymetodos1 {

   
    public static void main(String[] args) {
        
       //K  torre trr=new torre(20,"seryo",88,9,44,6,55,2);
        
        torre trr=new torre();
        
        System.out.println("mi nombre no es "+trr.asignarnombre());
        System.out.println("mi cpu es de "+trr.asignarcpu());
        System.out.println("mi cofre es de "+trr.asignarcofre());
        System.out.println("mi disco duro es de "+trr.asignardiscoduro());
        System.out.println("mi ram es de "+trr.asignarram());
        System.out.println("mis ventiladores son "+trr.asignarventiladores());
        
        //trr.asignadordecpu(777);
        
        System.out.println("la velocidad de tu cpu es de "+trr.asignarcpu());
        
        
    }
}
