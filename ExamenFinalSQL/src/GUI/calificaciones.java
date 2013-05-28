/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
       

import conexion.Conector;
import conexion.ConexionMySQL;
import conexion.Eliminar;
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
public class calificaciones extends javax.swing.JFrame {
//crear modelo de la tabla
    DefaultTableModel modelo;
   
    
    
    String tabla;
    boolean asendente=true;
    public calificaciones(String tabla) {
        initComponents();
        
        // cuando cargue el formualario me cargue automaticamente los datos
        //llamamos el metodo
        
    //   cargartablaempleados("");
        
        this.tabla=tabla;
     
        
    }

    
    void cargartablaempleados (String valor){  // resivira valor para poder filtrar los datos
        
        //creacion de titulos de la tabla
        
    String [] titulos ={"codalumno","alumno","materia","nivel","nota1","nota2","notafinal","promedio"};
        
        // otro para agregar cada uno de los elementos a la tabla
        
        String [] registros = new String[8];
        
        // poner los titulos a la tabla
        
        modelo = new DefaultTableModel(null,titulos);
        
        // procedemos a hacer la coneccion con la base de datos
        
        
        //creacion del objeto del constructor conexionMYSQL
        
        ConexionMySQL mysql = new ConexionMySQL();
        
        // objeto tipo coneccion
        
        Connection cn = mysql.Conectar();
        
        // crear la consulta Mysql
        
        
        String sSQL="";
        
        
        sSQL = "SELECT * FROM calificaciones "
                + "WHERE CONCAT(codalumno,'﻿ ',alumno,'﻿ ',materia,'﻿ ',nivel,'﻿ ',nota1,'﻿ ',nota2,'﻿ ',notafinal,'﻿ ',promedio) LIKE '%"+valor+"%' ";
        
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
                
                registros[0]= rs.getString("codalumno");
                registros[1]= rs.getString("alumno");
                registros[2]= rs.getString("materia");
                registros[3]= rs.getString("nivel");
                registros[4]= rs.getString("nota1");
                registros[5]= rs.getString("nota2");
                registros[6]= rs.getString("notafinal");
                registros[7]= rs.getString("promedio");
                
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
    
    
     void excluir (String valor){  // resivira valor para poder filtrar los datos
        
        //creacion de titulos de la tabla
        
          String [] titulos ={"codalumno","alumno","materia","nivel","nota1","nota2","notafinal","promedio"};
        
        // otro para agregar cada uno de los elementos a la tabla
        
        String [] registros = new String[8];
        
        // poner los titulos a la tabla
        
        modelo = new DefaultTableModel(null,titulos);
        
        // procedemos a hacer la coneccion con la base de datos
        
        
        //creacion del objeto del constructor conexionMYSQL
        
        ConexionMySQL mysql = new ConexionMySQL();
        
        // objeto tipo coneccion
        
        Connection cn = mysql.Conectar();
        
        // crear la consulta Mysql
        
        
        String sSQL="";
        
        
    
                
        
  //select distinct autor from libros
       
       //select autor from libros group by autor;
        
        sSQL = "SELECT * FROM calificaciones "
                + "group by "+valor;
       
       
       
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
                
                registros[0]= rs.getString("codalumno");
                registros[1]= rs.getString("alumno");
                registros[2]= rs.getString("materia");
                registros[3]= rs.getString("nivel");
                registros[4]= rs.getString("nota1");
                registros[5]= rs.getString("nota2");
                registros[6]= rs.getString("notafinal");
                registros[7]= rs.getString("promedio");
                
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
    
    
    
    
    
    
            
    
    
    
    
    String id_actualizar = "";
    
  
        
        
        void ordenar (String valor){  // resivira valor para poder filtrar los datos
        
        //creacion de titulos de la tabla
        
          String [] titulos ={"codalumno","alumno","materia","nivel","nota1","nota2","notafinal","promedio"};
        
        // otro para agregar cada uno de los elementos a la tabla
        
        String [] registros = new String[8];
        
        // poner los titulos a la tabla
        
        modelo = new DefaultTableModel(null,titulos);
        
        // procedemos a hacer la coneccion con la base de datos
        
        
        //creacion del objeto del constructor conexionMYSQL
        
        ConexionMySQL mysql = new ConexionMySQL();
        
        // objeto tipo coneccion
        
        Connection cn = mysql.Conectar();
        
        // crear la consulta Mysql
        
        
        String sSQL="";
        
        
        
        if(asendente){
            sSQL = "SELECT * FROM calificaciones "
                +"ORDER BY "+valor+" ASC";
            asendente=false;
        }else{
            sSQL = "SELECT * FROM calificaciones "
                +"ORDER BY "+valor+" DESC";
            asendente=true;
        }
        
        
        
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
                
                registros[0]= rs.getString("codalumno");
                registros[1]= rs.getString("alumno");
                registros[2]= rs.getString("materia");
                registros[3]= rs.getString("nivel");
                registros[4]= rs.getString("nota1");
                registros[5]= rs.getString("nota2");
                registros[6]= rs.getString("notafinal");
                registros[7]= rs.getString("promedio");
                
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
        
      
        
        
        
    }
            
    
    void inhabilitar (){
        
      
        
        
        
        
    }
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        menueditar = new javax.swing.JMenuItem();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbnconsultaempleados = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();
        tbnbuscar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtalumno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtnivel = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtnota1 = new javax.swing.JTextField();
        labeltitle = new javax.swing.JLabel();
        tbnguardar = new javax.swing.JButton();
        tbneliminar = new javax.swing.JButton();
        tbnsalir = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtnota2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtnotafinal = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtpromedio = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtmateria = new javax.swing.JTextField();

        menueditar.setText("Modificar");
        menueditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menueditarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(menueditar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

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

        txtbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscarActionPerformed(evt);
            }
        });
        txtbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbuscarKeyTyped(evt);
            }
        });

        tbnbuscar.setText("Consultar");
        tbnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnbuscarActionPerformed(evt);
            }
        });

        jButton1.setText("Consultar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Ordenar Por");

        jButton2.setText("Consulta");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setText("Datos Unicos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 849, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbnbuscar)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbnbuscar)
                    .addComponent(jButton1)
                    .addComponent(jLabel5)
                    .addComponent(jButton2)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel1.setText("Carnet Del Alumno");

        jLabel2.setText("Alumno");

        jLabel3.setText("Nivel");

        jLabel4.setText("Nota 1");

        txtnota1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnota1ActionPerformed(evt);
            }
        });

        labeltitle.setFont(new java.awt.Font("Harlow Solid Italic", 2, 24)); // NOI18N
        labeltitle.setText("Calificaciones");

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

        tbnsalir.setText("Salir");
        tbnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnsalirActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Harlow Solid Italic", 2, 24)); // NOI18N
        jLabel8.setText("Consultas");

        jButton3.setText("Nuevo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel9.setText("Nota 2");

        txtnota2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnota2ActionPerformed(evt);
            }
        });

        jLabel10.setText("Nota Final");

        txtnotafinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnotafinalActionPerformed(evt);
            }
        });

        jLabel11.setText("Promedio");

        txtpromedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpromedioActionPerformed(evt);
            }
        });

        jLabel12.setText("Materia");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(368, 368, 368)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(labeltitle))
                            .addComponent(jLabel2)
                            .addComponent(jLabel12)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtnotafinal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtpromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtnivel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtnota1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtnota2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addComponent(tbnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tbneliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tbnsalir)))))
                .addGap(0, 306, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtmateria)
                    .addComponent(txtalumno, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                    .addComponent(txtcodigo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labeltitle)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtalumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtmateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtnota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtnota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnotafinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpromedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbneliminar)
                    .addComponent(tbnsalir)
                    .addComponent(tbnguardar)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.getAccessibleContext().setAccessibleName("Alumnos");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    String accion ="Insertar";
    private void tbnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnbuscarActionPerformed

        
        
        // capturar el valor que se digito
        
        String valor = txtbuscar.getText();
        
        // llamar el metodo y filtrar por lo que tenga la variable valor
        
        cargartablaempleados(valor);
        
        
        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_tbnbuscarActionPerformed

    private void menueditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menueditarActionPerformed

        
        // capturar cual fue la fila que se selecciono
        
        int filaselected;
        String id;
        
        
        try{
            // capturar la fila seleccionada
            filaselected=tbnconsultaempleados.getSelectedRow();
            
            // preguntar si la fila esta realmente seleccionada
            
            if(filaselected==-1){
                
                JOptionPane.showMessageDialog(null,"porfavor selecccione alguna fila");
                
                
            }else{
                
                accion="Modificar";
                
                // obtener los datos de la tabla
                // haremos un cast una convercion ()
                modelo=(DefaultTableModel)tbnconsultaempleados.getModel();
                
                // seleccionar solo la id 
                
                id=(String)modelo.getValueAt(filaselected, 0);
                
                // 0 es la primera columna de la filaseleted 
                        
                     //   buscaryeditar(id);
             
            }
            
            
        }catch(Exception ex){
            
            
        }
        
        
        
        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_menueditarActionPerformed

    private void txtnota1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnota1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnota1ActionPerformed

    private void tbnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnguardarActionPerformed

          String codigo,alumno,nivel,nota1,nota2,notafinal,promedio,materia;
        
        
       materia= txtmateria.getText();    
       codigo= txtcodigo.getText();
       alumno= txtalumno.getText();
       nivel= txtnivel.getText();
       nota1= txtnota1.getText();
       nota2= txtnota2.getText();
       notafinal= txtnotafinal.getText();
       promedio= txtpromedio.getText();
      
        Conector cn = new Conector(tabla,codigo,alumno,nivel,nota1,nota2,notafinal,promedio,materia);

    }//GEN-LAST:event_tbnguardarActionPerformed

    private void tbneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbneliminarActionPerformed

        
        
        Eliminar delete = new Eliminar(tabla,"codalumno");

        // TODO add your handling code here:
    }//GEN-LAST:event_tbneliminarActionPerformed

    private void tbnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnsalirActionPerformed

        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_tbnsalirActionPerformed

    private void txtbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        
        
        
        /*
        
        String or = txtordenar.getText();
        
        
        if(or.length()==0){
            
            JOptionPane.showMessageDialog(null,"Porfavor seleccione Columna a ordenar");
            
        }else{
             ordenar(or);
        }
        
       */
        
        
        String or = (String)(JOptionPane.showInputDialog("Ingrese Columna a Ordenar")); 
         ordenar(or);
        
        
        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        
        
     
        
         String exclu = (String)(JOptionPane.showInputDialog("Ingrese Columna Unica")); 
         excluir(exclu);
         
       /* 
        
        String exclu = txtexcluir.getText();
        
       
        if(exclu.length()==0){
            JOptionPane.showMessageDialog(null,"Porfavor Introdusca una Columna");
        }else{
             excluir(exclu);
        }*/
        
        
       
    
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtbuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyTyped

        
        
          
        
        // capturar el valor que se digito
        
        String valor = txtbuscar.getText();
        
        // llamar el metodo y filtrar por lo que tenga la variable valor
        
        cargartablaempleados(valor);
        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscarKeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        
        
        txtmateria.setText("");
        txtcodigo.setText("");
        txtalumno.setText("");
        txtnivel.setText("");
        txtnota1.setText("");
        txtnota2.setText("");
        txtnotafinal.setText("");
        txtcodigo.setText("");
        txtpromedio.setText("");
        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtnota2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnota2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnota2ActionPerformed

    private void txtnotafinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnotafinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnotafinalActionPerformed

    private void txtpromedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpromedioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpromedioActionPerformed

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
            java.util.logging.Logger.getLogger(calificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calificaciones("calificaciones").setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labeltitle;
    private javax.swing.JMenuItem menueditar;
    private javax.swing.JButton tbnbuscar;
    private javax.swing.JTable tbnconsultaempleados;
    private javax.swing.JButton tbneliminar;
    private javax.swing.JButton tbnguardar;
    private javax.swing.JButton tbnsalir;
    private javax.swing.JTextField txtalumno;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtmateria;
    private javax.swing.JTextField txtnivel;
    private javax.swing.JTextField txtnota1;
    private javax.swing.JTextField txtnota2;
    private javax.swing.JTextField txtnotafinal;
    private javax.swing.JTextField txtpromedio;
    // End of variables declaration//GEN-END:variables
}
