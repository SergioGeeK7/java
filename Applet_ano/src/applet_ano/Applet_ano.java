
package applet_ano;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;


public class Applet_ano extends Applet implements ActionListener {

    Label title1;
    Label title2;
    Label title3;
    Label title4;
    Label title5;
    
    TextField txt1;
    TextField txt2;
    TextField txt3;
    TextField txt4;
    TextField txt5;
   
    Button btn;
    
    public Applet_ano (){
        
        title1= new Label ("Año");
        title2= new Label ("Dias");
        btn=new Button ("   Convercion   ");
        title3= new Label("Año");
        title4= new Label("Mes");
        title5= new Label("Dias");
        txt1 = new TextField (10);
        txt2 = new TextField (10);
        txt3 = new TextField (10);
        txt4 = new TextField (10);
        txt5 = new TextField (10);
        
        txt3.setEnabled(false);
        txt4.setEnabled(false);
        txt5.setEnabled(false);
        
        
        add(title1);
        add(txt1);
        add(title2);
        add(txt2);
        add(btn);
        add(title3);
        add(txt3);
        add(title4);
        add(txt4);
        add(title5);
        add(txt5);
        
        
       btn.addActionListener(this);
        
    }
    
    
    
    public void actionPerformed (ActionEvent e){
        
        
        int ano=Integer.parseInt(txt1.getText());
        int dias=Integer.parseInt(txt2.getText());
        int mes=0;
        
        int cont=0;
        
        
        if (ano%4==0 && ano%100==1){
            
            cont++;
            
        } else if (ano%100==0 && ano%400==0){
            
            cont++;
            
        }
        
        
        
        
        if (dias<32){
            
            mes=1;
            
            
        }else if (dias<60+cont){
            
            mes=2;
            dias=dias-31+cont;
            
            
        }else if (dias<91+cont){
            
            mes=3;
            dias=dias-60+cont;
            
        } else if (dias<121+cont){
            mes=4;
            dias=dias-90+cont;
            
        } else if (dias<152+cont){
            mes=5;
            dias=dias-120+cont;
        } else if (dias<182+cont){
            mes=6;
            dias=dias-151+cont;
        }else if (dias<213+cont){
            mes=7;
            dias=dias-181+cont;
        }else if (dias<244+cont){
            mes=8;
            dias=dias-212+cont;
        }else if (dias<274+cont){
            mes=9;
            dias=dias-243+cont;
        }else if (dias<305+cont){
            mes=10;
            dias=dias-273+cont;
        }else if (dias<335+cont){
            mes=11;
            dias=dias-304+cont;
        }else if (dias <366+cont){
            mes=12;
            dias=dias-334+cont;
        }else {
            
            
            
        }
        
        
     
        txt3.setText(""+ano);
        txt4.setText(""+mes);
        txt5.setText(""+dias);
        
        
        
        
    }
    
    
    
    
}
