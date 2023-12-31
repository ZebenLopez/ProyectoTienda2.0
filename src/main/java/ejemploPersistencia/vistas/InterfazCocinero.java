package ejemploPersistencia.vistas;

import ejemploPersistencia.controladorDatos.ControladorNumeroPedidos;
import ejemploPersistencia.controladorDatos.ControladorTablaFactura;
import ejemploPersistencia.models.ControladorGralModelo;
import ejemploPersistencia.models.Pedidos;

import javax.swing.table.DefaultTableModel;
import java.util.List;

/**
 *
 * @author Zeben
 * @author Lorena
 * @version 1.0
 */
public class InterfazCocinero extends javax.swing.JDialog {
    ControladorNumeroPedidos controladorNumeroPedidos = new ControladorNumeroPedidos();
    ControladorTablaFactura controladorTabla = new ControladorTablaFactura();


    /**
     * Creates new form interfazCocinero
     */
    public InterfazCocinero(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        scrollTablaPedido = new javax.swing.JScrollPane();
        tablePedidoDesglose = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        listPedidos = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        buttonSalirSesion = new javax.swing.JButton();
        buttonCerrarPrograma = new javax.swing.JButton();
        buttonCancelarPedido = new javax.swing.JButton();
        buttonEntregarPedido = new javax.swing.JButton();
        buttonElegirPedido = new javax.swing.JButton();
        buttonVerPedido = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(89, 38, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(253, 165, 58));
        jLabel2.setText("Pedido Nº :");

        tablePedidoDesglose.setBackground(new java.awt.Color(255, 249, 241));
        tablePedidoDesglose.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tablePedidoDesglose.setForeground(new java.awt.Color(14, 6, 0));
        tablePedidoDesglose.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                },
                new String[]{
                        "Número Pedido", "Producto", "Cantidad"
                }
        ) {
            Class[] types = new Class[]{
                    java.lang.String.class, java.lang.Boolean.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }
        });
        tablePedidoDesglose.setColumnSelectionAllowed(true);
        tablePedidoDesglose.setGridColor(new java.awt.Color(222, 218, 215));
        tablePedidoDesglose.setRowHeight(35);
        tablePedidoDesglose.setSelectionBackground(new java.awt.Color(250, 223, 152));
        tablePedidoDesglose.setSelectionForeground(new java.awt.Color(14, 6, 0));
        tablePedidoDesglose.setShowGrid(true);
        tablePedidoDesglose.getTableHeader().setReorderingAllowed(false);
        scrollTablaPedido.setViewportView(tablePedidoDesglose);
        tablePedidoDesglose.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        listPedidos.setBackground(new java.awt.Color(255, 249, 241));
        listPedidos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        listPedidos.setForeground(new java.awt.Color(14, 6, 0));
        listPedidos.setToolTipText("");
        listPedidos.setSelectionBackground(new java.awt.Color(254, 254, 249));
        listPedidos.setSelectionForeground(new java.awt.Color(14, 6, 0));
        jScrollPane1.setViewportView(listPedidos);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(253, 165, 58));
        jLabel1.setText("Pedidos Pendientes:");

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
                                .addContainerGap(566, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(buttonCerrarPrograma)
                                        .addComponent(buttonSalirSesion))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buttonCancelarPedido.setBackground(new java.awt.Color(253, 165, 58));
        buttonCancelarPedido.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        buttonCancelarPedido.setForeground(new java.awt.Color(153, 66, 0));
        buttonCancelarPedido.setText("Cancelar Pedido");
        buttonCancelarPedido.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonCancelarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarPedidoActionPerformed(evt);
            }
        });

        buttonEntregarPedido.setBackground(new java.awt.Color(253, 165, 58));
        buttonEntregarPedido.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        buttonEntregarPedido.setForeground(new java.awt.Color(153, 66, 0));
        buttonEntregarPedido.setText("Entregar Pedido");
        buttonEntregarPedido.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonEntregarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEntregarPedidoActionPerformed(evt);
            }
        });

        buttonElegirPedido.setBackground(new java.awt.Color(253, 165, 58));
        buttonElegirPedido.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        buttonElegirPedido.setForeground(new java.awt.Color(153, 66, 0));
        buttonElegirPedido.setText("Elegir Pedido");
        buttonElegirPedido.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonElegirPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonElegirPedidoActionPerformed(evt);
            }
        });

        buttonVerPedido.setBackground(new java.awt.Color(253, 165, 58));
        buttonVerPedido.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        buttonVerPedido.setForeground(new java.awt.Color(153, 66, 0));
        buttonVerPedido.setText("Actualizar Lista");
        buttonVerPedido.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonVerPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVerPedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(buttonVerPedido)
                                                .addGap(18, 18, 18)
                                                .addComponent(buttonElegirPedido))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(28, 28, 28)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(scrollTablaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel2))
                                                                .addGap(35, 35, 35))
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(buttonCancelarPedido)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(buttonEntregarPedido)
                                                                .addGap(38, 38, 38)))
                                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel1))))
                                .addGap(74, 74, 74))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(17, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(9, 9, 9)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(buttonElegirPedido)
                                                        .addComponent(buttonVerPedido)))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(scrollTablaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(buttonCancelarPedido)
                                                        .addComponent(buttonEntregarPedido)))
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 835, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_buttonCerrarProgramaActionPerformed

    private void buttonElegirPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonElegirPedidoActionPerformed
        // TODO add your handling code here:

        try {
            List<Pedidos> pedidos = controladorNumeroPedidos.listaPedidos(Integer.parseInt(listPedidos.getSelectedValue()));
            DefaultTableModel tableModel = new DefaultTableModel();
            if (pedidos.isEmpty()) {
                System.out.println("No hay pedidos");
            } else {
                tableModel.addColumn("Número Pedido");
                tableModel.addColumn("Producto");
                tableModel.addColumn("Cantidad");

                for (Pedidos pedido : pedidos) {
                    tableModel.addRow(new Object[]{pedido.getNumeroPedido(), pedido.getSnack(), pedido.getCantidad()});
                    System.out.println("Pedido: " + pedido.getNumeroPedido() + " " + pedido.getSnack() + " " + pedido.getCantidad());
                }

                tablePedidoDesglose.setModel(tableModel);
            }
        } catch (Exception e) {
            System.out.println("--> No hay pedidos disponibles");
        }
    }//GEN-LAST:event_buttonElegirPedidoActionPerformed

    private void buttonCancelarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarPedidoActionPerformed
        // TODO add your handling code here:
        ControladorGralModelo controladorGralModelo = new ControladorGralModelo();
        try {

            controladorGralModelo.borrarPedido(Integer.parseInt(listPedidos.getSelectedValue()));
            DefaultTableModel tableModel = new DefaultTableModel();
            tableModel.rowsRemoved(null);
            tablePedidoDesglose.setModel(tableModel);
            buttonVerPedidoActionPerformed(evt);

        } catch (Exception e) {
            System.out.println("--> No hay pedidos disponibles");
        }
    }//GEN-LAST:event_buttonCancelarPedidoActionPerformed

    private void buttonEntregarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEntregarPedidoActionPerformed
        // TODO add your handling code here:
        ControladorGralModelo controladorGralModelo = new ControladorGralModelo();
        try {

            controladorGralModelo.borrarPedido(Integer.parseInt(listPedidos.getSelectedValue()));
            DefaultTableModel tableModel = new DefaultTableModel();
            tableModel.rowsRemoved(null);
            tablePedidoDesglose.setModel(tableModel);
            buttonVerPedidoActionPerformed(evt);

        } catch (Exception e) {
            System.out.println("--> No hay pedidos disponibles");
        }
    }//GEN-LAST:event_buttonEntregarPedidoActionPerformed

    private void buttonVerPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVerPedidoActionPerformed
        // TODO add your handling code here:
        listPedidos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = (String[]) controladorNumeroPedidos.numeroPedidos().toArray(new String[0]);
            public int getSize() {
                return strings.length;
            }
            public String getElementAt(int i) {
                return strings[i];
            }
        });
    }//GEN-LAST:event_buttonVerPedidoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelarPedido;
    private javax.swing.JButton buttonCerrarPrograma;
    private javax.swing.JButton buttonElegirPedido;
    private javax.swing.JButton buttonEntregarPedido;
    private javax.swing.JButton buttonSalirSesion;
    private javax.swing.JButton buttonVerPedido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JList<String> listPedidos;
    private javax.swing.JScrollPane scrollTablaPedido;
    private javax.swing.JTable tablePedidoDesglose;
    // End of variables declaration//GEN-END:variables
}
