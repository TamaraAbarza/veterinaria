/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria.vistas;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import veterinaria.controlador.ClienteData;
import veterinaria.controlador.Conexion;
import veterinaria.controlador.MascotaData;
import veterinaria.modelo.Cliente;
import veterinaria.modelo.Mascota;

/**
 *
 * @author Usuario
 */
public class FormularioMascota extends javax.swing.JInternalFrame {

    /**
     * Creates new form Agregar
     */
    Conexion conexion;
    ClienteData clienteData;
    MascotaData mascotaData;
    List<Cliente> clientes;

    public FormularioMascota() {

        initComponents();
        try {
            conexion = new Conexion();
            clienteData = new ClienteData(conexion);
            mascotaData = new MascotaData(conexion);
            clientes = clienteData.obtenerClientes();
            agregarClientes();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FormularioMascota.class.getName()).log(Level.SEVERE, null, ex);
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
        fecha = new com.toedter.calendar.JDateChooser();
        btnAgregarDuenio = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jtNombre = new javax.swing.JTextField();
        jtEspecie = new javax.swing.JTextField();
        jtRaza = new javax.swing.JTextField();
        jtColorPelo = new javax.swing.JTextField();
        jcbActivo = new javax.swing.JCheckBox();
        btnGuardar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jrbMacho = new javax.swing.JRadioButton();
        jrbHembra = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jcbCliente = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtNombre1 = new javax.swing.JTextField();
        btnBuscarMascota = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(218, 229, 208));

        jPanel2.setBackground(new java.awt.Color(218, 229, 208));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnAgregarDuenio.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregarDuenio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAgregarDuenio.setText("AGREGAR NUEVO");

        jtNombre.setFont(new java.awt.Font("Lato", 0, 12)); // NOI18N

        jtEspecie.setFont(new java.awt.Font("Lato", 0, 12)); // NOI18N

        jtRaza.setFont(new java.awt.Font("Lato", 0, 12)); // NOI18N

        jtColorPelo.setFont(new java.awt.Font("Lato", 0, 12)); // NOI18N

        jcbActivo.setBackground(new java.awt.Color(218, 229, 208));
        jcbActivo.setFont(new java.awt.Font("Lato", 1, 12)); // NOI18N
        jcbActivo.setText("ACTIVO");

        btnGuardar.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnBorrar.setBackground(new java.awt.Color(255, 255, 255));
        btnBorrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

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

        jLabel2.setFont(new java.awt.Font("Lato", 1, 12)); // NOI18N
        jLabel2.setText("COLOR  DE  PELO");

        jLabel3.setFont(new java.awt.Font("Lato", 1, 12)); // NOI18N
        jLabel3.setText("RAZA");

        jLabel4.setFont(new java.awt.Font("Lato", 1, 12)); // NOI18N
        jLabel4.setText("SEXO");

        jLabel6.setFont(new java.awt.Font("Lato", 1, 12)); // NOI18N
        jLabel6.setText("NOMBRE  DE  LA  MASCOTA");

        jLabel7.setFont(new java.awt.Font("Lato", 1, 12)); // NOI18N
        jLabel7.setText("DUEÑO");

        jrbMacho.setBackground(new java.awt.Color(218, 229, 208));
        buttonGroup1.add(jrbMacho);
        jrbMacho.setFont(new java.awt.Font("Lato", 1, 12)); // NOI18N
        jrbMacho.setText("MACHO");

        jrbHembra.setBackground(new java.awt.Color(218, 229, 208));
        buttonGroup1.add(jrbHembra);
        jrbHembra.setFont(new java.awt.Font("Lato", 1, 12)); // NOI18N
        jrbHembra.setText("HEMBRA");

        jLabel5.setFont(new java.awt.Font("Lato", 1, 12)); // NOI18N
        jLabel5.setText("ESPECIE");

