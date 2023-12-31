/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package ejemploPersistencia.vistas;

import ejemploPersistencia.models.ControladorGralModelo;
import ejemploPersistencia.models.Usuario;
import ejemploPersistencia.utils.Validacion;

/**
 *
 * @author Zeben
 * @author Lorena
 * @version 1.0
 */
public class CrearUsuario extends javax.swing.JDialog {

    Validacion validacion = new Validacion();
    PantallaPrincipal login = new PantallaPrincipal();


    public CrearUsuario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        getContentPane().setBackground(new java.awt.Color(204, 102, 255));  //color del background
        setLocationRelativeTo(null);
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
        textFieldContrasenya = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        textFieldRepetirContrasenya = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        comboBoxRol = new javax.swing.JComboBox<>();
        checkSesionIniciada = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        buttonIrAIniciarSesion = new javax.swing.JButton();
        buttonCerrarPrograma = new javax.swing.JButton();
        buttonCrearUsuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(153, 66, 0));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(89, 38, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(253, 165, 58));
        jLabel1.setText("Nuevo Usuario");

        jPanel2.setBackground(new java.awt.Color(252, 202, 70));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 66, 0), 10));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gatoSin FondoGrande.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        textFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldUsuarioActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 66, 0));
        jLabel5.setText("Contraseña");

        textFieldContrasenya.setBackground(new java.awt.Color(255, 249, 241));
        textFieldContrasenya.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textFieldContrasenya.setForeground(new java.awt.Color(89, 38, 0));
        textFieldContrasenya.setText("Escribe aquí tu contraseña");
        textFieldContrasenya.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        textFieldContrasenya.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldContrasenyaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldContrasenyaFocusLost(evt);
            }
        });
        textFieldContrasenya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldContrasenyaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 66, 0));
        jLabel7.setText("Repetir Contraseña");

        textFieldRepetirContrasenya.setBackground(new java.awt.Color(255, 249, 241));
        textFieldRepetirContrasenya.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textFieldRepetirContrasenya.setForeground(new java.awt.Color(89, 38, 0));
        textFieldRepetirContrasenya.setText("Repite aquí tu contraseña");
        textFieldRepetirContrasenya.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        textFieldRepetirContrasenya.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldRepetirContrasenyaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldRepetirContrasenyaFocusLost(evt);
            }
        });
        textFieldRepetirContrasenya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldRepetirContrasenyaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 66, 0));
        jLabel6.setText("Rol como Trabajador");

        comboBoxRol.setBackground(new java.awt.Color(255, 249, 241));
        comboBoxRol.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        comboBoxRol.setForeground(new java.awt.Color(89, 38, 0));
        comboBoxRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cocinero/a", "Camarero/a" }));
        comboBoxRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxRolActionPerformed(evt);
            }
        });

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
        jLabel4.setText("¿Ya tengo cuenta?");

        buttonIrAIniciarSesion.setBackground(new java.awt.Color(253, 165, 58));
        buttonIrAIniciarSesion.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        buttonIrAIniciarSesion.setForeground(new java.awt.Color(153, 66, 0));
        buttonIrAIniciarSesion.setText("Iniciar Sesión");
        buttonIrAIniciarSesion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonIrAIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIrAIniciarSesionActionPerformed(evt);
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

        buttonCrearUsuario.setBackground(new java.awt.Color(253, 165, 58));
        buttonCrearUsuario.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        buttonCrearUsuario.setForeground(new java.awt.Color(153, 66, 0));
        buttonCrearUsuario.setText("Crear Usuario");
        buttonCrearUsuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonCrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCrearUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(checkSesionIniciada)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(textFieldUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addComponent(textFieldContrasenya, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                .addComponent(comboBoxRol, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(textFieldRepetirContrasenya, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(buttonIrAIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 199, Short.MAX_VALUE)
                        .addComponent(buttonCerrarPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonCrearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldContrasenya, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldRepetirContrasenya, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBoxRol, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(checkSesionIniciada)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCerrarPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCrearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonIrAIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCrearUsuarioActionPerformed
        // TODO add your handling code here:
        if (validacion.validarRegistro(textFieldUsuario.getText(), textFieldContrasenya.getText(), textFieldRepetirContrasenya.getText())) {
            ControladorGralModelo registroUsuario = new ControladorGralModelo();
            Usuario usuario = new Usuario(textFieldUsuario.getText(), textFieldContrasenya.getText(), (String) comboBoxRol.getSelectedItem());
            registroUsuario.crearUsuario(usuario);
            textFieldUsuario.setText("");
            textFieldContrasenya.setText("");
            textFieldRepetirContrasenya.setText("");
        }
    }//GEN-LAST:event_buttonCrearUsuarioActionPerformed

    private void buttonCerrarProgramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCerrarProgramaActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_buttonCerrarProgramaActionPerformed

    private void textFieldContrasenyaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldContrasenyaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldContrasenyaActionPerformed

    private void textFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldUsuarioActionPerformed

    private void checkSesionIniciadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkSesionIniciadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkSesionIniciadaActionPerformed

    private void comboBoxRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxRolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxRolActionPerformed

    private void buttonIrAIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIrAIniciarSesionActionPerformed
        // TODO add your handling code here:
        dispose();
        login.setVisible(true);
    }//GEN-LAST:event_buttonIrAIniciarSesionActionPerformed

    private void textFieldRepetirContrasenyaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldRepetirContrasenyaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldRepetirContrasenyaActionPerformed

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

    private void textFieldContrasenyaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldContrasenyaFocusGained
        if (textFieldContrasenya.getText().equals("Escribe aquí tu contraseña")){
            textFieldContrasenya.setText("");
        }
    }//GEN-LAST:event_textFieldContrasenyaFocusGained

    private void textFieldContrasenyaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldContrasenyaFocusLost
        if (textFieldContrasenya.getText().isBlank()){
            textFieldContrasenya.setText("Escribe aquí tu contraseña");
        }
    }//GEN-LAST:event_textFieldContrasenyaFocusLost

    private void textFieldRepetirContrasenyaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldRepetirContrasenyaFocusGained
        if (textFieldRepetirContrasenya.getText().equals("Repite aquí tu contraseña")){
            textFieldRepetirContrasenya.setText("");
        }
    }//GEN-LAST:event_textFieldRepetirContrasenyaFocusGained

    private void textFieldRepetirContrasenyaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldRepetirContrasenyaFocusLost
        if (textFieldRepetirContrasenya.getText().isBlank()){
            textFieldRepetirContrasenya.setText("Repite aquí tu contraseña");
        }
    }//GEN-LAST:event_textFieldRepetirContrasenyaFocusLost

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCerrarPrograma;
    private javax.swing.JButton buttonCrearUsuario;
    private javax.swing.JButton buttonIrAIniciarSesion;
    private javax.swing.JCheckBox checkSesionIniciada;
    private javax.swing.JComboBox<String> comboBoxRol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField textFieldContrasenya;
    private javax.swing.JTextField textFieldRepetirContrasenya;
    private javax.swing.JTextField textFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
