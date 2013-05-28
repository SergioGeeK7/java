/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import conexion.Conector;
import conexion.ConexionMySQL;
import conexion.Eliminar;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author salaf409
 */
public class gatos extends javax.swing.JFrame {

    /**
     * Creates new form gatos
     */String tabla;
    public gatos(String tabla,String title) {
        initComponents();
        
        limpiar();
        
        labeltitle.setText(title);
        this.tabla=tabla;
        
    }

    
    public void limpiar () {
        
         txtnombre.setEnabled(false);
        txtaños.setEnabled(false);
        txtdueño.setEnabled(false);
        txtcodigo.setEnabled(false);
        txtdiagnostico.setEnabled(false);
        
        tbnguardar.setEnabled(false);
        tbncancelar.setEnabled(false);
        tbneliminar.setEnabled(false);
    }
    
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtaños = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtdueño = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtdiagnostico = new javax.swing.JTextArea();
        labeltitle = new javax.swing.JLabel();
        btnagregar = new javax.swing.JButton();
        tbnguardar = new javax.swing.JButton();
        tbneliminar = new javax.swing.JButton();
        tbncancelar = new javax.swing.JButton();
        tbnsalir = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("nombre");

        jLabel2.setText("años");

        jLabel3.setText("dueño");

        jLabel4.setText("codigo");

        txtcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigoActionPerformed(evt);
            }
        });

        jLabel5.setText("diagnostico");

        txtdiagnostico.setColumns(20);
        txtdiagnostico.setRows(5);
        jScrollPane1.setViewportView(txtdiagnostico);

        labeltitle.setText("Gatos");

        btnagregar.setText("Agregar");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        tbnguardar.setText("Guardar");
        tbnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnguardarActionPerformed(evt);
            }
        });

        tbneliminar.setText("Eliminar");
        tbneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbneliminarActionPerformed(evt);
            }
        });

        tbncancelar.setText("Cancelar");
        tbncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbncancelarActionPerformed(evt);
            }
        });

        tbnsalir.setText("Salir");
        tbnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnsalirActionPerformed(evt);
            }
        });

        jToggleButton1.setText("jToggleButton1");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtnombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                    .addComponent(txtcodigo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtdueño, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtaños, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jToggleButton1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(tbnsalir)))
                .addGap(38, 38, 38))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnagregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbnguardar)
                        .addGap(18, 18, 18)
                        .addComponent(tbneliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tbncancelar)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labeltitle)
                        .addGap(145, 145, 145))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labeltitle)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtaños, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtdueño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnagregar)
                    .addComponent(tbnguardar)
                    .addComponent(tbneliminar)
                    .addComponent(tbncancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbnsalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodigoActionPerformed

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed

        
        
        
        
        
        
        
        
        
        
        
        
       
        
        
        
        txtnombre.setEnabled(true);
        txtaños.setEnabled(true);
        txtdueño.setEnabled(true);
        txtcodigo.setEnabled(true);
        txtdiagnostico.setEnabled(true);
        
        tbnguardar.setEnabled(true);
        tbncancelar.setEnabled(true);
        tbneliminar.setEnabled(true);
        
        txtnombre.setText("");
        txtaños.setText("");
        txtdueño.setText("");
        txtcodigo.setText("");
        txtdiagnostico.setText("");
        txtnombre.requestFocus();
        
        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btnagregarActionPerformed

    private void tbncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbncancelarActionPerformed

        limpiar();
        
        
    }//GEN-LAST:event_tbncancelarActionPerformed

    private void tbnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnsalirActionPerformed

        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_tbnsalirActionPerformed

    private void tbneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbneliminarActionPerformed

        /*
        
        ConexionMySQL mysql=new  ConexionMySQL();//se llama la clase conexión
        Connection cn=mysql.Conectar();  //creamos un objeto para conectar la base de datos sql

       int cod = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo a buscar")); 

       String mts ="DELETE FROM "+tabla+" WHERE codigo = "+cod;
          
       System.out.println(tabla);

    try 
    {
        Statement st = cn.createStatement();//Obtiene procedimiento o consulta, sin parametros.
        st.execute(mts); //ejecute la consulta, en este caso que elimine.
         JOptionPane.showMessageDialog(null,"Los datos fueron eliminardos correctamente");
    }
    catch (Exception ex) {
        
    JOptionPane.showMessageDialog(null, ex);
       
    }

        
        */
        
        
        Eliminar delete = new Eliminar(this.tabla);
        
        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_tbneliminarActionPerformed

    private void tbnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnguardarActionPerformed

        
        String nombre,años,dueño,codigo,diagnostico;
        
        
        nombre=txtnombre.getText();
        años=txtaños.getText();
        dueño=txtdueño.getText();
        codigo=txtcodigo.getText();
        diagnostico=txtdiagnostico.getText();
        
        
        Conector cn = new Conector(tabla,nombre,años,dueño,codigo,diagnostico);
        
        
        
        
        
        
       
    }//GEN-LAST:event_tbnguardarActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(gatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new gatos().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnagregar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel labeltitle;
    private javax.swing.JButton tbncancelar;
    private javax.swing.JButton tbneliminar;
    private javax.swing.JButton tbnguardar;
    private javax.swing.JButton tbnsalir;
    private javax.swing.JTextField txtaños;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextArea txtdiagnostico;
    private javax.swing.JTextField txtdueño;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
