package applet_dibujarycolorear;

import java.awt.Graphics;
import javax.swing.*;
import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.text.Style;

public class Applet_DibujaryColorear extends JFrame implements ActionListener {

    public int numero = 1;
    public String figura = "none";
    public String Coloor = "none";
    boolean dibujar = false;
    private Style estiloMorado, estiloGris, estiloCeleste, estiloRojo, estiloAzul;
    String s;
    pp ppanel;

    public Applet_DibujaryColorear() {

        setSize(400, 600);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /*  pp panel = new pp ();
       
       
         StyleContext sc = new StyleContext();    
         estiloMorado = sc.addStyle( null,null );
         StyleConstants.setForeground( estiloMorado,Color.magenta );
         estiloGris = sc.addStyle( null,null );
         DefaultStyledDocument doc = new DefaultStyledDocument(sc);
	
         JTextPane texto = new JTextPane(doc);
         */

        JMenuItem j2 = new JMenuItem("Rojo");
        JMenuItem j3 = new JMenuItem("Azul");
        JMenuItem j4 = new JMenuItem("Verde");

        JMenuItem j5 = new JMenuItem("Cuadrado");
        JMenuItem j6 = new JMenuItem("Rectangulo");
        JMenuItem j7 = new JMenuItem("Circulo");

        JMenuItem j8 = new JMenuItem("1");
        JMenuItem j9 = new JMenuItem("2");
        JMenuItem j10 = new JMenuItem("3");

        j2.addActionListener(this);
        j3.addActionListener(this);
        j4.addActionListener(this);
        j5.addActionListener(this);
        j6.addActionListener(this);
        j7.addActionListener(this);
        j8.addActionListener(this);
        j9.addActionListener(this);
        j10.addActionListener(this);

        JMenu menu = new JMenu("Color");

        menu.add(j2);
        menu.add(j3);
        menu.add(j4);

        JMenu editar = new JMenu("Figura");

        editar.add(j5);
        editar.add(j6);
        editar.add(j7);

        JMenu insertar = new JMenu("Numero");

        insertar.add(j8);
        insertar.add(j9);
        insertar.add(j10);

        JMenuBar menubar = new JMenuBar();
        menubar.add(editar);
        menubar.add(menu);
        menubar.add(insertar);

        ppanel = new pp();
        ppanel.setSize(400, 300);

        BorderLayout borde = new BorderLayout();
        setLayout(borde);
        setJMenuBar(menubar);
        add("Center", ppanel);

      //  Style estilo=estiloMorado;
        // texto.setCharacterAttributes( estilo,false );
       // add("Center",texto);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {

        s = e.getActionCommand();
   //  System.out.println(s);
        //  Object w=e.getSource();

        switch (s) {

            case "1":
                numero = 1;
                dibujar = true;
                ppanel.repaint();
                break;

            case "2":
                numero = 2;
                dibujar = true;
                ppanel.repaint();
                break;

            case "3":
                numero = 3;
                dibujar = true;
                ppanel.repaint();
                break;

            case "Cuadrado":
                figura = "Cuadrado";
                dibujar = true;
                ppanel.repaint();
                break;

            case "Rectangulo":
                figura = "Rectangulo";
                dibujar = true;
                ppanel.repaint();
                break;

            case "Circulo":
                figura = "Circulo";
                dibujar = true;
                ppanel.repaint();
                break;

            case "Rojo":
                Coloor = "Rojo";
                dibujar = true;
                ppanel.repaint();
                break;

            case "Azul":
                Coloor = "Azul";
                dibujar = true;
                ppanel.repaint();
                break;

            case "Verde":
                Coloor = "Verde";
                dibujar = true;
                ppanel.repaint();
                break;

            /* 
             default:  System.out.println("no lo se") ;
             ppanel.repaint();
             break;
             */
        }

    }

    public class pp extends JPanel {

        public void paint(Graphics g) {

             // super.paint(g);
            // g.fillOval(50, 100, 25, 25);
            // g.fillRect(50, 100, 500, 150);
            if (dibujar && figura != "none") {   // si dibuja es verdadero se dibuja

                int circulos = numero;  // se toma el numero del texto
                for (int i = 1; i <= circulos; i++) {  // ciclo de circulos
                    int x1 = (int) (Math.random() * 100) + 60;
                    int y1 = (int) (Math.random() * 100) + 80;

                    switch (Coloor) {

                        case "Rojo":
                            g.setColor(Color.red);  // se cambia a rojo el color de dibujo
                            break;
                        case "Verde":
                            g.setColor(Color.green);  // se cambia a rojo el color de dibujo
                            break;
                        case "Azul":
                            g.setColor(Color.blue);  // se cambia a rojo el color de dibujo
                            break;

                    }

                    switch (figura) {

                        case "Cuadrado":
                            g.drawRect(x1, y1, 150, 150);
                            break;
                        case "Circulo":
                            g.drawOval(x1, y1, 50, 50);  // se dibuja un circulo en // una posición al azar
                            break;
                        case "Rectangulo":
                            g.drawRect(x1, y1, 150, 50);
                            break;

                    }

                }
            } else if (figura == "none" && dibujar) {

                g.drawString("Porfavor Seleccione La Figura", 120, 180);
            } else {  // si dibuja es falso se limpia el applet
                g.setColor(Color.white);
                g.fillRect(0, 0, 400, 600);
            }
        }

    }

    public static void main(String[] args) {
        Applet_DibujaryColorear todomenu = new Applet_DibujaryColorear();

    }

}
