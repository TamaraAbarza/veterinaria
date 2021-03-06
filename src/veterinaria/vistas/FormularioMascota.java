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
import javax.swing.JOptionPane;
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
    Mascota mascota;

    public FormularioMascota() {

        initComponents();
        try {
            conexion = new Conexion();
            clienteData = new ClienteData(conexion);
            mascotaData = new MascotaData(conexion);
            clientes = clienteData.obtenerClientes();
            agregarClientes();
            btnModificar.setEnabled(false);
            btnBorrar.setEnabled(false);

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
        jLabel = new javax.swing.JLabel();
        jtNombre1 = new javax.swing.JTextField();
        btnBuscarMascota = new javax.swing.JButton();
        jLabelRegistrar = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(55, 62, 62), 2, true));

        fecha.setBackground(new java.awt.Color(247, 188, 32));

        btnAgregarDuenio.setBackground(new java.awt.Color(213, 55, 132));
        btnAgregarDuenio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAgregarDuenio.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarDuenio.setText("AGREGAR NUEVO");
        btnAgregarDuenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarDuenioActionPerformed(evt);
            }
        });

        jtNombre.setBackground(new java.awt.Color(213, 55, 132));
        jtNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtNombre.setForeground(new java.awt.Color(255, 255, 255));

        jtEspecie.setBackground(new java.awt.Color(247, 188, 32));
        jtEspecie.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtEspecie.setForeground(new java.awt.Color(255, 255, 255));
        jtEspecie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtEspecieKeyTyped(evt);
            }
        });

        jtRaza.setBackground(new java.awt.Color(247, 188, 32));
        jtRaza.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtRaza.setForeground(new java.awt.Color(255, 255, 255));
        jtRaza.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtRazaKeyTyped(evt);
            }
        });

        jtColorPelo.setBackground(new java.awt.Color(247, 188, 32));
        jtColorPelo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtColorPelo.setForeground(new java.awt.Color(255, 255, 255));
        jtColorPelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtColorPeloKeyTyped(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(36, 130, 186));
        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnBorrar.setBackground(new java.awt.Color(36, 130, 186));
        btnBorrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(36, 130, 186));
        btnModificar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(36, 130, 186));
        btnLimpiar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
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
        jLabel7.setText(" SELECCIONE  EL  DUE??O  DE  LA  MASCOTA");

        jrbMacho.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jrbMacho);
        jrbMacho.setFont(new java.awt.Font("Lato", 1, 12)); // NOI18N
        jrbMacho.setText("MACHO");

        jrbHembra.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jrbHembra);
        jrbHembra.setFont(new java.awt.Font("Lato", 1, 12)); // NOI18N
        jrbHembra.setText("HEMBRA");

        jLabel5.setFont(new java.awt.Font("Lato", 1, 12)); // NOI18N
        jLabel5.setText("ESPECIE");

        jcbCliente.setBackground(new java.awt.Color(213, 55, 132));

        jLabel11.setFont(new java.awt.Font("Lato", 1, 12)); // NOI18N
        jLabel11.setText("FECHA  DE  NACIMIENTO");

        jLabel.setFont(new java.awt.Font("Lato", 1, 12)); // NOI18N
        jLabel.setText("NOMBRE DE LA MASCOTA A BUSCAR");

        jtNombre1.setBackground(new java.awt.Color(247, 188, 32));
        jtNombre1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtNombre1.setForeground(new java.awt.Color(255, 255, 255));

        btnBuscarMascota.setBackground(new java.awt.Color(213, 55, 132));
        btnBuscarMascota.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBuscarMascota.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarMascota.setText("BUSCAR MASCOTA");
        btnBuscarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarMascotaActionPerformed(evt);
            }
        });

        jLabelRegistrar.setFont(new java.awt.Font("Lato", 1, 12)); // NOI18N
        jLabelRegistrar.setText("O  REGISTRE  UNA  NUEVA  MASCOTA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jtEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jtColorPelo, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)
                                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jcbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnAgregarDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnBuscarMascota)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jrbMacho)
                                        .addGap(18, 18, 18)
                                        .addComponent(jrbHembra))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelRegistrar)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarDuenio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarMascota)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabelRegistrar)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbMacho)
                    .addComponent(jrbHembra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtColorPelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(55, 62, 62), 2, true));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/vistas/imagenes/logo2.jpg"))); // NOI18N

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel15.setFont(new java.awt.Font("AngsanaUPC", 0, 45)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(247, 188, 32));
        jLabel15.setText("M");

        jLabel16.setFont(new java.awt.Font("AngsanaUPC", 0, 45)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(36, 130, 186));
        jLabel16.setText("A");

        jLabel17.setFont(new java.awt.Font("AngsanaUPC", 0, 45)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(213, 55, 132));
        jLabel17.setText("S");

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("AngsanaUPC", 0, 45)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(247, 188, 32));
        jLabel19.setText("C");

        jLabel18.setFont(new java.awt.Font("AngsanaUPC", 0, 45)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(36, 130, 186));
        jLabel18.setText("O");

        jLabel20.setFont(new java.awt.Font("AngsanaUPC", 0, 45)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(213, 55, 132));
        jLabel20.setText("T");

        jLabel21.setFont(new java.awt.Font("AngsanaUPC", 0, 45)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(247, 188, 32));
        jLabel21.setText("A");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel15)
                .addGap(2, 2, 2)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel19)
                    .addComponent(jLabel18)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(53, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(220, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(419, 419, 419)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(612, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        String nombre = jtNombre1.getText();
        String especie = jtEspecie.getText();
        String raza = jtRaza.getText();
        String colorPelo = jtColorPelo.getText();
        LocalDate fechaN = null;
        try {
            Date f = fecha.getDate();
            fechaN = f.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        } catch (Exception e) {
            fechaN = null;
        }
        boolean estado = true; //jcbActivo.isSelected();
        String sexo = "";
        if (jrbMacho.isSelected()) {
            sexo = "macho";
        } else {
            sexo = "hembra";
        }
        if (jtNombre1.getText().isEmpty() || jtEspecie.getText().isEmpty() || jtRaza.getText().isEmpty() || jtColorPelo.getText().isEmpty() || sexo.equals("") || fechaN == null) {
            JOptionPane.showMessageDialog(this, "Para realizar el registro de la mascota es necesario que complete todos los campos");
        } else {
            Cliente c = (Cliente) jcbCliente.getSelectedItem();
            Mascota mascota = new Mascota(nombre, sexo, especie, raza, colorPelo, fechaN, c, estado);
            boolean aux = mascotaData.guardarMascota(mascota);
            if (aux) {
                int confirmar = JOptionPane.showConfirmDialog(this, "Se registr?? correctamente a la mascota " + mascota.getAlias() + ". ??Desea registrar una visita?");
                if (confirmar == 0) {

                    FormularioVisita fv = new FormularioVisita();
                    Principal.fondo.add(fv);
                    fv.toFront();
                    fv.setVisible(true);
                    this.dispose();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Ocurri?? un error al intentar registrar a la mascota " + mascota.getAlias());
            }
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed

        if (mascota != null) {
            //cancelar=2 , no =1 , si=0
            int confirmar = JOptionPane.showConfirmDialog(this, "??Est?? seguro de darle de baja a la mascota " + mascota.getAlias() + "?");
            if (confirmar == 0) {
                boolean aux = mascotaData.borrarMascota(mascota.getIdMascota());
                if (aux) {
                    JOptionPane.showMessageDialog(this, "Se di?? de baja a la mascota " + mascota.getAlias());
                    limpiar();
                } else {
                    JOptionPane.showMessageDialog(this, "Ocurri?? un error al intentar darle de baja a la mascota " + mascota.getAlias());
                }
                limpiar();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Error, el nombre ingresado no corresponde a ninguna mascota registrada de " + (Cliente) jcbCliente.getSelectedItem());
        }


    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnBuscarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarMascotaActionPerformed
        // TODO add your handling code here:
        mascota = null;
        Cliente cliente = (Cliente) jcbCliente.getSelectedItem();
        List<Mascota> mascotas = mascotaData.obtenerMascotasPorDuenio(cliente.getIdCliente());
        if (mascotas.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Error, el cliente seleccionado no posee ninguna mascota registrada, debe ingresar los datos de la mascota a su cargo primero ");
        } else {
            for (Mascota it : mascotas) {
                if (it.getAlias().equalsIgnoreCase(jtNombre.getText())) {
                    mascota = it;
                    jtNombre1.setText(mascota.getAlias());
                    jtEspecie.setText(mascota.getEspecie());
                    jtRaza.setText(mascota.getRaza());
                    jtColorPelo.setText(mascota.getColorPelo());
                    //jcbActivo.setSelected(mascota.isActivo());
                    if (mascota.getSexo().equalsIgnoreCase("Hembra")) {
                        jrbHembra.setSelected(true);
                    } else {
                        jrbMacho.setSelected(true);
                    }
                    LocalDate f = mascota.getFechaNac();
                    ZoneId zona = ZoneId.systemDefault();
                    Date fechaN = Date.from(f.atStartOfDay(zona).toInstant());
                    fecha.setDate(fechaN);
                    break;
                }

            }

            if (mascota == null) {
                JOptionPane.showMessageDialog(this, "El nombre ingresado no corresponde a ninguna mascota del cliente " + cliente);
            } else {
                btnModificar.setEnabled(true);
                btnBorrar.setEnabled(true);
                btnGuardar.setEnabled(false);
                jLabelRegistrar.setVisible(false);
            }
        }
    }//GEN-LAST:event_btnBuscarMascotaActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        Cliente c = (Cliente) jcbCliente.getSelectedItem();

        String nombre = jtNombre1.getText();
        String especie = jtEspecie.getText();
        String raza = jtRaza.getText();
        String colorPelo = jtColorPelo.getText();
        Date fechaM = fecha.getDate();
        LocalDate fechaN = fechaM.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        boolean estado = true;//jcbActivo.isSelected();
        String sexo = "";
        if (jrbMacho.isSelected()) {
            sexo = "macho";
        } else {
            sexo = "hembra";
        }
        if (jtNombre1.getText().isEmpty() || jtEspecie.getText().isEmpty() || jtRaza.getText().isEmpty() || jtColorPelo.getText().isEmpty() || sexo.equals("")) {
            JOptionPane.showMessageDialog(this, "Para realizar el registro de la mascota es necesario que complete todos los campos");
        } else {
            Mascota m = new Mascota(mascota.getIdMascota(), nombre, sexo, especie, raza, colorPelo, fechaN, c, estado);
            boolean aux = mascotaData.modificarMascota(m);
            if (aux) {
                limpiar();
                JOptionPane.showMessageDialog(this, "Se modific?? correctamente a la mascota " + m.getAlias());
            } else {
                JOptionPane.showMessageDialog(this, "Error al intentar modificar a la mascota " + m.getAlias());
            }
        }

    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnAgregarDuenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarDuenioActionPerformed
        FormularioCliente fc = new FormularioCliente();
        Principal.fondo.add(fc);
        fc.toFront();
        fc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAgregarDuenioActionPerformed

    private void jtEspecieKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtEspecieKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c != ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_jtEspecieKeyTyped

    private void jtRazaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtRazaKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c != ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_jtRazaKeyTyped

    private void jtColorPeloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtColorPeloKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c != ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_jtColorPeloKeyTyped

    public void agregarClientes() {
        for (Cliente it : clientes) {
            jcbCliente.addItem(it);
        }
    }

    public void limpiar() {

        jtNombre.setText("");
        jtNombre1.setText("");
        jtEspecie.setText("");
        jtRaza.setText("");
        jtColorPelo.setText("");
        fecha.setDate(null);
//        jcbActivo.setSelected(false);
        buttonGroup1.clearSelection();

        btnModificar.setEnabled(false);
        btnBorrar.setEnabled(false);
        btnGuardar.setEnabled(true);
        jLabelRegistrar.setVisible(true);
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
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelRegistrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
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
