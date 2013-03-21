
package gui_hojadevida;
 
import javax.swing.*;
import java.awt.*;


public class GUI_Hojadevida extends JFrame{

    public GUI_Hojadevida (){
        
        // llamando metodos
        
        super("Hoja de vida");
        setSize(440,520);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        //diseñador
        
        FlowLayout diseño=new FlowLayout();
        
        //declaracion de objetos y llamar metodos
        
        JLabel nom=new JLabel("Nombre                ");
        JLabel dir=new JLabel("Direccion             ");
        JLabel tel=new JLabel("Telefono              ");
        JLabel gen=new JLabel("Genero                ");
        JLabel fdn=new JLabel("Fecha de nacimiento         ");
        JLabel dia=new JLabel("   Dia");
        JLabel mes=new JLabel("   Mes");
        JLabel ano=new JLabel("   Año");
        JLabel reffam=new JLabel("Referencia familiar      ");
        JLabel refper=new JLabel("Referencia personal    ");
        JLabel reflab=new JLabel("Referencia laboral        ");
        JLabel hobb=new JLabel ("Hobbies \n                                                                                                                      ");
        JTextField cnom= new JTextField("Sergio Andres Arboleda",28);
        JTextField cdir= new JTextField("Call 95 N 75 34",28);
        JTextField ctel= new JTextField("5703940",28);
       // JTextField cgen= new JTextField("Masculino",28);
        JTextField cfam= new JTextField(28);
        JTextField cper= new JTextField(28);
        JTextField clab= new JTextField(28);
        
        JTextArea creffam = new JTextArea("Piedad Maria Cardona \nTel: 4772010		",1,25);
        JTextArea crefper = new JTextArea("Julian Caro \nTel: 5880202",1,25);
        JTextArea creflab = new JTextArea("Jorge alberto \nTel: 5554466 ",1,25);
        
        
        JComboBox cgen = new JComboBox();
        
        cgen.addItem("Masculino"+"                                                                           ");
        cgen.addItem("Femenino");
        
        JComboBox cdia = new JComboBox ();
        
        //llamando metodos de JCombox cdia
        
        int a;
         cdia.addItem(17);
        for (a=1;a<=31;a++){
            
        cdia.addItem(a);
            
        }
               
        JComboBox cmes=new JComboBox();
         cmes.addItem(3);
        for (a=01;a<=12;a++){
            
            cmes.addItem(a);
            
            
        }
        
        JComboBox cano = new JComboBox();
        cano.addItem(1993);
        for (a=1960;a<2000;a++){
            
            cano.addItem(a);
            
            
            
            
        }
        
        
        
        JCheckBox pro = new JCheckBox ("Programing",true);
        JCheckBox frie =new JCheckBox ("Go out whith my friends                                                     ",true);
        JCheckBox watch = new JCheckBox("Watching anime or Surfing the internet                                                        ",true);
        
        
        // estructurando
        
         setLayout(diseño);    // finaliza el diseño 
         
         
         //agregar botones
                
         add(nom);
         add(cnom);
         add(dir);
         add(cdir);
         add(tel);
         add(ctel);
         add(gen);
         add(cgen);
         add(fdn);
         add(dia);
         add(cdia);
         add(mes);
         add(cmes);
         add(ano);
         add(cano);
         add(reffam);
         add(creffam);
        // add(cfam);
         add(refper);
         add(crefper);
        // add(cper);
         add(reflab);
         add(creflab);
        // add(clab);
         add(hobb);
         add(pro);
         add(frie);
         add(watch);
         
    
        
        
        setVisible(true);
        
        
    
        
        
    }
    
    
    
    
    
    public static void main(String[] args) {
       
        GUI_Hojadevida hdv =new GUI_Hojadevida ();
       
        
    }
}
