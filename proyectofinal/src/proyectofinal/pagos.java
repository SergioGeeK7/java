/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import Conexion.ConexionMySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;

/**
 *
 * @author salaf409
 */
public class pagos extends javax.swing.JFrame {

    /**
     * Creates new form pagos
     */
    public pagos() {
        initComponents();
        
        txtcodpagos.setEnabled(false);
        txtcodalumno.setEnabled(false);
        txtfechapago.setEnabled(false);
        txtdescripcion.setEnabled(false);
        txtvalor.setEnabled(false);
        
        txtcodpagos.setText("");
        txtcodalumno.setText("");
        txtfechapago.setText("");
        txtdescripcion.setText("");
        txtvalor.setText("");
        
        btnguardar.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnagregar = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        btncerrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtcodpagos = new javax.swing.JTextField();
        txtcodalumno = new javax.swing.JTextField();
        txtfechapago = new javax.swing.JTextField();
        txtdescripcion = new javax.swing.JTextField();
        txtvalor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnagregar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnagregar.setText("AGREGAR");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        btnguardar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnguardar.setText("GUARDAR");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btneliminar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btneliminar.setText("ELIMINAR");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btncancelar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btncancelar.setText("CANCELAR");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        btncerrar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btncerrar.setText("CERRAR");
        btncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 255));
        jLabel1.setText("Pagos");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setText("Codigo Pagos:");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setText("Codigo Alumno:");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setText("Fecha Pago:");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel5.setText("Descripciòn: ");

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel6.setText("Valor:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnagregar)
                                .addGap(39, 39, 39)
                                .addComponent(btnguardar)
                                .addGap(26, 26, 26)
                                .addComponent(btneliminar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(btncancelar)
                                .addGap(50, 50, 50)
                                .addComponent(btncerrar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7)))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtdescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                .addComponent(txtfechapago)
                                .addComponent(txtcodalumno)
                                .addComponent(txtcodpagos)
                                .addComponent(txtvalor)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtcodpagos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtcodalumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtfechapago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtvalor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnagregar)
                    .addComponent(btnguardar)
                    .addComponent(btneliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncancelar)
                    .addComponent(btncerrar))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        txtcodpagos.setEnabled(true);
        txtcodalumno.setEnabled(true);
        txtfechapago.setEnabled(true);
        txtdescripcion.setEnabled(true);
        txtvalor.setEnabled(true);
        
        txtcodpagos.setText("");
        txtcodalumno.setText("");
        txtfechapago.setText("");
        txtdescripcion.setText("");
        txtvalor.setText("");
        btnguardar.setEnabled(true);

        txtcodpagos.requestFocus();

        // TODO add your handling code here:
    }//GEN-LAST:event_btnagregarActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        txtcodpagos.setEnabled(false);
        txtcodalumno.setEnabled(false);
        txtfechapago.setEnabled(false);
        txtdescripcion.setEnabled(false);
        txtvalor.setEnabled(false);
        
        txtcodpagos.setText("");
        txtcodalumno.setText("");
        txtfechapago.setText("");
        txtdescripcion.setText("");
        txtvalor.setText("");
        
        btnguardar.setEnabled(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_btncancelarActionPerformed

    private void btncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarActionPerformed
        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_btncerrarActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed

        ConexionMySQL mysql=new  ConexionMySQL();//se llama la clase conexión
Connection cn=mysql.Conectar();  //creamos un objeto para conectar la base de datos sql

//ahora creamos las variables  para capturar los valores de los cuadros de texto

String  codpag, codalu, fechapa,descrip,val;
String sSQL="";
String mensaje="";
codpag=txtcodpagos.getText();
codalu=txtcodalumno.getText();
fechapa=txtfechapago.getText();
descrip=txtdescripcion.getText();
val=txtvalor.getText();



sSQL="INSERT INTO pagos(codpagos, codalum,fechapago,descripcion,valor)"+"VALUES(?, ?, ?, ?,?)";
       mensaje="los valores se han insertado correctamente";

//ahora vamos a utilizar una interface con un procedimiento para insertar los datos en la base de datos.

try
{
PreparedStatement pst=cn.prepareStatement(sSQL);
pst.setString(1,codpag);
pst.setString(2,codalu);
pst.setString(3,fechapa);
pst.setString(4,descrip);
pst.setString(5,val);



//ahora este código es para  ver cuántos elementos se insertaron

int  n=pst.executeUpdate();
if (n>0){
JOptionPane.showMessageDialog(null, mensaje);
}
}

catch (SQLException ex)
{
JOptionPane.showMessageDialog(null, ex);
}

        // TODO add your handling code here:
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
ConexionMySQL mysql=new  ConexionMySQL();//se llama la clase conexión
    Connection cn=mysql.Conectar();  //creamos un objeto para conectar la base de datos sql

       int codpagos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo  del pago  a buscar")); 

       String mts ="DELETE FROM pagos WHERE codigo = "+codpagos;
          
    try 
    {
       
        Statement st = cn.createStatement();//Obtiene procedimiento o consulta, sin parametros.
        st.execute(mts); //ejecute la consulta, en este caso que elimine.
         JOptionPane.showInputDialog("Valores eliminados correctamente");
    }
    catch (Exception ex) {
        
    JOptionPane.showMessageDialog(null, ex);
       
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_btneliminarActionPerformed

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
            java.util.logging.Logger.getLogger(pagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pagos().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btncerrar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtcodalumno;
    private javax.swing.JTextField txtcodpagos;
    private javax.swing.JTextField txtdescripcion;
    private javax.swing.JTextField txtfechapago;
    private javax.swing.JTextField txtvalor;
    // End of variables declaration//GEN-END:variables
}