        jLabel11.setFont(new java.awt.Font("Lato", 1, 12)); // NOI18N
        jLabel11.setText("FECHA  DE  NACIMIENTO");

        jLabel8.setFont(new java.awt.Font("Lato", 1, 12)); // NOI18N
        jLabel8.setText("NOMBRE DE LA MASCOTA A BUSCAR");

        jtNombre1.setFont(new java.awt.Font("Lato", 0, 12)); // NOI18N

        btnBuscarMascota.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscarMascota.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBuscarMascota.setText("BUSCAR MASCOTA");
        btnBuscarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarMascotaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jrbMacho)
                                .addGap(18, 18, 18)
                                .addComponent(jrbHembra))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jcbActivo)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7)
                                    .addComponent(jcbCliente, 0, 286, Short.MAX_VALUE)
                                    .addComponent(jtNombre))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnBuscarMascota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAgregarDuenio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jtColorPelo, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarDuenio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarMascota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbMacho)
                    .addComponent(jrbHembra))
                .addGap(19, 19, 19)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtColorPelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jcbActivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("AngsanaUPC", 0, 36)); // NOI18N
        jLabel9.setText("MASCOTA");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/vistas/imagenes/edit.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9)
            .addComponent(jLabel1)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        String nombre = jtNombre.getText();
        String especie = jtEspecie.getText();
        String raza = jtRaza.getText();
        String colorPelo = jtColorPelo.getText();
//        double peso = Double.parseDouble(jtPeso.getText());
        Date fechaM = fecha.getDate();
        LocalDate fechaN = fechaM.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        boolean estado = jcbActivo.isSelected();
        String sexo;
        if (jrbMacho.isSelected()) {
            sexo = "macho";
        } else {
            sexo = "hembra";
        }
        Cliente c = (Cliente) jcbCliente.getSelectedItem();
        Mascota mascota = new Mascota(nombre, sexo, especie, raza, colorPelo, fechaN, c, estado);
        mascotaData.guardarMascota(mascota);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        Cliente cliente = (Cliente) jcbCliente.getSelectedItem();
        Mascota mascota;
        List<Mascota> mascotas = mascotaData.obtenerMascotasPorDuenio(cliente);
        for (Mascota it : mascotas) {
            if (it.getAlias().equals(jtNombre.getText())) {
                mascota = it;
                mascotaData.borrarMascota(mascota.getIdMascota());
            }
        }


    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnBuscarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarMascotaActionPerformed
        // TODO add your handling code here:
        Cliente cliente = (Cliente) jcbCliente.getSelectedItem();
        Mascota mascota;
        List<Mascota> mascotas = mascotaData.obtenerMascotasPorDuenio(cliente);
        for (Mascota it : mascotas) {
            if (it.getAlias().equals(jtNombre.getText())) {
                mascota = it;
                jtNombre.setText("");
                jtEspecie.setText("");
                jtRaza.setText("");
                jtColorPelo.setText("");
                fecha.setDate(null);
                jcbActivo.setSelected(false);

            }
        }
    }//GEN-LAST:event_btnBuscarMascotaActionPerformed

    public void agregarClientes() {
        for (Cliente it : clientes) {
            jcbCliente.addItem(it);
        }
    }

    public void limpiar() {

        jtNombre.setText("");
        jtEspecie.setText("");
        jtRaza.setText("");
        jtColorPelo.setText("");
//        jtPeso.setText("");
        fecha.setDate(null);
        jcbActivo.setSelected(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarDuenio;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscarMascota;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JCheckBox jcbActivo;
    private javax.swing.JComboBox<Cliente> jcbCliente;
    private javax.swing.JRadioButton jrbHembra;
    private javax.swing.JRadioButton jrbMacho;
    private javax.swing.JTextField jtColorPelo;
    private javax.swing.JTextField jtEspecie;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtNombre1;
    private javax.swing.JTextField jtRaza;
    // End of variables declaration//GEN-END:variables
}