
package barramenusitems;

import javax.swing.*;
import java.awt.*;
public class Barramenusitems extends JFrame {

    
    public Barramenusitems () {

        super ("barra de menus");
        setSize(500,550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// CREANDO ITEMS

        JMenu mu1 = new JMenu ("Favoritos");
        JMenuItem m1 = new JMenuItem ("Metallica");
        JMenuItem m2 = new JMenuItem ("Iron Maiden");
        JMenuItem m3 = new JMenuItem ("Disturbed");
        JMenuItem m4 = new JMenuItem ("Black Eyed Peas");
        JMenuItem m5 = new JMenuItem ("Emienm");
        JMenuItem m6 = new JMenuItem ("Sean Paul");
        JMenuItem m7 = new JMenuItem ("Nirvana");
        JMenuItem m8 = new JMenuItem ("Peal Jam");
        JMenuItem m9 = new JMenuItem ("Foo Fithers");
        JMenuItem m10 = new JMenuItem ("Guns And Roses");
        JMenuItem m11 = new JMenuItem ("Queen");
        JMenuItem m12 = new JMenuItem ("Mana");
        JMenuItem m13 = new JMenuItem ("Simple Plan");
        JMenuItem m14 = new JMenuItem ("Green Day");
        JMenuItem m15 = new JMenuItem ("The Machine Again");
// http://www.adslzone.net/postp2050064.html

// CREANDO MENUS


    JMenu menumetal = new JMenu ("Metal");

     
        menumetal.add(mu1);
        mu1.add(m1);
	menumetal.addSeparator();
	menumetal.add(m2);
	menumetal.addSeparator();
	menumetal.add(m3);


	JMenu menurap = new JMenu ("Rap/Hip Hop");

	menurap.add(m4);
	menurap.addSeparator();
	menurap.add(m5);
	menurap.addSeparator();
	menurap.add(m6);


	JMenu menugrunge = new JMenu ("Grunge");

	menugrunge.add(m7);
	menugrunge.addSeparator();
	menugrunge.add(m8);
	menugrunge.addSeparator();
	menugrunge.add(m9);


	JMenu menurock = new JMenu ("rock");

	menurock.add(m10);
	menurock.addSeparator();
	menurock.add(m11);
	menurock.addSeparator();
	menurock.add(m12);

	JMenu menupunk = new JMenu ("Punk");

	menupunk.add(m13);
	menupunk.addSeparator();
	menupunk.add(m14);
	menupunk.addSeparator();
	menupunk.add(m15);


	JMenuBar mbar = new JMenuBar ();

	mbar.add(menumetal);
	mbar.add(menurap);
	mbar.add(menugrunge);
	mbar.add(menurock);
	mbar.add(menupunk);

        // checador
        
        JCheckBox ch1 = new JCheckBox ("You are Sure ?",false);

        // textfield
        
        JTextField text = new JTextField (40);
  
        
        // lista desplegable
        JComboBox paises= new JComboBox ();
        paises.addItem("Colombia");
        paises.addItem("Argentina");
        paises.addItem("España");
        paises.addItem("Estados Unidos");
        paises.addItem("Inglaterra");
        
        // boton de radio
        
        JRadioButton bradio = new JRadioButton ("You are single");
        
	// Diseñador 

	BorderLayout diseñador = new BorderLayout();
	setLayout(diseñador);
        // DONDE QUEDARA CADA OBJETO
	add("North",mbar);
        add("Center",ch1);
        add("South",text);
        add("East",bradio);
        add("West",paises);
        setJMenuBar(mbar); // PONDRA LA MENUBAR ARRIBA. DELANTE DE TODO.
	pack();
	setVisible(true);




























    }





    public static void main(String[] args) {



		Barramenusitems mj = new Barramenusitems ();



    }
}