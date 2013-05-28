/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorforkids;

import java.awt.BorderLayout;

import java.awt.GridLayout;
import java.awt.Panel;

import java.awt.event.ActionEvent;
//import java.applet.*;
import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.*;
/**
 *
 * @author sergio
 */
public class Calculatorforkids extends JFrame implements ActionListener{


    Panel p1;
    JButton b1, b2, b3, b4, b5 ,b6,b7,b8,b9,b11,b22,b33,b44,b55,b66,b77,b88,b99;
    boolean punto=true;
    JTextArea calcula;
    boolean resul=false;
    int auxint=0;
    double auxdouble=0;
    String hacer;
    boolean conteo=true;
    boolean conteo2=true;
    boolean error=false;
    private final ImageIcon Icon1,Icon2,Icon3,Icon4,Icon5,Icon6,Icon7,Icon8,Icon9,Icon10,Icon11,Icon12,Icon13,Icon14,Icon15,Icon16,Icon17,Icon18;
    public Calculatorforkids (){
        
        
        setSize(450,400);
        
        setLayout(new BorderLayout());
        calcula = new JTextArea(2,2);
        p1 = new Panel(new GridLayout(6,3,5,5));
       
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     //   calcula.setEnabled(false);
        
        Icon1 = new ImageIcon ("1.png");
        Icon2= new ImageIcon ("2.png");
        Icon3 = new ImageIcon ("3.png");
        Icon4 = new ImageIcon ("4.png");
        Icon5 = new ImageIcon ("5.png");
        Icon6 = new ImageIcon ("6.png");
        Icon7 = new ImageIcon ("7.png");
        Icon8 = new ImageIcon ("8.png");
        Icon9 = new ImageIcon ("9.png");
        Icon10 = new ImageIcon ("+.png");
        Icon11 = new ImageIcon ("-.png");
        Icon12 = new ImageIcon ("x.png");
        Icon13 = new ImageIcon ("c.png");
        Icon14 = new ImageIcon ("=.png");
        Icon15 = new ImageIcon ("0.png");
        Icon16 = new ImageIcon ("div.png");
        Icon17 = new ImageIcon ("..png");
        Icon18 = new ImageIcon ("ce.png");
      
        
        b1 = new JButton(Icon1);
        b2 = new JButton(Icon2);
        b3 = new JButton(Icon3);
        b4 = new JButton(Icon4);
        b5 = new JButton(Icon5);
        b6 = new JButton(Icon6);
        b7 = new JButton(Icon7);
        b8 = new JButton(Icon8);
        b9 = new JButton(Icon9);
        b11 = new JButton(Icon17);
        b22 = new JButton(Icon15);
        b33 = new JButton(Icon18);
        b44 = new JButton(Icon10);
        b55 = new JButton(Icon11);
        b66 = new JButton(Icon14);
        b77 = new JButton(Icon12);
        b88 = new JButton(Icon16);
        b99 = new JButton(Icon13);
      
        
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
        p1.add(b66);
        p1.add(b44);
        p1.add(b55);
        p1.add(b33);
        p1.add(b77);
        p1.add(b88);
        p1.add(b99);
        
       
        add(calcula, BorderLayout.NORTH);
        add(p1, BorderLayout.SOUTH);
        
        
        
        
        
        
    }
    
    
    
    
    public void actionPerformed (ActionEvent e){
        
        error=false;
        
        Object botoon=e.getSource();
        
       if(botoon==b1){
           calcula.setText(calcula.getText()+1);
           
       }
         if(botoon==b2){
           
           calcula.setText(calcula.getText()+2);
       }
          if(botoon==b3){
           
           calcula.setText(calcula.getText()+3);
       }
           if(botoon==b4){
           
           calcula.setText(calcula.getText()+4);
       }
            if(botoon==b5){
           
           calcula.setText(calcula.getText()+5);
       }
             if(botoon==b6){
           
           calcula.setText(calcula.getText()+6);
       }
              if(botoon==b7){
           
           calcula.setText(calcula.getText()+7);
       }
               if(botoon==b8){
           
           calcula.setText(calcula.getText()+8);
       }
                if(botoon==b9){
           
           calcula.setText(calcula.getText()+9);
       }
                 
        if(botoon==b22){
           
           calcula.setText(calcula.getText()+0);
       }
        
        
        
        
        if (botoon == b44){
             
                
                try{
                    auxdouble=Double.parseDouble(calcula.getText());
                    auxint = Integer.parseInt(calcula.getText()); 
                    
                }catch(NumberFormatException ex){
                    
                     errorletra();
                    
                        
                      
                  
                    
                }
                  
                punto=true;
                calcula.setText("");
                hacer="+";
                conteo=false;
                if(auxdouble % 1 != 0){
                   resul=true;
                   System.out.println("oh! que torpe eres");
                }  
        }
         
        if (botoon == b55){
             
                try{
                    auxdouble=Double.parseDouble(calcula.getText());
                    auxint = Integer.parseInt(calcula.getText()); 
                    System.out.println(auxint);
                }catch(NumberFormatException ex){error=true;
                    errorletra();
                }
                  
                punto=true;
                calcula.setText("");
                hacer="-";
                conteo=false;
                if(auxdouble % 1 != 0){
                   resul=true;
                   System.out.println("oh! que torpe eres");
                }  
            
            
        }
         
        if (botoon == b77){
            
                try{
                    auxdouble=Double.parseDouble(calcula.getText());
                    auxint = Integer.parseInt(calcula.getText()); 
                    System.out.println(auxint);
                }catch(NumberFormatException ex){error=true;
                    errorletra();
                }
                  
                punto=true;
                calcula.setText("");
                hacer="*";
                conteo=false;
                if(auxdouble % 1 != 0){
                   resul=true;
                   System.out.println("oh! que torpe eres");
                } 
            
        }
         
        if (botoon == b88){
             
                try{
                    auxdouble=Double.parseDouble(calcula.getText());
                    auxint = Integer.parseInt(calcula.getText()); 
                    System.out.println(auxint);
                }catch(NumberFormatException ex){error=true;
                    errorletra();
                }
                  
                punto=true;
                calcula.setText("");
                hacer="/";
                conteo=false;
                if(auxdouble % 1 != 0){
                   resul=true;
                   System.out.println("oh! que torpe eres");
                } 
        }
         
        if (botoon == b33){
            calcula.setText("");
                punto=true;
        }
         
        if (botoon == b99){
            auxint=0;
                auxdouble=0;
                calcula.setText("");
                resul=false;
                punto=true;
        }
         
        if (botoon == b66){
            igual();
                punto=true;
        }
        
        
       
        
         if (e.getSource() == b11 && punto){
            
            
                calcula.setText(calcula.getText()+".");
                punto=false;
                
        }
        
        
        
    }
 
    
    
