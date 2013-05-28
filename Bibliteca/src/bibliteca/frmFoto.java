/*Proyecto realizado por: Alejandro Hurtado C.
 estudiante de la EAPIIS-UNAMBA 7mo S.  
 proteccion compartida por el Autor sepais valorar
 el conocimiento es libre:
 mas Videotutoriales en:http://www.portaltutoriales.com/
  Created on 13-feb-2012, 10:42:56
  * update 24-jan-2013.
 */
package bibliteca;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alex
 */
public class frmFoto extends javax.swing.JFrame {

    /** Creates new form frmFoto */
    public frmFoto() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JpanelEstudiante = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jtxtCodAlumnoEstudiante = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jtxtNombresEstudiante = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jtxtApellidosEstudiante = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jtxtEmailEstudiante = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jtxtFoto = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jbtnAbrirFoto = new javax.swing.JButton();
        jpanelFoto = new javax.swing.JPanel();
        lblFoto = new javax.swing.JLabel();
        jbtnInsertarFoto = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jbtnInsertarFoto1 = new javax.swing.JButton();
        jbtnAbrirFoto1 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        JpanelEstudiante.setBorder(new javax.swing.border.MatteBorder(null));
        JpanelEstudiante.setToolTipText("");
        JpanelEstudiante.setRequestFocusEnabled(false);

        jLabel15.setText("CodAlumno");

        jLabel16.setText("Nombres");

        jLabel17.setText("Apellidos");

        jLabel18.setText("Email");

        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Formulario de Estudiante");

        jLabel19.setText("Foto");

        javax.swing.GroupLayout JpanelEstudianteLayout = new javax.swing.GroupLayout(JpanelEstudiante);
        JpanelEstudiante.setLayout(JpanelEstudianteLayout);
        JpanelEstudianteLayout.setHorizontalGroup(
            JpanelEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelEstudianteLayout.createSequentialGroup()
                .addGroup(JpanelEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JpanelEstudianteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(JpanelEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                        .addGroup(JpanelEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JpanelEstudianteLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jtxtCodAlumnoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JpanelEstudianteLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(JpanelEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxtNombresEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtApellidosEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(JpanelEstudianteLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(JpanelEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jtxtFoto, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxtEmailEstudiante, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)))))
                    .addGroup(JpanelEstudianteLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        JpanelEstudianteLayout.setVerticalGroup(
            JpanelEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelEstudianteLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(JpanelEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpanelEstudianteLayout.createSequentialGroup()
                        .addComponent(jtxtCodAlumnoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtxtNombresEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jtxtApellidosEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JpanelEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtEmailEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)))
                    .addGroup(JpanelEstudianteLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(JpanelEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addContainerGap())
        );

        jbtnAbrirFoto.setText("Cargar Foto");
        jbtnAbrirFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAbrirFotoActionPerformed(evt);
            }
        });

