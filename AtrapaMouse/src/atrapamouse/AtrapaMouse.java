/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package atrapamouse;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//clase AtrapaMouse implementa ActionListener con dos componentes (JLabel y JButton) y gestor de diseño BorderLayout.
public class AtrapaMouse extends JFrame implements ActionListener {
    public AtrapaMouse() {
        super("Mensaje");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(420, 220);
        BorderLayout borde = new BorderLayout();
        setLayout(borde);
        JLabel mensaje = new JLabel("Pulsa Aceptar para cerrar este programa.");
        add(BorderLayout.NORTH, mensaje);
        AtrapaPanel atrapa = new AtrapaPanel();  // llamando a clase externa
        atrapa.aceptar.addActionListener(this);
        add(BorderLayout.CENTER, atrapa);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        System.exit(0);
    }

    

    public static void main(String[] arguments) {
        new AtrapaMouse();
    }
}
//clase AtrapaPanel subclase de JPanel e implementa interface MouseMotionListener
class AtrapaPanel extends JPanel implements MouseMotionListener {
    //colocamos botón con valores absolutos.
    JButton aceptar = new JButton("Aceptar");
    int botonX, botonY, ratonX, ratonY;
    int ancho, alto;

    AtrapaPanel() {
        super();
        setLayout(null);
        addMouseMotionListener(this);
        botonX = 110;
        botonY = 110;
        aceptar.setBounds(new Rectangle(botonX, botonY,90, 20));
        add(aceptar);
    }

    public void mouseMoved(MouseEvent event) {
        ratonX = event.getX();
        ratonY = event.getY();
        ancho = (int)getSize().getWidth();
        alto = (int)getSize().getHeight();
        if (Math.abs((ratonX + 35) - botonX) < 50) {
            botonX = moverBoton(ratonX, botonX, ancho);
            repaint();
        }
        if (Math.abs((ratonY + 10) - botonY) < 50) {
            botonY = moverBoton(ratonY, botonY, alto);
            repaint();
        }
    }

    public void mouseDragged(MouseEvent event) {
        // ignorar este evento
    }

    private int moverBoton(int ratonAt, int botonAt, int borde) {
        if (botonAt < ratonAt) {
            botonAt--;
        } else {
            botonAt++;
        }
        if (botonAt > (borde - 20)) {
            botonAt = 10;
        }
        if (botonAt < 0) {
            botonAt = borde - 80;
        }
        return botonAt;
    }

    public void paintComponent(Graphics comp) {
        super.paintComponent(comp);
        aceptar.setBounds(botonX, botonY, 90, 20);
    }
}
