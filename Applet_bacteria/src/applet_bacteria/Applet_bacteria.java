package applet_bacteria;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;




public class Applet_bacteria extends Applet implements ActionListener {

    
    Label titlepoblacion;
    Label titleporcentaje;
    Label titleresultados;
    TextField txtpoblacion;
    TextField txtporcentaje;
    Button btn;
    TextArea txtarea;
    Button btn2;
    public Applet_bacteria (){
        
        
        titlepoblacion = new Label ("Poblacion Inicial       ");
        titleporcentaje= new Label("\n% de aumento diario");
        btn = new Button ("Simular");
        titleresultados = new Label ("          Resultados de la Simulacion");
        txtpoblacion = new TextField (20);
        txtporcentaje= new TextField (20);
        txtarea = new TextArea(20,40);
        txtarea.setEnabled(false);
        btn2= new Button ("Limpiar");
        
        
        add(titlepoblacion);
        add(txtpoblacion);
        add(titleporcentaje);
        add(txtporcentaje);
        add(btn);
        add(btn2);
        add(titleresultados);
        add(txtarea);
        btn.addActionListener(this);
        btn2.addActionListener(this);
    }

    
    
    
    
    
    public void actionPerformed (ActionEvent e){


        
           if (e.getSource() == btn) { 
        
        double poblacion = Double.parseDouble(txtpoblacion.getText());
        
        int porcentaje = Integer.parseInt(txtporcentaje.getText());
        

        double end=poblacion*2;
        int dias=0;
        
        
    
                 
                 
        
        while (poblacion<end){
            
            
            poblacion = (porcentaje*poblacion/100) + poblacion;
            dias++;
            txtarea.setText(txtarea.getText()+"dia "+dias+" Poblacion = "+poblacion +"\n" );
            
            
            
      }
        
        
        
       }else {
               
               txtarea.setText("");
               txtpoblacion.setText("");
               txtporcentaje.setText("");
               txtpoblacion.requestFocus();
           }
       
       
       
       
           
        
        
        
        
}
    
    
    
    
    
    
    
}

