

package evaluadorfunciones;

public class Evaluador {
    
    static Pila pila = new Pila();
    
    public static double evaluar(String infijo){
        String posfija = infijaToPostfija(infijo);
        
        int n = posfija.length();
        for (int i = 0; i < n; i++) {
            
            char token = posfija.charAt(i);
            
            if (token >= '0' && token <= '9' ) {
                
                pila.push(token);
            }else{

                
                
                pila.push(opera(pila.pop(),pila.pop(),token));
                
            }
            
            
        }
        
        
        
        
        
        
        return (double)pila.pop();
       
    }
    
    
    private static double opera (Object op1,Object op2,Object operador){
        
        
        
//         double opp1 =(double)op1;
//         double opp2 =(double)op2;
        
        double opp1 =new Double(op1.toString());
        double opp2 =new Double(op2.toString());

        
        double resul=-1;
        
        switch(operador.toString().charAt(0)){
            
            case'*':resul=opp2*opp1;break;
            case'/':resul=opp2/opp1;break;
            case'+':resul=opp2+opp1;break;
            case'-':resul=opp2-opp1;break;
            case'^':resul=Math.pow(opp2, opp1);break;
        }
        
        return resul;
    }
    
    
    
     static String infijaToPostfija (String infija){
        int n = infija.length();
        String posfija="";
        
        
        
        
        for (int i = 0; i < n; i++) {
            char token = infija.charAt(i);
            
            if (token >= '0' && token <= '9' ) {
                posfija+=token;
            }else{
                
                if (')'!= token) {
                    
                    if (!pila.empty()) {
                        
                        int prioriE = prioridadInfija(token);
                        int prioriP = prioridadPila(pila.peek().toString().charAt(0));
                        
                        if (prioriE <= prioriP) {
                            
                           posfija+=pila.pop();
                           pila.push(token);
                            
                        }else{
                            pila.push(token);
                        }
                        
                        
                        
                    }else{
                        pila.push(token);
                    }
                    
                    
                    
                    
                    
                    
                }else{
                    
                    
                    while(pila.peek().toString().charAt(0)!= '('){
                        
                        posfija += pila.pop();
                    }
                    
                    pila.pop();  // botamos ese hp
                    
                }
 
                
            }
            
            
            
            
            
        }
        
            if (!pila.empty()) {
            
                while(!pila.empty()){
                    
                    posfija += pila.pop();
                    
                }
            }
        
     
        
        
        return posfija;
    }
    
    
    
       
     private static int prioridadInfija(char c){
         
         
         int priori=-1;
         
         switch(c){
            case '^': priori=4;break;
            case '*': priori=2;break;
            case '/': priori=2;break;
            case '+': priori=1;break;
            case '-': priori=1;break;
            case '(': priori=5;break;
         }
         
         return priori;
         
         
     }
        
     
     private static int prioridadPila(char c){
         
         int priori=-1;
         
         switch(c){
             
            case '^': priori=3;break;
            case '*': priori=2;break;
            case '/': priori=2;break;
            case '+': priori=1;break;
            case '-': priori=1;break;
            case '(': priori=0;break;
         }
         
       
         return priori;
         
     }
    
    
    
    
    
}
