
package ejemplo_hilo3;



import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Ejemplo_hilo3 extends Applet implements ActionListener{

Button boton1 = new Button("Para el 1");
Button boton2 = new Button("Para el 2");
Button boton3 = new Button("Para el 3");
Button boton4 = new Button("Para el 4");
Button boton5 = new Button("Para el 5");
TextField cuenta1 = new TextField("0");
TextField cuenta2 = new TextField("0");
TextField cuenta3 = new TextField("0");
TextField cuenta4 = new TextField("0");
TextField cuenta5 = new TextField("0");
Cuenta t1, t2, t3,t4,t5;

    public void init(){
        setLayout(new GridLayout(2,3));
        add(cuenta1);
        add(cuenta2);
        add(cuenta3);
        add(cuenta4);
        add(cuenta5);
        add(boton1);
        add(boton2);
        add(boton3);
        add(boton4);
        add(boton5);
        boton1.addActionListener(this);
        boton2.addActionListener(this);
        boton3.addActionListener(this);
        boton4.addActionListener(this);
        boton5.addActionListener(this);
    }

    public void start(){
		t1 = new Cuenta(500,cuenta1);
		t2 = new Cuenta(1000,cuenta2);
		t3 = new Cuenta(2000,cuenta3);
		t4 = new Cuenta(3000,cuenta4);
		t5 = new Cuenta(5000,cuenta5);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
    }

    public void stop(){
        t1.contando = false;
        t2.contando = false;
        t3.contando = false;
        t4.contando = false;
        t5.contando = false;
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource().equals(boton1))
            	t1.contando = false;
        else if (e.getSource().equals(boton2))
                t2.contando = false;
        else if (e.getSource().equals(boton3))
                t3.contando = false;
        else if (e.getSource().equals(boton4))
                t4.contando = false;
        else if (e.getSource().equals(boton5))
                t5.contando = false;
    }
}
