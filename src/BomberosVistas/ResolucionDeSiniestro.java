/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BomberosVistas;

import BomberoAcceesoDatos.SiniestrosData;
import BomberosEntidades.Siniestro;
import static java.lang.System.in;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class ResolucionDeSiniestro extends javax.swing.JInternalFrame {

    private SiniestrosData siniestrodata = new SiniestrosData();
    private Siniestro siniestroActual = null;
    private DefaultTableModel modelo = new DefaultTableModel();
    List<Siniestro> listarSiniestros;

    public ResolucionDeSiniestro() {
        initComponents();
        armarCabecera();
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
        jTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPunto = new javax.swing.JComboBox<>();
        jFecha = new com.toedter.calendar.JDateChooser();
        jGuardar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTCodigo = new javax.swing.JTextField();

        jLabel1.setText("Resolucion del Simiestero");

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane1.setViewportView(jTable);

        jLabel2.setText("Fecha De Resolucion:");

        jLabel3.setText("Puntuacion: ");

        jPunto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));

        jGuardar.setText("Guardar");
        jGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGuardarActionPerformed(evt);
            }
        });

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Codigo: ");

        jTCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTCodigoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(259, 259, 259))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jGuardar)
                        .addGap(58, 58, 58)
                        .addComponent(jButton2)
                        .addGap(234, 234, 234))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPunto, 0, 46, Short.MAX_VALUE)
                                    .addComponent(jTCodigo))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jPunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jGuardar)
                    .addComponent(jButton2))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTCodigoActionPerformed

    private void jGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGuardarActionPerformed
        Resolucion();
    }//GEN-LAST:event_jGuardarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jFecha;
    private javax.swing.JButton jGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox<String> jPunto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTCodigo;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables

    public void armarCabecera() {
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("Codigo");
        filaCabecera.add("Fecha");
        filaCabecera.add("Tipo");
        filaCabecera.add("Brigada");
        filaCabecera.add("Detalles");

        for (Object i : filaCabecera) {
            modelo.addColumn(i);
        }
        jTable.setModel(modelo);
    }

    private void llenarTabla() {
        modelo.setRowCount(0);
        listarSiniestros = siniestrodata.listarSiniestroSinResolver();
        for (Siniestro aux : listarSiniestros) {
            modelo.addRow(new Object[]{aux.getCodigo(), aux.getFechaSiniestro(), aux.getTipoSiniestro(), aux.getCodigoBrigada(), aux.getDetalles()});
        }
    }

    private void Resolucion() {
//      siniestroActual = new Siniestro();
//        Integer codigo = Integer.parseInt(jTCodigo.getText());
//        java.util.Date fecha = jFecha.getDate();
//        LocalDate fechaResolucion = fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//        Integer puntuacion = Integer.parseInt(jPunto.getItemAt(siniestroActual.getCalificacion()));
//        
//        siniestroActual.setCodigo(codigo);
//        siniestroActual.setFechaResolucion( fechaResolucion);
//        siniestroActual.setCalificacion(puntuacion);
//        
//        if (fecha == null) {
//            JOptionPane.showMessageDialog(this, "Debe ingresar una fecha.");
//            return;
//        }
//
//
//
//       siniestrodata.marcarComoResuelto(siniestroActual);
//        modelo.setRowCount(0);
//
//        for (Siniestro siniestro : listarSiniestros) {
//            modelo.addRow(new Object[]{
//                siniestro.getCodigo(),
//                siniestro.getFechaResolucion(),
//                siniestro.getTipoSiniestro(),
//                siniestro.getCodigoBrigada(),
//                siniestro.getDetalles()
//            });
//        }
        siniestroActual = new Siniestro();

        try {
            Integer codigo = Integer.parseInt(jTCodigo.getText());
            java.util.Date fecha = jFecha.getDate();

            if (fecha == null) {
                JOptionPane.showMessageDialog(this, "Debe ingresar una fecha.");
                return;
            }

            LocalDate fechaResolucion = fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            Integer puntuacion = Integer.parseInt(Objects.requireNonNull(jPunto.getSelectedItem()).toString());
            
            LocalDateTime fechaResol = fechaResolucion.atTime(LocalTime.now());
            
            siniestroActual.setCodigo(codigo);
            
            siniestroActual.setFechaResolucion(fechaResol);
            siniestroActual.setCalificacion(puntuacion);

            siniestrodata.marcarComoResuelto(siniestroActual);

            modelo.setRowCount(0);

            for (Siniestro siniestro : listarSiniestros) {
                modelo.addRow(new Object[]{
                    siniestro.getCodigo(),
                    siniestro.getFechaResolucion(),
                    siniestro.getTipoSiniestro(),
                    siniestro.getCodigoBrigada(),
                    siniestro.getDetalles()
                });
            }
        } catch (NumberFormatException ex) {

            JOptionPane.showMessageDialog(this, "Ingrese un código y una puntuación válidos.");
        } catch (NullPointerException ex) {

            JOptionPane.showMessageDialog(this, "Asegúrese de ingresar todos los datos requeridos.");
        }

    }
}
