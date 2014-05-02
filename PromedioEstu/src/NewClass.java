
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andres
 */
public class NewClass extends JFrame{
    
    
    public static void main(String[] args) {
        
        int b=0;
        
        for (int i = 11; i < 10; i++) {
            
            for (int j = 0; j < 10; j++) {
                
              b = i+j;
                
            }
            
        }
        
        
        
        
//        System.out.println(b);
//        
//        
//        for (int i = 0; i < 10; i++) {
//            
//        }
//        
//        
//        int i;
//        
//        
//        String a = " <html> <head> </head>  <body> <h1> hellow </h1> </body> </html>";
//        
//        
//        
//        
//        
//        JOptionPane.showMessageDialog(null,a+"");
//        
//        
//        
//        int z =4;
//        
//        //z = z+1;
//        
//        //z++;
//        
//        z+=2;
//        
//        z*=6;
//        
//        z/=2;
//        
//        String zz="hola";
//        
//        
//        zz+="lala";
//        
//        
//        System.out.println(zz);
//        System.out.println(z);
//       
        
        
      //  double micirculoR = 5;
        
        String numero="2013";
        String alrevez="";
        
        
        int hasta = numero.length(); // 3
        
        
        
        System.out.println(hasta);
        
        
        
        for (int i = numero.length()-1; i >= 0; i--) {
            // System.out.println(numero.charAt(i));
            alrevez += numero.charAt(i);
        }
        
        if(alrevez.equals(numero)){
            System.out.println("es palindromo");
        }
        
        
        
        
        
          
        new NewClass().setVisible(true);
        
        
    }
static JButton a = new JButton("hhh");

    public NewClass() {
        
        setLayout(new BorderLayout());
        add(a);
        pack();
    }
    
    public void lala(){
        JOptionPane.showMessageDialog(this,"hellow");
    }
    
}
