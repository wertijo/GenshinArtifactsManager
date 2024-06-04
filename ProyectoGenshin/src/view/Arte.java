package view;

import conexion.Conector;
import controller.CuentaIdController;
import dao.CuentaIdDAO;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Usuario
 */
public class Arte extends javax.swing.JFrame {

    
    /**
     * Creates new form Prueba
     */
    public Arte() {
        initComponents();
        mostrar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        barra_superior = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        barra_lateral = new javax.swing.JPanel();
        boton_cuenta = new javax.swing.JLabel();
        boton_home = new javax.swing.JLabel();
        boton_arte = new javax.swing.JLabel();
        boton_predic = new javax.swing.JLabel();
        boton_salir = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Crear_Arte = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barra_superior.setBackground(new java.awt.Color(33, 159, 166));

        titulo.setFont(new java.awt.Font("Lobster", 0, 36)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Genshin Artifacts");

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo_chiquito.jpg"))); // NOI18N

        javax.swing.GroupLayout barra_superiorLayout = new javax.swing.GroupLayout(barra_superior);
        barra_superior.setLayout(barra_superiorLayout);
        barra_superiorLayout.setHorizontalGroup(
            barra_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barra_superiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
                .addGap(119, 119, 119))
        );
        barra_superiorLayout.setVerticalGroup(
            barra_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barra_superiorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(barra_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        background.add(barra_superior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 110));

        barra_lateral.setBackground(new java.awt.Color(33, 93, 166));
        barra_lateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        boton_cuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/profile.png"))); // NOI18N
        boton_cuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_cuentaMouseClicked(evt);
            }
        });
        barra_lateral.add(boton_cuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 21, -1, -1));

        boton_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png"))); // NOI18N
        boton_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_homeMouseClicked(evt);
            }
        });
        barra_lateral.add(boton_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 87, -1, -1));

        boton_arte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/artifact.png"))); // NOI18N
        boton_arte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_arteMouseClicked(evt);
            }
        });
        barra_lateral.add(boton_arte, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 221, -1, -1));

        boton_predic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/predict.png"))); // NOI18N
        boton_predic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_predicMouseClicked(evt);
            }
        });
        barra_lateral.add(boton_predic, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 155, -1, -1));

        boton_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        boton_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_salirMouseClicked(evt);
            }
        });
        barra_lateral.add(boton_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 50, 50));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        barra_lateral.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 110, 60));
        jPanel1.getAccessibleContext().setAccessibleParent(boton_home);

        background.add(barra_lateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 110, 370));

        Crear_Arte.setText("Añadir Artefacto");
        Crear_Arte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Crear_ArteMouseClicked(evt);
            }
        });
        background.add(Crear_Arte, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 120, -1, -1));

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

        background.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, -1, 290));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void boton_homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_homeMouseClicked
        this.setVisible(false);
        Home home = new Home();
        home.setVisible(true);
    }//GEN-LAST:event_boton_homeMouseClicked

    
    private void boton_cuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_cuentaMouseClicked
        this.setVisible(false);
        Cuenta cuenta = new Cuenta();
        cuenta.setVisible(true);
    }//GEN-LAST:event_boton_cuentaMouseClicked

    private void boton_predicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_predicMouseClicked
        this.setVisible(false);
        Predic predict = new Predic();
        predict.setVisible(true);
    }//GEN-LAST:event_boton_predicMouseClicked

    private void boton_arteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_arteMouseClicked
        this.setVisible(false);
        Arte arte = new Arte();
        arte.setVisible(true);
    }//GEN-LAST:event_boton_arteMouseClicked

    private void boton_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_salirMouseClicked
        this.setVisible(false);
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_boton_salirMouseClicked

    private void Crear_ArteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Crear_ArteMouseClicked
        Creacion crear = new Creacion();
        crear.setVisible(true);
    }//GEN-LAST:event_Crear_ArteMouseClicked

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Crear_Arte;
    private javax.swing.JPanel background;
    private javax.swing.JPanel barra_lateral;
    private javax.swing.JPanel barra_superior;
    private javax.swing.JLabel boton_arte;
    private javax.swing.JLabel boton_cuenta;
    private javax.swing.JLabel boton_home;
    private javax.swing.JLabel boton_predic;
    private javax.swing.JLabel boton_salir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables

    public void mostrar() {
        String sql = "SELECT ART.ID, SETA.NOMBRE_SET, CONCAT(TPA.NOMBRE_TIPO,' ',STP.NOMBRE_STAT) FROM  ARTEFACTO AS ART "
                + "INNER JOIN SET_ARTEFACTO AS SETA ON SETA.ID = ART.ID_SET "
                + "INNER JOIN TIPO_ARTEFACTO_STAT AS TIPO ON TIPO.ID = ART.ID_TIPO_ARTEFACTO_STAT "
                + "INNER JOIN TIPO_ARTEFACTO AS TPA ON TPA.ID = TIPO.ID_TIPO_ARTEFACTO "
                + "INNER JOIN STAT_PRINCIPAL AS STP ON STP.ID = TIPO.ID_STAT_PRINCIPAL "
                + "INNER JOIN USUARIOS AS USR ON USR.ID = ART.ID_USUARIOS "
                + "WHERE USR.ID = ?";

        Conector con = new Conector();
        Connection conexion = con.conectar();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id");
        model.addColumn("Set");
        model.addColumn("Tipo Artefacto");
        jTable2.setModel(model);
        String[] datos = new String[100];

        try {

            PreparedStatement preparedStatement = conexion.prepareStatement(sql);

            //traer la cuenta logeada
            CuentaIdDAO cuentaidDAO = new CuentaIdDAO();
            CuentaIdController cid = new CuentaIdController(cuentaidDAO);

            Integer cuentaid = cid.traerCuentaId();

            preparedStatement.setInt(1, cuentaid);

            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                model.addRow(datos);

            }
        } catch (SQLException e) {
            System.out.println("Sin datos");
        }
    }
}
