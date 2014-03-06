

package vectores1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author andres
 */
public class Vectores1 extends JFrame implements ActionListener{

    
    private javax.swing.JButton btnanade;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txaout;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtnumero;
    private javax.swing.JTextField txtsaldo;
    
     int con=0;
    
    String numero [] = new String[100];
    String nombre [] = new String[100];
    String saldo [] = new String[100];
     
    
     public Vectores1 (){
        super ("Actividad 1");
        setSize(205,650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       
        jLabel1 = new JLabel("Nombre");
        jLabel2 = new JLabel("Numero");
        jLabel3 = new JLabel("Saldo");
        jLabel4 = new JLabel("Out");
        
        
        txtnombre= new JTextField(10);
        txtnumero= new JTextField(10);
        txtsaldo = new JTextField(10);
        
        
        txaout = new JTextArea(10,19);
        
        btnanade = new JButton("Añade");
        jButton2 = new JButton("Muestra Vector");
        jButton3 = new JButton("Limpia Vector");
        jButton4 = new JButton("Limpia Campos");
       
        
        setLayout(new FlowLayout());
        
        add(jLabel1);
        add(txtnombre);
        add(jLabel2);
        add(txtnumero);
        add(jLabel3);
        add(txtsaldo);
        add(jLabel4);
        add(txaout);
        add(btnanade);
        add(jButton2);
        add(jButton3);
        add(jButton4);
       
       
        
        btnanade.addActionListener(this);
        jButton2.addActionListener(this);
        jButton3.addActionListener(this);
        jButton4.addActionListener(this);
        
        
         
     }
     
     
    
    
    
    
    
    public static void main(String[] args) {
        Vectores1 vec = new Vectores1();
        vec.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        if (e.getSource()==btnanade) {
            
             if (con<numero.length) {
            numero[con] = txtnumero.getText();
            nombre[con] = txtnombre.getText();
            saldo[con] = txtsaldo.getText();
            con++;
        }else{
            txaout.setText("No se pueden agregar mas usuarios");
            btnanade.setEnabled(false);
        }
        }
        
             if (e.getSource()==jButton2) {
                
                 txaout.setText("");
                for (int i = 0; i < con; i++) {

                    txaout.append(numero[i]+" "+nombre[i]+" "+saldo[i]+"\n");

                }
                 
            }
             
             if (e.getSource()==jButton3) {
                
                numero  = new String[100];
                nombre = new String[100];
                saldo = new String[100];
                con=0;
                btnanade.setEnabled(true);
                 
            }
             
             if (e.getSource()==jButton4) {
                txtnombre.setText(""); 
                txtnumero.setText("");
                txtsaldo.setText("");
                txaout.setText("");
                 
            }
             
             
             
             
            
        }
    }
    

