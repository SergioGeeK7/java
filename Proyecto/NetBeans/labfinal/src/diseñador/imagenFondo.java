
package diseñador;

import java.awt.*;
import javax.swing.*;


public class imagenFondo extends javax.swing.JPanel {
    
    public imagenFondo(){
        initComponents();
        this.setSize(800,500);
    }
    
    @Override
    public void paintComponent(Graphics g){
        Dimension tam = getSize();
        ImageIcon fondo = new ImageIcon(new ImageIcon(getClass().getResource("hombre.jpg")).getImage());
        g.drawImage(fondo.getImage(), 0, 0, tam.width,tam.height, null);
        setOpaque(false);
        super.paintComponents(g);
    }

    private void initComponents() {
       
    }


    
}
