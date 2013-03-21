
package gui_itm_5_jtextfield;



// CUADROS DE TEXTO (JTextField): crear una clase llamada textos.
    
    import javax.swing.*;
import java.awt.*;
public class GUI_ITM_5_JTextField extends  JFrame{
	public GUI_ITM_5_JTextField(){
		super("cuadros de textos");
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	        FlowLayout diseño=new FlowLayout();
	        JTextField nombres=new JTextField("digite aquí su nombre",30);
		JTextField apellidos=new JTextField(30);
		setLayout(diseño);
		add(nombres);
		add(apellidos);
		setVisible(true);
	}
	     public  static void main(String[] args){
	     	GUI_ITM_5_JTextField te=new GUI_ITM_5_JTextField();
	     }
}
