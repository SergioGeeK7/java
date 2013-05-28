/*Proyecto realizado por: Alejandro Hurtado C.
 estudiante de la EAPIIS-UNAMBA 7mo S.  
 proteccion compartida por el Autor sepais valorar
 el conocimiento es libre:
 mas Videotutoriales en:http://www.portaltutoriales.com/
  Created on 13-feb-2012, 10:42:56
 */
package bibliteca;

import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class biblioteca extends javax.swing.JFrame {

    /** Creates new form biblioteca */
    public biblioteca() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrestamo = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jtxtCodPrestamo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtxtISBNPrestamo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtxtCodAlumnoPrestamo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtxtFechaPrestamo = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jtxtFechaDevolucionPrestamo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanelLibro = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jtxtISBNLibro = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jtxtTituloLibro = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jtxtAutorLibro = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jtxtEditoriallLibro = new javax.swing.JTextField();
        jtxtNropaginasLibro = new javax.swing.JTextField();
        jtxtStockLibro = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
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
        jPanel1 = new javax.swing.JPanel();
        jbtnInsertar = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelPrestamo.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel5.setText("CodPrestamo");

        jLabel6.setText("ISBN");

        jLabel7.setText("CodAlumno");

        jLabel8.setText("FechaPrestamo");

        jLabel19.setText("Fecha Devolucion");

        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Formulario de Prestamo");

        javax.swing.GroupLayout jPanelPrestamoLayout = new javax.swing.GroupLayout(jPanelPrestamo);
        jPanelPrestamo.setLayout(jPanelPrestamoLayout);
        jPanelPrestamoLayout.setHorizontalGroup(
            jPanelPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrestamoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelPrestamoLayout.createSequentialGroup()
                        .addGroup(jPanelPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel19)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtxtCodPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtISBNPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtCodAlumnoPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtFechaPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtFechaDevolucionPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanelPrestamoLayout.setVerticalGroup(
            jPanelPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrestamoLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanelPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrestamoLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrestamoLayout.createSequentialGroup()
                        .addComponent(jtxtCodPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtISBNPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtCodAlumnoPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jtxtFechaPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtFechaDevolucionPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jPanelLibro.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel9.setText("ISBN");

        jLabel10.setText("Titulo");

        jLabel11.setText("Autor");

        jLabel12.setText("Editorial");

        jLabel13.setText("Stock");

        jLabel14.setText("NroPaginas");

        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Formulario de Libro");

        javax.swing.GroupLayout jPanelLibroLayout = new javax.swing.GroupLayout(jPanelLibro);
        jPanelLibro.setLayout(jPanelLibroLayout);
        jPanelLibroLayout.setHorizontalGroup(
            jPanelLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLibroLayout.createSequentialGroup()
                .addGroup(jPanelLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLibroLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelLibroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLibroLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                .addComponent(jtxtEditoriallLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelLibroLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                                .addComponent(jtxtAutorLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLibroLayout.createSequentialGroup()
                                .addGroup(jPanelLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                                .addGroup(jPanelLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxtISBNLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtTituloLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelLibroLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                                .addComponent(jtxtStockLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelLibroLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                .addComponent(jtxtNropaginasLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanelLibroLayout.setVerticalGroup(
            jPanelLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLibroLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jtxtISBNLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jtxtTituloLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jtxtAutorLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jtxtEditoriallLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jtxtNropaginasLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jtxtStockLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        JpanelEstudiante.setBorder(new javax.swing.border.MatteBorder(null));
        JpanelEstudiante.setToolTipText("");
        JpanelEstudiante.setRequestFocusEnabled(false);

        jLabel15.setText("CodAlumno");

        jLabel16.setText("Nombres");

        jLabel17.setText("Apellidos");

        jLabel18.setText("Email");

        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Formulario de Estudiante");

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
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(JpanelEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JpanelEstudianteLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jtxtCodAlumnoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JpanelEstudianteLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jtxtEmailEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JpanelEstudianteLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(JpanelEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxtNombresEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtApellidosEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(JpanelEstudianteLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        JpanelEstudianteLayout.setVerticalGroup(
            JpanelEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelEstudianteLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        jbtnInsertar.setText("Insertar");
        jbtnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnInsertarActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Estudiante", "Libro", "Prestamo" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtnInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jbtnInsertar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanelLibro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JpanelEstudiante, javax.swing.GroupLayout.Alignment.LEADING, 0, 245, Short.MAX_VALUE)
                    .addComponent(jPanelPrestamo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JpanelEstudiante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanelLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanelPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnInsertarActionPerformed
        try {
            if (JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(null, "Desea Inserta a la tabla '" + jComboBox1.getSelectedItem().toString() + "'", "Insertar Datos", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)) {
                {
                    if (jComboBox1.getSelectedItem().equals("Estudiante")) {
                        conectar = new conexion();
                        String sentenciaSQL = "insert into estudiante values(?,?,?,?)";
                        conectar.psPrepararSentencia = conectar.conectar.prepareStatement(sentenciaSQL);
                        conectar.psPrepararSentencia.setString(1, jtxtCodAlumnoEstudiante.getText());
                        conectar.psPrepararSentencia.setString(2, jtxtNombresEstudiante.getText());
                        conectar.psPrepararSentencia.setString(3, jtxtApellidosEstudiante.getText());
                        conectar.psPrepararSentencia.setString(4, jtxtEmailEstudiante.getText());
                        conectar.psPrepararSentencia.executeUpdate();

                    } else if (jComboBox1.getSelectedItem().equals("Libro")) {
                        conectar = new conexion();
                        String sentenciaSQL = "insert into Libro values(?,?,?,?,?,?)";
                        conectar.psPrepararSentencia = conectar.conectar.prepareStatement(sentenciaSQL);
                        conectar.psPrepararSentencia.setString(1, jtxtISBNLibro.getText());
                        conectar.psPrepararSentencia.setString(2, jtxtTituloLibro.getText());
                        conectar.psPrepararSentencia.setString(3, jtxtAutorLibro.getText());
                        conectar.psPrepararSentencia.setString(4, jtxtEditoriallLibro.getText());
                        conectar.psPrepararSentencia.setString(5, jtxtNropaginasLibro.getText());
                        conectar.psPrepararSentencia.setString(6, jtxtStockLibro.getText());
                        conectar.psPrepararSentencia.executeUpdate();

                    } else if (jComboBox1.getSelectedItem().equals("Prestamo")) {
                        conectar = new conexion();
                        String sentenciaSQL = "insert into Prestamo values(?,?,?,?,?)";
                        conectar.psPrepararSentencia = conectar.conectar.prepareStatement(sentenciaSQL);
                        conectar.psPrepararSentencia.setString(1, jtxtCodPrestamo.getText());
                        conectar.psPrepararSentencia.setString(2, jtxtISBNPrestamo.getText());
                        conectar.psPrepararSentencia.setString(3, jtxtCodAlumnoPrestamo.getText());
                        conectar.psPrepararSentencia.setString(4, jtxtFechaPrestamo.getText());
                        conectar.psPrepararSentencia.setString(5, jtxtFechaDevolucionPrestamo.getText());
                        conectar.psPrepararSentencia.executeUpdate();

                    }
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_jbtnInsertarActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        if (jComboBox1.getSelectedItem().equals("Estudiante")) {
            JpanelEstudiante.setVisible(true);
            jPanelLibro.setVisible(false);
            jPanelPrestamo.setVisible(false);
            //oo9988  this.setBounds(50, 50, 450, 240);
        } else if (jComboBox1.getSelectedItem().equals("Libro")) {
            JpanelEstudiante.setVisible(false);
            jPanelLibro.setVisible(true);
            jPanelPrestamo.setVisible(false);
            this.setBounds(50, 50, 450, 240);
        } else if (jComboBox1.getSelectedItem().equals("Prestamo")) {
            JpanelEstudiante.setVisible(false);
            jPanelLibro.setVisible(false);
            jPanelPrestamo.setVisible(true);
            this.setBounds(50, 50, 450, 240);
        }

    }//GEN-LAST:event_jComboBox1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new biblioteca().setVisible(true);
            }
        });
    }
    conexion conectar;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JpanelEstudiante;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelLibro;
    private javax.swing.JPanel jPanelPrestamo;
    private javax.swing.JButton jbtnInsertar;
    private javax.swing.JTextField jtxtApellidosEstudiante;
    private javax.swing.JTextField jtxtAutorLibro;
    private javax.swing.JTextField jtxtCodAlumnoEstudiante;
    private javax.swing.JTextField jtxtCodAlumnoPrestamo;
    private javax.swing.JTextField jtxtCodPrestamo;
    private javax.swing.JTextField jtxtEditoriallLibro;
    private javax.swing.JTextField jtxtEmailEstudiante;
    private javax.swing.JTextField jtxtFechaDevolucionPrestamo;
    private javax.swing.JTextField jtxtFechaPrestamo;
    private javax.swing.JTextField jtxtISBNLibro;
    private javax.swing.JTextField jtxtISBNPrestamo;
    private javax.swing.JTextField jtxtNombresEstudiante;
    private javax.swing.JTextField jtxtNropaginasLibro;
    private javax.swing.JTextField jtxtStockLibro;
    private javax.swing.JTextField jtxtTituloLibro;
    // End of variables declaration//GEN-END:variables
}
