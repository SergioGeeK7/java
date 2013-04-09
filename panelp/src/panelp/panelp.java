/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package panelp;

import javax.swing.*;
import java.awt.*;

public class panelp extends JPanel{	
               public panelp(){
               super();
               JPanel  tab1=new   JPanel();  
               JLabel   label1=new  JLabel("primer panel"); 
               tab1.add(label1); 
               JPanel  tab2=new   JPanel(); 
               JLabel   label2=new  JLabel("segundo panel"); 
               tab2.add(label2); //
               JPanel  tab3=new   JPanel();  
               JLabel   label3=new  JLabel("tercer panel"); 
               tab3.add(label3); 
               JPanel  tab4=new   JPanel();  
               JLabel   label4=new  JLabel("cuarto panel"); 
               tab4.add(label4); 

JTabbedPane    pestaña=new  JTabbedPane();

ImageIcon  icono=new   ImageIcon("kratos.GIF");

tab1.setPreferredSize(new Dimension(610,110));

                    pestaña.addTab("primero",icono,tab1); 
                    pestaña.addTab("segundo",icono,tab2);
                    pestaña.addTab("tercero",icono,tab3);
                    pestaña.addTab("cuarto",icono,tab4);

               add(pestaña);
pestaña.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);

               }
private static void crearYMostrarGUI(){ 


JFrame   marco=new  JFrame("ejemplo de paneles con pestañas"); 
marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

marco.add(new panelp(),BorderLayout.CENTER);
marco.pack();
marco.setVisible(true);
}

        public static  void  main(String[]  args){
             crearYMostrarGUI();
}
}