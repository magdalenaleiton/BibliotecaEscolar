package vista;

public class VentanaPrestamos extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentanaPrestamos.class.getName());

    public VentanaPrestamos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtIdLibro = new javax.swing.JTextField();
        txtIdEstudiante = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtFechaPrestamo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtFechaDevolucion = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        btnDevolver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPrestamos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Gestión de préstamos");

        jLabel2.setText("ID del libro:");

        txtIdEstudiante.setText("ID del estudiante:");

        jLabel4.setText("Fecha de prestamo:");

        jLabel5.setText("Fecha de devolucion:");

        btnRegistrar.setText("Registrar préstamo");
        btnRegistrar.addActionListener(this::btnRegistrarActionPerformed);

        btnListar.setText("Listar préstamos");
        btnListar.addActionListener(this::btnListarActionPerformed);

        btnDevolver.setText("Registrar devolucion");
        btnDevolver.addActionListener(this::btnDevolverActionPerformed);

        tablaPrestamos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "id", "id_estudiante", "id_libro", "fecha_prestamo", "fecha_devolucion", "devuelto"
            }
        ));
        jScrollPane1.setViewportView(tablaPrestamos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRegistrar)
                        .addGap(56, 56, 56)
                        .addComponent(btnListar)
                        .addGap(70, 70, 70)
                        .addComponent(btnDevolver)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 12, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(230, 230, 230))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFechaDevolucion))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFechaPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtIdEstudiante)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdEstudiante)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtFechaPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtFechaDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnListar)
                    .addComponent(btnDevolver))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        
String idLibroTexto = txtIdLibro.getText().trim();
String idEstudianteTexto = jTextField1.getText().trim();
String fechaPrestamoTexto = txtFechaPrestamo.getText().trim();
String fechaDevolucionTexto = txtFechaDevolucion.getText().trim();

if (idLibroTexto.isEmpty() || idEstudianteTexto.isEmpty()
        || fechaPrestamoTexto.isEmpty()) {
    javax.swing.JOptionPane.showMessageDialog(this,
            "Complete el ID del libro, el ID del estudiante y la fecha del prestamo.");
    return;
}

try {
    int idLibro = Integer.parseInt(idLibroTexto);
    int idEstudiante = Integer.parseInt(idEstudianteTexto);

    java.sql.Date fechaPrestamo =
            java.sql.Date.valueOf(fechaPrestamoTexto);

    java.sql.Date fechaDevolucion = null;

    if (!fechaDevolucionTexto.isEmpty()) {
        fechaDevolucion =
                java.sql.Date.valueOf(fechaDevolucionTexto);
    }

    String sql = "INSERT INTO prestamos "
            + "(id_estudiante, id_libro, fecha_prestamo, fecha_devolucion, devuelto) "
            + "VALUES (?, ?, ?, ?, 0)";

    try (java.sql.Connection con =
            conexion.ConexionBiblioteca.getConexion();
         java.sql.PreparedStatement ps =
            con.prepareStatement(sql)) {

        ps.setInt(1, idEstudiante);
        ps.setInt(2, idLibro);
        ps.setDate(3, fechaPrestamo);
        ps.setDate(4, fechaDevolucion);

        ps.executeUpdate();

        javax.swing.JOptionPane.showMessageDialog(this,
                "Prestamo registrado correctamente.");

        txtIdLibro.setText("");
        jTextField1.setText("");
        txtFechaPrestamo.setText("");
        txtFechaDevolucion.setText("");
    }

} catch (NumberFormatException e) {
    javax.swing.JOptionPane.showMessageDialog(this,
            "Los ID deben ser numeros enteros.");
} catch (IllegalArgumentException e) {
    javax.swing.JOptionPane.showMessageDialog(this,
            "Ingrese las fechas en formato AAAA-MM-DD.");
} catch (java.sql.SQLException e) {
    javax.swing.JOptionPane.showMessageDialog(this,
            "Error al registrar el prestamo: " + e.getMessage());
}

        
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        // TODO add your handling code here:
        
javax.swing.table.DefaultTableModel modelo =
        new javax.swing.table.DefaultTableModel();

modelo.addColumn("ID");
modelo.addColumn("ID Estudiante");
modelo.addColumn("ID Libro");
modelo.addColumn("Fecha Prestamo");
modelo.addColumn("Fecha Devolucion");
modelo.addColumn("Devuelto");

String sql = "SELECT id, id_estudiante, id_libro, "
        + "fecha_prestamo, fecha_devolucion, devuelto "
        + "FROM prestamos";

try (java.sql.Connection con =
        conexion.ConexionBiblioteca.getConexion();
     java.sql.PreparedStatement ps = con.prepareStatement(sql);
     java.sql.ResultSet rs = ps.executeQuery()) {

    while (rs.next()) {
        modelo.addRow(new Object[]{
            rs.getInt("id"),
            rs.getInt("id_estudiante"),
            rs.getInt("id_libro"),
            rs.getDate("fecha_prestamo"),
            rs.getDate("fecha_devolucion"),
            rs.getInt("devuelto") == 1 ? "Si" : "No"
        });
    }

    tablaPrestamos.setModel(modelo);

} catch (java.sql.SQLException e) {
    javax.swing.JOptionPane.showMessageDialog(this,
            "Error al listar prestamos: " + e.getMessage());
}

    }//GEN-LAST:event_btnListarActionPerformed

    private void btnDevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevolverActionPerformed
        // TODO add your handling code here:
        
int fila = tablaPrestamos.getSelectedRow();

if (fila == -1) {
    javax.swing.JOptionPane.showMessageDialog(this,
            "Seleccione un prestamo de la tabla.");
    return;
}

int idPrestamo = Integer.parseInt(
        tablaPrestamos.getValueAt(fila, 0).toString());

int confirmacion = javax.swing.JOptionPane.showConfirmDialog(
        this,
        "Desea registrar la devolucion de este prestamo?",
        "Confirmar devolucion",
        javax.swing.JOptionPane.YES_NO_OPTION);

if (confirmacion != javax.swing.JOptionPane.YES_OPTION) {
    return;
}

String sql = "UPDATE prestamos SET devuelto = 1, "
        + "fecha_devolucion = CURDATE() WHERE id = ? AND devuelto = 0";

try (java.sql.Connection con =
        conexion.ConexionBiblioteca.getConexion();
     java.sql.PreparedStatement ps = con.prepareStatement(sql)) {

    ps.setInt(1, idPrestamo);

    int filasActualizadas = ps.executeUpdate();

    if (filasActualizadas > 0) {
        javax.swing.JOptionPane.showMessageDialog(this,
                "Devolucion registrada correctamente.");
        btnListar.doClick();
    } else {
        javax.swing.JOptionPane.showMessageDialog(this,
                "Este prestamo ya fue devuelto o no existe.");
    }

} catch (java.sql.SQLException e) {
    javax.swing.JOptionPane.showMessageDialog(this,
            "Error al registrar la devolucion: " + e.getMessage());
}

    }//GEN-LAST:event_btnDevolverActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new VentanaPrestamos().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDevolver;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tablaPrestamos;
    private javax.swing.JTextField txtFechaDevolucion;
    private javax.swing.JTextField txtFechaPrestamo;
    private javax.swing.JLabel txtIdEstudiante;
    private javax.swing.JTextField txtIdLibro;
    // End of variables declaration//GEN-END:variables
}
