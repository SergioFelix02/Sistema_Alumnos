package menu_items;

import javax.swing.JOptionPane;
import sistema_alumnos.*;

public class Alumno_Desactivar extends javax.swing.JFrame {

    Sistema_Alumnos cn = new Sistema_Alumnos();

    public Alumno_Desactivar() {
        initComponents();
    }

    //Inicializar Componentes - No Modificar
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombre = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        txtCampus_ID = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        lblCampus_ID = new javax.swing.JLabel();
        lblNombre1 = new javax.swing.JLabel();
        txtID_Alumno = new javax.swing.JTextField();
        lblEstatus = new javax.swing.JLabel();
        txtEstatus = new javax.swing.JComboBox<>();
        txtNombre = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        lblID_Alumno = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();

        setTitle("Desactivar Alumno");
        setResizable(false);

        lblNombre.setText("Nombre:");

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        txtCampus_ID.setText(" ");
        txtCampus_ID.setEnabled(false);

        lblTitulo.setText("Datos del Alumno:");

        lblCampus_ID.setText("Campus_ID");

        lblNombre1.setText("ID_Alumno:");

        txtID_Alumno.setText(" ");

        lblEstatus.setText("Estatus");

        txtEstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        txtEstatus.setEnabled(false);

        txtNombre.setText(" ");
        txtNombre.setEnabled(false);

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        lblID_Alumno.setText("ID_Alumno:");

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema_alumnos/icon.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTitulo)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblCampus_ID)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtCampus_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblNombre)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblEstatus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEstatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblID_Alumno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtID_Alumno, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtID_Alumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblID_Alumno)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCampus_ID)
                    .addComponent(txtCampus_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstatus)
                    .addComponent(txtEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCerrar))
                .addGap(16, 16, 16))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String id = txtID_Alumno.getText().trim();
        if (id.equals("")) {
            JOptionPane.showMessageDialog(null, "Escribe un ID");
        } else {
            int id_alumno = Integer.parseInt(id);
            cn.BuscarA(id_alumno);
            if (cn.isFoundA()) {
                txtNombre.setText(cn.getNombre());
                txtCampus_ID.setText(String.valueOf(cn.getCampus_id()));
                if (cn.getEstatus() == 1) {
                    txtEstatus.setSelectedIndex(0);
                } else {
                    txtEstatus.setSelectedIndex(1);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Alumno no Encontrado");
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed
    //Fin Inicializar Componentes

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
    }

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            String id = txtID_Alumno.getText().trim();
            if (id.equals("")) {
                JOptionPane.showMessageDialog(null, "Llena todos los campos");
            } else {
                int id_alumno = Integer.parseInt(id);
                Sistema_Alumnos cn = new Sistema_Alumnos();
                cn.BuscarA(id_alumno);
                if (cn.isFoundA()) {
                    cn.Desactivar(id_alumno);
                    JOptionPane.showMessageDialog(null, "Alumno Desactivado Correctamente!");
                    txtID_Alumno.setText("");
                    txtNombre.setText("");
                    txtCampus_ID.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Alumno no encontrado");
                }
            }
            txtID_Alumno.setText("");
            txtNombre.setText("");
            txtCampus_ID.setText("");
            txtEstatus.setSelectedIndex(0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    //Main
    public static void main(String args[]) {

        //Look and feel - No Modificar
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Alumno_Desactivar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alumno_Desactivar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alumno_Desactivar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alumno_Desactivar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //Mostrar Form
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alumno_Desactivar().setVisible(true);
            }
        });
    }//Fin Main

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JLabel lblCampus_ID;
    private javax.swing.JLabel lblEstatus;
    private javax.swing.JLabel lblID_Alumno;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtCampus_ID;
    private javax.swing.JComboBox<String> txtEstatus;
    private javax.swing.JTextField txtID_Alumno;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
