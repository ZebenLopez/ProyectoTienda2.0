package ejemploPersistencia.vistas;

import java.awt.Frame;

/**
 *
 * @author Zeben
 * @author Lorena
 * @version 1.0
 */
public class InterfazBebidasMenu extends javax.swing.JDialog {

    /**
     * Creates new form interfazCocinero
     */
    public InterfazBebidasMenu(InterfazPrincipalCamarero parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

        private Object[] pedido;

    private void agregarProducto(String nombre, int cantidad, double precio) {

        pedido = new Object[]{nombre, cantidad, precio, cantidad * precio};
        if (cantidad != 0) {
            InterfazPrincipalCamarero.AddRowJTable(new Object[]{
                nombre,
                cantidad,
                precio,
                (cantidad * precio)
            });
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        buttonCancelarSnacks = new javax.swing.JButton();
        buttonVaciarBebida = new javax.swing.JButton();
        buttonElegirBebida = new javax.swing.JButton();
        spinnerTeHelado = new javax.swing.JSpinner();
        spinnerCappuccino = new javax.swing.JSpinner();
        spinnerChocolate = new javax.swing.JSpinner();
        spinnerCortado = new javax.swing.JSpinner();
        spinnerMocha = new javax.swing.JSpinner();
        spinnerLatte = new javax.swing.JSpinner();
        spinnerEspresso = new javax.swing.JSpinner();
        spinnerTeNegro = new javax.swing.JSpinner();
        spinnerTeVerde = new javax.swing.JSpinner();
        spinnerBatido = new javax.swing.JSpinner();
        spinnerCafeHelado = new javax.swing.JSpinner();
        spinnerCacaoLat = new javax.swing.JSpinner();
        spinnerCocaCola = new javax.swing.JSpinner();
        spinnerFrappe = new javax.swing.JSpinner();
        spinnerLimonada = new javax.swing.JSpinner();
        spinnerNestea = new javax.swing.JSpinner();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(89, 38, 0));

        buttonCancelarSnacks.setBackground(new java.awt.Color(253, 165, 58));
        buttonCancelarSnacks.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        buttonCancelarSnacks.setForeground(new java.awt.Color(153, 66, 0));
        buttonCancelarSnacks.setText("Cancelar Selección");
        buttonCancelarSnacks.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonCancelarSnacks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarSnacksActionPerformed(evt);
            }
        });

        buttonVaciarBebida.setBackground(new java.awt.Color(253, 165, 58));
        buttonVaciarBebida.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        buttonVaciarBebida.setForeground(new java.awt.Color(153, 66, 0));
        buttonVaciarBebida.setText("Vaciar Bebida(s)");
        buttonVaciarBebida.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonVaciarBebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVaciarBebidaActionPerformed(evt);
            }
        });

        buttonElegirBebida.setBackground(new java.awt.Color(255, 242, 66));
        buttonElegirBebida.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        buttonElegirBebida.setForeground(new java.awt.Color(153, 66, 0));
        buttonElegirBebida.setText("Elegir Bebida(s)");
        buttonElegirBebida.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonElegirBebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonElegirBebidaActionPerformed(evt);
            }
        });

        spinnerTeHelado.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        spinnerCappuccino.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        spinnerChocolate.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        spinnerCortado.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        spinnerMocha.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        spinnerLatte.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        spinnerEspresso.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        spinnerTeNegro.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        spinnerTeVerde.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        spinnerBatido.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        spinnerCafeHelado.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        spinnerCacaoLat.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        spinnerCocaCola.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        spinnerFrappe.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        spinnerLimonada.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        spinnerNestea.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jSeparator1.setBackground(new java.awt.Color(153, 66, 0));
        jSeparator1.setForeground(new java.awt.Color(153, 66, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(252, 202, 70));
        jLabel2.setText("Cappuccino");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(253, 165, 58));
        jLabel1.setText("Opciones Pedido:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(253, 165, 58));
        jLabel3.setText(" Agregar Bebida(s) :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(253, 165, 58));
        jLabel4.setText(" Calientes :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(253, 165, 58));
        jLabel5.setText("Frías :");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(252, 202, 70));
        jLabel6.setText("Chocolate caliente");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(252, 202, 70));
        jLabel7.setText("Cortado ");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(252, 202, 70));
        jLabel8.setText("Espresso");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(252, 202, 70));
        jLabel9.setText("Latte");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(252, 202, 70));
        jLabel10.setText("Mocha");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(252, 202, 70));
        jLabel11.setText("Té negro");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(252, 202, 70));
        jLabel12.setText("Té verde ");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(252, 202, 70));
        jLabel13.setText("Batido de frutas");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(252, 202, 70));
        jLabel14.setText("Café helado");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(252, 202, 70));
        jLabel15.setText("CacaoLat");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(252, 202, 70));
        jLabel16.setText("Coca-Cola");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(252, 202, 70));
        jLabel17.setText("Frappé");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(252, 202, 70));
        jLabel18.setText("Limonada");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(252, 202, 70));
        jLabel19.setText("Nestea");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(252, 202, 70));
        jLabel20.setText("Té helado ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(spinnerTeVerde, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spinnerTeNegro, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(spinnerCappuccino, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(spinnerCortado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(spinnerChocolate, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(spinnerEspresso, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(spinnerMocha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(spinnerLatte, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(78, 78, 78))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(234, 234, 234)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel19))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(spinnerTeHelado, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spinnerNestea, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(spinnerBatido, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(spinnerCacaoLat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(spinnerCafeHelado, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(spinnerCocaCola, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(spinnerLimonada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(spinnerFrappe, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(78, 78, 78))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonVaciarBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(buttonElegirBebida, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(buttonCancelarSnacks, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(spinnerBatido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13))
                                .addGap(18, 18, 18)
                                .addComponent(spinnerCafeHelado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spinnerCacaoLat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spinnerCocaCola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spinnerFrappe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spinnerLimonada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(spinnerNestea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spinnerTeHelado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spinnerCappuccino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spinnerChocolate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spinnerCortado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spinnerEspresso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spinnerLatte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spinnerMocha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spinnerTeNegro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spinnerTeVerde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(36, 36, 36)
                        .addComponent(buttonElegirBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(buttonCancelarSnacks, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(buttonVaciarBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonVaciarBebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVaciarBebidaActionPerformed
//BebidasCalientes
        spinnerCappuccino.setValue(0);
        spinnerChocolate.setValue(0);
        spinnerCortado.setValue(0);
        spinnerEspresso.setValue(0);
        spinnerLatte.setValue(0);
        spinnerMocha.setValue(0);
        spinnerTeNegro.setValue(0);
        spinnerTeVerde.setValue(0);
//BebidasFrias
        spinnerBatido.setValue(0);
        spinnerCafeHelado.setValue(0);
        spinnerCacaoLat.setValue(0);
        spinnerCocaCola.setValue(0);
        spinnerFrappe.setValue(0);
        spinnerLimonada.setValue(0);
        spinnerNestea.setValue(0);
        spinnerTeHelado.setValue(0);
    }//GEN-LAST:event_buttonVaciarBebidaActionPerformed

    private void buttonElegirBebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonElegirBebidaActionPerformed
        dispose();

// Bebidas Calientes
        agregarProducto("Cappuccino", (int) spinnerCappuccino.getValue(), 1.50);
        agregarProducto("Chocolate caliente", (int) spinnerChocolate.getValue(), 1.50);
        agregarProducto("Cortado", (int) spinnerCortado.getValue(), 1.00);
        agregarProducto("Espresso", (int) spinnerEspresso.getValue(), 0.80);
        agregarProducto("Latte", (int) spinnerLatte.getValue(), 1.25);
        agregarProducto("Mocha", (int) spinnerMocha.getValue(), 2.00);
        agregarProducto("Té negro", (int) spinnerTeNegro.getValue(), 1.10);
        agregarProducto("Té verde", (int) spinnerTeVerde.getValue(), 1.10);

// Bebidas Frias
        agregarProducto("Batido de frutas", (int) spinnerBatido.getValue(), 2.60);
        agregarProducto("Café helado", (int) spinnerCafeHelado.getValue(), 2.95);
        agregarProducto("CacaoLat", (int) spinnerCacaoLat.getValue(), 2.60);
        agregarProducto("Coca-Cola", (int) spinnerCocaCola.getValue(), 1.50);
        agregarProducto("Frappé", (int) spinnerFrappe.getValue(), 2.75);
        agregarProducto("Limonada", (int) spinnerLimonada.getValue(), 2.00);
        agregarProducto("Nestea", (int) spinnerNestea.getValue(), 1.80);
        agregarProducto("Té helado", (int) spinnerTeHelado.getValue(), 1.20);

    }//GEN-LAST:event_buttonElegirBebidaActionPerformed

    private void buttonCancelarSnacksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarSnacksActionPerformed
        dispose();
        //BebidasCalientes
        spinnerCappuccino.setValue(0);
        spinnerChocolate.setValue(0);
        spinnerCortado.setValue(0);
        spinnerEspresso.setValue(0);
        spinnerLatte.setValue(0);
        spinnerMocha.setValue(0);
        spinnerTeNegro.setValue(0);
        spinnerTeVerde.setValue(0);
//BebidasFrias
        spinnerBatido.setValue(0);
        spinnerCafeHelado.setValue(0);
        spinnerCacaoLat.setValue(0);
        spinnerCocaCola.setValue(0);
        spinnerFrappe.setValue(0);
        spinnerLimonada.setValue(0);
        spinnerNestea.setValue(0);
        spinnerTeHelado.setValue(0);
    }//GEN-LAST:event_buttonCancelarSnacksActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelarSnacks;
    private javax.swing.JButton buttonElegirBebida;
    private javax.swing.JButton buttonVaciarBebida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner spinnerBatido;
    private javax.swing.JSpinner spinnerCacaoLat;
    private javax.swing.JSpinner spinnerCafeHelado;
    private javax.swing.JSpinner spinnerCappuccino;
    private javax.swing.JSpinner spinnerChocolate;
    private javax.swing.JSpinner spinnerCocaCola;
    private javax.swing.JSpinner spinnerCortado;
    private javax.swing.JSpinner spinnerEspresso;
    private javax.swing.JSpinner spinnerFrappe;
    private javax.swing.JSpinner spinnerLatte;
    private javax.swing.JSpinner spinnerLimonada;
    private javax.swing.JSpinner spinnerMocha;
    private javax.swing.JSpinner spinnerNestea;
    private javax.swing.JSpinner spinnerTeHelado;
    private javax.swing.JSpinner spinnerTeNegro;
    private javax.swing.JSpinner spinnerTeVerde;
    // End of variables declaration//GEN-END:variables
}
