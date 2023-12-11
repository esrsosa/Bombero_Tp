/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BomberosVistas;

import BomberoAcceesoDatos.CuartelData;
import BomberoAcceesoDatos.SiniestrosData;
import BomberosEntidades.Cuartel;
import BomberosEntidades.Siniestro;
import java.awt.Graphics;
import java.awt.Image;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pollo
 */
public class CalcularDistancia extends javax.swing.JInternalFrame {

    private SiniestrosData sd = new SiniestrosData();
    private CuartelData cd = new CuartelData();
    private List<Siniestro> listaSiniestros = sd.listarSiniestroSinResolver();
    private List<Cuartel> listaCuartel = cd.listaCuarteles();

    DefaultComboBoxModel comboModelo = new DefaultComboBoxModel(listaSiniestros.toArray());
    DefaultTableModel modelo = new DefaultTableModel();
    DefaultTableModel modelo2 = new DefaultTableModel();
    FondoPanel fondo = new FondoPanel();

    /**
     * Creates new form CalcularDistancia
     */
    public CalcularDistancia() {
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
        this.setContentPane(fondo);
        initComponents();
        armarTabla();
        armarTabla2();
        llenarTablaCuartel();
        llenarTablaSiniestro();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jPanel1 = new FondoPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtCuartel = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jCuartelCercano = new javax.swing.JButton();
        jbSeleccionar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtSiniestro = new javax.swing.JTable();
        jtResultado = new javax.swing.JLabel();
        jCercano = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jScrollPane2.setViewportView(jTextPane1);

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setForeground(java.awt.Color.white);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Siniestro");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, -1, -1));

        jtCuartel.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jtCuartel);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 98, -1, 101));

        jLabel9.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Cuartel");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, -1, -1));

        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 421, -1, -1));

        jLabel11.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Seleccione un siniestro ");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, -1, -1));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Yu Gothic Medium", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("CALCULAR DISTANCIA");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, -1, -1));

        jCuartelCercano.setText("Cuartel cercano");
        jCuartelCercano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCuartelCercanoActionPerformed(evt);
            }
        });
        jPanel1.add(jCuartelCercano, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, -1, -1));

        jbSeleccionar.setText("Seleccionar");
        jbSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSeleccionarActionPerformed(evt);
            }
        });
        jPanel1.add(jbSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, -1, -1));

        jtSiniestro.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(jtSiniestro);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 239, -1, 94));

        jtResultado.setBackground(new java.awt.Color(204, 204, 204));
        jtResultado.setFont(new java.awt.Font("Eras Demi ITC", 1, 14)); // NOI18N
        jtResultado.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 380, 180, 28));

        jCercano.setBackground(new java.awt.Color(204, 204, 204));
        jCercano.setFont(new java.awt.Font("Eras Demi ITC", 1, 14)); // NOI18N
        jCercano.setForeground(new java.awt.Color(204, 204, 204));
        jCercano.setText("           ");
        jPanel1.add(jCercano, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, 180, 28));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jbSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSeleccionarActionPerformed
        // TODO add your handling code here:
        try {
            int filaSeleccionada = jtSiniestro.getSelectedRow();
            int filaSeleccionada2 = jtCuartel.getSelectedRow();
            if (filaSeleccionada != -1 && filaSeleccionada2 != -1) {
                Object valorCoordx = jtSiniestro.getValueAt(filaSeleccionada, 1);
                Object valorCoordy = jtSiniestro.getValueAt(filaSeleccionada, 2);
                Object nombre = jtCuartel.getValueAt(filaSeleccionada2, 0);
                int X1 = Integer.parseInt(valorCoordx.toString());
                int Y1 = Integer.parseInt(valorCoordy.toString());
                double distanciaMinima = Double.MAX_VALUE;
                for (Cuartel cuartel : listaCuartel) {
                    if (nombre.equals(cuartel.getNombre())) {
                        int X2 = cuartel.getCoordenadax();
                        int Y2 = cuartel.getCoordenaday();
                        double distancia = Math.sqrt(Math.pow(X2 - X1, 2) + Math.pow(Y2 - Y1, 2));
                        if (distancia < distanciaMinima) {
                            distanciaMinima = distancia;
                        }
                        jtResultado.setText(nombre+" "+String.format("%.2f", distanciaMinima) + "Km");
                    }
                }

            } else {
                JOptionPane.showMessageDialog(this, "Fila seleccionada invalida");
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Los datos tomados del sistema son incorrectos ");
        }
    }//GEN-LAST:event_jbSeleccionarActionPerformed

    private void jCuartelCercanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCuartelCercanoActionPerformed
        // TODO add your handling code here:
        try {
            int filaSeleccionada = jtSiniestro.getSelectedRow();
            int filaSeleccionada2 = jtCuartel.getSelectedRow();
            if (filaSeleccionada != -1) {
                Object valorCoordx = jtSiniestro.getValueAt(filaSeleccionada, 1);
                Object valorCoordy = jtSiniestro.getValueAt(filaSeleccionada, 2);
                int X1 = Integer.parseInt(valorCoordx.toString());
                int Y1 = Integer.parseInt(valorCoordy.toString());
                double distanciaMinima = Double.MAX_VALUE;
                String nombre1 = "";
                for (Cuartel cuartel : listaCuartel) {
                    int X2 = cuartel.getCoordenadax();
                    int Y2 = cuartel.getCoordenaday();
                    double distancia = Math.sqrt(Math.pow(X2 - X1, 2) + Math.pow(Y2 - Y1, 2));
                    if (distancia < distanciaMinima) {
                        distanciaMinima = distancia;
                        nombre1 = cuartel.getNombre();
                    }
                }
                jCercano.setText(nombre1 + " " + String.format("%.2f", distanciaMinima) + "Km");
            } else {
                JOptionPane.showMessageDialog(this, "Fila seleccionada invalida");
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Los datos tomados del sistema son incorrectos ");
        }

    }//GEN-LAST:event_jCuartelCercanoActionPerformed
