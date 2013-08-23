/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_protected;


public class Herencia_protected {

   private String saludo="hola"; // SOLO ESTA CLASE NO HERENCIAS (SUB CLASES)    -----   NO ES HEREDABLE
   protected String saludo2="hola"; // ESTA CLASE Y SUS HERENCIAS
   static int uu=4; // SE MANTIENE ENTRE TODAS LAS INSTANCIAS DE ESTA CLASE
   
   private double saldo = 654654; // VARIABLES PRIVATE SE UTILIZAN PARA METODOS PRIVATE QUE NO NECESITAN SER ACCEDIDOS DESDE LA INSTANCIA MODIFICAR SUS VALORES Y 
                                  //PROBABLEMENTE NUNCA SERAN MOSTRADOS AL USUARIO AMENOS QUE SEA POR MEDIO DE UN METODO PUBLICO
                                  // EJEMPLO... MODIFICAR EL SALDO POR UN METODO PRIVADO INTERNO DE LA MISMA CLASE
   
   String lol = "hola";
    
    public static void main(String[] args) {
        
        
        int a=0;
        
        System.out.println(lala(a));
        
        
        
    }
    
    
    public static String lala (int a){
        
        if (a==4){
            
        }else{
            return "hola";  // CUANDO SE ENCUENTRA EL PRIMER RETURN PARA ....
        }
        
        return null;
       /* 
        saldo=0;           LO ESTATICO SE ENTIENDE CON LO ESTATICO.. VARIABLES Y METODOS
        saludo2="holaa";
        lalala ()
        theend();
        */
        
        
    }
    
    
    private void lalala (){
        
        saldo=0;
        saludo2="cambio desde private";
    }
    
    
    public void agregarsaldo (int a){
        
        saldo += a;
        
    }
    
    void mostrarsaldo (){
        
        System.out.println(saldo);
        lala(4); // UN PUBLIC PUEDE LLAMAR A UN STATIC
    }
    
    
    protected void theend (){
        
        System.out.print(uu);
        lala(4); // UN PROTECTED PUEDE LLAMAR A UN STATIC
        
    }
    
    
    
    /*
    public static  void lala (){
        
        // EN METODOS ESTATIOS SOLO PUEDO UTILIZAR VARIABLES ESTATICAS
        System.out.println(saludo);
        
    }*/
    
    
    
    
    
}
