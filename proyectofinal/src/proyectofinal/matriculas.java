/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import Conexion.Conector;
import Conexion.Eliminar;

/**
 *
 * @author salaf409
 */
public class matriculas extends javax.swing.JFrame {

    /**
     * Creates new form matriculas
     */
    public matriculas() {
        initComponents();
        limpiar();
    }
    
    
    
    
    public void limpiar (){
        
        
        txtcodigo.setText("");
        txtalumno.setText("");
        txtfecha.setText("");
        txtvalor.setText("");
        txtnivel.setText("");
        txthorario.setText("");
        
        
         txtcodigo.setEnabled(false);
        txtalumno.setEnabled(false);
        txtfecha.setEnabled(false);
        txtvalor.setEnabled(false);
        txtnivel.setEnabled(false);
        txthorario.setEnabled(false);
        
          
        tbneliminar.setEnabled(false);
        tbnguardar.setEnabled(false);
        
        
        
        
    }
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tbnguardar = new javax.swing.JButton();
        tbneliminar = new javax.swing.JButton();
        tbncancelar = new javax.swing.JButton();
        tbnsalir = new javax.swing.JButton();
        tbnagregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtalumno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtfecha = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtvalor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtnivel = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txthorario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbnguardar.setText("Guardar");
        tbnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnguardarActionPerformed(evt);
            }
        });
        getContentPane().add(tbnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 294, -1, -1));

        tbneliminar.setText("Eliminar");
        tbneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbneliminarActionPerformed(evt);
            }
        });
        getContentPane().add(tbneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 294, -1, -1));

        tbncancelar.setText("Cancelar");
        tbncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbncancelarActionPerformed(evt);
            }
        });
        getContentPane().add(tbncancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 328, -1, -1));

        tbnsalir.setText("Salir");
        tbnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnsalirActionPerformed(evt);
            }
        });
        getContentPane().add(tbnsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 328, -1, -1));

        tbnagregar.setText("Agregar");
        tbnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnagregarActionPerformed(evt);
            }
        });
        getContentPane().add(tbnagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 294, -1, -1));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Codigo matricula");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 133, -1, -1));
        getContentPane().add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 130, 108, -1));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Codigo alumno");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 102, -1, -1));

        txtalumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtalumnoActionPerformed(evt);
            }
        });
        getContentPane().add(txtalumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 99, 108, -1));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fecha de matricula");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 171, -1, -1));
        getContentPane().add(txtfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 168, 108, -1));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Valor");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 202, -1, -1));
        getContentPane().add(txtvalor, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 199, 108, -1));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nivel");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 228, -1, -1));

        txtnivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnivelActionPerformed(evt);
            }
        });
        getContentPane().add(txtnivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 225, 108, -1));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Horario");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 259, -1, -1));

        txthorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthorarioActionPerformed(evt);
            }
        });
        getContentPane().add(txthorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 256, 108, -1));

        jLabel7.setFont(new java.awt.Font("Lucida Calligraphy", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Matriculas");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 48, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtalumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtalumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtalumnoActionPerformed

    private void txtnivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnivelActionPerformed

    private void txthorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthorarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthorarioActionPerformed

    private void tbnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnagregarActionPerformed

        
        
         txtcodigo.setText("");
        txtalumno.setText("");
        txtfecha.setText("");
        txtvalor.setText("");
        txtnivel.setText("");
        txthorario.setText("");
        
        
         txtcodigo.setEnabled(true);
        txtalumno.setEnabled(true);
        txtfecha.setEnabled(true);
        txtvalor.setEnabled(true);
        txtnivel.setEnabled(true);
        txthorario.setEnabled(true);
        
          
        tbneliminar.setEnabled(true);
        tbnguardar.setEnabled(true);
        
        
        
        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_tbnagregarActionPerformed

    private void tbncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbncancelarActionPerformed

        limpiar();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_tbncancelarActionPerformed

    private void tbnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnsalirActionPerformed

        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_tbnsalirActionPerformed

    private void tbnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnguardarActionPerformed

   
        
        
        String codigoalumno,codigomatricula,fecha,valor,nivel,horario;
        
        
        
        codigomatricula=txtcodigo.getText();
        codigoalumno=txtalumno.getText();
        fecha=txtfecha.getText();
        valor=txtvalor.getText();
        nivel=txtnivel.getText();
        horario=txthorario.getText();
        
        
        Conector cn = new Conector("matriculas",codigoalumno,codigomatricula,fecha,valor,nivel,horario);
        
        
        
        
        
        
    }//GEN-LAST:event_tbnguardarActionPerformed

    private void tbneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbneliminarActionPerformed

        
        
        Eliminar DEL = new Eliminar ("matriculas");
        // TODO add your handling code here:
    }//GEN-LAST:event_tbneliminarActionPerformed

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
            java.util.logging.Logger.getLogger(matriculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(matriculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(matriculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(matriculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new matriculas().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton tbnagregar;
    private javax.swing.JButton tbncancelar;
    private javax.swing.JButton tbneliminar;
    private javax.swing.JButton tbnguardar;
    private javax.swing.JButton tbnsalir;
    private javax.swing.JTextField txtalumno;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txthorario;
    private javax.swing.JTextField txtnivel;
    private javax.swing.JTextField txtvalor;
    // End of variables declaration//GEN-END:variables
}