//    public void limpiar() {
//        jtSiniestro.clearSelection();
//        jtCuartel.clearSelection();
//        jCercano.setText(null);
//        jtResultado.setText(null);
//        jDistancia.setText(null);
//        jTextPane1.setText(null);
//        x1.setText(null);
//        x2.setText(null);
//        y1.setText(null);
//        y2.setText(null);
//
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jCercano;
    private javax.swing.JButton jCuartelCercano;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JButton jbSeleccionar;
    private javax.swing.JTable jtCuartel;
    private javax.swing.JLabel jtResultado;
    private javax.swing.JTable jtSiniestro;
    // End of variables declaration//GEN-END:variables
//  private void calcularDistancia() {
//        try {
//            int X1 = Integer.parseInt(x1.getText().trim());
//            int Y1 = Integer.parseInt(y1.getText().trim());
//            int X2 = Integer.parseInt(x2.getText().trim());
//            int Y2 = Integer.parseInt(y2.getText().trim());
//
//            if (x1.getText() != null && y2.getText() != null && x2.getText() != null && y2.getText() != null) {
//
//                double distancia = Math.sqrt(Math.pow(X2 - X1, 2) + Math.pow(Y2 - Y1, 2));
//                jtResultado.setText(String.format("%.2f", distancia));
//            } else {
//                JOptionPane.showMessageDialog(this, "No puede haber campos vacios");
//            }
//        } catch (NumberFormatException ex) {
//
//            JOptionPane.showMessageDialog(this, "Error: Ingresa números válidos en los campos.");
//        }
//    }

    public void llenarTablaSiniestro() {
        modelo.setRowCount(0);

        for (Siniestro aux : listaSiniestros) {

            modelo.addRow(new Object[]{aux.getDetalles(), aux.getCoordenadaX(), aux.getCoordenadaY()});
        }
    }

    public void llenarTablaCuartel() {
        modelo.setRowCount(0);

        for (Cuartel aux : listaCuartel) {

            modelo2.addRow(new Object[]{aux.getNombre(), aux.getCoordenadax(), aux.getCoordenaday()});
        }
    }

    public void armarTabla2() {
        modelo2.addColumn("Cuartel");
        modelo2.addColumn("CoordenadaX");
        modelo2.addColumn("CoordenadaY");
        jtCuartel.setModel(modelo2);
    }

    public void armarTabla() {
        modelo.addColumn("Tipo de Siniestro");
        modelo.addColumn("CoordenadaX");
        modelo.addColumn("CoordenadaY");
        jtSiniestro.setModel(modelo);
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
