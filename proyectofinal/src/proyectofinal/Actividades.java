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
public class Actividades extends javax.swing.JFrame {

    /**
     * Creates new form Actividades
     */
    public Actividades() {
        initComponents();
        
        txtcodactividad.setEnabled(false);
         txtcodalumno.setEnabled(false);
         txtnombreactividad.setEnabled(false);
         txthorario.setEnabled(false);
         txtduracion.setEnabled(false);
         txtobservacion.setEnabled(false);
         
         txtcodactividad.setText("");
         txtcodalumno.setText("");
         txtnombreactividad.setText("");
         txthorario.setText("");
         txtduracion.setText("");
         txtobservacion.setText("");
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtcodactividad = new javax.swing.JTextField();
        txtcodalumno = new javax.swing.JTextField();
        txtnombreactividad = new javax.swing.JTextField();
        txthorario = new javax.swing.JTextField();
        txtduracion = new javax.swing.JTextField();
        txtobservacion = new javax.swing.JTextField();
        btnagregar = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        btncerrar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Actividades");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(136, 11, 189, 33);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Codigo Actividad: ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 73, 123, 21);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Codigo Alumno: ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(47, 106, 106, 21);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre  Actividad:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 139, 133, 21);

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Horario:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(96, 166, 57, 21);

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Duraciòn: ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(84, 199, 69, 21);

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Observacion: ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(60, 232, 93, 21);
        getContentPane().add(txtcodactividad);
        txtcodactividad.setBounds(157, 75, 149, 20);
        getContentPane().add(txtcodalumno);
        txtcodalumno.setBounds(157, 108, 149, 20);
        getContentPane().add(txtnombreactividad);
        txtnombreactividad.setBounds(157, 141, 149, 20);
        getContentPane().add(txthorario);
        txthorario.setBounds(157, 168, 149, 20);
        getContentPane().add(txtduracion);
        txtduracion.setBounds(157, 201, 149, 20);
        getContentPane().add(txtobservacion);
        txtobservacion.setBounds(157, 232, 149, 20);

        btnagregar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnagregar.setText("AGREGAR");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnagregar);
        btnagregar.setBounds(29, 281, 89, 23);

        btnguardar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnguardar.setText("GUARDAR");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnguardar);
        btnguardar.setBounds(157, 281, 91, 23);

        btneliminar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btneliminar.setText("ELIMINAR");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btneliminar);
        btneliminar.setBounds(274, 281, 91, 23);

        btncancelar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btncancelar.setText("CANCELAR");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btncancelar);
        btncancelar.setBounds(91, 315, 97, 23);

        btncerrar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btncerrar.setText("CERRAR");
        btncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btncerrar);
        btncerrar.setBounds(254, 315, 81, 23);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 360);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarActionPerformed
      this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_btncerrarActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
          txtcodactividad.setEnabled(false);
         txtcodalumno.setEnabled(false);
         txtnombreactividad.setEnabled(false);
         txthorario.setEnabled(false);
         txtduracion.setEnabled(false);
         txtobservacion.setEnabled(false);
         
         txtcodactividad.setText("");
         txtcodalumno.setText("");
         txtnombreactividad.setText("");
         txthorario.setText("");
         txtduracion.setText("");
         txtobservacion.setText("");
         btnguardar.setEnabled(false);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btncancelarActionPerformed

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
   txtcodactividad.setEnabled(true);
         txtcodalumno.setEnabled(true);
         txtnombreactividad.setEnabled(true);
         txthorario.setEnabled(true);
         txtduracion.setEnabled(true);
         txtobservacion.setEnabled(true);
         
         txtcodactividad.setText("");
         txtcodalumno.setText("");
         txtnombreactividad.setText("");
         txthorario.setText("");
         txtduracion.setText("");
         txtobservacion.setText("");
         btnguardar.setEnabled(true);
         
         txtcodactividad.requestFocus();
         
        // TODO add your handling code here:
    }//GEN-LAST:event_btnagregarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
      
        ConexionMySQL mysql=new  ConexionMySQL();//se llama la clase conexión
    Connection cn=mysql.Conectar();  //creamos un objeto para conectar la base de datos sql

       int codactividad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo  de la actividad  a buscar")); 

       String mts ="DELETE FROM actividades WHERE codactividad = "+codactividad;
          
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

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed

        ConexionMySQL mysql=new  ConexionMySQL();//se llama la clase conexión
Connection cn=mysql.Conectar();  //creamos un objeto para conectar la base de datos sql

//ahora creamos las variables  para capturar los valores de los cuadros de texto

String  codact, codalum, nomact,hor,dur,observ;
String sSQL="";
String mensaje="";
codact=txtcodactividad.getText();
codalum=txtcodalumno.getText();
nomact=txtnombreactividad.getText();
hor=txthorario.getText();
dur=txtduracion.getText();
observ=txtobservacion.getText();



sSQL="INSERT INTO actividades(codactividad, codalumno,nombreactividad,horario,duracion, observacion)"+"VALUES(?, ?, ?, ?,?,?)";
       mensaje="los valores se han insertado correctamente";

//ahora vamos a utilizar una interface con un procedimiento para insertar los datos en la base de datos.

try
{
PreparedStatement pst=cn.prepareStatement(sSQL);
pst.setString(1,codact);
pst.setString(2,codalum);
pst.setString(3,nomact);
pst.setString(4,hor);
pst.setString(5,dur);
pst.setString(6,observ);


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
            java.util.logging.Logger.getLogger(Actividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Actividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Actividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Actividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Actividades().setVisible(true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtcodactividad;
    private javax.swing.JTextField txtcodalumno;
    private javax.swing.JTextField txtduracion;
    private javax.swing.JTextField txthorario;
    private javax.swing.JTextField txtnombreactividad;
    private javax.swing.JTextField txtobservacion;
    // End of variables declaration//GEN-END:variables
}