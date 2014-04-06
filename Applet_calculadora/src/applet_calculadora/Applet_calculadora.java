package applet_calculadora;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Applet_calculadora extends Applet implements ActionListener {

    Panel p1;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b11, b22, b33, b44, b55, b66, b77, b88, b99;
    boolean punto = true;
    TextArea calcula;
    boolean resul = false;
    int auxint = 0;
    double auxdouble = 0;
    String hacer;
    boolean conteo = true;
    boolean conteo2 = true;

    public Applet_calculadora() {

        setLayout(new BorderLayout());
        calcula = new TextArea(1, 1);
        p1 = new Panel(new GridLayout(6, 3, 5, 5));

        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");
        b11 = new Button(".");
        b22 = new Button("0");
        b33 = new Button("CE");
        b44 = new Button("+");
        b55 = new Button("-");
        b66 = new Button("=");
        b77 = new Button("*");
        b88 = new Button("/");
        b99 = new Button("C");

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b11.addActionListener(this);
        b22.addActionListener(this);
        b33.addActionListener(this);
        b44.addActionListener(this);
        b55.addActionListener(this);
        b66.addActionListener(this);
        b77.addActionListener(this);
        b88.addActionListener(this);
        b99.addActionListener(this);

        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
        p1.add(b5);
        p1.add(b6);
        p1.add(b7);
        p1.add(b8);
        p1.add(b9);
        p1.add(b11);
        p1.add(b22);
        p1.add(b33);
        p1.add(b44);
        p1.add(b55);
        p1.add(b66);
        p1.add(b77);
        p1.add(b88);
        p1.add(b99);

        add(calcula, BorderLayout.NORTH);
        add(p1, BorderLayout.SOUTH);

    }

    public void actionPerformed(ActionEvent e) {

        String boton = e.getActionCommand();

        try {
            int numero = Integer.parseInt(boton);

            if (numero > -1 && numero < 10) {

                //      if (conteo){
                calcula.setText(calcula.getText() + numero);
            //     }else{
                //        calcula.setText(""+numero);
                //         conteo2=true;
                //    }

            }

        } catch (NumberFormatException ex) {

        }

        switch (boton) {

            case "+":

               // if(conteo){
                auxdouble = Double.parseDouble(calcula.getText());
                try {
                    auxint = Integer.parseInt(calcula.getText());
                    System.out.println(auxint);
                } catch (NumberFormatException ex) {

                }

                punto = true;
                calcula.setText("");
                hacer = "+";
                conteo = false;
                if (auxdouble % 1 != 0) {
                    resul = true;
                    System.out.println("oh! que torpe eres");
                }

                /*
                 }else{
                 hacer="+";
                 igual();
                 conteo2=false;
                 }
                 */
                break;

            case "-":

                //if(conteo){
                auxdouble = Double.parseDouble(calcula.getText());
                try {
                    auxint = Integer.parseInt(calcula.getText());
                    System.out.println(auxint);
                } catch (NumberFormatException ex) {

                }

                punto = true;
                calcula.setText("");
                hacer = "-";
                conteo = false;
                if (auxdouble % 1 != 0) {
                    resul = true;
                    System.out.println("oh! que torpe eres");
                }
                /* }else{
                 hacer="-";
                 igual();
                 conteo2=false;
                 }
                 */

                break;

            case "*":

                auxdouble = Double.parseDouble(calcula.getText());
                try {
                    auxint = Integer.parseInt(calcula.getText());
                    System.out.println(auxint);
                } catch (NumberFormatException ex) {

                }

                punto = true;
                calcula.setText("");
                hacer = "*";
                conteo = false;
                if (auxdouble % 1 != 0) {
                    resul = true;
                    System.out.println("oh! que torpe eres");
                }

                break;

            case "/":
                auxdouble = Double.parseDouble(calcula.getText());
                try {
                    auxint = Integer.parseInt(calcula.getText());
                    System.out.println(auxint);
                } catch (NumberFormatException ex) {

                }

                punto = true;
                calcula.setText("");
                hacer = "/";
                conteo = false;
                if (auxdouble % 1 != 0) {
                    resul = true;
                    System.out.println("oh! que torpe eres");
                }
                break;

            case "CE":
                calcula.setText("");
                punto = true;
                break;

            case "C":
                auxint = 0;
                auxdouble = 0;
                calcula.setText("");
                resul = false;
                punto = true;
                break;

            case "=":
                igual();
                punto = true;
                break;

        }

        if (e.getSource() == b11 && punto) {

            calcula.setText(calcula.getText() + ".");
            punto = false;

        }

    }

    public void igual() {

        if (Double.parseDouble(calcula.getText()) % 1 != 0) {
            resul = true;
        }

        switch (hacer) {

            case "+":

                try {
                    auxint += Integer.parseInt(calcula.getText());
                } catch (NumberFormatException ex) {

                }

                auxdouble += Double.parseDouble(calcula.getText());

                if (resul) {
                    calcula.setText("" + auxdouble);
                } else {
                    calcula.setText("" + auxint);
                }

                break;

            case "-":
                auxdouble -= Double.parseDouble(calcula.getText());
                auxint -= Integer.parseInt(calcula.getText());

                if (resul) {
                    calcula.setText("" + auxdouble);
                } else {
                    calcula.setText("" + auxint);
                }
                break;

            case "*":
                auxdouble *= Double.parseDouble(calcula.getText());
                auxint *= Integer.parseInt(calcula.getText());

                if (resul) {
                    calcula.setText("" + auxdouble);
                } else {
                    calcula.setText("" + auxint);
                }
                break;

            case "/":
                auxdouble /= Double.parseDouble(calcula.getText());
                auxint /= Integer.parseInt(calcula.getText());

                if (resul) {
                    calcula.setText("" + auxdouble);
                } else {
                    calcula.setText("" + auxdouble);
                }

                break;

        }

    }

}
