/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cargaricono;


import java.awt.*; 
import java.applet.*;
import javax.swing.*;


public class CargarIcono extends JApplet{

      ImageIcon miIcono; 
      public void init() { 
      miIcono = new ImageIcon ("gosh.jpg");
      setSize(250,250);

} 
      public void paint(Graphics g){ 
          
          miIcono.paintIcon(this, g, 0, 0);
          g.setColor(Color.white);
          g.drawString("Gosh of Sparta",100, 125);
          
      } 
      
}
