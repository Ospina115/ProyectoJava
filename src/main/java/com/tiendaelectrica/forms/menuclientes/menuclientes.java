/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.tiendaelectrica.forms.menuclientes;
import com.tiendaelectrica.menuprincipal.menuprincipal;

/**
 *
 * @author camper
 */
public class menuclientes extends javax.swing.JFrame {

    /**
     * Creates new form menuclientes
     */
    public menuclientes() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        reportes = new javax.swing.JButton();
        proveedores = new javax.swing.JButton();
        compras = new javax.swing.JButton();
        ventas = new javax.swing.JButton();
        clientes = new javax.swing.JButton();
        inventario = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        regresar = new javax.swing.JButton();
        eliminarcliente = new javax.swing.JButton();
        buscarcliente = new javax.swing.JButton();
        editarcliente = new javax.swing.JButton();
        crearcliente = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        reportes.setBackground(new java.awt.Color(204, 255, 255));
        reportes.setFont(new java.awt.Font("aakar", 2, 24)); // NOI18N
        reportes.setText("REPORTES");

        proveedores.setBackground(new java.awt.Color(204, 255, 255));
        proveedores.setFont(new java.awt.Font("aakar", 2, 24)); // NOI18N
        proveedores.setText("PROVEEDORES");

        compras.setBackground(new java.awt.Color(204, 255, 255));
        compras.setFont(new java.awt.Font("aakar", 2, 24)); // NOI18N
        compras.setText("COMPRAS");

        ventas.setBackground(new java.awt.Color(204, 255, 255));
        ventas.setFont(new java.awt.Font("aakar", 2, 24)); // NOI18N
        ventas.setText("VENTAS");

        clientes.setBackground(new java.awt.Color(204, 255, 255));
        clientes.setFont(new java.awt.Font("aakar", 2, 24)); // NOI18N
        clientes.setText("CLIENTES");

        inventario.setBackground(new java.awt.Color(204, 255, 255));
        inventario.setFont(new java.awt.Font("aakar", 2, 24)); // NOI18N
        inventario.setText("INVENTARIO");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setText("ENU PRINCIPAL");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        regresar.setBackground(new java.awt.Color(255, 204, 204));
        regresar.setFont(new java.awt.Font("aakar", 2, 24)); // NOI18N
        regresar.setText("Regresar al Menu Principal");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        eliminarcliente.setBackground(new java.awt.Color(204, 255, 255));
        eliminarcliente.setFont(new java.awt.Font("aakar", 2, 24)); // NOI18N
        eliminarcliente.setText("Eliminar Cliente");
        eliminarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarclienteActionPerformed(evt);
            }
        });

        buscarcliente.setBackground(new java.awt.Color(204, 255, 255));
        buscarcliente.setFont(new java.awt.Font("aakar", 2, 24)); // NOI18N
        buscarcliente.setText("Buscar Cliente");
        buscarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarclienteActionPerformed(evt);
            }
        });

        editarcliente.setBackground(new java.awt.Color(204, 255, 255));
        editarcliente.setFont(new java.awt.Font("aakar", 2, 24)); // NOI18N
        editarcliente.setText("Editar Cliente");
        editarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarclienteActionPerformed(evt);
            }
        });

        crearcliente.setBackground(new java.awt.Color(204, 255, 255));
        crearcliente.setFont(new java.awt.Font("aakar", 2, 24)); // NOI18N
        crearcliente.setText("Crear Cliente");
        crearcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearclienteActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 204));
        jLabel2.setText("MENU CLIENTES");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buscarcliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eliminarcliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(regresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editarcliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(crearcliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addGap(42, 42, 42)
                .addComponent(crearcliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editarcliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buscarcliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(eliminarcliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(regresar)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        this.dispose();
        menuprincipal menu = new menuprincipal();
        menu.setVisible(true);
    }//GEN-LAST:event_regresarActionPerformed

    private void eliminarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarclienteActionPerformed
        // AQUI VA EL CODIGO Y LO LOGICO DE LA PARTE DE COMPRAS
    }//GEN-LAST:event_eliminarclienteActionPerformed

    private void buscarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarclienteActionPerformed
        // AQUI VA EL CODIGO Y LO LOGICO DE LA PARTE DEL VENTAS
    }//GEN-LAST:event_buscarclienteActionPerformed

    private void editarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarclienteActionPerformed
        // AQUI VA EL CODIGO Y LO LOGICO DE LA PARTE DE CLIENTES
    }//GEN-LAST:event_editarclienteActionPerformed

    private void crearclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearclienteActionPerformed
        // AQUI VA EL CODIGO Y LO LOGICO DE LA PARTE DEL INVENTARIO
    }//GEN-LAST:event_crearclienteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(menuclientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuclientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuclientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuclientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuclientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarcliente;
    private javax.swing.JButton clientes;
    private javax.swing.JButton compras;
    private javax.swing.JButton crearcliente;
    private javax.swing.JButton editarcliente;
    private javax.swing.JButton eliminarcliente;
    private javax.swing.JButton inventario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton proveedores;
    private javax.swing.JButton regresar;
    private javax.swing.JButton reportes;
    private javax.swing.JButton ventas;
    // End of variables declaration//GEN-END:variables
}
