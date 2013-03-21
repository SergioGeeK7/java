
package nombrematris;

public class Letras {
    
  
    
    
public Letras () {
    
    
}
 
   

public void s (int f,int c){
    
        int letra_s[][]=new int[f][c];
        //int mita=f/2;
        
        
        for (c=0,f=0;c<letra_s.length;c++){
            
            letra_s[f][c]=1;
            letra_s[letra_s.length/2][c]=1;
            letra_s[letra_s.length-1][c]=1;
        }
        
        for (f=1,c=0;f<(letra_s.length/2);f++){
            
            letra_s[f][c]=1;
            letra_s[f+(letra_s.length/2)][letra_s.length-1]=1;
            
            
            
        }
        
     
        // MOSTRAR
        
      for (f=0;f<letra_s.length;f++){
          
          for (c=0;c<letra_s.length;c++){
              
              System.out.print("\t"+letra_s[f][c]);
              
          }
          
          System.out.println("");
          
      }  
        
    
    System.out.println("");
    
    
    
}

   
public void e (int f,int c){
    
     int [][] letra_e=new int [f][c];
        
        
        for (c=1;c<letra_e.length;c++){
            
            letra_e[0][c]=1;
            letra_e[letra_e.length/2][c]=1;
            letra_e[letra_e.length-1][c]=1;
            
            
        }
        
        for (f=0;f<letra_e.length;f++){
            
            letra_e[f][0]=1;
            
            
        }
        
        
        //Mostrar
        
        
        for (f=0;f<letra_e.length;f++){
            
            for (c=0;c<letra_e.length;c++){
                
                System.out.print("\t"+letra_e[f][c]);
                
            }
            System.out.println("");
            
        }
        
    System.out.println("");
    
}

public void r (int f,int c){
    
    int letra_r[][]=new int [f][c];
        
        
        for (c=1,f=0;c<letra_r.length-1;c++){
            
            letra_r[f][c]=1;
            letra_r[letra_r.length/2][c]=1;
           
            
        }
        
        
        for (f=letra_r.length/2,c=f;f<letra_r.length;f++,c++){
            
            letra_r[f][c]=1;
            
            
        }
        
        
        for (f=0,c=0;f<letra_r.length;f++){
            
            letra_r[f][c]=1;
            
             if (f<=letra_r.length/2){
                
               letra_r[f][letra_r.length-1]=1;
                
            }
            
            
        }
        
        
        //mostrar
        
        for(f=0;f<letra_r.length;f++){
            
            
            for (c=0;c<letra_r.length;c++){
                
                System.out.print("\t"+letra_r[f][c]);
                
            }
            System.out.println("");
        }
        
    System.out.println("");
    
}


public void g (int f,int c){
    
     
        int[][] letra_g=new int [f][c];
        
        
        for (c=letra_g.length-1,f=0;c>0;c--){

          
            letra_g[f][c]=1;
           
            letra_g[letra_g.length-1][c]=1;
            
            if (c>=letra_g.length/2){
               letra_g[letra_g.length/2][c]=1;
            }
         
        }
        
         c=letra_g.length-1;
         for (int aux=letra_g.length/2;aux<letra_g.length;aux++){
                
                letra_g[aux][c]=1;
              
            }
        
        
        
        for (f=0,c=0;f<letra_g.length;f++){
            
            letra_g[f][c]=1;
            
            
            
        }
        
        
        
        // mostrar letra
        
        for (f=0;f<letra_g.length;f++){
            
            for (c=0;c<letra_g.length;c++){
                
                System.out.print("\t"+letra_g[f][c]);
                
            }
            
            System.out.println("");
            
        }
     System.out.println("");
    
}

public void i (int f,int c){
    
    int [][] letra_i=new int [f][c];
        
        
        for (c=0,f=0;c<letra_i.length;c++){
            
            letra_i[f][c]=1;
            letra_i[letra_i.length-1][c]=1;
            
        }
        
        
        for (f=1;f<letra_i.length-1;f++){
            
            
            letra_i[f][letra_i.length/2]=1;
         
        }
        
        
        /// mostrar
        
        for (f=0;f<letra_i.length;f++){
            
            for (c=0;c<letra_i.length;c++){
                
                System.out.print("\t"+letra_i[f][c]);
                
            }
            
            System.out.println("");
        }
    System.out.println("");
    
}

public void o (int f,int c){
    
    int letra_o[][]=new int [f][c];
        
        for (c=0,f=0;c<letra_o.length;c++){
            
           letra_o[f][c]=1;
           letra_o[letra_o.length-1][c]=1;
            
        }
        
        
       for (f=1,c=0;f<letra_o.length-1;f++){
           
           letra_o[f][c]=1;
           letra_o[f][letra_o.length-1]=1;
           
       }
        
      
        // mostrar
        
        for (f=0;f<letra_o.length;f++){
            
            for (c=0;c<letra_o.length;c++){
                
                System.out.print("\t"+letra_o[f][c]);
                
                
            }
            
            System.out.println("");
            
        }
    
    System.out.println("");
    
}

   
}