    ////////////////////////////// igual  ///////////////////////////////////////////////
    
    
    
    public void igual (){
        
        try{
            if (Double.parseDouble(calcula.getText()) % 1 != 0){
            resul=true;
        }
            
        }catch(NumberFormatException ex){error=true;
            errorletra();
        }
        
        
        
        if(hacer!=null){
            
      
        
        
        
        
        switch (hacer){
            
             case "+":
                 
                 try{
                     auxdouble+=Double.parseDouble(calcula.getText());
                      auxint += Integer.parseInt(calcula.getText());
                 }catch (NumberFormatException ex){error=true;
                     errorletra();
                 }
                 
                 
                
               
                
              
                    
                       if(resul){
                    calcula.setText(""+auxdouble);
                }else{
                    calcula.setText(""+auxint);
                }
                    
               
                
             
                
                
                
                break;
                
            case "-":
                
                
                try{
                     auxdouble-=Double.parseDouble(calcula.getText());
                      auxint -= Integer.parseInt(calcula.getText());
                 }catch (NumberFormatException ex){error=true;
                     errorletra();
                 }
                
                
                
                
                       if(resul){
                    calcula.setText(""+auxdouble);
                }else{
                    calcula.setText(""+auxint);
                }
                break;
                
            case "*":
                try{
                     auxdouble*=Double.parseDouble(calcula.getText());
                      auxint *= Integer.parseInt(calcula.getText());
                 }catch (NumberFormatException ex){
                     error=true;
                     errorletra();
                 }
                
                       if(resul){
                    calcula.setText(""+auxdouble);
                }else{
                    calcula.setText(""+auxint);
                }
                break;
                
            case "/":
                try{
                     auxdouble/=Double.parseDouble(calcula.getText());
                      auxint /= Integer.parseInt(calcula.getText());
                 }catch (NumberFormatException ex){
                     error=true;
                     errorletra();
                 }
                
                       if(resul){
                    calcula.setText(""+auxdouble);
                }else{
                    calcula.setText(""+auxdouble);
                }
                
                break;
            
            
            
        }
        
          }else{
             JOptionPane.showMessageDialog(null, " Y  Selecciona la operacion ");
        }
        
        
    }
    
    
    
    public void errorletra (){
         calcula.setText("Error Usa los numeros para las operaciones");
         JOptionPane.showMessageDialog(null, "Porfavor Usa los Numeros En Pantalla ");
                auxint=0;
                auxdouble=0;
                calcula.setText("");
                resul=false;
                punto=true;
    }
        
 
    public static void main (String [] args){
        
        Calculatorforkids cn = new Calculatorforkids();
        cn.setVisible(true);
    }
  
    
    
        
    }
    
    
    
    

