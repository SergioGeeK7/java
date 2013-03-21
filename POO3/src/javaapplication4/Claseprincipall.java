


package javaapplication4;

public class Claseprincipall {

   private static int[] arrA = {1,2,3,4};
   private static int[] arrB = {2,4,6,8};
   private static int[] arrC = new int[4];
   
   
    public static void main(String[] args) {
        Clasesecundaria objCS = new Clasesecundaria();
        objCS.sumarreglo (arrA, arrB);
        
    }
}
