
package metodosdedevuelta;

public class Metodosdedevuelta {

 
    public static void main(String[] args) {
       
        
        int x=4,r=3,i=7,m,n,b;
        
        
        System.out.println(contadoresnormales());
        
       contadoresnormales();
       operadoresasignacion();
        System.out.println(x);
        
        incremento();
        pruebasweas();
        
       // otraprueba(x,r,i);
        
        
    }
    
    public static int contadoresnormales (){
    
    int x=4,u=1,r=6;
    
    x=x+6;
    u=u+3;
    r=r-4;
    
    System.out.println("el valor de x es "+x);
    System.out.println("el valor de u es "+u);
    System.out.println("el valor de r es "+r);
    
    return r;
    
}
           
    public static int operadoresasignacion(){
        
        int x=0,k=0,i=1;
                
        x-=4;
        k+=1;
        i-=7;    
        
        x*=3;
        x/=5;
        
        
        
              
              System.out.println(x);
              return x;
                
        
        
    }
    
    public static int incremento () {
        
        int i=7,g=9,r=3;
        
        
        i++;
        g++;
        r++;
        
        System.out.println(i+g+r);
        System.out.println("el resultado es "+i+g+r);
        
        r--;
        g--;
        i--;
        
        System.out.println(i+g+r);
        System.out.println(" "+i+g+r);
        System.out.printf("el contenido de los tres numeros es %d %d %d%n",i,g,r);
        
        return r ;
        
    }
    
   
    public static int pruebasweas (){
        
        
        int u=9,t=4,k=0,m=6;
        String nom="serto";
        
        k++;
        //u++;
        //u--;
        //m--;
        //m++;
        
        
        System.out.printf("el contenido de m es %d%n",m);
        
        System.out.printf("el contenido de m es ahora %d%n",m+1);
        System.out.printf("el contenido de m es ya %d%n",++m);
        
        
        --u;
        
        System.out.println(u);
        System.out.println(++u);
        
        
        
        
        System.out.println("el nombre de seryo no es "+nombre(nom));
        
        
        return m;
        
        
    }
    
    
    public static String nombre (String nom){
        
        nom="falso";
        
        return nom;
        
        
        
    }
    
    
    public int otraprueba (int a,int b, int c){
        
        
        a++;
        b++;
        c++;
        
        
        return a+b+c;
        
        
    }
    
    
}
