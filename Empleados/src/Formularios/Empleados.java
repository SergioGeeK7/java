/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;
       
import coneccion.ConexionMySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Administrador
 */
public class Empleados extends javax.swing.JFrame {
//crear modelo de la tabla
    DefaultTableModel modelo;
   
    
    
    
    
    public Empleados() {
        initComponents();
        
        // cuando cargue el formualario me cargue automaticamente los datos
        //llamamos el metodo
        
    //    cargartablaempleados("");
        
        
        
        
        
        cbogenero.addItem("M");
        cbogenero.addItem("F");
        inhabilitar();
        
    }

    
    void cargartablaempleados (String valor){  // resivira valor para poder filtrar los datos
        
        //creacion de titulos de la tabla
        
        String [] titulos ={"ID","Primer Apellido","Segundo Apellido","Primer Nombre","Segundo Nombre","Fecha de nac","Genero"};
        
        // otro para agregar cada uno de los elementos a la tabla
        
        String [] registros = new String[7];
        
        // poner los titulos a la tabla
        
        modelo = new DefaultTableModel(null,titulos);
        
        // procedemos a hacer la coneccion con la base de datos
        
        
        //creacion del objeto del constructor conexionMYSQL
        
        ConexionMySQL mysql = new ConexionMySQL();
        
        // objeto tipo coneccion
        
        Connection cn = mysql.Conectar();
        
        // crear la consulta Mysql
        
        
        String sSQL="";
        
        
        sSQL = "SELECT id_emp,apellido1,apellido2,nombre1,nombre2,fecha_nac,genero FROM datos_personales "
                + "WHERE CONCAT(apellido1,'﻿ ',apellido2,'﻿ ',nombre1,'﻿ ',nombre2) LIKE '%"+valor+"%' ";
        
        // SELECT PONER TODOS LOS CAMPOS DE LA TABLA
        //WHERE CONCAT == CONCATENAREMOS PARA QUE SE PUEDA BUSCAR POR CUALQUIERA DE ESTOS ELEMENTOS,
        // YA SEA POR APELLIDO1 APELLIDO2 NOMBRE1 
        // LIKE(LENGUAJE MYSQL) == QUE TODO ESTO SE PARESCA A LO QUE ESTE EN LA VARIABLE "VALOR" 
        // COMODINES %
        // variable es la variable que recivimos en este metodo
        try {
            // crear un estamento 
            // reportar excepcion
            
            Statement st =cn.createStatement();
            
            
            // vamos a almacenar los datos en un objeto resultset
            // un objeto tipo Resultset llamado rs y le mandamos el stament st.executeQuery , donde le mandamos el sSQL de arriba
            ResultSet rs = st.executeQuery(sSQL);
            
            // en este objeto rs obtenemos todos los datos, ahora lo recorremos para poder 
            // rescatar los valores del objeto
            // resulset tiene un objeto que es una matriz y debemos recorrerla
            
            
            while(rs.next()){
                
                
                // utilizaremos la variable que tiene varias posiciones y guardaremos cada uno de los valores en ese vector
                
                registros[0]= rs.getString("id_emp");
                registros[1]= rs.getString("apellido1");
                registros[2]= rs.getString("apellido2");
                registros[3]= rs.getString("nombre1");
                registros[4]= rs.getString("nombre2");
                registros[5]= rs.getString("fecha_nac");
                registros[6]= rs.getString("genero");
                
                
                // almacenar esto en el modelo
                
                modelo.addRow(registros);
                
            }
            
            
            // vamos a agregar estos elementos a la tabla
            
           tbnconsultaempleados.setModel(modelo);
            
            
            
            
        } catch (SQLException ex) {
           
                JOptionPane.showMessageDialog(null, ex);  
                
                
                
            // Logger.getLogger(Empleados.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
  
        
        
        
        
    }
            
    
    
    
    
    // habilitar todos los controles . para agregar datos
    
    void habilitar (){
        
        // habilitar cuando presionen en el boton nuevo
        
        txtprimerapellido.setEnabled(true);
        txtsegundoapellido.setEnabled(true);
        txtprimernombre.setEnabled(true);
        txtsegundonombre.setEnabled(true);
        txtfechadenac.setEnabled(true);
        cbogenero.setEnabled(true);
        txtprimerapellido.setText("");
        txtsegundoapellido.setText("");
        txtprimernombre.setText("");
        txtsegundonombre.setText("");
        txtfechadenac.setText("");
        btnguardar.setEnabled(true);
        btncancelar.setEnabled(true);
        
        // pasar el cursor
        
        
        txtprimerapellido.requestFocus();
        
        
        
    }
            
    
    void inhabilitar (){
        
        txtprimerapellido.setEnabled(false);
        txtsegundoapellido.setEnabled(false);
        txtprimernombre.setEnabled(false);
        txtsegundonombre.setEnabled(false);
        txtfechadenac.setEnabled(false);
        cbogenero.setEnabled(false);
        txtprimerapellido.setText("");
        txtsegundoapellido.setText("");
        txtprimernombre.setText("");
        txtsegundonombre.setText("");
        txtfechadenac.setText("");
        btnguardar.setEnabled(false);
        btncancelar.setEnabled(false);
        
        
        
        
        
    }
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtprimerapellido = new javax.swing.JTextField();
        txtsegundoapellido = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtprimernombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtsegundonombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtfechadenac = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbogenero = new javax.swing.JComboBox();
        btnnuevo = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbnconsultaempleados = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        tbnbuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Captura de datos peronales de Empleados"));

        jLabel1.setText("Primer apellido");

        txtprimerapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprimerapellidoActionPerformed(evt);
            }
        });

        txtsegundoapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsegundoapellidoActionPerformed(evt);
            }
        });

        jLabel2.setText("Segundo apellido");

        txtprimernombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprimernombreActionPerformed(evt);
            }
        });

        jLabel3.setText("Primer nombre");

        txtsegundonombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsegundonombreActionPerformed(evt);
            }
        });

        jLabel4.setText("Segundo nombre");

        txtfechadenac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfechadenacActionPerformed(evt);
            }
        });

        jLabel5.setText("Fecha de nacimiento");

        jLabel6.setText("Genero");

        btnnuevo.setText("Nuevo");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnnuevo)
                        .addGap(18, 18, 18)
                        .addComponent(btnguardar)
                        .addGap(22, 22, 22)
                        .addComponent(btncancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnsalir))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2))
                                    .addComponent(jLabel3))
                                .addComponent(jLabel4))
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cbogenero, 0, 108, Short.MAX_VALUE)
                            .addComponent(txtsegundonombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtprimernombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtsegundoapellido, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtprimerapellido, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtfechadenac, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtprimerapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtsegundoapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtprimernombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtsegundonombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtfechadenac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbogenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnnuevo)
                    .addComponent(btnguardar)
                    .addComponent(btncancelar)
                    .addComponent(btnsalir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("consulta de empleados"));

        tbnconsultaempleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbnconsultaempleados);

        jLabel7.setText("Buscar");

        tbnbuscar.setText("Buscar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel7)
                .addGap(50, 50, 50)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbnbuscar)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbnbuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed

        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed

        inhabilitar();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btncancelarActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed

        
        habilitar();  //llamamos al metodo a accion
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void txtprimerapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprimerapellidoActionPerformed

        txtprimerapellido.transferFocus();   // TRASFERIR AL SIGUIENTE CAMPO
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprimerapellidoActionPerformed

    private void txtsegundoapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsegundoapellidoActionPerformed

        txtsegundoapellido.transferFocus();
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsegundoapellidoActionPerformed

    private void txtprimernombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprimernombreActionPerformed

        txtprimernombre.transferFocus();
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprimernombreActionPerformed

    private void txtsegundonombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsegundonombreActionPerformed

        txtsegundonombre.transferFocus();
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsegundonombreActionPerformed

    private void txtfechadenacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfechadenacActionPerformed

        txtfechadenac.transferFocus();
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfechadenacActionPerformed

    String accion ="Insertar";
    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed

        
        // vamos a instanciar la clase que creamos anteriormente. "coneccion" la clase que contiene el metodo c
        //con el que nos conectaremos a la base de datos
     
        
        ConexionMySQL mysql = new ConexionMySQL();   // CREANDO OBJETO CON EL CONSTRUCTOR DEL CONECTOR MYSQL
                                               // objeto coneccion con el cual nos conectaremos a la base de datos
        Connection cn = mysql.Conectar();
        
                                            // ALIAS
        String ap1,ap2,nom1,nom2,fn,gen;  // capturaremos los valores y almacenaremos en cada una de estas variables
        
        String sSQL="";
        String mensaje="";
        
        ap1=txtprimerapellido.getText(); // obtener texto de esa variable
        ap2=txtsegundoapellido.getText();
        nom1=txtprimernombre.getText();
        nom2=txtsegundonombre.getText();
        fn=txtfechadenac.getText();
        gen= cbogenero.getSelectedItem().toString();   // to string para convertir el objeto a string.
        
        sSQL= "INSERT INTO datos_personales(apellido1,apellido2,nombre1,nombre2,fecha_nac,genero)"  //poner campos que tenemos que insetar (menos el campo id mp que se 

                + "VALUES(?,?,?,?,?,?) ";     // + values que son igual al numero de icognitas al numero de campos a llevar
        
        mensaje="Los datos se han insertado de manera sactisfactoria";
        
        // procedemos a insertar estos datos a la base de datos
        // utilizaremos una interface 
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);  // falta capturar el try catch para capturar el error que se genera.
            
            // ir agregando cada una de las variables, en los signos de interrogacion
            
            // enviar todos los alias a la base de datos
            
            pst.setString(1, ap1);  // en el campo1 mete el apellido 1 
            pst.setString(2, ap2);
            pst.setString(3, nom1);
            pst.setString(4, nom2);
            pst.setString(5, fn);
            pst.setString(6, gen);
            
            
            int n=pst.executeUpdate(); // devolvera el numero de campos que se llenaron
            
            if (n>0){
                
                JOptionPane.showMessageDialog(null,mensaje);
                //actualizar la base de datos
                cargartablaempleados("");
            }
                
            
            
            
            
        } catch (SQLException ex) {
            
           // Logger.getLogger(Empleados.class.getName()).log(Level.SEVERE, null, ex);
            
            // crear un alert para avizar del error. (javascript)
            
            JOptionPane.showMessageDialog(null,ex);  // mandar "ex" el mensaje de error.
            
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
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
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Empleados().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnsalir;
    private javax.swing.JComboBox cbogenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton tbnbuscar;
    private javax.swing.JTable tbnconsultaempleados;
    private javax.swing.JTextField txtfechadenac;
    private javax.swing.JTextField txtprimerapellido;
    private javax.swing.JTextField txtprimernombre;
    private javax.swing.JTextField txtsegundoapellido;
    private javax.swing.JTextField txtsegundonombre;
    // End of variables declaration//GEN-END:variables
}
