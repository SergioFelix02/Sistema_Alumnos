package sistema_alumnos;

import menu_items.*;

public class AlumnosUI extends javax.swing.JFrame {
    Alumno_Insertar InsertarA = new Alumno_Insertar();
    Alumno_Modificar Modificar = new Alumno_Modificar();
    Alumno_Desactivar Desactivar = new Alumno_Desactivar();
    Campus_Insertar InsertarC = new Campus_Insertar();

    public AlumnosUI() {
        initComponents();
    }
    
    // Inicializar Componentes
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        JMenuBar = new javax.swing.JMenuBar();
        MenuAlumnos = new javax.swing.JMenu();
        MI_Insertar = new javax.swing.JMenuItem();
        MI_Modificar = new javax.swing.JMenuItem();
        MI_Desactivar = new javax.swing.JMenuItem();
        MI_Activos = new javax.swing.JMenuItem();
        MI_Todos = new javax.swing.JMenuItem();
        MenuCampus = new javax.swing.JMenu();
        MI_InsertarC = new javax.swing.JMenuItem();
        MenuSalir = new javax.swing.JMenu();
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

        MenuAlumnos.setText("Alumnos");

        MI_Insertar.setText("Insertar");
        MI_Insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_InsertarActionPerformed(evt);
            }
        });
        MenuAlumnos.add(MI_Insertar);

        MI_Modificar.setText("Modificar");
        MI_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_ModificarActionPerformed(evt);
            }
        });
        MenuAlumnos.add(MI_Modificar);

        MI_Desactivar.setText("Desactivar");
        MI_Desactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_DesactivarActionPerformed(evt);
            }
        });
        MenuAlumnos.add(MI_Desactivar);

        MI_Activos.setText("Mostrar Activos");
        MI_Activos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_ActivosActionPerformed(evt);
            }
        });
        MenuAlumnos.add(MI_Activos);

        MI_Todos.setText("Mostrar Todos");
        MI_Todos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_TodosActionPerformed(evt);
            }
        });
        MenuAlumnos.add(MI_Todos);

        JMenuBar.add(MenuAlumnos);

        MenuCampus.setText("Campus");

        MI_InsertarC.setText("Insertar");
        MI_InsertarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_InsertarCActionPerformed(evt);
            }
        });
        MenuCampus.add(MI_InsertarC);

        JMenuBar.add(MenuCampus);

        MenuSalir.setText("Salir");

        MI_Cerrar.setText("Cerrar Sesion");
        MI_Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_CerrarActionPerformed(evt);
            }
        });
        MenuSalir.add(MI_Cerrar);

        JMenuBar.add(MenuSalir);

        setJMenuBar(JMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// Fin Inicializar Componentes

    private void MI_ActivosActionPerformed(java.awt.event.ActionEvent evt) {
        // Pendiente
    }// Mostrar Alumnos Activos

    private void MI_TodosActionPerformed(java.awt.event.ActionEvent evt) {
        // Pendientewdw
    }// Mostrar Todos los Alumnos

    private void MI_InsertarActionPerformed(java.awt.event.ActionEvent evt) {
        InsertarA.setVisible(true);
        Modificar.setVisible(false);
        Desactivar.setVisible(false);
        InsertarC.setVisible(false);
    }// Insertar Alumno
    
    private void MI_ModificarActionPerformed(java.awt.event.ActionEvent evt) {
        Modificar.setVisible(true);
        InsertarA.setVisible(false);
        Desactivar.setVisible(false);
        InsertarC.setVisible(false);
    }// Modificar Alumno

    private void MI_DesactivarActionPerformed(java.awt.event.ActionEvent evt) {
        Desactivar.setVisible(true);
        Modificar.setVisible(false);
        InsertarA.setVisible(false);
        InsertarC.setVisible(false);
    }// Desactivar Alumno

    private void MI_InsertarCActionPerformed(java.awt.event.ActionEvent evt) {
        InsertarC.setVisible(true);
        Modificar.setVisible(false);
        Desactivar.setVisible(false);
        InsertarA.setVisible(false);
    }// Insertar Campus
    
   
    private void MI_CerrarActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
        LoginUI Login = new LoginUI();
        Login.setVisible(true);
    }// Cerrar Sesion
    
    public static void main(String args[]) {

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

        // Mostrar Form
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlumnosUI().setVisible(true);
            }
        });
    }// Metodo Main

    // Variables 
    private javax.swing.JMenuBar JMenuBar;
    private javax.swing.JMenuItem MI_Activos;
    private javax.swing.JMenuItem MI_Cerrar;
    private javax.swing.JMenuItem MI_Desactivar;
    private javax.swing.JMenuItem MI_Insertar;
    private javax.swing.JMenuItem MI_InsertarC;
    private javax.swing.JMenuItem MI_Modificar;
    private javax.swing.JMenuItem MI_Todos;
    private javax.swing.JMenu MenuAlumnos;
    private javax.swing.JMenu MenuCampus;
    private javax.swing.JMenu MenuSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of Variables 
}
