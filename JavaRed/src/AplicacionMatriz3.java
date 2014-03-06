
import java.util.Scanner;

public class AplicacionMatriz3 {

    static Scanner meta = new Scanner(System.in);
    static int matriz[][];
    static String carros[];

    public static void main(String[] args) {

        llena(); 

        int opc = 0;

        do {
            opc = menu();

            switch (opc) {

                case 1:reportePorCoche();
                    break;
                case 2:reportePorVelocidad();
                    break;
                case 3:reporteRuidoTotal();
                    break;
                case 4:reporteMenorRuido();
                    break;
                case 5:reporteMayorRuido();
                break;

            }

        } while (opc != 0);

    }

    public static int menu() {

        System.out.println("1. Reporte Por Coche");
        System.out.println("2. Reporte Por Velocidad");
        System.out.println("3. Promedio De Nivel De Ruido Total");
        System.out.println("4. Menor Ruidoso");
        System.out.println("5. Mayor Ruidoso");
        System.out.println("Su opcion es: ");

        return meta.nextInt();
    }

    public static void llena() {
        
        System.out.println("Ingrese numero de autos a calcular");
        
        
        int n = meta.nextInt();
        
        matriz = new int[n][7];
        carros = new String [n];
        
        
        meta.nextLine();// SOLUCINANDO BUG DE READER
        for (int i = 0; i < matriz.length; i++) {
            int velocidades = 10;
            System.out.println("Ingrese el nombre del carro: ");
            carros[i] = meta.nextLine();

            for (int j = 0; j < matriz[0].length; j++) {

                System.out.print("Ingresa Nivel de ruido en decibeles para la velocidad: "
                        + (velocidades += 10)+" ");
                matriz[i][j] = Integer.parseInt(meta.nextLine());

            }
        }

    }

    public static void reportePorCoche() {

        for (int i = 0; i < matriz.length; i++) {

            double sum = 0;

            for (int j = 0; j < matriz[0].length; j++) {

                sum += matriz[i][j];

            }
            System.out.println("El promedio del carro :" + carros[i] + " es " + (double)(sum / 7));
            
        }

    }
    
    public static void reportePorVelocidad() {
        
        int velocidades = 10;

        for (int i = 0; i < matriz[0].length; i++) {

            double sum = 0;

            for (int j = 0; j < matriz.length; j++) {

                sum += matriz[j][i];

            }
            System.out.println("El promedio de la velocidad  :"
                    + (velocidades+=10)+ " es de " + (double)(sum / matriz.length));
            
        }

    }
    
     public static void reporteRuidoTotal() {
         
         double sum=0;
         
         for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[0].length; j++) {
                sum += matriz[i][j];
            }
        }
        
         
        System.out.println("El promedio total de ruido es " + (double) (sum/(matriz.length*matriz[0].length))); 
         
         

    }
     
     
     public static void reporteMayorRuido() {
        
         int sum = 0;
         int indice =0;
         int mayor=0;
         
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[0].length; j++) {
                sum += matriz[i][j];
            }
            
            if (sum>mayor){ 
                mayor = sum;
                indice = i;  
            }
            sum=0;
        }
        
        System.out.println("El mayor ruidoso es "+carros[indice]+" con un total"
                + " de "+mayor+" decibeles");

    }
     
     
     
      public static void reporteMenorRuido() {
        
        int sum = 0;
        int indice=0;
        
        int menor = 99999;
        
        for (int i = 0; i < matriz.length; i++) {

            

            for (int j = 0; j < matriz[0].length; j++) {
                sum += matriz[i][j];
            }
            
            if (sum<menor){
                menor = sum;
                indice = i;
            }
            
             sum=0;  
               
            
        }
        
        System.out.println("El carro que causo menos ruido es " +carros[indice]+
                " Con un total de : "+menor+" decibeles");

    }
    

}
