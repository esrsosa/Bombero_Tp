/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BomberosVistas;

import BomberoAcceesoDatos.BomberoData;
import BomberoAcceesoDatos.BrigadaData;
import BomberoAcceesoDatos.CuartelData;
import BomberosEntidades.Bombero;
import BomberosEntidades.Brigada;
import BomberosEntidades.Cuartel;
import BomberosEntidades.Especialidad;
import com.toedter.calendar.JCalendar;
import java.awt.Graphics;
import java.awt.Image;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Emanuel Sosa
 */
public class FormularioBombero extends javax.swing.JInternalFrame {

    private BomberoData bomberodata = new BomberoData();
    private Bombero bomberoActual = null;
    private BrigadaData bData = new BrigadaData();
    CuartelData cd = new CuartelData();
    List<Cuartel> listaCuartel = cd.listaCuarteles();
    DefaultTableModel modelo = new DefaultTableModel();
    private List<Brigada> listaBrigadas = bData.listarBrigadas();
    DefaultComboBoxModel comboModelo = new DefaultComboBoxModel(listaBrigadas.toArray());
    List<Bombero> listarBomberos = bomberodata.listaBomberos();
    List<Brigada> brigadas = bData.listarBrigadas();
    FondoPanel fondo = new FondoPanel();
    

    public FormularioBombero() {
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
        this.setContentPane(fondo);
        initComponents();
        ArmarTabla();
        armarSangre();
        llenarTabla();
        llenarComboBox();
        brigadas();
        JActivos.setSelected(true);
        activos();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jMostrar = new javax.swing.JTable();
        jDarDeBaja = new javax.swing.JButton();
        jlimpiar = new javax.swing.JButton();
        jModificar = new javax.swing.JButton();
        jNuevo = new javax.swing.JButton();
        jTSelecionar = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        JActivos = new javax.swing.JRadioButton();
        Jinactivos = new javax.swing.JRadioButton();
        jDarDeAlta = new javax.swing.JButton();
        jPanel1 = new FondoPanel();
        jLabel9 = new javax.swing.JLabel();
        JApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jBrigadaAsignada = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jDetallesEspecialidad = new javax.swing.JLabel();
        jSangre = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jCelular = new javax.swing.JTextField();
        Jnombre = new javax.swing.JTextField();
        jTDisponibles = new javax.swing.JTextField();
        jFiltrar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jDCalendar = new com.toedter.calendar.JDateChooser();
        jDni = new javax.swing.JTextField();
        jDetallesCuartel = new javax.swing.JLabel();
        jBuscar = new javax.swing.JButton();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Fomulario de Bomberos");

        jMostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jMostrar);

