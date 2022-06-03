/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria.vistas;

import java.awt.BorderLayout;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import veterinaria.controlador.ClienteData;
import veterinaria.controlador.Conexion;
import veterinaria.controlador.MascotaData;
import veterinaria.controlador.TratamientoData;
import veterinaria.controlador.VisitaData;
import veterinaria.modelo.Cliente;
import veterinaria.modelo.Mascota;
import veterinaria.modelo.Tratamiento;
import veterinaria.modelo.Visita;

/**
 *
 * @author Usuario
 */
public class FormularioVisita extends javax.swing.JInternalFrame {

    /**
     * Creates new form Agregar
     */
    Conexion conexion;
    ClienteData clienteData;
    MascotaData mascotaData;
    TratamientoData tratamientoData;
    VisitaData visitaData;
    List<Mascota> mascotas;
    List<Visita> visitas = null;

    public FormularioVisita() {

        initComponents();
        jrbBaja.setEnabled(false);
        jrbAlta.setEnabled(false);
        try {
            conexion = new Conexion();
            clienteData = new ClienteData(conexion);
            tratamientoData = new TratamientoData(conexion);
            mascotaData = new MascotaData(conexion);
            visitaData = new VisitaData(conexion);
            agregarTratamientos();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FormularioVisita.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jtDni = new javax.swing.JTextField();
        jtDetalle = new javax.swing.JTextField();
        jcbActivo = new javax.swing.JCheckBox();
        btnGuardar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jcbMascota = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        jrbAlta = new javax.swing.JRadioButton();
        jrbBaja = new javax.swing.JRadioButton();
        jDate = new com.toedter.calendar.JDateChooser();
        jtPeso = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtDescripcion = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jtMedicamento = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jtImporte = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jcbTratamiento = new javax.swing.JComboBox<>();
        btnTratamiento = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(218, 229, 208));

        jPanel2.setBackground(new java.awt.Color(218, 229, 208));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));

        jtDni.setFont(new java.awt.Font("Lato", 0, 12)); // NOI18N

        jtDetalle.setFont(new java.awt.Font("Lato", 0, 12)); // NOI18N

        jcbActivo.setBackground(new java.awt.Color(218, 229, 208));
        jcbActivo.setFont(new java.awt.Font("Lato", 1, 12)); // NOI18N
        jcbActivo.setText("Activo");

        btnGuardar.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnGuardar.setText("Guardar");

        btnBorrar.setBackground(new java.awt.Color(255, 255, 255));
        btnBorrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBorrar.setText("Borrar");

        btnModificar.setBackground(new java.awt.Color(255, 255, 255));
        btnModificar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnModificar.setText("Modificar");

        btnLimpiar.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lato", 1, 12)); // NOI18N
        jLabel1.setText("PESO ACTUAL");

        jLabel2.setFont(new java.awt.Font("Lato", 1, 12)); // NOI18N
        jLabel2.setText("FECHA DE VISITA");

        jLabel6.setFont(new java.awt.Font("Lato", 1, 12)); // NOI18N
        jLabel6.setText("MASCOTA");

        jLabel7.setFont(new java.awt.Font("Lato", 1, 12)); // NOI18N
        jLabel7.setText("DNI CLIENTE");

        jLabel11.setFont(new java.awt.Font("Lato", 1, 12)); // NOI18N
        jLabel11.setText("DETALLE DE VISITA");

        jcbMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMascotaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lato", 1, 12)); // NOI18N
        jLabel4.setText("TRATAMIENTOS ACTIVOS");

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "FECHA", "TIPO DE TRATAMIENTO", "DESCRIPCION", "MEDICAMENTO", "IMPORTE"
            }
        ));
        jScrollPane1.setViewportView(jTable);

        btnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBuscar.setText("BUSCAR CLIENTE");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jrbAlta.setBackground(new java.awt.Color(218, 229, 208));
        buttonGroup1.add(jrbAlta);
        jrbAlta.setFont(new java.awt.Font("Lato", 1, 11)); // NOI18N
        jrbAlta.setText("CONTINUAR CON EL TRATAMIENTO");
        jrbAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbAltaActionPerformed(evt);
            }
        });

        jrbBaja.setBackground(new java.awt.Color(218, 229, 208));
        buttonGroup1.add(jrbBaja);
        jrbBaja.setFont(new java.awt.Font("Lato", 1, 11)); // NOI18N
        jrbBaja.setText("DAR DE BAJA EL TRATAMIENTO");
        jrbBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbBajaActionPerformed(evt);
            }
        });

        jtPeso.setFont(new java.awt.Font("Lato", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Lato", 1, 12)); // NOI18N
        jLabel5.setText("MEDICAMENTO");

        jtDescripcion.setFont(new java.awt.Font("Lato", 0, 12)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Lato", 1, 12)); // NOI18N
        jLabel12.setText("SELECCIONE  EL  TIPO  DE  TRATAMIENTO   O  AGREGUE UN NUEVO TIPO");

        jtMedicamento.setFont(new java.awt.Font("Lato", 0, 12)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Lato", 1, 12)); // NOI18N
        jLabel13.setText("DESCRIPCION");

        jLabel14.setFont(new java.awt.Font("Lato", 1, 12)); // NOI18N
        jLabel14.setText("IMPORTE");

        jtImporte.setFont(new java.awt.Font("Lato", 0, 12)); // NOI18N

        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jcbTratamiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnTratamiento.setText("Agregar nuevo");
        btnTratamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTratamientoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel7))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jcbMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jrbAlta)
                        .addGap(18, 18, 18)
                        .addComponent(jrbBaja))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(371, 371, 371)
                        .addComponent(jLabel12))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbActivo))
                        .addGap(46, 46, 46)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13)
                            .addComponent(jtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jtMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(jtImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jcbTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnTratamiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel7)
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(11, 11, 11)
                .addComponent(jLabel6)
                .addGap(3, 3, 3)
                .addComponent(jcbMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel4)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbAlta)
                    .addComponent(jrbBaja))
                .addGap(7, 7, 7)
                .addComponent(jLabel12)
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2)
                        .addGap(6, 6, 6)
                        .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel1)
                        .addGap(6, 6, 6)
                        .addComponent(jtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel11)
                        .addGap(6, 6, 6)
                        .addComponent(jtDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jcbActivo))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTratamiento))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addGap(6, 6, 6)
                        .addComponent(jtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel5)
                        .addGap(6, 6, 6)
                        .addComponent(jtMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel14)
                        .addGap(6, 6, 6)
                        .addComponent(jtImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("AngsanaUPC", 0, 40)); // NOI18N
        jLabel9.setText("VISITA DE ATENCIÓN");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/vistas/imagenes/edit.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 255, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        Cliente cliente = null;
        jcbMascota.removeAllItems();
        jrbBaja.setEnabled(false);
        jrbAlta.setEnabled(false);
        limpiar();
        try {
            int dni = Integer.parseInt(jtDni.getText());
            cliente = clienteData.buscarClienteDni(dni);
            if (!(cliente == null)) {
                mascotas = mascotaData.obtenerMascotasPorDuenio(cliente);
                agregarMascotas();
            } else {
                jcbMascota.removeAllItems();
                //cancelar=2 , no =1 , si=0
//                int confirmar = JOptionPane.showConfirmDialog(this, "Error, el dni ingresado no está registrado. ¿Desea registrarse?");
//                if (confirmar == 0) {
//                   
//                    FormularioCliente agregarc = new FormularioCliente();
//                    agregarc.setVisible(true);
//                    this.setVisible(false);
//                }
            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jcbMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMascotaActionPerformed

        try {
            cargarTabla();
        } catch (Exception e) {

        }
    }//GEN-LAST:event_jcbMascotaActionPerformed

    private void jrbBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbBajaActionPerformed
        if (jrbBaja.isSelected()) {

        }
    }//GEN-LAST:event_jrbBajaActionPerformed

    private void jrbAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbAltaActionPerformed
        if (jrbAlta.isSelected()) {
            try {
                //guardo la posicion que esta seleccionada en la fila
                int posicionFila = jTable.getSelectedRow();
                Tratamiento ts = visitas.get(posicionFila).getTratamiento();
//                jtTipo.setText(ts.getTipoTratamiento());
                jtDescripcion.setText(ts.getDescripcion());
                jtMedicamento.setText(ts.getMedicamento());
                jtImporte.setText(ts.getImporte() + "");

            } catch (Exception e) {
                System.out.println("Tiene que seleccionar una fila de la tabla primero");
            }
        }
    }//GEN-LAST:event_jrbAltaActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnTratamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTratamientoActionPerformed
        String respuesta = JOptionPane.showInputDialog("Ingrese un tratamiento");
        jcbTratamiento.addItem(respuesta);
    }//GEN-LAST:event_btnTratamientoActionPerformed

    public void agregarMascotas() {
        if (mascotas != null) {
            for (Mascota it : mascotas) {
                jcbMascota.addItem(it);
            }
        }

    }

    public void agregarTratamientos() {
        {
            jcbTratamiento.addItem("vacunación");
            jcbTratamiento.addItem("enfermedad");
            jcbTratamiento.addItem("curaciones");
            jcbTratamiento.addItem("baño y corte de pelo");
            jcbTratamiento.addItem("castración");
            jcbTratamiento.addItem("desparasitación");
        }
    }

    public void cargarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) jTable.getModel();
        modelo.setRowCount(0);
        Mascota m = (Mascota) jcbMascota.getSelectedItem();
        visitas = visitaData.obtenerVisitasxMascotaEActivo(m.getIdMascota());
        if (visitas != null) {
            jrbBaja.setEnabled(true);
            jrbAlta.setEnabled(true);
            for (Visita it : visitas) {
                modelo.addRow(new Object[]{it.getFechaVisita(), it.getTratamiento().getTipoTratamiento(), it.getTratamiento().getDescripcion(), it.getTratamiento().getMedicamento(), it.getTratamiento().getImporte()});
            }
            jTable.setModel(modelo);
        }
    }

    public void limpiar() {
//           jtTipo.setText("");
        jtDescripcion.setText("");
        jtMedicamento.setText("");
        jtImporte.setText("");

        jtPeso.setText("");
        jtDetalle.setText("");
        jcbActivo.setSelected(false);
        jDate.setDate(null);
        buttonGroup1.clearSelection();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnTratamiento;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser jDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable;
    private javax.swing.JCheckBox jcbActivo;
    private javax.swing.JComboBox<Mascota> jcbMascota;
    private javax.swing.JComboBox<String> jcbTratamiento;
    private javax.swing.JRadioButton jrbAlta;
    private javax.swing.JRadioButton jrbBaja;
    private javax.swing.JTextField jtDescripcion;
    private javax.swing.JTextField jtDetalle;
    private javax.swing.JTextField jtDni;
    private javax.swing.JTextField jtImporte;
    private javax.swing.JTextField jtMedicamento;
    private javax.swing.JTextField jtPeso;
    // End of variables declaration//GEN-END:variables
}
