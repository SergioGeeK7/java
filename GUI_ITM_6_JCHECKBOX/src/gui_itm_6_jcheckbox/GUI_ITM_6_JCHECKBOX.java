
package gui_itm_6_jcheckbox;


import javax.swing.*;
import java.awt.*;
public class GUI_ITM_6_JCHECKBOX extends  JFrame{
	public GUI_ITM_6_JCHECKBOX(){
	super("casillas de verificación");
	setSize(400,400);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
	FlowLayout diseño=new FlowLayout();
	JCheckBox  ch1=new JCheckBox("estudiar");
	JCheckBox  ch2=new JCheckBox("nadar",false); // CASILLA DE VERIFICACION
	JCheckBox  ch3=new JCheckBox("bailar",false);
	ButtonGroup  actividad=new ButtonGroup(); // para que solo se pueda escoger una sola opcion de las 3, buttongroup
	actividad.add(ch1);
	actividad.add(ch2);
	actividad.add(ch3);
	setLayout(diseño);
	add(ch1);
	add(ch2);
	add(ch3);
	setVisible(true);
	}
        
        
        
             public  static void main(String[] args){
		GUI_ITM_6_JCHECKBOX cv=new GUI_ITM_6_JCHECKBOX();
	     }
}