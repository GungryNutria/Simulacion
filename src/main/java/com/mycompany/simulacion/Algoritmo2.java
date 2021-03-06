/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.simulacion;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author edgar
 */
public class Algoritmo2 extends javax.swing.JFrame {

    Semilla semilla = new Semilla();
    String seed1, seed2;
    private DefaultTableModel table;
    private String[] seeds;

    public Algoritmo2() {
        initComponents();
        table = new DefaultTableModel();
        table.addColumn("Semilla");
        table.addColumn("Semilla");
        table.addColumn("Xi*Xi+1");
        table.addColumn("Xi+1");
        table.addColumn("R");
        this.doc.setModel(table);
        setResizable(false);
        setLocationRelativeTo(null);
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
        one = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        two = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fin = new javax.swing.JTextField();
        lado = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        doc = new javax.swing.JTable();

        jLabel1.setText("X0");

        one.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                oneKeyTyped(evt);
            }
        });

        jLabel2.setText("X1");

        two.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                twoKeyTyped(evt);
            }
        });

        jLabel3.setText("R");

        fin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                finKeyTyped(evt);
            }
        });

        lado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lado", "Izquierda", "Derecha" }));

        jButton1.setText("Generar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        doc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Semilla", "Semilla", "Xi*Xi+1", "Xi+1", "R"
            }
        ));
        jScrollPane1.setViewportView(doc);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fin, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(fin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            for (int i = 0; i < doc.getRowCount(); i++) {
                table.removeRow(i);
                i -= 1;
            }
            seeds = new String[Integer.parseInt(fin.getText() + 1)];
            seed1 = one.getText();
            seed2 = two.getText();
            String Iteration = fin.getText();
            String side = (String) lado.getSelectedItem();
            if ((seed1.charAt(0)) == '-' || (seed2.charAt(0) == '-')) {
                JOptionPane.showMessageDialog(null, "No se aceptan numeros negativos");
            } else {
                if ((seed1.length()) <= 3 || (seed2.length()) <= 3) {
                    JOptionPane.showMessageDialog(null, "La semilla debe ser mayor de 3 caracteres");
                } else {
                    if (side.equals("Lado")) {
                        JOptionPane.showMessageDialog(null, "Escoje un Lado Valido");
                    } else {
                        JOptionPane.showMessageDialog(null, "Generando Semilla");
                        for (int j = 0; j < Integer.parseInt(Iteration); j++) {
                            semilla.newSeedProduct(seed1, seed2, side);
                            System.out.println(semilla.getSeedSingle());
                            String r = semilla.getSeedSingle();
                            String R = "0." + r;
                            table.addRow(new Object[]{seed1, seed2, semilla.getSeedDouble(), semilla.getSeedSingle(), R});
                            seed1 = seed2;
                            seed2 = semilla.getSeedSingle();
                            seeds[j] = seed1;
                            for (int k = 0; k < seeds.length; k++) {
                                if ((seeds[k] == seed1)||(seeds[k] == seed2)) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Algo esta mal o la semilla es 0");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void oneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_oneKeyTyped
        if(Character.isLetter(evt.getKeyChar()) || (evt.getKeyChar()==KeyEvent.VK_SPACE) || (evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
          evt.consume();
      }
    }//GEN-LAST:event_oneKeyTyped

    private void twoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_twoKeyTyped
        if(Character.isLetter(evt.getKeyChar()) || (evt.getKeyChar()==KeyEvent.VK_SPACE) || (evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
          evt.consume();
      }
    }//GEN-LAST:event_twoKeyTyped

    private void finKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_finKeyTyped
        if(Character.isLetter(evt.getKeyChar()) || (evt.getKeyChar()==KeyEvent.VK_SPACE) || (evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)){
          evt.consume();
      }
    }//GEN-LAST:event_finKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Algoritmo1 a1 = new Algoritmo1();
        a1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Algoritmo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Algoritmo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Algoritmo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Algoritmo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Algoritmo2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable doc;
    private javax.swing.JTextField fin;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> lado;
    private javax.swing.JTextField one;
    private javax.swing.JTextField two;
    // End of variables declaration//GEN-END:variables
}
