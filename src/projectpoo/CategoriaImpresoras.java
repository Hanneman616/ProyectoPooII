/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpoo;

import Clases.Impresora;
import Clases.TiendaElectrodomesticos;

/**
 *
 * @author Juanpaa
 */
public class CategoriaImpresoras extends javax.swing.JPanel {

     TiendaElectrodomesticos tiendaElectrodomesticos;
    /**
     * Creates new form CategoriaImpresoras
     */
    public CategoriaImpresoras() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        lblTipoFuncionamiento = new javax.swing.JLabel();
        cmbTipoFuncionamiento = new javax.swing.JComboBox<>();
        cmbMarcas = new javax.swing.JComboBox<>();
        rbTinta = new javax.swing.JRadioButton();
        rbResma = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        lblCantidad = new javax.swing.JLabel();
        cmbCantidad = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Marcas:");

        lblTipoFuncionamiento.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblTipoFuncionamiento.setText("Tipo de Funcionamiento:");

        cmbTipoFuncionamiento.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cmbTipoFuncionamiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tinta Recargable", "Tinta Continua", " " }));

        cmbMarcas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hp", "Canon", "Epson", " " }));
        cmbMarcas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMarcasActionPerformed(evt);
            }
        });

        rbTinta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        rbTinta.setText("Botes de tinta (RGB)");

        rbResma.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        rbResma.setText("Resma de hojas");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/carrito.png"))); // NOI18N
        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblCantidad.setText("Cantidad:");

        cmbCantidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jLabel8.setText("NewbieSoftware");
        jLabel8.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(rbResma)
                        .addGap(446, 446, 446))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblTipoFuncionamiento)
                                        .addGap(34, 34, 34))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmbMarcas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(68, 68, 68)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cmbCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cmbTipoFuncionamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(rbTinta))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoFuncionamiento)
                    .addComponent(cmbTipoFuncionamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbMarcas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(rbResma)
                .addGap(18, 18, 18)
                .addComponent(rbTinta)
                .addGap(32, 32, 32)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbMarcasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMarcasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbMarcasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        double precioExtras = 0;
        double precioFinal = 0;
        int Cantidad = Integer.parseInt((String) cmbCantidad.getSelectedItem());
        String TipoFuncionamiento = (String) cmbTipoFuncionamiento.getSelectedItem();
        String Marca = (String) cmbMarcas.getSelectedItem();

        if(rbResma.isSelected()){
            precioExtras+=5.15;
        }
         if(rbTinta.isSelected()){
            precioExtras+=23.25;
        }
        
        tiendaElectrodomesticos = new Impresora("Impresora" ,Cantidad, precioExtras, Marca, TipoFuncionamiento);
        precioFinal =((Impresora)tiendaElectrodomesticos).calcularPrecio();
        tiendaElectrodomesticos.setPrecioFinal(precioFinal);
        
        Array.tiendaArray.add(tiendaElectrodomesticos);
        
        System.out.println(Array.tiendaArray);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbCantidad;
    private javax.swing.JComboBox<String> cmbMarcas;
    private javax.swing.JComboBox<String> cmbTipoFuncionamiento;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblTipoFuncionamiento;
    private javax.swing.JRadioButton rbResma;
    private javax.swing.JRadioButton rbTinta;
    // End of variables declaration//GEN-END:variables
}
