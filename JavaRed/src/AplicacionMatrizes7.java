import java.io.*;

public class AplicacionMatrizes7 {
	private static final int REN = 3;
	private static final int COL = 3;
	
	// para pedir los valores de teclado de cualquier matriz ya creada
	public static void pide_matriz(int matriz[][]) throws IOException{
        BufferedReader in = 
			new BufferedReader(new InputStreamReader(System.in));
        
        for (int i=0; i<matriz.length; i++) {
        	for (int j=0; j<matriz[0].length; j++) {
           		System.out.print("Da elemento " + (i+1)+ " , " + (j+1) + " : ");
           		matriz[i][j] = Integer.parseInt(in.readLine());
        	}
        	System.out.println();
        }				
	}
	
	// para desplegar los datos de cualquier matriz
	public static void despliega_matriz(int matriz[][]) {
        for (int i=0; i<matriz.length; i++) {
        	for (int j=0; j<matriz[0].length; j++) {
           		System.out.print(" " + matriz[i][j]  + " ");
        	}
        	System.out.println();
        }
        System.out.println();
	}
	
	// dadas las matrices a y b, las suma en c
	public static void suma(int a[][], int b[][], int c[][]) {
        for (int i=0; i<b.length; i++) {
        	for (int j=0; j<b[0].length; j++) {
           		c[i][j] = a[i][j] + b[i][j];
        	}
        }
		
	}
	
	// para calcular el promedio de la matriz cualquiera que sea
	public static double promedio(int matriz[][]) {
		double suma = 0d;
		
        for (int i=0; i<matriz.length; i++) {
        	for (int j=0; j<matriz[0].length; j++) {
           		suma +=  matriz[i][j];
        	}
        }
        return suma/(matriz.length * matriz[0].length);
		
	}
	
	public static void main(String[] args) throws IOException {

	    char opcion;
	    int a[][] = new int[REN][COL];
	    int b[][] = new int[REN][COL];
	    int c[][] = new int[REN][COL];
	    BufferedReader in = 
			new BufferedReader(new InputStreamReader(System.in));
	
	    opcion = ' ';
	    while (opcion != '5') {
	    	System.out.println(" Menu de Matrices");
	    	System.out.println();
	    	System.out.println("1. Pedir datos matrices A y B");
	    	System.out.println("2. Desplegar datos Matrices A y B");
	    	System.out.println("3. Obtener Suma en C y desplegarla");
	    	System.out.println("4. Desplegar Promedio de A y de B");
	    	System.out.println("5. Fin");
	    	System.out.println("¿Opcion deseada (1-5) ?");
	    	opcion = in.readLine().charAt(0);
	    	switch (opcion) {
	    		case ('1') :
	    			pide_matriz(a);
	    			pide_matriz(b);
	    			break;
	    		case ('2') :
	    			despliega_matriz(a);
	    			despliega_matriz(b);
	    			break;
	    		case ('3') :
	    			suma(a, b, c);
	    			despliega_matriz(c);
	    			break;
	    		case ('4') :
	    			System.out.println("El promedio de matriz A = " + promedio(a));
	    			System.out.println("El promedio de matriz B = " + promedio(b));
	    			break;
	    		case ('5') :
	    		    System.out.println("Hasta Luego!");
	    		    break;
	    		default:
	    		    System.out.println("Opcion debe ser de 1 a 5");
	    		    break;
	    	};
	    	
	    }

  	}

}
