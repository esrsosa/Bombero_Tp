/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BomberosVistas;

import BomberoAcceesoDatos.BomberoData;
import BomberoAcceesoDatos.BrigadaData;
import BomberosEntidades.Bombero;
import BomberosEntidades.Brigada;
import BomberosEntidades.Cuartel;
import BomberosEntidades.Especialidad;
import com.toedter.calendar.JCalendar;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Emanuel Sosa
 */
public class FormularioBombero extends javax.swing.JInternalFrame {

    private BomberoData bomberodata = new BomberoData();
    private Bombero bomberoActual = null;
    private BrigadaData bData = new BrigadaData();
    DefaultTableModel modelo = new DefaultTableModel();
    private List<Brigada> listaBrigadas = bData.listarBrigadasLibres();
    DefaultComboBoxModel comboModelo = new DefaultComboBoxModel(listaBrigadas.toArray());
    List<Bombero> listarBomberos = bomberodata.listaBomberos();
    List<Brigada> brigadas = bData.listarBrigadasLibres();

    public FormularioBombero() {
        initComponents();
        ArmarTabla();
        armarSangre();
        llenarTabla();
//        llenarTipo();
        llenarComboBox();
        brigadas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jMostrar = new javax.swing.JTable();
        jDarDeBaja = new javax.swing.JButton();
        jlimpiar = new javax.swing.JButton();
        jBuscar = new javax.swing.JButton();
        jFiltrar = new javax.swing.JButton();
        jModificar = new javax.swing.JButton();
        jSangre = new javax.swing.JComboBox<>();
        jBrigadaAsignada = new javax.swing.JComboBox<>();
        JApellido = new javax.swing.JTextField();
        jDni = new javax.swing.JTextField();
        jCelular = new javax.swing.JTextField();
        jTDisponibles = new javax.swing.JTextField();
        Jnombre = new javax.swing.JTextField();
        jNuevo = new javax.swing.JButton();
        jDCalendar = new com.toedter.calendar.JDateChooser();
        jTSelecionar = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 3, 24)); // NOI18N
        jLabel1.setText("Fomulario de Bomberos");

        jLabel2.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        jLabel2.setText("Dni");

        jLabel3.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        jLabel4.setText("Apellido");

        jLabel5.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        jLabel5.setText("Grupo Sanguineo");

        jLabel6.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        jLabel6.setText("Fecha de Nacimiento");

        jLabel7.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        jLabel7.setText("Quedan Disponibles");

        jLabel8.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        jLabel8.setText("Celular");

        jLabel9.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        jLabel9.setText("Brigada Asignada");

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

        jBuscar.setText("Buscar");
        jBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarActionPerformed(evt);
            }
        });

        jFiltrar.setText("Filtrar");
        jFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFiltrarActionPerformed(evt);
            }
        });

        jModificar.setText("Modificar");
        jModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jModificarActionPerformed(evt);
            }
        });

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

        jDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jDniKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jDniKeyReleased(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(141, 141, 141)
                                .addComponent(jNuevo))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jlimpiar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jModificar)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(514, 514, 514)
                                .addComponent(jTSelecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(jBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jDni, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3))
                                    .addGap(28, 28, 28)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(JApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Jnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jDCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addGap(18, 18, 18)
                                            .addComponent(jSangre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jBrigadaAsignada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jFiltrar))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jDarDeBaja)))))))
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGap(390, 390, 390)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(366, 366, 366)
                    .addComponent(jButton6)
                    .addContainerGap(641, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlimpiar)
                        .addComponent(jModificar)
                        .addComponent(jDarDeBaja))
                    .addComponent(jTSelecionar))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBuscar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Jnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(JApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jDCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jSangre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jBrigadaAsignada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFiltrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jNuevo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(521, Short.MAX_VALUE)
                    .addComponent(jButton6)
                    .addGap(4, 4, 4)))
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
            String celular = jCelular.getText();

            if (jDni.getText().isEmpty() || nombre.isEmpty() || apellido.isEmpty() || sfecha == null || celular.isEmpty()
                    || jSangre.getSelectedItem().toString().isEmpty()) {
                JOptionPane.showMessageDialog(this, "No debe haber campos vacíos");
            } else {
                Brigada asigBrigada = new Brigada();
                String dni1 = String.valueOf(dni);
                String sangre = jSangre.getSelectedItem().toString();
                LocalDate fechaNac = sfecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                asigBrigada = (Brigada) jBrigadaAsignada.getSelectedItem();
                if (bomberoActual == null) {
                    if (!brigadasLibre()) {
                        bomberoActual = new Bombero(dni1, nombre, apellido, celular, fechaNac, sangre, true, asigBrigada);
                        bomberodata.agregarBombero(bomberoActual);
                        limpiar();
                    } else {
                        JOptionPane.showMessageDialog(this, "Brigada completa, " + jBrigadaAsignada.getSelectedItem().toString());
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
            String dni = jDni.getText();
            String nombre = Jnombre.getText();
            String apellido = JApellido.getText();
            java.util.Date sfecha = jDCalendar.getDate();
            String celular = jCelular.getText();
            Brigada asigBrigada = new Brigada();
            asigBrigada.setCodBrigada(Ndebrigada());
            if (jDni.getText().isEmpty() || nombre.isEmpty() || apellido.isEmpty() || sfecha == null || celular.isEmpty()
                    || jSangre.getSelectedItem().toString().isEmpty()) {//hay que verificar si entro una brigada en asigBrigada
                JOptionPane.showMessageDialog(this, "No debe haber campos vacíos");
            } else {
                String sangre = jSangre.getSelectedItem().toString();
                LocalDate fechaNac = sfecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                if (!brigadasLibre()) {
                    bomberoActual = new Bombero(dni, nombre, apellido, sangre, fechaNac, celular, true, asigBrigada);
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
            JOptionPane.showMessageDialog(this, "No hay Bomberos en "+ jBrigadaAsignada.getSelectedItem());
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
                    bomberoActual = bomberodata.buscarBombero(numero);
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
    public void brigadas() {
        List<Bombero> bomberos = bomberodata.listaBomberos();
        List<Brigada> brigadasLibres = bData.listarBrigadasLibres();
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
                jTDisponibles.setText("   [ " + bomberosDisponibles + " ] ");

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
        List<Brigada> brigadasLibres = bData.listarBrigadasLibres();
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
        limpiarTabla();
        llenarTabla();
        brigadas();
        jDni.setText(null);
        Jnombre.setText(null);
        JApellido.setText(null);
        jSangre.setSelectedIndex(-1);
        jDCalendar.setDate(null);
        jCelular.setText(null);
        jTDisponibles.setText("");
    }

    private void ArmarTabla() {
        modelo.addColumn("Dni");
        modelo.addColumn("Apellido");
        modelo.addColumn("Nombre");
        modelo.addColumn("Brigada");
        jMostrar.setModel(modelo);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JApellido;
    private javax.swing.JTextField Jnombre;
    private javax.swing.JComboBox<Brigada> jBrigadaAsignada;
    private javax.swing.JButton jBuscar;
    private javax.swing.JButton jButton6;
    private javax.swing.JTextField jCelular;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private com.toedter.calendar.JDateChooser jDCalendar;
    private javax.swing.JButton jDarDeBaja;
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
    private javax.swing.JComboBox<String> jSangre;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTDisponibles;
    private javax.swing.JButton jTSelecionar;
    private javax.swing.JButton jlimpiar;
    // End of variables declaration//GEN-END:variables

}
