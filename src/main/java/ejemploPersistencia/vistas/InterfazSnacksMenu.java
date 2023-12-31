package ejemploPersistencia.vistas;

/**
 *
 * @author Zeben
 * @author Lorena
 * @version 1.0
 */
public class InterfazSnacksMenu extends javax.swing.JDialog {

    public InterfazSnacksMenu(java.awt.Frame parent, boolean modal) {
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
        buttonVaciarSnacks = new javax.swing.JButton();
        buttonElegirSnack = new javax.swing.JButton();
        spinnerCrepes = new javax.swing.JSpinner();
        spinnerCroissant = new javax.swing.JSpinner();
        spinnerDonut = new javax.swing.JSpinner();
        spinnerTartaFresa = new javax.swing.JSpinner();
        spinnerMagdalena = new javax.swing.JSpinner();
        spinnerHelado = new javax.swing.JSpinner();
        spinnerTartaQueso = new javax.swing.JSpinner();
        spinnerTortitas = new javax.swing.JSpinner();
        spinnerSerrano = new javax.swing.JSpinner();
        spinnerPata = new javax.swing.JSpinner();
        spinnerMixto = new javax.swing.JSpinner();
        spinnerPollo = new javax.swing.JSpinner();
        spinnerPapas = new javax.swing.JSpinner();
        spinnerCharcuteria = new javax.swing.JSpinner();
        spinnerQuesos = new javax.swing.JSpinner();
        spinnerTortilla = new javax.swing.JSpinner();
        jSeparator1 = new javax.swing.JSeparator();
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
        jLabel2 = new javax.swing.JLabel();
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

        buttonVaciarSnacks.setBackground(new java.awt.Color(253, 165, 58));
        buttonVaciarSnacks.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        buttonVaciarSnacks.setForeground(new java.awt.Color(153, 66, 0));
        buttonVaciarSnacks.setText("Vaciar Snack(s)");
        buttonVaciarSnacks.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonVaciarSnacks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVaciarSnacksActionPerformed(evt);
            }
        });

        buttonElegirSnack.setBackground(new java.awt.Color(255, 242, 66));
        buttonElegirSnack.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        buttonElegirSnack.setForeground(new java.awt.Color(153, 66, 0));
        buttonElegirSnack.setText("Elegir Snack(s)");
        buttonElegirSnack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonElegirSnack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonElegirSnackActionPerformed(evt);
            }
        });

        spinnerCrepes.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        spinnerCroissant.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        spinnerDonut.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        spinnerTartaFresa.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        spinnerMagdalena.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        spinnerHelado.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        spinnerTartaQueso.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        spinnerTortitas.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        spinnerSerrano.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        spinnerPata.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        spinnerMixto.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        spinnerPollo.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        spinnerPapas.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        spinnerCharcuteria.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        spinnerQuesos.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        spinnerTortilla.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jSeparator1.setBackground(new java.awt.Color(153, 66, 0));
        jSeparator1.setForeground(new java.awt.Color(153, 66, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(253, 165, 58));
        jLabel1.setText("Opciones Pedido:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(253, 165, 58));
        jLabel3.setText(" Agregar Snack(s) :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(253, 165, 58));
        jLabel4.setText(" Dulces :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(253, 165, 58));
        jLabel5.setText(" Salados :");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(252, 202, 70));
        jLabel6.setText("Croissant");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(252, 202, 70));
        jLabel7.setText("Donut");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(252, 202, 70));
        jLabel8.setText("Helado");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(252, 202, 70));
        jLabel9.setText("Magdalena");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(252, 202, 70));
        jLabel10.setText("Tarta de fresa");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(252, 202, 70));
        jLabel11.setText("Tarta de queso");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(252, 202, 70));
        jLabel2.setText("Crêpes");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(252, 202, 70));
        jLabel12.setText("Tortitas");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(252, 202, 70));
        jLabel13.setText("Bocadillo de serrano");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(252, 202, 70));
        jLabel14.setText("Bocadillo de pata");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(252, 202, 70));
        jLabel15.setText("Papas bolsa");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(252, 202, 70));
        jLabel16.setText("Sandwich de pollo");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(252, 202, 70));
        jLabel17.setText("Sandwich mixto");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(252, 202, 70));
        jLabel18.setText("Tabla charcutería");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(252, 202, 70));
        jLabel19.setText("Tabla quesos");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(252, 202, 70));
        jLabel20.setText("Tortilla");

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
                                    .addComponent(spinnerTortitas, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spinnerTartaQueso, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(spinnerCrepes, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(spinnerDonut, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(spinnerCroissant, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(spinnerHelado, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(spinnerTartaFresa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(spinnerMagdalena, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(spinnerTortilla, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spinnerQuesos, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(spinnerSerrano, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(spinnerPapas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(spinnerPata, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(spinnerPollo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(spinnerCharcuteria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(spinnerMixto, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                            .addComponent(buttonVaciarSnacks, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(buttonElegirSnack, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(buttonCancelarSnacks, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(55, Short.MAX_VALUE))
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
                                    .addComponent(spinnerSerrano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13))
                                .addGap(18, 18, 18)
                                .addComponent(spinnerPata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spinnerPapas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spinnerPollo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spinnerMixto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spinnerCharcuteria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(spinnerQuesos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spinnerTortilla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spinnerCrepes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spinnerCroissant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spinnerDonut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spinnerHelado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spinnerMagdalena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spinnerTartaFresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spinnerTartaQueso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spinnerTortitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(buttonElegirSnack, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(buttonCancelarSnacks, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(buttonVaciarSnacks, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void buttonVaciarSnacksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVaciarSnacksActionPerformed
//SanacksDulces
        spinnerCrepes.setValue(0);
        spinnerCroissant.setValue(0);
        spinnerDonut.setValue(0);
        spinnerHelado.setValue(0);
        spinnerMagdalena.setValue(0);
        spinnerTartaFresa.setValue(0);
        spinnerTartaQueso.setValue(0);
        spinnerTortitas.setValue(0);
//SnacksSalados
        spinnerSerrano.setValue(0);
        spinnerPata.setValue(0);
        spinnerPapas.setValue(0);
        spinnerPollo.setValue(0);
        spinnerMixto.setValue(0);
        spinnerCharcuteria.setValue(0);
        spinnerQuesos.setValue(0);
        spinnerTortilla.setValue(0);
    }//GEN-LAST:event_buttonVaciarSnacksActionPerformed

    private void buttonElegirSnackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonElegirSnackActionPerformed
        dispose();
//CargarTabla
//SancksDulces
        agregarProducto("Crepes", (int) spinnerCrepes.getValue(), 3.50);
        agregarProducto("Croissant", (int) spinnerCroissant.getValue(), 2.20);
        agregarProducto("Donut", (int) spinnerDonut.getValue(), 1.50);
        agregarProducto("Helado", (int) spinnerHelado.getValue(), 1.80);
        agregarProducto("Magdalena", (int) spinnerMagdalena.getValue(), 1.50);
        agregarProducto("Tarta de Fresa", (int) spinnerTartaFresa.getValue(), 1.65);
        agregarProducto("Tarta de Queso", (int) spinnerTartaQueso.getValue(), 1.85);
        agregarProducto("Tortitas", (int) spinnerTortitas.getValue(), 3.50);
        

//SnacksSalados
        agregarProducto("Bocadillo de serrano", (int) spinnerSerrano.getValue(), 3.00);
        agregarProducto("Bocadillo de pata", (int) spinnerPata.getValue(), 2.50);
        agregarProducto("Papas bolsa", (int) spinnerPapas.getValue(), 1.00);
        agregarProducto("Sandwich de pollo", (int) spinnerPollo.getValue(), 2.50);
        agregarProducto("Sandwich mixto", (int) spinnerMixto.getValue(), 1.20);
        agregarProducto("Tabla charcutería", (int) spinnerCharcuteria.getValue(), 4.00);
        agregarProducto("Tabla quesos", (int) spinnerQuesos.getValue(), 3.50);
        agregarProducto("Tortilla", (int) spinnerTortilla.getValue(), 2.00);

//SanacksDulces
        spinnerCrepes.setValue(0);
        spinnerCroissant.setValue(0);
        spinnerDonut.setValue(0);
        spinnerHelado.setValue(0);
        spinnerMagdalena.setValue(0);
        spinnerTartaFresa.setValue(0);
        spinnerTartaQueso.setValue(0);
        spinnerTortitas.setValue(0);
//SnacksSalados
        spinnerSerrano.setValue(0);
        spinnerPata.setValue(0);
        spinnerPapas.setValue(0);
        spinnerPollo.setValue(0);
        spinnerMixto.setValue(0);
        spinnerCharcuteria.setValue(0);
        spinnerQuesos.setValue(0);
        spinnerTortilla.setValue(0);


    }//GEN-LAST:event_buttonElegirSnackActionPerformed

    private void buttonCancelarSnacksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarSnacksActionPerformed
        dispose();
//SanacksDulces
        spinnerCrepes.setValue(0);
        spinnerCroissant.setValue(0);
        spinnerDonut.setValue(0);
        spinnerHelado.setValue(0);
        spinnerMagdalena.setValue(0);
        spinnerTartaFresa.setValue(0);
        spinnerTartaQueso.setValue(0);
        spinnerTortitas.setValue(0);
//SnacksSalados
        spinnerSerrano.setValue(0);
        spinnerPata.setValue(0);
        spinnerPapas.setValue(0);
        spinnerPollo.setValue(0);
        spinnerMixto.setValue(0);
        spinnerCharcuteria.setValue(0);
        spinnerQuesos.setValue(0);
        spinnerTortilla.setValue(0);
    }//GEN-LAST:event_buttonCancelarSnacksActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelarSnacks;
    private javax.swing.JButton buttonElegirSnack;
    private javax.swing.JButton buttonVaciarSnacks;
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
    private javax.swing.JSpinner spinnerCharcuteria;
    private javax.swing.JSpinner spinnerCrepes;
    private javax.swing.JSpinner spinnerCroissant;
    private javax.swing.JSpinner spinnerDonut;
    private javax.swing.JSpinner spinnerHelado;
    private javax.swing.JSpinner spinnerMagdalena;
    private javax.swing.JSpinner spinnerMixto;
    private javax.swing.JSpinner spinnerPapas;
    private javax.swing.JSpinner spinnerPata;
    private javax.swing.JSpinner spinnerPollo;
    private javax.swing.JSpinner spinnerQuesos;
    private javax.swing.JSpinner spinnerSerrano;
    private javax.swing.JSpinner spinnerTartaFresa;
    private javax.swing.JSpinner spinnerTartaQueso;
    private javax.swing.JSpinner spinnerTortilla;
    private javax.swing.JSpinner spinnerTortitas;
    // End of variables declaration//GEN-END:variables
}
