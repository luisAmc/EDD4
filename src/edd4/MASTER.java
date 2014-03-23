/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edd4;

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
    public MASTER() {
        initComponents();
        temp = new Planes();
        clase_temp = new Clase();

        Lista_Planes = new ArrayList();//inicializamos array
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
        jToggleButton4 = new javax.swing.JToggleButton();
        jLabel12 = new javax.swing.JLabel();
        jToggleButton3 = new javax.swing.JToggleButton();
        rb_no = new javax.swing.JRadioButton();
        rb_si = new javax.swing.JRadioButton();
        jToggleButton7 = new javax.swing.JToggleButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
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

        jToggleButton4.setText("+");
        jToggleButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton4MouseClicked(evt);
            }
        });
        jPanel3.add(jToggleButton4);
        jToggleButton4.setBounds(340, 210, 50, 20);

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

        rb_no.setText("No");
        jPanel3.add(rb_no);
        rb_no.setBounds(250, 230, 40, 23);

        rb_si.setText("Si");
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
        jLabel3.setBounds(30, 200, 110, 30);
        jPanel1.add(tf_nombrePlan);
        tf_nombrePlan.setBounds(30, 130, 150, 30);

        jToggleButton1.setText("Agregar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton1);
        jToggleButton1.setBounds(50, 330, 105, 23);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Ingresar Plan Estudio");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 20, 150, 30);

        jToggleButton2.setText("Ingresar");
        jPanel1.add(jToggleButton2);
        jToggleButton2.setBounds(60, 250, 80, 23);
        jPanel1.add(jSeparator4);
        jSeparator4.setBounds(0, 60, 200, 10);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Nombre");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 90, 60, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 120, 200, 370);

        jPanel2.setBackground(new java.awt.Color(224, 218, 218));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);
        jPanel2.add(jSeparator3);
        jSeparator3.setBounds(0, 60, 200, 10);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Estudio");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(40, 20, 130, 30);

        jPanel2.add(cb_planesDisponibles);
        cb_planesDisponibles.setBounds(30, 100, 140, 30);

        Calcular.setBackground(new java.awt.Color(204, 204, 204));
        Calcular.setText("Calcular");
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

        if (getTemp().getClases().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El plan no contiene clases");
        } else {
            Lista_Planes.add(getTemp());
            JOptionPane.showMessageDialog(this, "Plan agregado con exito");
        }


    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        //Agregar Clase al Plan

        boolean ver = false;

        if (this.getTemp().getClases().isEmpty()) {//si es diferente de 0 verificamos

            for (int i = 0; i < this.getTemp().getClases().size(); i++) {//inicio for

                if (this.getTemp().getClases().get(i).getNombre().equals(this.tf_nombreClase.getText())) {
                    ver = true;
                }

            }//fin for


        }


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
                this.getTemp().setClases(this.getClase_temp());
                JOptionPane.showMessageDialog(jd_ingresarClases, "Se ha agregado la clase \n" + this.tf_nombreClase.getText());

                /*
                 * Limpar Textos
                 */
                this.tf_codigoClase.setText("");
                this.tf_nombreClase.setText("");
                this.tf_unidadClase.setText("");
                this.clase_temp = new Clase();//limpiamos memoria 
            }



        } else {//si ya esta en la calse no ingresamos claae y mandamos mensaje al usuario

            JOptionPane.showMessageDialog(jd_ingresarClases, "Ya has ingresado esta clase anteriormente");
        }

    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jToggleButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton7ActionPerformed
        //cerrar Ingreso clases
        this.jd_ingresarClases.setVisible(false);
    }//GEN-LAST:event_jToggleButton7ActionPerformed

    private void jToggleButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton4MouseClicked
        //setear clases requisitos a mi clase temporal

        boolean ver = false;
        if (this.getClase_temp().getRequisitos().size() != 0) {

            for (int i = 0; i < this.getClase_temp().getRequisitos().size(); i++) {//inicio for

                if (((Clase) cb_requisitos.getSelectedItem()).getNombre().equals(this.getClase_temp().getNombre())) {
                    ver = true;
                }
            }//fin for

        }

        if (ver == false) {   //agregamos a clase tem las clase de requisito

            this.clase_temp.setRequisitos((Clase) cb_requisitos.getSelectedItem());
        } else {

            JOptionPane.showMessageDialog(jd_ingresarClases, "Ya has ingresado esta clase como requisito");

        }//si ya la ingreso le indicamos al usuario


    }//GEN-LAST:event_jToggleButton4MouseClicked

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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cb_planes;
    private javax.swing.JComboBox cb_planesDisponibles;
    private javax.swing.JComboBox cb_requisitos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JDialog jd_ingresarClases;
    private javax.swing.JRadioButton rb_no;
    private javax.swing.JRadioButton rb_si;
    private javax.swing.JTextField tf_codigoClase;
    private javax.swing.JTextField tf_nombreClase;
    private javax.swing.JTextField tf_nombrePlan;
    private javax.swing.JTextField tf_unidadClase;
    // End of variables declaration//GEN-END:variables
    private ArrayList<Planes> Lista_Planes;//lista de Planes de estudio
    private Planes temp;
    private Clase clase_temp;

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
