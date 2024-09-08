/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.tiendaelectrica.forms.menuinventario;

import com.tiendaelectrica.menuprincipal.menuprincipal;

/**
 *
 * @author camper
 */
public class menuinventario extends javax.swing.JFrame {

    /**
     * Creates new form menuinventario
     */
    public menuinventario() {
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

        jLabel2 = new javax.swing.JLabel();
        registrarcompra = new javax.swing.JButton();
        editarcompra = new javax.swing.JButton();
        buscarcompra = new javax.swing.JButton();
        eliminarcompra = new javax.swing.JButton();
        regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 204));
        jLabel2.setText("MENU INVENTARIO");

        registrarcompra.setBackground(new java.awt.Color(204, 255, 255));
        registrarcompra.setFont(new java.awt.Font("aakar", 2, 24)); // NOI18N
        registrarcompra.setText("Registrar Compra");
        registrarcompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarcompraActionPerformed(evt);
            }
        });

        editarcompra.setBackground(new java.awt.Color(204, 255, 255));
        editarcompra.setFont(new java.awt.Font("aakar", 2, 24)); // NOI18N
        editarcompra.setText("Editar Compra");
        editarcompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarcompraActionPerformed(evt);
            }
        });

        buscarcompra.setBackground(new java.awt.Color(204, 255, 255));
        buscarcompra.setFont(new java.awt.Font("aakar", 2, 24)); // NOI18N
        buscarcompra.setText("Buscar Compra");
        buscarcompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarcompraActionPerformed(evt);
            }
        });

        eliminarcompra.setBackground(new java.awt.Color(204, 255, 255));
        eliminarcompra.setFont(new java.awt.Font("aakar", 2, 24)); // NOI18N
        eliminarcompra.setText("Eliminar Compra");
        eliminarcompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarcompraActionPerformed(evt);
            }
        });

        regresar.setBackground(new java.awt.Color(255, 204, 204));
        regresar.setFont(new java.awt.Font("aakar", 2, 24)); // NOI18N
        regresar.setText("Regresar al Menu Principal");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buscarcompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eliminarcompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(regresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editarcompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(registrarcompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addGap(42, 42, 42)
                .addComponent(registrarcompra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editarcompra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buscarcompra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(eliminarcompra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(regresar)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrarcompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarcompraActionPerformed
        // AQUI VA EL CODIGO Y LO LOGICO DE LA PARTE DEL INVENTARIO
    }//GEN-LAST:event_registrarcompraActionPerformed

    private void editarcompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarcompraActionPerformed
        // AQUI VA EL CODIGO Y LO LOGICO DE LA PARTE DE CLIENTES
    }//GEN-LAST:event_editarcompraActionPerformed

    private void buscarcompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarcompraActionPerformed
        // AQUI VA EL CODIGO Y LO LOGICO DE LA PARTE DEL VENTAS
    }//GEN-LAST:event_buscarcompraActionPerformed

    private void eliminarcompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarcompraActionPerformed
        // AQUI VA EL CODIGO Y LO LOGICO DE LA PARTE DE COMPRAS
    }//GEN-LAST:event_eliminarcompraActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        this.dispose();
        menuprincipal menu = new menuprincipal();
        menu.setVisible(true);
    }//GEN-LAST:event_regresarActionPerformed

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
            java.util.logging.Logger.getLogger(menuinventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuinventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuinventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuinventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuinventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarcompra;
    private javax.swing.JButton editarcompra;
    private javax.swing.JButton eliminarcompra;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton registrarcompra;
    private javax.swing.JButton regresar;
    // End of variables declaration//GEN-END:variables
}
