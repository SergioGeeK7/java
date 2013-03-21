
package gui_itm_7_jtextarea;

// TEXTOS AMPLIOS

import javax.swing.*; 
import java.awt.*;
public class GUI_ITM_7_JTextArea extends  JFrame{
	public GUI_ITM_7_JTextArea(){
		super("textos amplios");
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
                FlowLayout diseño=new FlowLayout();
                JTextArea  observaciones=new JTextArea(8,40);
		setLayout(diseño);
		add(observaciones);
		setVisible(true);
	}
	     public  static void main(String[] args){
	     	GUI_ITM_7_JTextArea ta=new GUI_ITM_7_JTextArea();
	     }
}