        jDarDeBaja.setText("Dar de baja");
        jDarDeBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDarDeBajaActionPerformed(evt);
            }
        });

        jlimpiar.setText("Limpiar");
        jlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlimpiarActionPerformed(evt);
            }
        });

        jModificar.setText("Modificar");
        jModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jModificarActionPerformed(evt);
            }
        });

        jNuevo.setText("Nuevo");
        jNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNuevoActionPerformed(evt);
            }
        });

        jTSelecionar.setText("Seleccionar");
        jTSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTSelecionarActionPerformed(evt);
            }
        });

        jButton6.setText("Salir");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        JActivos.setFont(new java.awt.Font("Yu Gothic Light", 0, 14)); // NOI18N
        JActivos.setForeground(new java.awt.Color(255, 255, 255));
        JActivos.setText("Activos");
        JActivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JActivosActionPerformed(evt);
            }
        });

        Jinactivos.setFont(new java.awt.Font("Yu Gothic Light", 0, 14)); // NOI18N
        Jinactivos.setForeground(new java.awt.Color(255, 255, 255));
        Jinactivos.setText("Inactivos");
        Jinactivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JinactivosActionPerformed(evt);
            }
        });

        jDarDeAlta.setText("Dar de Alta");
        jDarDeAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDarDeAltaActionPerformed(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Yu Gothic Light", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Brigada Asignada");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, -1, -1));
        jPanel1.add(JApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 66, 120, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Yu Gothic Light", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Apellido");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        jBrigadaAsignada.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jBrigadaAsignadaItemStateChanged(evt);
            }
        });
        jBrigadaAsignada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBrigadaAsignadaMouseClicked(evt);
            }
        });
        jPanel1.add(jBrigadaAsignada, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 120, -1));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Yu Gothic Light", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Quedan Disponibles");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 339, -1, -1));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Yu Gothic Light", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Grupo Sanguineo");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Yu Gothic Light", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Yu Gothic Light", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Dni");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jDetallesEspecialidad.setBackground(new java.awt.Color(0, 0, 0));
        jDetallesEspecialidad.setFont(new java.awt.Font("Yu Gothic Light", 0, 14)); // NOI18N
        jDetallesEspecialidad.setForeground(new java.awt.Color(255, 255, 255));
        jDetallesEspecialidad.setText("predeterminado");
        jPanel1.add(jDetallesEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 309, 209, -1));

        jPanel1.add(jSangre, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 131, 110, -1));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Yu Gothic Light", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Fecha de Nacimiento");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));
        jPanel1.add(jCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 160, 120, -1));
        jPanel1.add(Jnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 36, 120, -1));
        jPanel1.add(jTDisponibles, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 338, 55, -1));

        jFiltrar.setText("Filtrar");
        jFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFiltrarActionPerformed(evt);
            }
        });
        jPanel1.add(jFiltrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, -1, -1));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Yu Gothic Light", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Celular");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, -1, -1));
        jPanel1.add(jDCalendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 96, 120, -1));

        jDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jDniKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jDniKeyReleased(evt);
            }
        });
        jPanel1.add(jDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 6, 120, -1));

        jDetallesCuartel.setBackground(new java.awt.Color(0, 0, 0));
        jDetallesCuartel.setFont(new java.awt.Font("Yu Gothic Light", 0, 14)); // NOI18N
        jDetallesCuartel.setForeground(new java.awt.Color(255, 255, 255));
        jDetallesCuartel.setText("predeterminado");
        jPanel1.add(jDetallesCuartel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 151, -1));

        jBuscar.setText("Buscar");
        jBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(jBuscar)
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(JActivos)
                .addGap(15, 15, 15)
                .addComponent(Jinactivos))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jNuevo))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jlimpiar)
                .addGap(27, 27, 27)
                .addComponent(jModificar)
                .addGap(17, 17, 17)
                .addComponent(jDarDeBaja)
                .addGap(6, 6, 6)
                .addComponent(jDarDeAlta)
                .addGap(178, 178, 178)
                .addComponent(jTSelecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jButton6))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jBuscar))
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(JActivos))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(Jinactivos)))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(jNuevo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlimpiar)
                    .addComponent(jModificar)
                    .addComponent(jDarDeBaja)
                    .addComponent(jDarDeAlta)
                    .addComponent(jTSelecionar)
                    .addComponent(jButton6))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNuevoActionPerformed
        bomberoActual = null;
        try {
            int dni = Integer.parseInt(jDni.getText());
            String nombre = Jnombre.getText();
            String apellido = JApellido.getText();
            java.util.Date sfecha = jDCalendar.getDate();
            //  String celular = jCelular.getText();
            int celular = Integer.parseInt(jCelular.getText());

            if (jDni.getText().isEmpty() || nombre.isEmpty() || apellido.isEmpty() || sfecha == null || jCelular.getText().isEmpty()
                    || jSangre.getSelectedItem().toString().isEmpty()) {
                JOptionPane.showMessageDialog(this, "No debe haber campos vacíos");
            } else {
                Brigada asigBrigada = new Brigada();
                String dni1 = String.valueOf(dni);
                String celular1 = String.valueOf(celular);
                String sangre = jSangre.getSelectedItem().toString();
                LocalDate fechaNac = sfecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                asigBrigada = (Brigada) jBrigadaAsignada.getSelectedItem();
                if (bomberoActual == null) {
                    if (!brigadasLibre()) {
                        if (bomberodata.buscarBombero(dni) == null) {
                            bomberoActual = new Bombero(dni1, nombre, apellido, celular1, fechaNac, sangre, true, asigBrigada);
                            bomberodata.agregarBombero(bomberoActual);
                            limpiar();
                        } else {
                            JOptionPane.showMessageDialog(this, "El Bombero con Dni: " + dni + " ya existe");
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Brigada completa, " + jBrigadaAsignada.getSelectedItem().toString());
                        List<Bombero> bomberos = bomberodata.listaBomberos();
                        Map<Integer, Integer> bomberosPorBrigada = new HashMap<>();
                        for (Bombero bombero : bomberos) {
                            int codBrigada = bombero.getBrigada().getCodBrigada();
                            bomberosPorBrigada.put(codBrigada, bomberosPorBrigada.getOrDefault(codBrigada, 0) + 1);
                        }
                        Boolean x = false;
                        for (Brigada brigada : brigadas) {
                            String nombre1 = brigada.getNombreBrigada();
                            int codBrigada = brigada.getCodBrigada();
                            int bomberosAsignados = bomberosPorBrigada.getOrDefault(codBrigada, 0);
                            int bomberosDisponibles = Math.max(0, 5 - bomberosAsignados);
                            if (bomberosDisponibles >= 1) {
                                x = true;
                                jBrigadaAsignada.setSelectedItem(brigada);
                                JOptionPane.showMessageDialog(this, "Brigada Recomendada, " + nombre1 + " con " + bomberosDisponibles + " bomberos disponibles. "
                                        + "Especialidad en " + brigada.getEspecialidad());
                                break;
                            }
                        }
                        if (!x) {
                            JOptionPane.showMessageDialog(this, "Sin Brigadas disponibles, libere alguna brigada");
                        }
                    }
                }
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Debe ingresar datos válidos" + ex.getMessage());
        }

    }//GEN-LAST:event_jNuevoActionPerformed

    private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarActionPerformed
        try {
            bomberoActual = new Bombero();
            int dni = Integer.parseInt(jDni.getText());
            bomberoActual = bomberodata.buscarBombero(dni);
            if (bomberoActual != null) {
                jDni.setText(bomberoActual.getDni());
                Jnombre.setText(bomberoActual.getNombre());
                JApellido.setText(bomberoActual.getApellido());
                jCelular.setText(bomberoActual.getCelular());
                jSangre.setSelectedItem(bomberoActual.getGrupSanguineo());
                jBrigadaAsignada.setSelectedItem(bomberoActual.getBrigada());
                jDCalendar.setDate(Date.from(bomberoActual.getFecha_nac().atStartOfDay(ZoneId.systemDefault()).toInstant()));
                limpiarTabla();
                modelo.setRowCount(0);
                for (Brigada tipo : brigadas) {
                    if (bomberoActual.getBrigada().getCodBrigada() == tipo.getCodBrigada()) { //Basicamente comparaba el bomberoActual.getCodBrigada con el tipo.getCodBombero, lo cambie por un equals que compara objetos
                        jBrigadaAsignada.setSelectedItem(tipo);
                        modelo.addRow(new Object[]{bomberoActual.getDni(), bomberoActual.getApellido(), bomberoActual.getNombre(), tipo.getNombreBrigada()});
                    }

                }

            } else {
                JOptionPane.showMessageDialog(this, "Bombero no encontrado." + "Dni: " + dni);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Debe ingresar números válidos" + ex.getMessage());
        }
    }//GEN-LAST:event_jBuscarActionPerformed

    private void jDniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDniKeyReleased
        if (jDni.getText().isEmpty()) {
            llenarTabla();
            limpiar();
        }
    }//GEN-LAST:event_jDniKeyReleased
    private void armarSangre() {
        jSangre.addItem("A+");
        jSangre.addItem("A-");
        jSangre.addItem("B+");
        jSangre.addItem("B-");
        jSangre.addItem("AB+");
        jSangre.addItem("AB-");
        jSangre.addItem("0+");
        jSangre.addItem("0-");
    }

    private void jlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
        llenarTabla();
    }//GEN-LAST:event_jlimpiarActionPerformed

    private void jDniKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDniKeyPressed

    }//GEN-LAST:event_jDniKeyPressed

    private void jModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jModificarActionPerformed
        try {
            int dni = Integer.parseInt(jDni.getText());
            String nombre = Jnombre.getText();
            String apellido = JApellido.getText();
            java.util.Date sfecha = jDCalendar.getDate();
            int celular = Integer.parseInt(jCelular.getText());
            Brigada asigBrigada = new Brigada();
            asigBrigada.setCodBrigada(Ndebrigada());
            if (jDni.getText().isEmpty() || nombre.isEmpty() || apellido.isEmpty() || sfecha == null || jCelular.getText().isEmpty()
                    || jSangre.getSelectedItem().toString().isEmpty()) {//hay que verificar si entro una brigada en asigBrigada
                JOptionPane.showMessageDialog(this, "No debe haber campos vacíos");
            } else {

                String sangre = jSangre.getSelectedItem().toString();
                LocalDate fechaNac = sfecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                if (!brigadasLibre()) {
                    String dni1 = String.valueOf(dni);
                    String celular1 = String.valueOf(celular);
                    bomberoActual = new Bombero(dni1, nombre, apellido, sangre, fechaNac, celular1, true, asigBrigada);
                    bomberodata.actualizarDatos(bomberoActual);
                    limpiar();
                } else {
                    JOptionPane.showMessageDialog(this, "Brigada completa, " + jBrigadaAsignada.getSelectedItem().toString());
                }
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Debe ingresar datos válidos" + ex.getMessage());
        }
    }//GEN-LAST:event_jModificarActionPerformed

    private void jDarDeBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDarDeBajaActionPerformed
        try {
            String dni = jDni.getText();
            if (dni.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No debe haber campos vacíos");
            } else {
                bomberodata.darBajaPorInactividad(dni);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Debe ingresar números válidos");
        }
        llenarTabla();
        limpiar();
    }//GEN-LAST:event_jDarDeBajaActionPerformed

    private void jFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFiltrarActionPerformed
        modelo.setRowCount(0);
        listarBomberos = bomberodata.listaBomberos();
        boolean x = false;
        for (Bombero aux : listarBomberos) {
            for (Brigada tipo : brigadas) {
                if (aux.getBrigada().getCodBrigada() == tipo.getCodBrigada()) {
                    if (tipo.getNombreBrigada().equals(jBrigadaAsignada.getSelectedItem().toString())) {
                        x = true;
                        modelo.addRow(new Object[]{aux.getDni(), aux.getApellido(), aux.getNombre(), tipo.getNombreBrigada()});
                    }
                }
            }
        }
        if (!x) {
            JOptionPane.showMessageDialog(this, "No hay Bomberos en " + jBrigadaAsignada.getSelectedItem());
        }
    }//GEN-LAST:event_jFiltrarActionPerformed

    private void jBrigadaAsignadaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jBrigadaAsignadaItemStateChanged
        brigadas();
    }//GEN-LAST:event_jBrigadaAsignadaItemStateChanged

    private void jBrigadaAsignadaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBrigadaAsignadaMouseClicked
        // TODO add your handling code here:
        brigadas();
    }//GEN-LAST:event_jBrigadaAsignadaMouseClicked

    private void jTSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTSelecionarActionPerformed

        try {
            int filaSeleccionada = jMostrar.getSelectedRow();
            if (filaSeleccionada != -1) {
                Object valorCodigo = jMostrar.getValueAt(filaSeleccionada, 0);
                if (valorCodigo != null) {
                    int numero = Integer.parseInt(valorCodigo.toString());
                    bomberoActual = bomberodata.buscarBomberoTodos(numero);
                    if (bomberoActual != null) {
                        jDni.setText(bomberoActual.getDni());
                        Jnombre.setText(bomberoActual.getNombre());
                        JApellido.setText(bomberoActual.getApellido());
                        jCelular.setText(bomberoActual.getCelular());
                        jSangre.setSelectedItem(bomberoActual.getGrupSanguineo());
                        jBrigadaAsignada.setSelectedItem(bomberoActual.getBrigada());
                        jDCalendar.setDate(Date.from(bomberoActual.getFecha_nac().atStartOfDay(ZoneId.systemDefault()).toInstant()));
                    } else {
                        JOptionPane.showMessageDialog(this, "Bombero no encontrado");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "El valor seleccionado es nulo");
                }
            } else {
                JOptionPane.showMessageDialog(this, "No se ha seleccionado ninguna fila");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Error al procesar la selección: " + ex.getMessage());
        }
    }//GEN-LAST:event_jTSelecionarActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void JActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JActivosActionPerformed
        // TODO add your handling code here:
        activos();
    }//GEN-LAST:event_JActivosActionPerformed

    private void activos() {
        jDarDeBaja.setEnabled(true);
        jDarDeAlta.setEnabled(false);
        if (JActivos.isSelected() == true) {
            Jinactivos.setSelected(false);
        }
        llenarTabla();
    }
    private void JinactivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JinactivosActionPerformed
        // TODO add your handling code here:
        jDarDeAlta.setEnabled(true);
        jDarDeBaja.setEnabled(false);
        if (Jinactivos.isSelected() == true) {
            JActivos.setSelected(false);
        }
        modelo.setRowCount(0);
        listarBomberos = bomberodata.listaBomberosInactivos();
        for (Bombero aux : listarBomberos) {
            System.out.println(aux.isEstado());
            for (Brigada tipo : brigadas) {
                if (aux.getBrigada().getCodBrigada() == tipo.getCodBrigada()) {
                    modelo.addRow(new Object[]{aux.getDni(), aux.getApellido(), aux.getNombre(), tipo.getNombreBrigada()});
                }
            }
        }
    }//GEN-LAST:event_JinactivosActionPerformed

    private void jDarDeAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDarDeAltaActionPerformed
        // TODO add your handling code here:

        try {
            String dni = jDni.getText();
            if (dni.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No debe haber campos vacíos");
            } else {

                if (!brigadasLibre()) {
                    bomberodata.darDeAlta(dni);
                } else {
                    JOptionPane.showMessageDialog(this, "Brigada completa, " + jBrigadaAsignada.getSelectedItem().toString());
                }

            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Debe ingresar números válidos");
        }
        llenarTabla();
        limpiar();
    }//GEN-LAST:event_jDarDeAltaActionPerformed
    public void brigadas() {
        jTDisponibles.setText("   [ " + " ] ");

        List<Bombero> bomberos = bomberodata.listaBomberos();
        List<Brigada> brigadasLibres = bData.listarBrigadas();
        Map<Integer, Integer> bomberosPorBrigada = new HashMap<>();
        for (Bombero bombero : bomberos) {
            int codBrigada = bombero.getBrigada().getCodBrigada();
            bomberosPorBrigada.put(codBrigada, bomberosPorBrigada.getOrDefault(codBrigada, 0) + 1);
        }
        for (Brigada brigada : brigadasLibres) {
            String nombre = brigada.getNombreBrigada();
            if (jBrigadaAsignada.getSelectedItem().toString().equalsIgnoreCase(nombre)) {
                int codBrigada = brigada.getCodBrigada();
                int bomberosAsignados = bomberosPorBrigada.getOrDefault(codBrigada, 0);
                int bomberosDisponibles = Math.max(0, 5 - bomberosAsignados);
                String C = "";
                for (Cuartel cuartel : listaCuartel) {
                    if (cuartel.getCodCuartel() == brigada.getNro_cuartel().getCodCuartel()) {
                        C = cuartel.getNombre();
                    }
                }
                jTDisponibles.setText("   [ " + bomberosDisponibles + " ] ");
                jDetallesEspecialidad.setText("Especialidad: " + brigada.getEspecialidad());
                jDetallesCuartel.setText("Cuartel: " + C);
            }
        }
    }

    public int Ndebrigada() {
        for (Brigada tipo : brigadas) {
            if (jBrigadaAsignada.getSelectedItem().toString().equalsIgnoreCase(tipo.getNombreBrigada())) {
                return tipo.getCodBrigada();
            }
        }
        return 0;
    }

    private boolean brigadasLibre() {
        List<Bombero> bomberos = bomberodata.listaBomberos();
        Map<Integer, Integer> bomberosPorBrigada = new HashMap<>();
        for (Bombero bombero : bomberos) {
            int codBrigada = bombero.getBrigada().getCodBrigada();
            bomberosPorBrigada.put(codBrigada, bomberosPorBrigada.getOrDefault(codBrigada, 0) + 1);
        }
        for (Brigada brigada : brigadas) {
            String nombre = brigada.getNombreBrigada();
            if (jBrigadaAsignada.getSelectedItem().toString().equalsIgnoreCase(nombre)) {
                int codBrigada = brigada.getCodBrigada();
                int bomberosAsignados = bomberosPorBrigada.getOrDefault(codBrigada, 0);
                int bomberosDisponibles = Math.max(0, 5 - bomberosAsignados);
                if (bomberosDisponibles == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public void llenarComboBox() {
        jBrigadaAsignada.setModel(comboModelo);
        jTDisponibles.setEnabled(false);
    }

    private void llenarTabla() {
        modelo.setRowCount(0);
        listarBomberos = bomberodata.listaBomberos();
        for (Bombero aux : listarBomberos) {
            for (Brigada tipo : brigadas) {
                if (aux.getBrigada().getCodBrigada() == tipo.getCodBrigada()) {
                    modelo.addRow(new Object[]{aux.getDni(), aux.getApellido(), aux.getNombre(), tipo.getNombreBrigada()});
                }
            }
        }
    }

    private void limpiarTabla() {
        int filas = modelo.getRowCount();
        for (int i = filas - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    private void limpiar() {
        jBrigadaAsignada.setSelectedIndex(0);
        limpiarTabla();
        llenarTabla();
        brigadas();
        jDni.setText(null);
        Jnombre.setText(null);
        JApellido.setText(null);
        jSangre.setSelectedIndex(-1);
        jDCalendar.setDate(null);
        jCelular.setText(null);
        JActivos.setSelected(true);
        activos();
       
    }

    private void ArmarTabla() {
        modelo.addColumn("Dni");
        modelo.addColumn("Apellido");
        modelo.addColumn("Nombre");
        modelo.addColumn("Brigada");
        jMostrar.setModel(modelo);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton JActivos;
    private javax.swing.JTextField JApellido;
    private javax.swing.JRadioButton Jinactivos;
    private javax.swing.JTextField Jnombre;
    private javax.swing.JComboBox<Brigada> jBrigadaAsignada;
    private javax.swing.JButton jBuscar;
    private javax.swing.JButton jButton6;
    private javax.swing.JTextField jCelular;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private com.toedter.calendar.JDateChooser jDCalendar;
    private javax.swing.JButton jDarDeAlta;
    private javax.swing.JButton jDarDeBaja;
    private javax.swing.JLabel jDetallesCuartel;
    private javax.swing.JLabel jDetallesEspecialidad;
    private javax.swing.JTextField jDni;
    private javax.swing.JButton jFiltrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jModificar;
    private javax.swing.JTable jMostrar;
    private javax.swing.JButton jNuevo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jSangre;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTDisponibles;
    private javax.swing.JButton jTSelecionar;
    private javax.swing.JButton jlimpiar;
    // End of variables declaration//GEN-END:variables
public class FondoPanel extends JPanel {

        private Image imagen;

        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/imagen/degrade.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
        
    }
}
