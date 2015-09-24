/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Dao.AreaDao;
import Dao.Dao;
import Pojos.AreaTrabajo;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ingdonaldo
 */
public class AreasTabajoInternal extends javax.swing.JInternalFrame {

    /**
     * Creates new form AreasTabajoInternal
     */
    boolean Editando = false;
    int id = -1;
    DefaultTableModel dtm = new DefaultTableModel() {

        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }

    };

    public AreasTabajoInternal() {
        initComponents();
        dtm.addColumn("No. area");
        dtm.addColumn("Nombre de area");
        dtm.addColumn("Estado");
        this.jTable1.setModel(dtm);
        CargarDatos();
    }

    public void CargarDatos() {
        btnEditar.setEnabled(false);
        btnAccion.setEnabled(false);
        for (AreaTrabajo a : new AreaDao().getAll()) {
            dtm.addRow(new Object[]{a.getIdArea(), a.getNombreArea(), a.getEstadoArea() ? "Activo" : "Inactivo"});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnAccion = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Areas del hospital");

        jLabel1.setText("Nombre del area");

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(52, 52, 52)
                        .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jButton1)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Registrar areas", jPanel1);

        jTable1.setAutoCreateRowSorter(true);
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btnAccion.setText("Activar/Desactivar");
        btnAccion.setEnabled(false);
        btnAccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccionActionPerformed(evt);
            }
        });

        jLabel2.setText("Buscar");

        btnEditar.setText("Editar");
        btnEditar.setEnabled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAccion))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAccion)
                    .addComponent(btnEditar))
                .addGap(11, 11, 11))
        );

        jTabbedPane1.addTab("Administrar areas", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jTabbedPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        btnAccion.setEnabled(true);
        btnEditar.setEnabled(true);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nombre;

        nombre = Nombre.getText();

        if (nombre.trim().equals("")) {
            JOptionPane.showInternalMessageDialog(this, "El nombre del area no puede ser vacío", "Error", JOptionPane.ERROR_MESSAGE);
        }
        if (!Editando) {
            AreaTrabajo a = new AreaTrabajo();
            a.setNombreArea(nombre);
            a.setEstadoArea(true);

            if (new Dao().Guardar(a) != -1) {
                JOptionPane.showInternalMessageDialog(this, "Guardado exitosamente", "Información", JOptionPane.INFORMATION_MESSAGE);
                Nombre.setText(null);
            } else {
                JOptionPane.showInternalMessageDialog(this, "Error al guardar, por favor intente mas tarde", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
            AreaTrabajo a  = new AreaDao().getById(id);
            if(a == null){
                CargarDatos();
                Editando = false;
                id = -1;
                this.jTabbedPane1.setSelectedIndex(1);
                JOptionPane.showInternalMessageDialog(this, "Error al actualizar, por favor intente mas tarde", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            a.setNombreArea(nombre);
        
            if(!new Dao().Actualizar(a)){
                JOptionPane.showInternalMessageDialog(this, "Error al actualizar, por favor intente mas tarde", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else{
                CargarDatos();
                Editando = false;
                id = -1;
                this.jTabbedPane1.setSelectedIndex(1);
                JOptionPane.showInternalMessageDialog(this, "Actualizado exitosamente", "Información", JOptionPane.INFORMATION_MESSAGE);
            }
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccionActionPerformed
        int index = this.jTable1.getSelectedRow();
        String estado ;
        int id;
        if(index == -1){
            JOptionPane.showInternalMessageDialog(this, "Por favor primero seleccione un area de la tabla", "Error" , JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        estado =  this.jTable1.getValueAt(index, 2).toString();
        id = Integer.parseInt(this.jTable1.getValueAt(index, 0).toString());
        AreaTrabajo a = new AreaDao().getById(id);
        if(estado.equalsIgnoreCase("activo")){
            a.setEstadoArea(false);
        }
        else{
            a.setEstadoArea(true);
        }
        
        if(!new Dao().Actualizar(a)){
                JOptionPane.showInternalMessageDialog(this, "Error al actualizar, por favor intente mas tarde", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else{
                CargarDatos();
                JOptionPane.showInternalMessageDialog(this, "Actualizado exitosamente", "Información", JOptionPane.INFORMATION_MESSAGE);
            }
    }//GEN-LAST:event_btnAccionActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int index = this.jTable1.getSelectedRow();
        if(index == -1){
            JOptionPane.showInternalMessageDialog(this, "Por favor primero seleccione un area de la tabla", "Error" , JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Editando = true;
        id  = Integer.parseInt(this.jTable1.getValueAt(index, 0).toString());
        
        this.jTabbedPane1.setSelectedIndex(0);
        this.Nombre.setText(new AreaDao().getById(id).getNombreArea());
    }//GEN-LAST:event_btnEditarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Nombre;
    private javax.swing.JButton btnAccion;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
