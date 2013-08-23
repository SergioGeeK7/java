
package herencia_protected;


public class instancia extends Herencia_protected {
    
    
    
    public instancia (){ // METODOS NORMALES PUEDEN LLAMAR METODOS NORMALES Y ACCEDER A VARIABLES PROTECTED 
        
        accede();
        
        
    }
    
    
    
    
    public static void main (String args[]){  // METODOS STATIC PUEDEN LLAMAR A METODOS STATICS .....
        
     //   System.out.println(saludo); NO PUEDO ACCEDER A SALUDO PORQUE ES PRIVADO
        
          // System.out.println(lol);  lol NO ES ESTATICO Y NO PUEDO ACCEDER A ELLA
        
        // METODOS ESTATICOS SOLO SE ENTIENDEN CON METODOS ESTATICOS
        
        lala(4); // HEREDO LOS METODOS Y PUEDO ACCEDER A EL PORQUE ES ESTATICO
        
        
    }
    
    
    public void accede (){
        
        System.out.print(saludo2);
        System.out.print(uu);
        System.out.print(lol);
        theend();
        System.out.println("y");
     // System.out.print(saludo); // NO PUEDO ACCEDER PORQUE ES PRIVADO
        
        
    }
    
    
    
    
}
