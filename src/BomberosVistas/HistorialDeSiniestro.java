/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BomberosVistas;

import BomberoAcceesoDatos.SiniestrosData;
import BomberosEntidades.Siniestro;
import java.awt.Graphics;
import java.awt.Image;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pollo
 */
public class HistorialDeSiniestro extends javax.swing.JInternalFrame {

    private SiniestrosData siniestrodata = new SiniestrosData();
    private Siniestro siniestroActual = null;
    List<Siniestro> listarSiniestros = null;

    DefaultTableModel modelo = new DefaultTableModel();
    FondoPanel fondo = new FondoPanel();

    public HistorialDeSiniestro() {
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        this.setContentPane(fondo);
        initComponents();
        ArmarTabla();
        llenarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jHistorial = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jfecha1 = new com.toedter.calendar.JDateChooser();
        jfecha2 = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSalir = new javax.swing.JButton();
        jBuscar = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Historial del Siniestro");

        jHistorial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10", "Title 11"
            }
        ));
        jScrollPane1.setViewportView(jHistorial);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Yu Gothic Light", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Filtrar entre fechas");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Yu Gothic Light", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Y");

        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jSalir.setText("Salir");
        jSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalirActionPerformed(evt);
            }
        });

        jBuscar.setText("buscar");
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jfecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jfecha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jBuscar)
                        .addGap(80, 80, 80)
                        .addComponent(jButton1)
                        .addGap(28, 28, 28)
                        .addComponent(jSalir)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(292, 292, 292))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBuscar)
                        .addComponent(jButton1)
                        .addComponent(jSalir))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jfecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(jfecha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // limpiar
        limpiarTabla();
        llenarTabla();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarActionPerformed
        try {
            java.util.Date fechaInicio = jfecha1.getDate();
            java.util.Date fechaFin = jfecha2.getDate();
            if (fechaInicio == null || fechaFin == null) {
                JOptionPane.showMessageDialog(this, "Debe ingresar ambas fechas.");
                return;
            }
            Instant instant2 = fechaFin.toInstant();
            Instant instant = fechaInicio.toInstant();
            LocalDateTime FechaInicioFiltro = instant.atZone(ZoneId.systemDefault()).toLocalDateTime();
            LocalDateTime FechaFinFiltro = instant2.atZone(ZoneId.systemDefault()).toLocalDateTime();
            System.out.println(FechaInicioFiltro + "      " + FechaFinFiltro);
            List<Siniestro> siniestrosRecientes = siniestrodata.listarSiniestrosRecientes(FechaInicioFiltro, FechaFinFiltro);
            modelo.setRowCount(0);
            for (Siniestro siniestroActual : siniestrosRecientes) {
                LocalDateTime fechaSiniestro = siniestroActual.getFechaSiniestro();
                LocalDate fechaSiniestroSoloFecha = fechaSiniestro.toLocalDate();

                LocalDateTime fechaResolucion = siniestroActual.getFechaResolucion();
                LocalDate fechaResolucionSoloFecha = fechaResolucion.toLocalDate();

                modelo.addRow(new Object[]{
                    siniestroActual.getTipoSiniestro(),
                    siniestroActual.getCoordenadaX(),
                    siniestroActual.getCoordenadaY(),
                    siniestroActual.getCodigoBrigada(),
                    siniestroActual.getDetalles(),
                    fechaSiniestroSoloFecha,
                    fechaResolucionSoloFecha,
                    siniestroActual.getCalificacion()
                });

            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Error en el formato de las fechas.");
        }

    }//GEN-LAST:event_jBuscarActionPerformed

    private void jSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBuscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JTable jHistorial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private com.toedter.calendar.JDateChooser jfecha1;
    private com.toedter.calendar.JDateChooser jfecha2;
    // End of variables declaration//GEN-END:variables

    private void llenarTabla() {
        modelo.setRowCount(0);
        listarSiniestros = siniestrodata.listarTodosLosSiniestrosOrdenadosPorFechaResolucion();
        for (Siniestro aux : listarSiniestros) {
            LocalDateTime fechaSiniestro = aux.getFechaSiniestro();
            LocalDate fechaSiniestroSoloFecha = fechaSiniestro.toLocalDate();

            LocalDateTime fechaResolucion = aux.getFechaResolucion();
            LocalDate fechaResolucionSoloFecha = null;
            if (fechaResolucion != null) {
                fechaResolucionSoloFecha = fechaResolucion.toLocalDate();
            }

            modelo.addRow(new Object[]{aux.getTipoSiniestro(), aux.getCoordenadaX(), aux.getCoordenadaY(), aux.getCodigoBrigada(), aux.getDetalles(), fechaSiniestroSoloFecha, fechaResolucionSoloFecha, aux.getCalificacion()});
        }
    }

    private void limpiarTabla() {
        int filas = modelo.getRowCount();
        for (int i = filas - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    private void ArmarTabla() {
        modelo.addColumn("Tipo");
        modelo.addColumn("CorX");
        modelo.addColumn("CorY");
        modelo.addColumn("Brigada");
        modelo.addColumn("Detalle");
        modelo.addColumn("F.Inicio");
        modelo.addColumn("F.Resolucion");
        modelo.addColumn("puntuacion");
        jHistorial.setModel(modelo);
        // this.setLocationRelativeTo(null);
        this.setResizable(false);

    }

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
