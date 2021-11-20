package sistema_alumnos;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import menu_items.*;

public class AlumnosUI extends javax.swing.JFrame {
    
    Alumno_Insertar InsertarA = new Alumno_Insertar();
    Alumno_Modificar Modificar = new Alumno_Modificar();
    Alumno_Desactivar Desactivar = new Alumno_Desactivar();
    Campus_Insertar InsertarC = new Campus_Insertar();

    public AlumnosUI() {
        initComponents();
    }
    
    //Inicializar Componentes - No Modificar     
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        JMenuBar = new javax.swing.JMenuBar();
        Menu_Alumnos = new javax.swing.JMenu();
        MI_Insertar = new javax.swing.JMenuItem();
        MI_Modificar = new javax.swing.JMenuItem();
        MI_Desactivar = new javax.swing.JMenuItem();
        MI_Activos = new javax.swing.JMenuItem();
        MI_Todos = new javax.swing.JMenuItem();
        Menu_Campus = new javax.swing.JMenu();
        MI_InsertarC = new javax.swing.JMenuItem();
        Menu_Salir = new javax.swing.JMenu();
        MI_Cerrar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Alumnos");
        setResizable(false);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        Menu_Alumnos.setText("Alumnos");

        MI_Insertar.setText("Insertar");
        MI_Insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_InsertarActionPerformed(evt);
            }
        });
        Menu_Alumnos.add(MI_Insertar);

        MI_Modificar.setText("Modificar");
        MI_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_ModificarActionPerformed(evt);
            }
        });
        Menu_Alumnos.add(MI_Modificar);

        MI_Desactivar.setText("Desactivar");
        MI_Desactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_DesactivarActionPerformed(evt);
            }
        });
        Menu_Alumnos.add(MI_Desactivar);

        MI_Activos.setText("Mostrar Activos");
        MI_Activos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_ActivosActionPerformed(evt);
            }
        });
        Menu_Alumnos.add(MI_Activos);

        MI_Todos.setText("Mostrar Todos");
        MI_Todos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_TodosActionPerformed(evt);
            }
        });
        Menu_Alumnos.add(MI_Todos);

        JMenuBar.add(Menu_Alumnos);

        Menu_Campus.setText("Campus");

        MI_InsertarC.setText("Insertar");
        MI_InsertarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_InsertarCActionPerformed(evt);
            }
        });
        Menu_Campus.add(MI_InsertarC);

        JMenuBar.add(Menu_Campus);

        Menu_Salir.setText("Salir");

        MI_Cerrar.setText("Cerrar Sesion");
        MI_Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_CerrarActionPerformed(evt);
            }
        });
        Menu_Salir.add(MI_Cerrar);

        JMenuBar.add(Menu_Salir);

        setJMenuBar(JMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //Fin Inicializar Componentes

    private void MI_ActivosActionPerformed(java.awt.event.ActionEvent evt) {
        try{
            Sistema_Alumnos cn = new Sistema_Alumnos();
            cn.AlumnosActiveGetSelect();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//Mostrar Activos

    private void MI_TodosActionPerformed(java.awt.event.ActionEvent evt) {

    }//Mostrar Todos
    
    private void MI_InsertarActionPerformed(java.awt.event.ActionEvent evt) {
        InsertarA.setVisible(true);
        Modificar.setVisible(false);
        Desactivar.setVisible(false);
        InsertarC.setVisible(false);
    }//Insertar Alumno

    private void MI_CerrarActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
        LoginUI Login = new LoginUI();
        Login.setVisible(true);
    }//Cerrar Sesion

    private void MI_ModificarActionPerformed(java.awt.event.ActionEvent evt) {
        Modificar.setVisible(true);
        InsertarA.setVisible(false);
        Desactivar.setVisible(false);
        InsertarC.setVisible(false);
    }//Modificar Alumno

    private void MI_DesactivarActionPerformed(java.awt.event.ActionEvent evt) {
        Desactivar.setVisible(true);
        Modificar.setVisible(false);
        InsertarA.setVisible(false);
        InsertarC.setVisible(false);
    }//Desactivar Alumno

    private void MI_InsertarCActionPerformed(java.awt.event.ActionEvent evt) {
        InsertarC.setVisible(true);
        Modificar.setVisible(false);
        Desactivar.setVisible(false);
        InsertarA.setVisible(false);
    }//Instertar Campus

    public void CrearTabla(){
        try{
            AlumnosUI Alumnos = new AlumnosUI();
            Connection cn = MyConnection.getConnection();
            DefaultTableModel dfm = new DefaultTableModel();
            Alumnos.jTable1.setModel(dfm);
            dfm.setColumnIdentifiers(new Object[]{"ID", "Nombre", "Fecha de Creacion", "Estatus"});
            PreparedStatement pst = cn.prepareStatement("select * from Alumnos");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                dfm.addRow(new Object[]{rs.getInt("id"), rs.getString("nombre"), (rs.getDate("fechaCreacion")).toString(), rs.getInt("estatus")});
            } 
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    //Main
    public static void main(String args[]) {

        //Look and fell - No Modificar
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AlumnosUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlumnosUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlumnosUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlumnosUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        // Mostrar Form
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlumnosUI().setVisible(true);
            }
        });
    }//Fin Main

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar JMenuBar;
    private javax.swing.JMenuItem MI_Activos;
    private javax.swing.JMenuItem MI_Cerrar;
    private javax.swing.JMenuItem MI_Desactivar;
    private javax.swing.JMenuItem MI_Insertar;
    private javax.swing.JMenuItem MI_InsertarC;
    private javax.swing.JMenuItem MI_Modificar;
    private javax.swing.JMenuItem MI_Todos;
    private javax.swing.JMenu Menu_Alumnos;
    private javax.swing.JMenu Menu_Campus;
    private javax.swing.JMenu Menu_Salir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
