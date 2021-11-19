
package menu_items;

import javax.swing.JOptionPane;
import sistema_alumnos.Sistema_Alumnos;

public class Alumno_Modificar extends javax.swing.JFrame {

    public Alumno_Modificar() {
        initComponents();
    }

    // Inicializar Componentes
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
        lblID_Alumno = new javax.swing.JLabel();
        txtID_Alumno = new javax.swing.JTextField();
        
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

        lblID_Alumno.setText("ID_Alumno:");

        txtID_Alumno.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblID_Alumno)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtID_Alumno))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCampus_ID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCampus_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblNombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblEstatus)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtEstatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID_Alumno)
                    .addComponent(txtID_Alumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
    }// Fin Inicializar Componentes
    
    //Boton Cerrar
    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
    }
  
    //Boton Aceptar
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
                Sistema_Alumnos cn = new Sistema_Alumnos();
                cn.BuscarA(id_alumno);
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

            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    //Metodo Main
    public static void main(String args[]) {

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

        // Mostrar Form
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alumno_Modificar().setVisible(true);
            }
        });
    }

    // Variables 
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JLabel lblCampus_ID;
    private javax.swing.JLabel lblEstatus;
    private javax.swing.JLabel lblID_Alumno;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtCampus_ID;
    private javax.swing.JComboBox<String> txtEstatus;
    private javax.swing.JTextField txtID_Alumno;
    private javax.swing.JTextField txtNombre;
    // End of Variables 
}
