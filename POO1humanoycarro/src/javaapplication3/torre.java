
package javaapplication3;


public class torre {
    // atributos (o propiedades del ) del objeto de la clase torre
    // private para que solo sean accesibles por la clase torre, y no sean reemplazados o reutilizados como globales
    // desde otras clases
    
    private int cofre,fuente,ram,cpu,ventiladores,discoduro,cddvd;
    private String nombre;
  
    // se asignan las variables globalmente en el class
    
    
    
    /*
     -- si se pone public int cofre seria como declarar una variable global y me la podria modificar otra clase
     aqui puedo repetir variables que tenga en otra clase 
     -- public static int chazis;
        public int cogre;
    */
    
    // las clases sirven para determinar un conjunto de objetos
    
   
    
     // lo siguiente que tiene una clase es el constructor
    // creacion de objeto
    //K public torre (int cofre,String nombre,int fuente,int ram, int cpu,int ventiladores,int discoduro,int cddvd){
     
        public torre () {
        
        // de este(this) objeto la propiedad cddvd va a ser igual a esta dvd que le pare como parametro
        // es como si creara otra variable cpu pero solo para este objeto y le estoy asignando el mismo valor que tiene el cpu que le pase como parametro
        // porque this.cpu=cpu ; porque si pongo cpu=cpu estaria asignando el mismo valor a la misma variable, y aqui estoy creando una varible nueva cpu para este objeto y le estoy asignando el mismo valor que tiene cpu en la clase que le pase como parametro
        //this.cddvd=cddvd;
        
      // retorne la variable cpu que tengo aqui a la variable cpu que tengo arriba
      
        
       /* 
        this.cofre=cofre;
        this.ram=ram;
        this.cpu=cpu;
        this.ventiladores=ventiladores;
        this.discoduro=discoduro;
        this.nombre=nombre;
        this.fuente=fuente;
        this.cddvd=cddvd;
        */
     
       //-------------------------------------- un objeto o clase no funciona sin contructor. se pone asi sea el contructor basio. y luego se llama los demas metodos, si es necesario se crean las variables en los metodos. sino se crean desde arriba en el class y se pasan al constructor
        
            //--- FUNCIONAMIENTO DE EL CONSTRUCTOR. (( ESTE CONSTRUCTOR RESIVIRA LOS PARAMETROS DE ENTRADA EN LA LLAMADA. EL ES EL QUE SE ENCARGA DE RESIVIR LOS PARAMETROS DE ENTRADA CUANDO LO LLAMAN. ASI EN EL MISMO ORDEN QUE ENTRAN LOS PARAMETROS EN EL METODO CONSTRUCTOR Y LAS DEMAS INSTRUCCIONES THIS. ES PARA ACTUALIZAR LAS INSTRUCCIONES GLOBALES CON LAS ACABADAS DE INGRESAR EN PARAMETRO CUANDO FUE LLAMADO. 
            // -- Y ASI SE TIENE QUE CREAR UN METODO PARA CADA PARAMETRO QUE SEA DEVUELTO INDIVIDUALMENTE YA QUE FUERON ESCRITOS POR EL CONSTRUCTOR DE LOS PARAMETROS DE ENTRADA Y ACTUALIZADOS SIMULTANEAMENTE CON THIS
    }
    // creacion de metodos
    // lo siguiente que aremos en nuestra clase sera asignar unos metodos 
    // llamados sets and gets
    
    public void asignadordecpu (int cpu) {
        
        this.cpu=cpu;
        
        // return cpu;
        
    //- funcionamiento de metodo. este cuando lo llaman se le envia el parametro de entrada el cual modificara el global, para luego ser mostrada por otro metodo
        
        
        // metodo de asignacion para especificamente la variable edad
        
    }
    
    
    // set
    
    //asignar variables globales mientras se escribe public int ob=0;
    
    public int asignarcpu (){
        
        return cpu;
        
       // esto retornara el valor que yo le pedi cunado lo llame. en este caso cpu, que como esta global ya fue modificada en primera instancia
        
    }
     public int asignarventiladores (){
        
        return ventiladores;
        
    }
      public int asignardiscoduro (){
        
        return discoduro;
        
    }
       public int asignarram (){
        
        return ram;
        
    }
        public int asignarcofre (){
        
        return cofre;
        
    }
         public String asignarnombre (){
        
        return nombre;
        
    }
    
 
}


