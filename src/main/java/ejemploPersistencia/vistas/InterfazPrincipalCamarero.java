package ejemploPersistencia.vistas;

import ejemploPersistencia.controladorDatos.ControladorTablaFactura;
import ejemploPersistencia.models.ControladorGralModelo;
import ejemploPersistencia.models.Pedidos;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.security.NoSuchAlgorithmException;
import java.util.*;

/**
 *
 * @author Zeben
 * @author Lorena
 * @version 1.0
 */
public class InterfazPrincipalCamarero extends javax.swing.JDialog {

    public static DefaultTableModel tableModel;

    /**
     * Creates new form interfazCocinero
     */
    public InterfazPrincipalCamarero(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);

    }

    public static void AddRowJTable(Object[] dataRow) {
        tableModel = (DefaultTableModel) tablePedido.getModel();
        tableModel.addRow(dataRow);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        buttonSalirSesion = new javax.swing.JButton();
        buttonCerrarPrograma = new javax.swing.JButton();
        buttonBebidaFria = new javax.swing.JButton();
        buttonCancelarPedido = new javax.swing.JButton();
        buttonEnviarPedido = new javax.swing.JButton();
        buttonSnack = new javax.swing.JButton();
        scrollTablaPedido = new javax.swing.JScrollPane();
        tablePedido = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(89, 38, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(253, 165, 58));
        jLabel2.setText("Añadir al Pedido:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(253, 165, 58));
        jLabel1.setText("Pedido Actual :");

        jSeparator1.setBackground(new java.awt.Color(153, 66, 0));
        jSeparator1.setForeground(new java.awt.Color(153, 66, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(153, 66, 0));
        jPanel1.setForeground(new java.awt.Color(153, 66, 0));

        buttonSalirSesion.setBackground(new java.awt.Color(253, 165, 58));
        buttonSalirSesion.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        buttonSalirSesion.setForeground(new java.awt.Color(153, 66, 0));
        buttonSalirSesion.setText("Salir Sesión");
        buttonSalirSesion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonSalirSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalirSesionActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonCerrarPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonSalirSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(399, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCerrarPrograma)
                    .addComponent(buttonSalirSesion))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        buttonBebidaFria.setBackground(new java.awt.Color(253, 165, 58));
        buttonBebidaFria.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        buttonBebidaFria.setForeground(new java.awt.Color(153, 66, 0));
        buttonBebidaFria.setText("Bebidas");
        buttonBebidaFria.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonBebidaFria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBebidaFriaActionPerformed(evt);
            }
        });

        buttonCancelarPedido.setBackground(new java.awt.Color(253, 165, 58));
        buttonCancelarPedido.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        buttonCancelarPedido.setForeground(new java.awt.Color(153, 66, 0));
        buttonCancelarPedido.setText("Cancelar Pedido");
        buttonCancelarPedido.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        buttonEnviarPedido.setBackground(new java.awt.Color(253, 165, 58));
        buttonEnviarPedido.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        buttonEnviarPedido.setForeground(new java.awt.Color(153, 66, 0));
        buttonEnviarPedido.setText("Enviar Pedido");
        buttonEnviarPedido.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonEnviarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    buttonEnviarPedidoActionPerformed(evt);
                } catch (NoSuchAlgorithmException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        buttonSnack.setBackground(new java.awt.Color(253, 165, 58));
        buttonSnack.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        buttonSnack.setForeground(new java.awt.Color(153, 66, 0));
        buttonSnack.setText("Snacks");
        buttonSnack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonSnack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSnackActionPerformed(evt);
            }
        });

        tablePedido.setBackground(new java.awt.Color(255, 249, 241));
        tablePedido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tablePedido.setForeground(new java.awt.Color(14, 6, 0));
        tablePedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Cantidad ", "Precio Ud. (€)", "Precio Total (€)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablePedido.setColumnSelectionAllowed(true);
        tablePedido.setGridColor(new java.awt.Color(222, 218, 215));
        tablePedido.setRowHeight(35);
        tablePedido.setSelectionBackground(new java.awt.Color(250, 223, 152));
        tablePedido.setSelectionForeground(new java.awt.Color(14, 6, 0));
        tablePedido.setShowGrid(true);
        tablePedido.getTableHeader().setReorderingAllowed(false);
        scrollTablaPedido.setViewportView(tablePedido);
        tablePedido.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (tablePedido.getColumnModel().getColumnCount() > 0) {
            tablePedido.getColumnModel().getColumn(0).setResizable(false);
            tablePedido.getColumnModel().getColumn(1).setResizable(false);
            tablePedido.getColumnModel().getColumn(2).setResizable(false);
            tablePedido.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonBebidaFria, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonSnack, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(buttonCancelarPedido)
                            .addGap(18, 18, 18)
                            .addComponent(buttonEnviarPedido))
                        .addComponent(scrollTablaPedido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(44, 44, 44)
                            .addComponent(buttonSnack, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40)
                            .addComponent(buttonBebidaFria, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollTablaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonCancelarPedido)
                            .addComponent(buttonEnviarPedido))))
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 673, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSalirSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalirSesionActionPerformed
        // TODO add your handling code here:
        dispose();
        PantallaPrincipal login = new PantallaPrincipal();
        login.setVisible(true);
    }//GEN-LAST:event_buttonSalirSesionActionPerformed

    private void buttonCerrarProgramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCerrarProgramaActionPerformed
        System.exit(0);
    }//GEN-LAST:event_buttonCerrarProgramaActionPerformed

    private void buttonBebidaFriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBebidaFriaActionPerformed
        InterfazBebidasMenu bebida = new InterfazBebidasMenu(this, true);
        bebida.setVisible(true);
    }//GEN-LAST:event_buttonBebidaFriaActionPerformed

    private void buttonSnackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSnackActionPerformed
        InterfazSnacksMenu snacks = new InterfazSnacksMenu((Frame) this.getParent(), true);
        snacks.setVisible(true);
    }//GEN-LAST:event_buttonSnackActionPerformed

    private void buttonEnviarPedidoActionPerformed(java.awt.event.ActionEvent evt) throws NoSuchAlgorithmException {//GEN-FIRST:event_buttonEnviarPedidoActionPerformed
        // TODO add your handling code here:
        ControladorGralModelo controladorGralModelo = new ControladorGralModelo();

        ControladorTablaFactura controladorTabla = new ControladorTablaFactura();
        ArrayList<Pedidos> pedido = controladorTabla.recorrerTabla();

        for (Pedidos pedidos : pedido) {
            // Insertar pedidos en la base de datos
            controladorGralModelo.crearPedido(pedidos);
        }
        // Generar factura
        controladorTabla.guardarFactura();
    }//GEN-LAST:event_buttonEnviarPedidoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBebidaFria;
    private javax.swing.JButton buttonCancelarPedido;
    private javax.swing.JButton buttonCerrarPrograma;
    private javax.swing.JButton buttonEnviarPedido;
    private javax.swing.JButton buttonSalirSesion;
    private javax.swing.JButton buttonSnack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JScrollPane scrollTablaPedido;
    private static javax.swing.JTable tablePedido;
    // End of variables declaration//GEN-END:variables
}
