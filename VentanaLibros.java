package vista;

public class VentanaLibros extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentanaLibros.class.getName());

    public VentanaLibros() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTitulo = new javax.swing.JLabel();
        txtAutor = new javax.swing.JLabel();
        txtIsbn = new javax.swing.JLabel();
        txtIdCategoria = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaLibros = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtTitulo.setText("Titulo");

        txtAutor.setText("Autor");

        txtIsbn.setText("ISBN");

        txtIdCategoria.setText("ID Categoria");

        jTextField1.addActionListener(this::jTextField1ActionPerformed);

        btnRegistrar.setText("Registrar Libro");
        btnRegistrar.addActionListener(this::btnRegistrarActionPerformed);

        btnListar.setText("Listar Libros");
        btnListar.addActionListener(this::btnListarActionPerformed);

        btnEliminar.setText("Eliminar Libro");
        btnEliminar.addActionListener(this::btnEliminarActionPerformed);

        tablaLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Titulo", "Autor", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaLibros);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtIsbn)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtTitulo)
                                        .addComponent(txtAutor)))
                                .addGap(46, 46, 46))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtIdCategoria)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField4)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRegistrar)
                        .addGap(18, 18, 18)
                        .addComponent(btnListar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)))
                .addGap(0, 61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTitulo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAutor))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIsbn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdCategoria))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnListar)
                    .addComponent(btnEliminar))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

String titulo = jTextField1.getText().trim();
String autor = jTextField2.getText().trim();
String isbn = jTextField3.getText().trim();
String textoCategoria = jTextField4.getText().trim();

if (titulo.isEmpty() || autor.isEmpty()
        || isbn.isEmpty() || textoCategoria.isEmpty()) {
    javax.swing.JOptionPane.showMessageDialog(
            this, "Complete todos los campos.");
    return;
}

int idCategoria;

try {
    idCategoria = Integer.parseInt(textoCategoria);
} catch (NumberFormatException e) {
    javax.swing.JOptionPane.showMessageDialog(
            this, "Escriba un numero valido para ID Categoria.");
    return;
}

try {
    modelo.Libro libro = new modelo.Libro(
            0, titulo, autor, isbn, idCategoria, 1, 1);

    dao.LibroDAO libroDAO = new dao.LibroDAO();

    if (libroDAO.insertar(libro)) {
        javax.swing.JOptionPane.showMessageDialog(
                this, "Libro registrado correctamente.");

        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
    } else {
    javax.swing.JOptionPane.showMessageDialog(
            this,
            "No se pudo registrar. Revisa Output de NetBeans.");
}
} catch (Exception e) {
    javax.swing.JOptionPane.showMessageDialog(
            this, "Error al registrar libro: " + e.getMessage());
}

    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        javax.swing.table.DefaultTableModel modeloTabla =
        new javax.swing.table.DefaultTableModel();

modeloTabla.addColumn("ID");
modeloTabla.addColumn("Titulo");
modeloTabla.addColumn("Autor");
modeloTabla.addColumn("ISBN");
modeloTabla.addColumn("ID Categoria");
modeloTabla.addColumn("Cantidad");
modeloTabla.addColumn("Disponibles");

try {
    dao.LibroDAO libroDAO = new dao.LibroDAO();
    java.util.List<modelo.Libro> listaLibros = libroDAO.listar();

    for (modelo.Libro libro : listaLibros) {
        modeloTabla.addRow(new Object[]{
            libro.getId(),
            libro.getTitulo(),
            libro.getAutor(),
            libro.getIsbn(),
            libro.getIdCategoria(),
            libro.getCantidad(),
            libro.getDisponibles()
        });
    }

    tablaLibros.setModel(modeloTabla);

} catch (Exception e) {
    javax.swing.JOptionPane.showMessageDialog(
            this, "Error al listar libros: " + e.getMessage());
}

    }//GEN-LAST:event_btnListarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int filaSeleccionada = tablaLibros.getSelectedRow();

if (filaSeleccionada == -1) {
    javax.swing.JOptionPane.showMessageDialog(
            this, "Seleccione un libro de la tabla.");
    return;
}

int confirmar = javax.swing.JOptionPane.showConfirmDialog(
        this,
        "Esta seguro de eliminar el libro seleccionado?",
        "Confirmar eliminacion",
        javax.swing.JOptionPane.YES_NO_OPTION
);

if (confirmar == javax.swing.JOptionPane.YES_OPTION) {
    try {
        int idLibro = Integer.parseInt(
                tablaLibros.getValueAt(filaSeleccionada, 0).toString());

        dao.LibroDAO libroDAO = new dao.LibroDAO();

        if (libroDAO.eliminar(idLibro)) {
            javax.swing.JOptionPane.showMessageDialog(
                    this, "Libro eliminado correctamente.");
            btnListar.doClick();
        } else {
            javax.swing.JOptionPane.showMessageDialog(
                    this, "No se pudo eliminar el libro.");
        }
    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(
                this, "Error al eliminar libro: " + e.getMessage());
    }
}
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new VentanaLibros().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTable tablaLibros;
    private javax.swing.JLabel txtAutor;
    private javax.swing.JLabel txtIdCategoria;
    private javax.swing.JLabel txtIsbn;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}