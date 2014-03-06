
   
    
    
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.util.Vector;

// <applet width="400" height="200" code="AppletArreglos1"></applet>

public class Array_Coleccion extends Applet implements ActionListener{
    	Label l1, l2;
	    Button b1, b2,b3,b4,b5,b6,b7;	
	    TextField t1;
	    TextArea ta1;
	    Vector vector;
	    Panel p1, p2,p3;

        public Array_Coleccion() {
			l1 = new Label("Numero");
			l2 = new Label("Texto para ver Vector");
			t1 = new TextField(8);
			ta1 = new TextArea(10,20);
			b1 = new Button("Añade");
			b2 = new Button("Muestra Vector");
			b3 = new Button("Limpia Vector");
			b4 = new Button("Limpia Campos");
			b5 = new Button("Eliminar Elemento");
			b6 = new Button("Borrar Todos");
			b7 = new Button("Buscar Elemento");
			p1 = new Panel(new GridLayout(2,1,5,5));
			p2 = new Panel(new FlowLayout());
			p3 = new Panel(new GridLayout(2,2,5,5));
			setLayout(new GridLayout(3,1,5,5));
			p1.add(l1);
			p1.add(t1);
			p2.add(l2);
			p2.add(ta1);
			p3.add(b1);
			p3.add(b2);
			p3.add(b3);
			p3.add(b4);
			p3.add(b5);
			p3.add(b6);
			p3.add(b7);
			b1.addActionListener(this);
			b2.addActionListener(this);
			b3.addActionListener(this);
			b4.addActionListener(this);
                        b5.addActionListener(this);
                        b6.addActionListener(this);
                        b7.addActionListener(this);
			vector = new Vector();
			add(p1);
			add(p2);
			add(p3);
 	    }
	     
	    public void actionPerformed(ActionEvent ae) {
	        if (ae.getSource() == b1) {
                vector.add(new Integer(t1.getText()));
                t1.setText("");   
	         }
	         if (ae.getSource() == b2) {
	               ta1.setText("");
	               for (int i=0; i < vector.size(); i++) {
	                   ta1.append("" + vector.get(i).toString() + "\n");
	               }
	         }
	         if (ae.getSource() == b3) {
	               vector = new Vector();
	         }
	         if (ae.getSource() == b4) {
					t1.setText("");
					ta1.setText("");
	         }
                if (ae.getSource() == b5) {
                    
                    vector.remove(new Integer(t1.getText()));
                    
                }
                 
                if (ae.getSource() == b6) {
                    vector.removeAllElements();
                }
                
                if (ae.getSource() == b7) {
                    
                    if (vector.indexOf(new Integer(t1.getText())) != -1) 
                        ta1.setText("El elemento si esta");
                    else
                        ta1.setText("El elemento no esta");
                    
                }
                 
                 
                 
	    }
}


    
    
    
    

