
package puntoslineas1;


import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * AUTOR = http://www.youtube.com/user/0mercenario0
 */
public class PuntosLineas2 extends javax.swing.JFrame {

    /** Creates new form PuntosLineas2 */
    public PuntosLineas2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>
    //VARIABLE PARA ALMACENAR PUNTOS
    ArrayList<Point> lista = new ArrayList<Point>();
private void formMousePressed(java.awt.event.MouseEvent evt) {
    //*************DIBUJAR PUNTOS
    //CREAR LIENZO
    Graphics g = this.getGraphics();
    //DIBUJAR PUNTO
    g.drawRect(evt.getX(), evt.getY(), 5, 5);
    //*************DIBUJAR LINEA
    
    //GUARDAR PUNTOS
    lista.add(new Point(evt.getX(), evt.getY()));
    //OBTENER PUNTOS
    if(lista.size()>1)
    {
    //DIBUJAR LINEA
        g.drawLine(lista.get(lista.size()-1).x, lista.get(lista.size()-1).y, lista.get(lista.size()-2).x, lista.get(lista.size()-2).y);
    }
    
}

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PuntosLineas2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PuntosLineas2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PuntosLineas2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PuntosLineas2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new PuntosLineas2().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify
    // End of variables declaration
}