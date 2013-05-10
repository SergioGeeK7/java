package applet_botones;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
public class Applet_botones extends Applet implements ActionListener {
    
    Label title1;
    Label title2;
    Label resultado;
    
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    
    TextField txt1;
    TextField txt2;
    TextField txt3;
    
    
    public Applet_botones (){
        
        
        
        title1= new Label ("Numero 1");
        title2= new Label ("Numero 2");
        
        btn1= new Button ("Suma");
        btn2= new Button ("Resta");
        btn3= new Button ("Multiplica");
        btn4= new Button ("Divide");
        btn5= new Button ("Raiz de 1");
        btn6= new Button ("Raiz de 2");
        btn7= new Button ("Mayor");
        btn8= new Button ("Limpia");
        
        resultado = new Label ("Resultado");
        
        txt1= new TextField(7);
        txt2= new TextField(7);
        txt3= new TextField(7);
        
         
            txt3.setEnabled(false);
        
        add(title1);
        add(txt1);
        add(title2);
        add(txt2);
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);
        add(btn6);
        add(btn7);
        add(btn8);
        add(resultado);
        add(txt3);
        
        
        
            btn1.addActionListener(this);
            btn2.addActionListener(this);
            btn3.addActionListener(this);
            btn4.addActionListener(this);
            btn5.addActionListener(this);
            btn6.addActionListener(this);
            btn7.addActionListener(this);
            btn8.addActionListener(this);

        
        
        
        
        
        
    }
    

    public void actionPerformed (ActionEvent e){
        
        
      //  if(txt1.getText().length()>0 && txt2.getText().length() > 0){
            
     
       int n1=0;
       int n2=0;
       int resultado; 
       
       
       double nn1=n1;
       double nn2=n2;
       double resultado2;
            
            
            
            
     try{
        
        
       n1=Integer.parseInt(txt1.getText());
       n2=Integer.parseInt(txt2.getText());
       
       
       
        nn1=n1;
        nn2=n2;
     
        
      
       
       
       
       
       
       //  if (ae.getActionCommand() == "Suma")  --> toma el nombre de el boton.
       
       
       
       
        if (e.getSource()==btn1){
            resultado=n1+n2;
            txt3.setText(""+resultado);
            
            
        }else if (e.getSource()==btn2){
            
            resultado=n1-n2;
            txt3.setText(""+resultado);
            
            
        }else if(e.getSource()==btn3){
            resultado=n1*n2;
            txt3.setText(""+resultado);
        }else if (e.getSource()==btn4){
            resultado2=nn1/nn2;
            txt3.setText(""+resultado2);
            
        }else if(e.getSource()==btn5){
            
            resultado2=Math.sqrt(nn1);
            txt3.setText(""+resultado2);
            
            
        }else if (e.getSource()==btn6){
            
            resultado2=Math.sqrt(nn2);
            txt3.setText(""+resultado2);
            
            
        }else if(e.getSource()==btn7){
            
             if(n1>n2){
                
            txt3.setText(""+n1);
            }else{
                
            txt3.setText(""+n2);
            }
            
            
        }else {
            
            txt1.setText("");
            txt2.setText("");
            txt3.setText("");
           
    }
        
      }catch(Exception ex){
           
           txt3.setText("NaN");
           JOptionPane.showMessageDialog(null, ex);
           
       }
      
    }//else{
      //  JOptionPane.showMessageDialog(null,"Digite porfavor en los campos");    
        
        
       // }
        
        
          //   }
   
}
