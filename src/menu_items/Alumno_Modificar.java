
package menu_items;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import sistema_alumnos.Sistema_Alumnos;

public class Alumno_Modificar extends javax.swing.JFrame {
    
    Sistema_Alumnos cn = new Sistema_Alumnos();

    public Alumno_Modificar() {
        initComponents();
    }

    //Inicializar Componentes - No Modificar
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEstatus = new javax.swing.JLabel();
        txtEstatus = new javax.swing.JComboBox<>();
        txtNombre = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        txtCampus_ID = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        lblCampus_ID = new javax.swing.JLabel();
        lblNombre1 = new javax.swing.JLabel();
        txtID_Alumno = new javax.swing.JTextField();
        lblID_Alumno = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();

        setTitle("Modificar Alumno");
        setResizable(false);

        lblEstatus.setText("Estatus");

        txtEstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));

        txtNombre.setText(" ");

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        lblNombre.setText("Nombre:");

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        txtCampus_ID.setText(" ");

        lblTitulo.setText("Datos del Alumno:");

        lblCampus_ID.setText("Campus_ID");

        lblNombre1.setText("ID_Alumno:");

        txtID_Alumno.setText(" ");

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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblID_Alumno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtID_Alumno, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblCampus_ID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblEstatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEstatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCampus_ID))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtID_Alumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblID_Alumno))
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String id = txtID_Alumno.getText().trim();
        if (id.equals("")){
                JOptionPane.showMessageDialog(null, "Escribe un ID");
        }
        else{
            int id_alumno = Integer.parseInt(id);
            cn.BuscarA(id_alumno);
            if(cn.isFoundA()){
                txtNombre.setText(cn.getNombre());
                txtCampus_ID.setText(String.valueOf(cn.getCampus_id()));
                if (cn.getEstatus() == 1){
                    txtEstatus.setSelectedIndex(0);
                }
                else{
                    txtEstatus.setSelectedIndex(1);
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Alumno no Encontrado");
            }
        }

    }//GEN-LAST:event_btnBuscarActionPerformed
    //Fin Inicializar Componentes

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
    }//Boton Cerrar                               

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {
        try{
            String id = txtID_Alumno.getText().trim();
            String nombre = txtNombre.getText().trim();
            String txtCampus = txtCampus_ID.getText().trim();
            if (id.equals("") || nombre.equals("") || txtCampus.equals("")){
                JOptionPane.showMessageDialog(null, "Llena todos los campos");
            }
            else{
                int id_alumno = Integer.parseInt(id);
                int campus_id = Integer.parseInt(txtCampus);
                cn.BuscarC(campus_id);

                int estatus = 0;
                if (txtEstatus.getSelectedItem() == "Activo"){
                    estatus = 1;
                }
                else{
                    estatus = 0;
                }
                if (cn.isFoundA() && cn.isFoundC()){
                    cn.Modificar(id_alumno, nombre, campus_id, estatus);   
                    JOptionPane.showMessageDialog(null, "Alumno Modificado Correctamente!");                
                }
                else{
                    JOptionPane.showMessageDialog(null, "Alumno o campus no encontrados");        
                }
                txtID_Alumno.setText("");
                txtNombre.setText("");
                txtCampus_ID.setText("");
                txtEstatus.setSelectedIndex(0);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//Boton Aceptar

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
            java.util.logging.Logger.getLogger(Alumno_Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alumno_Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alumno_Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alumno_Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //Mostrar Form
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alumno_Modificar().setVisible(true);
            }
        });
    }

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

    public JTextField getTxtCampus_ID() {
        return txtCampus_ID;
    }

    public JComboBox<String> getTxtEstatus() {
        return txtEstatus;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }
}
