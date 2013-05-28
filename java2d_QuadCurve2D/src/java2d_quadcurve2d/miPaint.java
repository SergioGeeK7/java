package java2d_quadcurve2d;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.QuadCurve2D;
import java.text.NumberFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 * @web http://jc-mouse.blogspot.com/
 * @author Mouse
 */
public class miPaint extends JPanel {
    private Point2D Punto1;
    private Point2D Punto2;
    private Point2D Punto3;    
    private Point2D Punto;
    private boolean band=true;
    float rango=0.01f;
    
    public miPaint(Dimension d){
      this.setPreferredSize(d);
      this.setSize(d);
      this.setVisible(true);
      this.repaint();      
      //se crean las coordenas al azar
      this.Punto1 = new Point2D.Double(getCoordenada(),getCoordenada());            
      this.Punto2 = new Point2D.Double(getCoordenada(),getCoordenada());            
      this.Punto3 = new Point2D.Double(getCoordenada(),getCoordenada()); 
    }
    //actualiza nuevas coordenadas a los Puntos
    public void setPoint2D(String x1,String y1,String x2,String y2,String x3,String y3, boolean b){
        this.Punto1 = new Point2D.Float(Float.valueOf(x1),Float.valueOf(y1));            
        this.Punto2 = new Point2D.Float(Float.valueOf(x3),Float.valueOf(y3));            
        this.Punto3 = new Point2D.Float(Float.valueOf(x2),Float.valueOf(y2));            
        this.band=b;
    }
    
  @Override                   
  public void paintComponent(Graphics g){
        super.paintComponent(g);      
        Graphics2D g2 = (Graphics2D)g;    
        //grosor de pincel
        g2.setStroke(new BasicStroke(2.0f));   
        //color de pincel
        g2.setColor(new Color(0,0,200));
        if(band){
            Dibujar_QuadCurve2D(g2);
        }else{
            Dibujar_Bezier(g2);
        }         
        this.repaint();
        Mostrar_Datos(g2);
   }
  
  //dibuja la curva con la funcion de java2d QuadCurve2D
  public void Dibujar_QuadCurve2D(Graphics2D g2){    
    g2.draw(new QuadCurve2D.Double(Punto1.getX(), Punto1.getY(), Punto2.getX(), Punto2.getY(), Punto3.getX(), Punto3.getY()));                           
  }
  
  //dibuja la curva con la funcion de la curva cuadratica de Bezier
  //(1-t)^2*p1 + 2t(1-t)p2 + t^2*p3
  public void Dibujar_Bezier(Graphics2D g2){
        float f1;
        float f2;        
        float t=0;          
        while (t<=1.0){  
            //obtiene las coordenadas
            f1 = (float) (((1-t)*(1-t) * Punto1.getX()) + 2 * t * (1 - t) * Punto2.getX() + (t * t) * Punto3.getX()); 
            f2 = (float) (((1-t)*(1-t) * Punto1.getY()) + 2 * t * (1 - t) * Punto2.getY() + (t * t) * Punto3.getY());            
            //crea un punto con esas coordenadas
            Punto = new Point2D.Float(f1,f2);   
            //dibuja el punto
            g2.draw(new Line2D.Double(Punto.getX(),Punto.getY(),Punto.getX(),Punto.getY()));      
            t = (float) (t + rango);    
        }      
        
  }
  
  //
  public void setRango(String x){
      if((Float.valueOf(x)<=1)&&(Float.valueOf(x)>0.001)){
         this.rango=Float.valueOf(x);  
      }else{
        JOptionPane.showMessageDialog(this,"Solo valores entre [0.001 y 1.0]");            
      }
    
  }
  /* metodos auxiliares */
  
  //muestra lascoordenas de los puntos P1,P2 Y P3
  //dibuja las lineas que estos forman
  private void Mostrar_Datos(Graphics2D g2){
        g2.setStroke(new BasicStroke(1.0f));
        g2.setColor(new Color(0,0,0));
        g2.draw(new Line2D.Double(Punto1.getX(), Punto1.getY(), Punto2.getX(), Punto2.getY()));          
        g2.draw(new Line2D.Double(Punto3.getX(), Punto3.getY(), Punto2.getX(), Punto2.getY()));          
        dibuja_coordenada(g2,Punto1.getX(), Punto1.getY(),"Punto 1");
        dibuja_coordenada(g2,Punto2.getX(), Punto2.getY(),"Punto de Control");
        dibuja_coordenada(g2,Punto3.getX(), Punto3.getY(),"Punto 2");        
  }
  
   //dibuja las coordenas dadas  un punto P1,P2   
private void dibuja_coordenada(Graphics2D g2,double x, double y,String t){       
    NumberFormat mf = NumberFormat.getInstance(); 
    mf.setMaximumFractionDigits(2); 
    g2.setColor(new Color(255,0,0)); 
    g2.setFont(new Font("Arial", Font.BOLD, 11));
    g2.drawString(t + " ("+mf.format(x)+","+mf.format(y)+")",(float) (x+4),(float)  (y-10));       
    g2.setStroke(new BasicStroke(4.5f));   
    g2.draw(new Line2D.Double(x,y,x,y));      
   } 

//genera un valor al azar
private double getCoordenada(){ 
    return ((Math.random()*350)+50);
}

     
}
