
package aplicacionarreglo;

public class AplicacionArreglo {

    
    public static void main(String[] args) {
        
        
                char arreglo0[] = { 'v', 'i', 'v', 'o', 's'};
		char arreglo1[] = { 'r', 'e', 'c', 'o', 'n' , 'o', 'c', 'e','r'};
		
       
	palin(arreglo0);
        palin(arreglo1);
        
        
        
        
    }
    
    
    
    
    public static void palin (char palabra[]){
        
        
        for (int i = 0; i < palabra.length; i++) 
            System.out.println("Caracter " + (i+1) + " = " + palabra[i]);
	
        
        int mitad = palabra.length/2;
        int con=0;
        
        for (int i = 0; i < mitad; i++) {
            
            if (palabra[i]==palabra[palabra.length-i-1]) 
                con++;
            
            
            
        }
        
        if (con==mitad) 
            System.out.println("Es un palindromo");
        else
            System.out.println("No es palindromo");
        
    }
    
    
}
