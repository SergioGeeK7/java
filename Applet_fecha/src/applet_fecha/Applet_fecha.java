
package applet_fecha;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.applet.*;
public class Applet_fecha extends Applet implements ActionListener {

   
    Label title1;
    Label title2;
    Label title3;
    Button btn;
    TextField txt1;
    TextField txt2;
    TextArea txt3;
    
    public Applet_fecha (){
        
        
        title1= new Label("Dia");
        title2= new Label("Mes");
        title3= new Label("Fecha con Letras");
        btn= new Button("Cambiar");
        txt1= new TextField (5);
        txt2= new TextField (5);
        txt3= new TextArea (8,30);
        txt3.setEditable(false);
        
        add(title1);
        add(txt1);
        add(title2);
        add(txt2);
        add(btn);
        add(title3);
        add(txt3);
        
        btn.addActionListener(this);
        
    }
    
    public void actionPerformed (ActionEvent e){
        
        
        int dia=Integer.parseInt(txt1.getText());
        int mes=Integer.parseInt(txt2.getText());
        
        String fecha;
        
        switch (dia) {
            
            case 1: fecha="lunes de";
                    break;
            case 2: fecha="martes de";
                    break;
            case 3: fecha="miercoles de";
                    break;
            case 4: fecha="jueves de";
                    break;
            case 5: fecha="viernes de";
                    break;
            case 6: fecha="sabado de";
                    break;
            case 7: fecha="domingo de";
                    break;
            default : fecha="Usted ha digitado mal";
                    break;
            
        }
        
        switch (mes){
            
            case 1: fecha=fecha+" enero";
                    break;
            case 2:fecha=fecha+" febrero";
                    break;
            case 3:fecha=fecha+" marzo";
                    break;
            case 4:fecha=fecha+" abril";
                    break;
            case 5:fecha=fecha+" mayo";
                    break;
            case 6:fecha=fecha+" junio";
                    break;
            case 7:fecha=fecha+" julio";
                    break;
            case 8:fecha=fecha+" agosto";
                    break;
            case 9:fecha=fecha+" septiembre";
                    break;
            case 10:fecha=fecha+" octubre";
                    break;
            case 11:fecha=fecha+" noviembre";
                    break;
            case 12:fecha=fecha+" diciembre";
                    break;
                
            
        }
        
        if (dia <= 0 || dia > 7 || mes > 12 || mes <= 0){
            fecha="Usted ha digitado mal";
        }
        
        
        txt3.setText(fecha);
        
        
        
        
        
        
    }
    
    
    
    
    
}
