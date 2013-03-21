
package ciclos;
import com.sun.xml.internal.ws.api.pipe.NextAction;
import java.util.Scanner;
public class ciclos {

    public static void main(String[] args) {
       
        
        int y=0;
        int vec[];
        //int vec[];
        
        
       /* while (y<=30){
            
            System.out.println("el valor de el contador es "+y);
            //System.err.println(y);
            y++;
            
       }
        
       */
      
        
        
        
        
    dowhile();    
    dowfor();
    
    
    System.out.println("are el vector");
    
    //int vec[]=vector();
    
    vec=vector();
    
    System.out.println("el vector lo tengo en"+vec[1]);
    
        
    }
    
    
    
    
    public static void dowhile (){
        
    Scanner meta=new Scanner(System.in);
    System.out.println("meta un numero");
        int a;
    
    
    do{
        
        a=meta.nextInt();
        
        
    }while (a>5);
        
        
    }
    
    
    public static void dowfor (){
        
        for (int j=0;j>20;j++){
            
          //  lerr verctor y preguntar y guardar los pares, luego mostrarlos
            
        }
        
        
    }
    
    
    public static int[] vector (){
        
        Scanner meta=new Scanner (System.in);
        
        System.out.println("cuantas posiciones desea que tenga el vector ?");
        int pos=meta.nextInt();
        int vec[]=new int[pos];
        
        
        for (int cont=0;cont==pos-1;cont++){
            
            System.out.println("ingrese un numero para la posicion"+cont);
            vec[cont]=meta.nextInt();
            
        }
        
        
        return vec;
        
        
        
    }
            
            
            
    
    
    
}
