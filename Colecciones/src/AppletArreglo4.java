
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.util.Vector;

// <applet width="400" height="200" code="AppletArreglo4"></applet>
public class AppletArreglo4 extends Applet implements ActionListener {

    Label l1, l2, l3, l4;
    Button b1, b2, b3, b4, b5, b6, b7, b8;
    TextField t1, t2, t3;
    TextArea ta1;
    Vector vector;
    Panel p1, p2, p3;

    public AppletArreglo4() {
        l1 = new Label("Numero");
        l2 = new Label("Nombre");
        l3 = new Label("Saldo");
        l4 = new Label("Texto para ver Vector");
        t1 = new TextField(8);
        t2 = new TextField(20);
        t3 = new TextField(12);
        ta1 = new TextArea(10, 20);
        b1 = new Button("Añade");
        b2 = new Button("Muestra Vector");
        b3 = new Button("Limpia Vector");
        b4 = new Button("Limpia Campos");
        b5 = new Button("Eliminar Elemento");
        b6 = new Button("Borrar Todos");
        b7 = new Button("Buscar Elemento");
        b8 = new Button("Buscar Arriba de saldo");
        p1 = new Panel(new GridLayout(3, 2, 5, 5));
        p2 = new Panel(new FlowLayout());
        p3 = new Panel(new GridLayout(2, 2, 5, 5));
        setLayout(new GridLayout(3, 1, 5, 5));
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p1.add(l3);
        p1.add(t3);
        p2.add(l4);
        p2.add(ta1);
        p3.add(b1);
        p3.add(b2);
        p3.add(b3);
        p3.add(b4);
        p3.add(b5);
        p3.add(b6);
        p3.add(b7);
        p3.add(b8);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        vector = new Vector();
        add(p1);
        add(p2);
        add(p3);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            int numero = Integer.parseInt(t1.getText());
            String nombre = t2.getText();
            double saldo = Double.parseDouble(t3.getText());
            vector.add(new Cuenta(numero, nombre, saldo));
            t1.setText("");
            t2.setText("");
            t3.setText("");
        }
        if (ae.getSource() == b2) {
            ta1.setText("");
            for (int i = 0; i < vector.size(); i++) {
                ta1.append("" + ((Cuenta) vector.get(i)).toString() + "\n");
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
            
            int toDelete = new Integer(ta1.getText().trim());
            
            for (int i = 0; i < vector.size(); i++) {
                
                
                
                if (((Cuenta) vector.get(i)).obtenNumero()==toDelete) {

                    vector.remove(vector.get(i));

                }

            }
        }

        if (ae.getSource() == b6) {
            vector.removeAllElements();
        }

        if (ae.getSource() == b7) {
            int id = new Integer(ta1.getText().trim());
            for (int i = 0; i < vector.size(); i++) {

                if (((Cuenta) vector.get(i)).obtenNumero()
                        == id) {

                    ta1.setText("" + ((Cuenta) vector.get(i)).toString() + "\n");
                    return;
                }
            }
            ta1.setText("NO ESTA");
        }

        if (ae.getSource() == b8) {
            ta1.setText("");
            double tope = new Double(ta1.getText().trim());
            for (int i = 0; i < vector.size(); i++) {

                if (((Cuenta) vector.get(i)).obtenSaldo()
                        >=tope ) {

                    ta1.append("" + ((Cuenta) vector.get(i)).toString() + "\n");

                }

            }

            if (ta1.getText().equals("")) 
                ta1.setText("NO SE ENCONTRO NI UN SALDO MAYOR");
            

        }

    }

}
