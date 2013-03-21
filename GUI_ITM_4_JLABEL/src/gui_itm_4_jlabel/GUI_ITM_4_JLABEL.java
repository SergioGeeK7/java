
package gui_itm_4_jlabel;




    
import javax.swing.*;
import java.awt.*;
public class GUI_ITM_4_JLABEL extends  JFrame{
    
    //AHORA SIN MAS EXPLICACIONES SE CREARAN ALGUNOS OBJETOS:
    // LA ETIQUTE (JLABEL): crear una clase llamada etiquetas.   || QUE FUNCIONA COMO EL SUBTITULO DE CADA VARIABLE O DE CADA JButton
    
	public GUI_ITM_4_JLABEL(){
		super("etiquetas");
		setSize(500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		FlowLayout diseño=new FlowLayout();
		JLabel nombres=new JLabel("nombre usuario");
		JLabel apellidos=new JLabel("apellidos usuario");
                setLayout(diseño);
		add(nombres);
		add(apellidos);
		setVisible(true);
	}
	     public  static void main(String[] args){
	     	GUI_ITM_4_JLABEL eti=new GUI_ITM_4_JLABEL();
	     }
	}
