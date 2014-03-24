/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edd4;

import edd4.PlanDeClases.NodoClase;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author David Discua
 */
public class MASTER extends javax.swing.JFrame {

    /**
     * Creates new form MASTER
     */
    
    private PlanDeClases planTEMP;
    private PlanDeClases.NodoClase claseTEMP;
 
    private ArrayList<PlanDeClases>PLANES;
    private ArrayList<NodoClase>CLASES;
    public MASTER() {
        initComponents();
        temp = new Planes();
        clase_temp = new Clase();
        this.setLocationRelativeTo(null);
        Lista_Planes = new ArrayList();//inicializamos array
        Lista_Requisitos = new ArrayList();
//        PLANES.add(new PlanDeClases());
        CLASES = new ArrayList();
    }//fin cosntructor

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_ingresarClases = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tf_unidadClase = new javax.swing.JTextField();
        tf_codigoClase = new javax.swing.JTextField();
        tf_nombreClase = new javax.swing.JTextField();
        cb_requisitos = new javax.swing.JComboBox();
        mas = new javax.swing.JToggleButton();
        jLabel12 = new javax.swing.JLabel();
        jToggleButton3 = new javax.swing.JToggleButton();
        rb_no = new javax.swing.JRadioButton();
        rb_si = new javax.swing.JRadioButton();
        jToggleButton7 = new javax.swing.JToggleButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jd_calcular = new javax.swing.JDialog();
        jLabel11 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_clases = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jToggleButton4 = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jSeparator8 = new javax.swing.JSeparator();
        cb_agregadas = new javax.swing.JComboBox();
        agregar = new javax.swing.JToggleButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        cb_seleccionPlanes = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        remover = new javax.swing.JToggleButton();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        tf_nombrePlan = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        jToggleButton2 = new javax.swing.JToggleButton();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        cb_planesDisponibles = new javax.swing.JComboBox();
        Calcular = new javax.swing.JToggleButton();
        jPanel4 = new javax.swing.JPanel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        cb_planes = new javax.swing.JComboBox();
        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        jPanel5 = new javax.swing.JPanel();