        jpanelFoto.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout jpanelFotoLayout = new javax.swing.GroupLayout(jpanelFoto);
        jpanelFoto.setLayout(jpanelFotoLayout);
        jpanelFotoLayout.setHorizontalGroup(
            jpanelFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelFotoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFoto, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpanelFotoLayout.setVerticalGroup(
            jpanelFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelFotoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jbtnInsertarFoto.setText("Insertar a la BD");
        jbtnInsertarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnInsertarFotoActionPerformed(evt);
            }
        });

        jButton1.setText("<-");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("<");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("->");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText(">");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jbtnInsertarFoto1.setText("Buscar");
        jbtnInsertarFoto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnInsertarFoto1ActionPerformed(evt);
            }
        });

        jbtnAbrirFoto1.setText("Nuevo");
        jbtnAbrirFoto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAbrirFoto1ActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 255));
        jLabel20.setText("Mas Proyectos con su Código Fuente en :WWW.PORTALTUTORIALES:COM");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JpanelEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jpanelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtnAbrirFoto1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtnAbrirFoto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnInsertarFoto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnInsertarFoto1))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel20))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpanelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JpanelEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton4)
                            .addComponent(jButton3)
                            .addComponent(jbtnInsertarFoto)
                            .addComponent(jbtnInsertarFoto1)
                            .addComponent(jbtnAbrirFoto))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnAbrirFoto1)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel20)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     public void mostarDatosFotos(ResultSet rsDatosFotos) throws SQLException, IOException {
        jtxtCodAlumnoEstudiante.setText(rsDatosFotos.getString(1));
        jtxtNombresEstudiante.setText(rsDatosFotos.getString(2));
        jtxtApellidosEstudiante.setText(rsDatosFotos.getString(3));
        jtxtEmailEstudiante.setText(rsDatosFotos.getString(4));
         ByteArrayOutputStream ouput=new ByteArrayOutputStream();
        InputStream isdatos=rsFotos.getBinaryStream(5);
        //convetimos a imagen de binario
        int temp=isdatos.read();
        while(temp>=0)
        {
           ouput.write((char)temp);
           temp=isdatos.read();
           
        }
        Image imagen=Toolkit.getDefaultToolkit().createImage(ouput.toByteArray());
        imagen=imagen.getScaledInstance(110, 120, 1);
        lblFoto.setIcon(new ImageIcon(imagen));
        
    }
    private void jbtnAbrirFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAbrirFotoActionPerformed
        // TODO add your handling code here:
        File archivo;
        JFileChooser flcAbrirArchivo=new JFileChooser();
        flcAbrirArchivo.setFileFilter(new FileNameExtensionFilter("Archivo de Imagen","jpg","jpeg"));
        int respuesta=flcAbrirArchivo.showOpenDialog(this);
        if(respuesta==JFileChooser.APPROVE_OPTION)
        {
            archivo=flcAbrirArchivo.getSelectedFile();
            jtxtFoto.setText(archivo.getAbsolutePath());
            Image foto=getToolkit().getImage(jtxtFoto.getText());
            foto=foto.getScaledInstance(110, 110, 1);
            lblFoto.setIcon(new ImageIcon(foto));
        }
    }//GEN-LAST:event_jbtnAbrirFotoActionPerformed

    private void jbtnInsertarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnInsertarFotoActionPerformed
            //NOTA RESULSET :conjunto de resultados de bases de datos, que normalmente es generado por la
             FileInputStream archivoFoto;
        File nombreFoto;

        try {
                  if (JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(null, "desea insertar un registro al estudiante?", "Insertar Datos", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)) {
      
           conectar=new conexion();
          // String insertFoto="update table set foto="
           String sentenciaInsert="INSERT INTO ESTUDIANTE VALUES(?,?,?,?,?)";
            conectar.psPrepararSentencia=conectar.conectar.prepareStatement(sentenciaInsert);
            nombreFoto=new File(jtxtFoto.getText());
            archivoFoto=new FileInputStream(nombreFoto);
            conectar.psPrepararSentencia.setString(1,jtxtCodAlumnoEstudiante.getText());
            conectar.psPrepararSentencia.setString(2,jtxtNombresEstudiante.getText());
            conectar.psPrepararSentencia.setString(3,jtxtApellidosEstudiante.getText());
            conectar.psPrepararSentencia.setString(4,jtxtEmailEstudiante.getText());
            conectar.psPrepararSentencia.setString(5,jtxtFoto.getText());
            
            conectar.psPrepararSentencia.setBinaryStream(5,archivoFoto,archivoFoto.available());
            conectar.psPrepararSentencia.executeUpdate();
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }         

    }//GEN-LAST:event_jbtnInsertarFotoActionPerformed

    private void jbtnInsertarFoto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnInsertarFoto1ActionPerformed
        // TODO add your handling code here:
            DefaultTableModel modeloFotos;
        try {
            conectar = new conexion();
            String codBuscar = "";
            codBuscar = JOptionPane.showInputDialog("Ingrese el codigo a Buscar: ");
            rsFotos = conectar.consulta("SELECT CodAlumno  FROM estudiante");
            boolean encontro = false;
            while (rsFotos.next()) {
                if (codBuscar.equals(rsFotos.getObject("CodAlumno"))) {
                    encontro = true;
                    break;
                }
            }
            String SQL = "SELECT * FROM estudiante where CodAlumno='" + codBuscar + "'";
            modeloFotos = conectar.retornarDatosTabla(SQL);
            jTable2.setModel(modeloFotos);
            jScrollPane2.getViewport().add(jTable2);
            if (encontro == false) {
                JOptionPane.showMessageDialog(null, "no existe Estudiante Buscado");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        
    }//GEN-LAST:event_jbtnInsertarFoto1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         try {
            rsFotos.first();
            // mostrarproductos(rsDatosProducto);
            mostarDatosFotos(rsFotos);
        } catch (Exception e) {
            System.err.println(e.getMessage().toString());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
         try {
            conectar = new conexion();

            rsFotos= conectar.consulta("SELECT *  FROM estudiante");
            rsFotos.next();
            mostarDatosFotos(rsFotos);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_formWindowOpened

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         try {
            rsFotos.next();
            mostarDatosFotos(rsFotos);
        } catch (Exception e) {
            System.err.println(e.getMessage().toString());

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         try {
            rsFotos.last();
            mostarDatosFotos(rsFotos);
        } catch (Exception e) {
            System.err.println(e.getMessage().toString());

        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jbtnAbrirFoto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAbrirFoto1ActionPerformed
        // TODO add your handling code here:
        jtxtCodAlumnoEstudiante.setText("");
        jtxtNombresEstudiante.setText("");
        jtxtApellidosEstudiante.setText("");
        jtxtEmailEstudiante.setText("");
        jtxtFoto.setText("");
        lblFoto.setIcon(null);
    }//GEN-LAST:event_jbtnAbrirFoto1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new frmFoto().setVisible(true);
            }
        });
    }
    conexion conectar;ResultSet rsFotos;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JpanelEstudiante;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton jbtnAbrirFoto;
    private javax.swing.JButton jbtnAbrirFoto1;
    private javax.swing.JButton jbtnInsertarFoto;
    private javax.swing.JButton jbtnInsertarFoto1;
    private javax.swing.JPanel jpanelFoto;
    private javax.swing.JTextField jtxtApellidosEstudiante;
    private javax.swing.JTextField jtxtCodAlumnoEstudiante;
    private javax.swing.JTextField jtxtEmailEstudiante;
    private javax.swing.JTextField jtxtFoto;
    private javax.swing.JTextField jtxtNombresEstudiante;
    private javax.swing.JLabel lblFoto;
    // End of variables declaration//GEN-END:variables

   
}
