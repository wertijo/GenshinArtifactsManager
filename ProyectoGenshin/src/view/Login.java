package view;

import conexion.Conector;
import controller.UsuarioController;
import dao.UsuariosDAO;
import javax.swing.JOptionPane;
import modelo.Usuario;



/**
 *
 * @author Usuario
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
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
        label_usuario = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        label_contra = new javax.swing.JLabel();
        contra = new javax.swing.JPasswordField();
        boton_iniciar = new javax.swing.JToggleButton();
        boton_crear_cuenta = new javax.swing.JButton();

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

        label_usuario.setText("Usuario");
        background.add(label_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, -1, -1));
        background.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 140, -1));

        label_contra.setText("Contraseña");
        background.add(label_contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, -1, -1));
        background.add(contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 140, -1));

        boton_iniciar.setText("Login");
        boton_iniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_iniciarMouseClicked(evt);
            }
        });
        background.add(boton_iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, -1, -1));

        boton_crear_cuenta.setText("No tengo cuenta");
        boton_crear_cuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_crear_cuentaMouseClicked(evt);
            }
        });
        background.add(boton_crear_cuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 360, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void boton_iniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_iniciarMouseClicked
        
            UsuariosDAO usuarioDAO = new UsuariosDAO();    
            UsuarioController uctr = new UsuarioController(usuarioDAO);
            
            Usuario user = new Usuario();
            user.setUsuario(usuario.getText());
            user.setContrasenha(contra.getText());
        
        if(uctr.iniciarSesion(user)){
                uctr.guardarId(user);
                System.out.println("Inicio exitoso con el usuario "+ user.getUsuario());
                this.setVisible(false);
                Home home = new Home();
                home.setVisible(true);   
        } else {
            JOptionPane.showMessageDialog(this, "El usuario o contraseña son incorrectos.");
        }
    }//GEN-LAST:event_boton_iniciarMouseClicked

    private void boton_crear_cuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_crear_cuentaMouseClicked
        this.setVisible(false);
        CrearCuenta crear_cuenta = new CrearCuenta();
        crear_cuenta.setVisible(true);
    }//GEN-LAST:event_boton_crear_cuentaMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel barra_superior;
    private javax.swing.JButton boton_crear_cuenta;
    private javax.swing.JToggleButton boton_iniciar;
    private javax.swing.JPasswordField contra;
    private javax.swing.JLabel label_contra;
    private javax.swing.JLabel label_usuario;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
