

package arreglo2;


import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Arreglo2 extends JFrame implements ActionListener{

     JLabel l1, l2,l3;
     JButton b1, b2,b3,b4,b5,b6,b7,b8;	
     JTextField t1;
     JTextArea ta1,ta2;
     int arreglo[];
     int conta;
    
    
     public Arreglo2 (){
        super ("Actividad 2");
        setSize(230,650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        l1 = new JLabel("Dato a Añadir/Buscar");
        l2 = new JLabel("Texto para ver Arreglo");
        l3 = new JLabel("Resultado");
        t1 = new JTextField(10);
        ta1  = new JTextArea(10,19);
        ta2  = new JTextArea(10,19);
        b1 = new JButton("Añade");
        b2 = new JButton("Muestra Vector");
        b3 = new JButton("Limpia Vector");
        b4 = new JButton("Limpia Campos");
        b5 = new JButton("Mayor");
        b6 = new JButton("Menor");
        b7 = new JButton("Promedio");
        b8 = new JButton("Busca");
        
        ta1.setEnabled(false);
        ta2.setEnabled(false);
        
        setLayout(new FlowLayout());
        
        add(l1);
        add(t1);
        add(l2);
        add(ta1);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(l3);
        add(ta2);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        
        
        
        arreglo = new int[100];
        conta=0;
         
     }
     
     
     
     
     
   
    public static void main(String[] args) {
        
              
          Arreglo2 actividad2 = new Arreglo2();
          actividad2.setVisible(true);
            
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
          if (ae.getSource() == b1) {
	            if (conta > arreglo.length) {
	                ta1.setText("No se puede añadir otro elemento");
	            }
	            else {
	                arreglo[conta++] = Integer.parseInt(t1.getText());
	                t1.setText("");   
	            }
	         }
	         if (ae.getSource() == b2) {
	               ta1.setText("");
	               for (int i=0; i < conta; i++) {
	                   ta1.append("" + arreglo[i] + "\n");
	               }
	         }
	         if (ae.getSource() == b3) {
	               conta = 0;
	               arreglo = new int[100];
	         }
	         if (ae.getSource() == b4) {
					t1.setText("");
					ta1.setText("");
                                        ta2.setText("");
	         }
                
                 if (ae.getSource() == b5) {
                     int mayor = arreglo[0];
                     for (int i = 1; i < conta; i++) 
                         if (arreglo[i]>mayor) 
                             mayor=arreglo[i];
                     ta2.setText(""+mayor);
                }
           
                if (ae.getSource() == b6) {
                     int menor = arreglo[0];
                     for (int i = 1; i < conta; i++) 
                         if (arreglo[i]<menor) 
                             menor=arreglo[i];
                     ta2.setText(""+menor);
                } 
                 
               if (ae.getSource() == b7) {
                     double sum=0;
                     for (int i = 0; i < conta; i++) 
                         sum+=arreglo[i];
                     ta2.setText(""+sum/conta);
                } 
                 
               if (ae.getSource() == b8) {
                     int toSeach = Integer.parseInt(t1.getText());
                     boolean found=false;
                     for (int i = 0; i < conta; i++)
                         if (arreglo[i]==toSeach) 
                         found=true;
                     
                     if (found) 
                        ta2.setText("se encontro el numero");
                     else
                        ta2.setText("No se ha encontrado el numero");
                     

                     
                } 
                 
                 
	    }
        
        
    }

