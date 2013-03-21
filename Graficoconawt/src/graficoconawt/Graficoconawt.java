
package graficoconawt;




   
import javax.swing.*; 
import java.awt.*;
public class Graficoconawt extends  JFrame{
	public Graficoconawt(){
		super("cajas de listas");
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
                FlowLayout diseño=new FlowLayout();
                JComboBox  idiomas=new JComboBox();
		idiomas.addItem("español");
		idiomas.addItem("frances");
		idiomas.addItem("ingles");  
		setLayout(diseño);
		add(idiomas);
		setVisible(true);
	}
	     public  static void main(String[] args){
	     	Graficoconawt cb=new Graficoconawt();
	     }
}