
package busgui;
import javax.swing.*;
import java.awt.*;



public class BusGUI extends JFrame  {

   // GUI GLOBAL
    
  private JTextField objeto1;
  private JTextField objeto2;
  private JTextField objeto3;
  private JTextField objeto4;
  
  
  
  // constructor de objetos
    
    
  public BusGUI (){
      
      super ("eventos....");
      setLayout(new FlowLayout());
      
      
      objeto1=new JTextField(10);
      objeto2=new JTextField("ingresa tu nombre");
      objeto3=new JTextField("No editable",10);
      objeto3.setEnabled(false);  // hace al campo 3 no editable....
      objeto4=new JTextField("Social red");
      
      // añadiendo al diseñador flow
      
      add(objeto1);
      add(objeto2);
      add(objeto3);
      add(objeto4);
      
    //  setVisible(true);
      
     
      
  }
  
    /*
    
    JTextField tx1 = new JTextField ("ingresa tu nombre");
    JTextField tx2 = new JTextField ("ingresa tu nombre");
    JTextField tx3 = new JTextField ("ingresa tu nombre");
    JTextField tx4 = new JTextField ("ingresa tu nombre");
    */
    
    
    
    
    public static void main(String[] args) {
        
        BusGUI b = new BusGUI ();
        
        
    }
}
