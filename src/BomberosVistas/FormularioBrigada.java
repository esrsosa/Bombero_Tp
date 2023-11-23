/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BomberosVistas;

import BomberoAcceesoDatos.BomberoData;
import BomberoAcceesoDatos.BrigadaData;
import BomberoAcceesoDatos.CuartelData;
import BomberoAcceesoDatos.SiniestrosData;
import BomberosEntidades.Bombero;
import BomberosEntidades.Cuartel;
import BomberosEntidades.Especialidad;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import BomberosEntidades.Brigada;
import BomberosEntidades.Siniestro;

/**
 *
 * @author pollo
 */
public class FormularioBrigada extends javax.swing.JInternalFrame {

    private BomberoData bomberodata = new BomberoData();
    private Bombero bomberoActual = null;
    private FormularioBrigada brigada;
    CuartelData cd = new CuartelData();
    private List<Cuartel> listaCuartel = cd.listaCuarteles();
    private BrigadaData bData = new BrigadaData();
    DefaultTableModel modelo = new DefaultTableModel();
    List<Bombero> listarBomberos = bomberodata.listaBomberos();
    private List<BomberosEntidades.Brigada> listaBrigadas = bData.listarBrigadasLibres();
    DefaultComboBoxModel comboModelo = new DefaultComboBoxModel(listaCuartel.toArray());
    DefaultTableModel modelo2 = new DefaultTableModel();
    private SiniestrosData sn = new SiniestrosData();
    List<Siniestro> listarSiniestro = sn.listarSiniestros();
    List<BomberosEntidades.Brigada> brigadas = bData.listarBrigadasLibres();

    /**
     * Creates new form Brigada
     */
    public FormularioBrigada() {
        initComponents();
        armarTabla2();
        llenarTipo();
        ArmarTabla();
        llenarTablaSiniestro();
        llenarCuartel();
        llenarTabla();
    }

    private void ArmarTabla() {
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Especialidad");
        jTabla.setModel(modelo);
    }

    //
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        liompiarfasasdasd = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jCtipo = new javax.swing.JComboBox<>();
        jcCuartel = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableSiniestro = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        jLabel1.setText("Brigada");

        jLabel2.setText("Nombre: ");

        jLabel3.setText("Especialida:");

        jLabel4.setText("Cuartel: ");

        jTabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTabla);

        jButton1.setText("Selecionar");

        liompiarfasasdasd.setText("Limpiar");
        liompiarfasasdasd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                liompiarfasasdasdActionPerformed(evt);
            }
        });

        jButton3.setText("Nuevo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setText("Salir");

        jCtipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCtipoActionPerformed(evt);
            }
        });

        jTableSiniestro.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTableSiniestro);

        jLabel5.setText("Siniestros");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(7, 7, 7)
                                .addComponent(jCtipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(1, 1, 1)
                                .addComponent(jtNombre))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(7, 7, 7)
                                .addComponent(jcCuartel, 0, 145, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(liompiarfasasdasd)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(79, 79, 79))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(355, 355, 355)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(349, 349, 349)
                        .addComponent(jLabel5)))
                .addContainerGap(439, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jCtipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jcCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton5)
                            .addComponent(liompiarfasasdasd))
                        .addGap(83, 83, 83))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try {
            Cuartel cuartel;
            Brigada brigada;
            String nombre = jtNombre.getText();
            Especialidad esp = (Especialidad) jCtipo.getSelectedItem();
            cuartel = (Cuartel) jcCuartel.getSelectedItem();
            brigada = new Brigada(nombre, esp, cuartel);
            bData.agregarBrigada(brigada);
            llenarTabla();

        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(this, "No debe haber campos vacios ");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jCtipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCtipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCtipoActionPerformed

    private void liompiarfasasdasdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_liompiarfasasdasdActionPerformed
        // TODO add your handling code here:
        limpiarCampos();

    }//GEN-LAST:event_liompiarfasasdasdActionPerformed
    private void limpiarCampos() {
        jtNombre.setText("");
        jCtipo.setSelectedIndex(0);
        jcCuartel.setSelectedIndex(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<Especialidad> jCtipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTabla;
    private javax.swing.JTable jTableSiniestro;
    private javax.swing.JComboBox<Cuartel> jcCuartel;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JButton liompiarfasasdasd;
    // End of variables declaration//GEN-END:variables
public void llenarTipo() {
        for (Especialidad tipo : Especialidad.values()) {
            jCtipo.addItem(tipo);
        }
    }

    public void llenarTablaSiniestro() {
        modelo2.setRowCount(0);
        for (Siniestro aux : listarSiniestro) {
            String codigo="No asignada";
            if (aux.getCodigoBrigada()!=null) {
                codigo=""+aux.getCodigoBrigada().getCodBrigada()+"-"+aux.getCodigoBrigada().getNombreBrigada();
            }
            modelo2.addRow(new Object[]{aux.getCodigo(), aux.getFechaSiniestro(), aux.getTipoSiniestro(),codigo, aux.getDetalles()});
        }
    }

    public void armarTabla2() {

        modelo2.addColumn("Codigo");
        modelo2.addColumn("Fecha");
        modelo2.addColumn("Tipo");
        modelo2.addColumn("CodBrigada");
        modelo2.addColumn("Detalles");
        jTableSiniestro.setModel(modelo2);
    }

    public void llenarCuartel() {
        jcCuartel.setModel(comboModelo);
    }

    private void llenarTabla() {
        modelo.setRowCount(0);
        for (Brigada aux : brigadas) {
            modelo.addRow(new Object[]{aux.getCodBrigada(), aux.getNombreBrigada(), aux.getEspecialidad()});
        }

    }
}