        jd_ingresarClases.setTitle("Ingreso Clases");
        jd_ingresarClases.setMinimumSize(new java.awt.Dimension(669, 464));
        jd_ingresarClases.getContentPane().setLayout(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setText("Ingreso de Clases");
        jd_ingresarClases.getContentPane().add(jLabel5);
        jLabel5.setBounds(170, 10, 330, 50);
        jd_ingresarClases.getContentPane().add(jSeparator6);
        jSeparator6.setBounds(0, 70, 670, 2);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Nombre");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(30, 20, 120, 40);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Codigo");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(30, 80, 120, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Unidad Valorativa");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(30, 130, 130, 40);
        jPanel3.add(tf_unidadClase);
        tf_unidadClase.setBounds(170, 140, 40, 30);
        jPanel3.add(tf_codigoClase);
        tf_codigoClase.setBounds(170, 80, 70, 30);
        jPanel3.add(tf_nombreClase);
        tf_nombreClase.setBounds(170, 30, 140, 30);

        jPanel3.add(cb_requisitos);
        cb_requisitos.setBounds(170, 200, 140, 30);

        mas.setText("+");
        mas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                masMouseClicked(evt);
            }
        });
        jPanel3.add(mas);
        mas.setBounds(340, 210, 50, 20);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Clase Requisito");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(30, 190, 130, 40);

        jToggleButton3.setText("Agregar Clase");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jToggleButton3);
        jToggleButton3.setBounds(350, 70, 110, 60);

        buttonGroup1.add(rb_no);
        rb_no.setText("No");
        rb_no.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb_noMouseClicked(evt);
            }
        });
        jPanel3.add(rb_no);
        rb_no.setBounds(250, 230, 40, 23);

        buttonGroup1.add(rb_si);
        rb_si.setText("Si");
        rb_si.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_siActionPerformed(evt);
            }
        });
        jPanel3.add(rb_si);
        rb_si.setBounds(200, 230, 40, 23);

        jd_ingresarClases.getContentPane().add(jPanel3);
        jPanel3.setBounds(100, 110, 480, 260);

        jToggleButton7.setText("Salir");
        jToggleButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton7ActionPerformed(evt);
            }
        });
        jd_ingresarClases.getContentPane().add(jToggleButton7);
        jToggleButton7.setBounds(290, 390, 110, 23);

        jd_calcular.setTitle("Calcular");
        jd_calcular.setMinimumSize(new java.awt.Dimension(800, 630));
        jd_calcular.getContentPane().setLayout(null);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel11.setText("Como debe Cursarlas");
        jd_calcular.getContentPane().add(jLabel11);
        jLabel11.setBounds(210, 10, 430, 60);
        jd_calcular.getContentPane().add(jSeparator7);
        jSeparator7.setBounds(0, 80, 780, 10);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Organizacion por Periodo");
        jd_calcular.getContentPane().add(jLabel13);
        jLabel13.setBounds(550, 100, 200, 30);

        jt_clases.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Clase", "Uv"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jt_clases);

        jd_calcular.getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 280, 340, 310);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Clase");
        jd_calcular.getContentPane().add(jLabel16);
        jLabel16.setBounds(410, 270, 40, 30);

        jToggleButton4.setText("Calcular");
        jToggleButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jd_calcular.getContentPane().add(jToggleButton4);
        jToggleButton4.setBounds(380, 210, 105, 19);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jd_calcular.getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(500, 140, 280, 430);

        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator8.setAlignmentX(10.0F);
        jSeparator8.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jSeparator8.setPreferredSize(new java.awt.Dimension(30, 10));
        jd_calcular.getContentPane().add(jSeparator8);
        jSeparator8.setBounds(490, 80, 10, 530);

        jd_calcular.getContentPane().add(cb_agregadas);
        cb_agregadas.setBounds(370, 310, 110, 30);

        agregar.setText("Agregar");
        jd_calcular.getContentPane().add(agregar);
        agregar.setBounds(380, 130, 105, 23);

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Plan de Estudio");

        cb_seleccionPlanes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_seleccionPlanesActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Ingresar Clases Cursadas?");

        buttonGroup2.add(jRadioButton1);
        jRadioButton1.setText("Si");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioButton2);
        jRadioButton2.setText("No");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Seleccione Clases que ya curso");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(cb_seleccionPlanes, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_seleccionPlanes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(7, 7, 7)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jd_calcular.getContentPane().add(jPanel6);
        jPanel6.setBounds(20, 90, 340, 180);

        remover.setText("Remover");
        jd_calcular.getContentPane().add(remover);
        remover.setBounds(380, 170, 105, 23);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(760, 570));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Como llevar tus clases?");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 10, 490, 70);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 80, 760, 10);

        jPanel1.setBackground(new java.awt.Color(233, 230, 230));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(0, 320, 200, 10);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Ingresar Clases");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 80, 110, 30);
        jPanel1.add(tf_nombrePlan);
        tf_nombrePlan.setBounds(20, 270, 150, 30);

        jToggleButton1.setText("Agregar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton1);
        jToggleButton1.setBounds(50, 330, 105, 23);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Menu Plan Estudio");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 20, 150, 30);

        jToggleButton2.setText("Ingresar");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton2);
        jToggleButton2.setBounds(50, 120, 80, 23);
        jPanel1.add(jSeparator4);
        jSeparator4.setBounds(0, 60, 200, 10);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Nombre");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 230, 60, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 120, 200, 370);

        jPanel2.setBackground(new java.awt.Color(224, 218, 218));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);
        jPanel2.add(jSeparator3);
        jSeparator3.setBounds(0, 60, 200, 10);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("         Estudio");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(40, 20, 130, 30);

        jPanel2.add(cb_planesDisponibles);
        cb_planesDisponibles.setBounds(30, 100, 140, 30);

        Calcular.setBackground(new java.awt.Color(204, 204, 204));
        Calcular.setText("Calcular");
        Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularActionPerformed(evt);
            }
        });
        jPanel2.add(Calcular);
        Calcular.setBounds(50, 210, 110, 40);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(520, 120, 200, 370);

        jPanel4.setBackground(new java.awt.Color(225, 225, 225));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(null);
        jPanel4.add(jSeparator5);
        jSeparator5.setBounds(0, 60, 200, 10);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Planes de Estudio");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(40, 20, 130, 30);

        jPanel4.add(cb_planes);
        cb_planes.setBounds(30, 100, 140, 30);

        jToggleButton5.setText("Borrar");
        jPanel4.add(jToggleButton5);
        jToggleButton5.setBounds(60, 250, 70, 23);

        jToggleButton6.setText("Ver");
        jPanel4.add(jToggleButton6);
        jToggleButton6.setBounds(60, 200, 70, 23);

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 106, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 106, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel5);
        jPanel5.setBounds(40, 180, 110, 110);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(270, 120, 200, 370);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:

        if (this.getTemp().getClases().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El plan no contiene clases");
        } else if (this.tf_nombrePlan.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "El plan no tiene nombre");
        } else {
            PlanDeClases p =new PlanDeClases();
            PLANES.add(new PlanDeClases());
            Lista_Planes.add(getTemp());
            JOptionPane.showMessageDialog(this, "Plan agregado con exito");
        }


    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        //Agregar Clase al Plan

        boolean ver = false;

        if (this.getTemp().getClases().isEmpty()) {//si es diferente de 0 verificamos
            
            for (int i = 0; i < this.getTemp().getClases().size(); i++) {//inicio for

                if (this.getTemp().getClases().get(i).getNombre().equals(this.tf_nombreClase.getText())) {//fin if
                    ver = true;
                }//fin if

            }//fin for            
        }//fin if


        if (ver == false) {//sin no agregamos la calse al plan

            if (tf_nombreClase.getText().equals("")) {

                JOptionPane.showMessageDialog(jd_ingresarClases, "No se ha ingresado Nombre de la Clase");

            } else if (this.tf_codigoClase.getText().equals("")) {

                JOptionPane.showMessageDialog(jd_ingresarClases, "No se ha ingresado Codigo de la Clase");

            } else if (this.tf_unidadClase.getText().equals("")) {
                JOptionPane.showMessageDialog(jd_ingresarClases, "No se ha ingresado Unidades Valorativas");
            } else {

                this.clase_temp.setNombre(this.tf_nombreClase.getText());
                this.clase_temp.setCodigo(this.tf_codigoClase.getText());
                this.clase_temp.setUnidades(Integer.parseInt(this.tf_unidadClase.getText()));
                
                if(this.Lista_Requisitos.isEmpty()==false){
                    for (int i = 0; i <this.Lista_Requisitos.size(); i++) {
                                    
                    this.getClase_temp().setRequisitos(this.Lista_Requisitos.get(i));
                    }//fin for
                }//si no esta vacia requisitos
                this.getTemp().setClases(this.getClase_temp());
                this.cb_requisitos.addItem(this.getClase_temp());
                JOptionPane.showMessageDialog(jd_ingresarClases, "Se ha agregado la clase \n" + this.tf_nombreClase.getText());

                /*
                 * Limpar Textos
                 */
                this.tf_codigoClase.setText("");
                this.tf_nombreClase.setText("");
                this.tf_unidadClase.setText("");
                this.clase_temp = new Clase();//limpiamos memoria 
                this.Lista_Requisitos.clear();
            }



        } else {//si ya esta en la calse no ingresamos claae y mandamos mensaje al usuario

            JOptionPane.showMessageDialog(jd_ingresarClases, "Ya has ingresado esta clase anteriormente");
        }

    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jToggleButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton7ActionPerformed
        //cerrar Ingreso clases
        this.jd_ingresarClases.setVisible(false);
    }//GEN-LAST:event_jToggleButton7ActionPerformed

    private void masMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masMouseClicked
        //setear clases requisitos a mi clase temporal

        boolean ver = false;
        if (!this.Lista_Requisitos.isEmpty()) {

            for (int i = 0; i <this.Lista_Requisitos.size(); i++) {//inicio for

                if (((Clase) cb_requisitos.getSelectedItem()).getNombre().equals(this.Lista_Requisitos.get(i).getNombre())) {
                    ver = true;
                }
            }//fin for

        }

        if (ver == false) {   //agregamos a clase tem las clase de requisito

            if(this.cb_requisitos.getSelectedIndex()!=-1){
            this.Lista_Requisitos.add((Clase) this.cb_requisitos.getSelectedItem());
            JOptionPane.showMessageDialog(jd_ingresarClases, "Se ha agregado la clase "+this.cb_requisitos.getSelectedItem().toString().toUpperCase()+""
                    + " como requisito");
            }else{
                JOptionPane.showMessageDialog(jd_ingresarClases,"No existen clases para agregar aun!");
            }
        } else {

            JOptionPane.showMessageDialog(jd_ingresarClases, "Ya has ingresado esta clase como requisito");

        }//si ya la ingreso le indicamos al usuario


    }//GEN-LAST:event_masMouseClicked

    private void rb_siActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_siActionPerformed
        // TODO add your handling code here:

        if (this.rb_si.isSelected()) {

            this.cb_requisitos.setEnabled(true);
            this.mas.setEnabled(true);
        }
    }//GEN-LAST:event_rb_siActionPerformed

    private void rb_noMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_noMouseClicked
        // TODO add your handling code here:
        if (this.rb_no.isSelected()) {

            this.cb_requisitos.setEnabled(false);
            this.mas.setEnabled(false);
        }
    }//GEN-LAST:event_rb_noMouseClicked

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        // TODO add your handling code here:

        this.cb_requisitos.removeAllItems();
        this.cb_requisitos.setEnabled(false);
        this.mas.setEnabled(false);
        if (this.getTemp().getClases().isEmpty() == false) {


            for (int o = 0; o < Lista_Planes.size(); o++) {

                for (int i = 0; i < this.Lista_Planes.get(o).getClases().size(); i++) {//inicio for

                    this.cb_requisitos.addItem(this.Lista_Planes.get(i).getClases().get(i));

                }//fin for
            }//fin for planes
        }

        this.jd_ingresarClases.setModal(true);
        this.jd_ingresarClases.pack();
        this.jd_ingresarClases.setLocationRelativeTo(this);
        this.jd_ingresarClases.setVisible(true);
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void cb_seleccionPlanesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_seleccionPlanesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_seleccionPlanesActionPerformed

    private void CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularActionPerformed
        // TODO add your handling code here:
        
        
        this.jt_clases.setEnabled(false);
        this.agregar.setEnabled(false);
        this.remover.setEnabled(false);
        this.jd_calcular.setModal(true);
        this.jd_calcular.pack();
        this.jd_calcular.setLocationRelativeTo(this);
        this.jd_calcular.setVisible(true);
    }//GEN-LAST:event_CalcularActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
                this.jt_clases.setEnabled(true);
        this.agregar.setEnabled(true);
        this.remover.setEnabled(true);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
                this.jt_clases.setEnabled(false);
        this.agregar.setEnabled(false);
        this.remover.setEnabled(false);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(MASTER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MASTER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MASTER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MASTER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MASTER().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Calcular;
    private javax.swing.JToggleButton agregar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox cb_agregadas;
    private javax.swing.JComboBox cb_planes;
    private javax.swing.JComboBox cb_planesDisponibles;
    private javax.swing.JComboBox cb_requisitos;
    private javax.swing.JComboBox cb_seleccionPlanes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JDialog jd_calcular;
    private javax.swing.JDialog jd_ingresarClases;
    private javax.swing.JTable jt_clases;
    private javax.swing.JToggleButton mas;
    private javax.swing.JRadioButton rb_no;
    private javax.swing.JRadioButton rb_si;
    private javax.swing.JToggleButton remover;
    private javax.swing.JTextField tf_codigoClase;
    private javax.swing.JTextField tf_nombreClase;
    private javax.swing.JTextField tf_nombrePlan;
    private javax.swing.JTextField tf_unidadClase;
    // End of variables declaration//GEN-END:variables
    
    private ArrayList<Planes> Lista_Planes;//lista de Planes de estudio
    private Planes temp;
    private Clase clase_temp; 
    private ArrayList<Clase> Lista_Requisitos;
    private ArrayList<PlanDeClases.DependenciaClase>DEPENDENCIAS;

    public PlanDeClases getPlanTEMP() {
        return planTEMP;
    }

    public void setPlanTEMP(PlanDeClases planTEMP) {
        this.planTEMP = planTEMP;
    }

    public NodoClase getClaseTEMP() {
        return claseTEMP;
    }

    public void setClaseTEMP(NodoClase claseTEMP) {
        this.claseTEMP = claseTEMP;
    }

    
    
    public Planes getTemp() {
        return temp;
    }

    public void setTemp(Planes temp) {
        this.temp = temp;
    }

    public Clase getClase_temp() {
        return clase_temp;
    }

    public void setClase_temp(Clase clase_temp) {
        this.clase_temp = clase_temp;
    }
}//fin clase Main
