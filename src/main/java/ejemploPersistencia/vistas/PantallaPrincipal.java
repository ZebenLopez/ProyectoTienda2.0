package ejemploPersistencia.vistas;

import java.util.Objects;
import javax.swing.JFrame;
import ejemploPersistencia.utils.Validacion;

/**
 *
 * @author Zeben
 * @author Lorena
 * @version 1.0
 */
public class PantallaPrincipal extends javax.swing.JFrame {
    Validacion validacion = new Validacion();
    static String usuario;

    public static String getUsuario() {
        return usuario;
    }

    /**
     * Creates new form PantallaPrincipal
     */
    public PantallaPrincipal() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textFieldUsuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        checkSesionIniciada = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        buttonInicioSesion = new javax.swing.JButton();
        buttonCrearUsuario = new javax.swing.JButton();
        buttonCerrarPrograma = new javax.swing.JButton();
        textFieldContrasenya = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(89, 146, 183));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(89, 38, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(253, 165, 58));
        jLabel1.setText("Iniciar Sesión");

        jPanel2.setBackground(new java.awt.Color(252, 202, 70));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 66, 0), 10));
        jPanel2.setFocusable(false);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gatoSin FondoGrande.png"))); // NOI18N
        jLabel2.setFocusable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 353, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 66, 0));
        jLabel3.setText("Nombre de Usuario");

        textFieldUsuario.setBackground(new java.awt.Color(255, 249, 241));
        textFieldUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textFieldUsuario.setForeground(new java.awt.Color(89, 38, 0));
        textFieldUsuario.setText("Escribe aquí tu usuario");
        textFieldUsuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        textFieldUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldUsuarioFocusLost(evt);
            }
        });
        textFieldUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textFieldUsuarioMouseClicked(evt);
            }
        });
        textFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldUsuarioActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 66, 0));
        jLabel5.setText("Contraseña");

        checkSesionIniciada.setBackground(new java.awt.Color(89, 38, 0));
        checkSesionIniciada.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        checkSesionIniciada.setForeground(new java.awt.Color(253, 165, 58));
        checkSesionIniciada.setText("Mantener sesión Iniciada");
        checkSesionIniciada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkSesionIniciadaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(253, 165, 58));
        jLabel4.setText("¿No tengo cuenta?");

        buttonInicioSesion.setBackground(new java.awt.Color(253, 165, 58));
        buttonInicioSesion.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        buttonInicioSesion.setForeground(new java.awt.Color(153, 66, 0));
        buttonInicioSesion.setText("Crear Usuario");
        buttonInicioSesion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonInicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCrearUserActionPerformed(evt);
            }
        });

        buttonCrearUsuario.setBackground(new java.awt.Color(253, 165, 58));
        buttonCrearUsuario.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        buttonCrearUsuario.setForeground(new java.awt.Color(153, 66, 0));
        buttonCrearUsuario.setText("Iniciar Sesión");
        buttonCrearUsuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonCrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIniciarSesionActionPerformed(evt);
            }
        });

        buttonCerrarPrograma.setBackground(new java.awt.Color(253, 165, 58));
        buttonCerrarPrograma.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        buttonCerrarPrograma.setForeground(new java.awt.Color(153, 66, 0));
        buttonCerrarPrograma.setText("Cerrar Programa");
        buttonCerrarPrograma.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonCerrarPrograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCerrarProgramaActionPerformed(evt);
            }
        });

        textFieldContrasenya.setBackground(new java.awt.Color(255, 249, 241));
        textFieldContrasenya.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textFieldContrasenya.setForeground(new java.awt.Color(89, 38, 0));
        textFieldContrasenya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldContrasenyaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5)
                                    .addComponent(checkSesionIniciada)
                                    .addComponent(textFieldUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                    .addComponent(jLabel3)
                                    .addComponent(textFieldContrasenya)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(buttonCerrarPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonCrearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(34, 34, 34))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(buttonInicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(185, 185, 185))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldContrasenya, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(checkSesionIniciada)
                        .addGap(138, 138, 138))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buttonCerrarPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonCrearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(buttonInicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textFieldUsuarioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldUsuarioMouseClicked

    private void textFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldUsuarioActionPerformed

    private void checkSesionIniciadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkSesionIniciadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkSesionIniciadaActionPerformed

    private void buttonCrearUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInicioSesionActionPerformed
        // TODO add your handling code here:
        dispose();
        CrearUsuario crearUsuario = new CrearUsuario((JFrame) this.getParent(), true);
        crearUsuario.setVisible(true);
    }//GEN-LAST:event_buttonInicioSesionActionPerformed

    private void buttonIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCrearUsuarioActionPerformed
        // TODO add your handling code here:
        String rol = "Camarero/a";
        if (validacion.validarLogin(textFieldUsuario.getText(), textFieldContrasenya.getText())) {
            if (Objects.equals(validacion.obtenerRol(textFieldUsuario.getText(), textFieldContrasenya.getText()), rol)){
                dispose();
                InterfazPrincipalCamarero camarero = new InterfazPrincipalCamarero((JFrame) this.getParent(), true);
                camarero.setVisible(true);
            } else {
                dispose();
                InterfazCocinero cocinero = new InterfazCocinero((JFrame) this.getParent(), true);
                cocinero.setVisible(true);
            }
        }
    }//GEN-LAST:event_buttonCrearUsuarioActionPerformed

    private void buttonCerrarProgramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCerrarProgramaActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_buttonCerrarProgramaActionPerformed

    private void textFieldUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldUsuarioFocusGained
        if (textFieldUsuario.getText().equals("Escribe aquí tu usuario")){
            textFieldUsuario.setText("");
        }
    }//GEN-LAST:event_textFieldUsuarioFocusGained

    private void textFieldUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldUsuarioFocusLost
        if (textFieldUsuario.getText().isBlank()){
            textFieldUsuario.setText("Escribe aquí tu usuario");
        }
    }//GEN-LAST:event_textFieldUsuarioFocusLost

    private void textFieldContrasenyaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldContrasenyaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldContrasenyaActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCerrarPrograma;
    private javax.swing.JButton buttonCrearUsuario;
    private javax.swing.JButton buttonInicioSesion;
    private javax.swing.JCheckBox checkSesionIniciada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField textFieldContrasenya;
    private javax.swing.JTextField textFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
