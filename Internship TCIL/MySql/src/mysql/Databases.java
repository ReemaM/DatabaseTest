/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysql;

/**
 *
 * @author ReemaM
 */
public class Databases extends javax.swing.JPanel {

    /**
     * Creates new form MainP
     */
    public Databases() {
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

        Mc = new javax.swing.JButton();
        In = new javax.swing.JButton();
        Al = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        Mc.setText("Material Code");
        Mc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                McActionPerformed(evt);
            }
        });

        In.setText("Inventory");
        In.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InActionPerformed(evt);
            }
        });

        Al.setText("Allopment");
        Al.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        jLabel1.setText("Please choose which database you want");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Mc, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(In, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Al, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(126, 126, 126))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(Mc)
                .addGap(31, 31, 31)
                .addComponent(Al)
                .addGap(37, 37, 37)
                .addComponent(In)
                .addContainerGap(85, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void McActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_McActionPerformed
        // TODO add your handling code here:
      MainClass.showMaterialCode();
    }//GEN-LAST:event_McActionPerformed

    private void AlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlActionPerformed
        // TODO add your handling code here:
        MainClass.showAllopment();
    }//GEN-LAST:event_AlActionPerformed

    private void InActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InActionPerformed
        // TODO add your handling code here:
        MainClass.showInventory();
    }//GEN-LAST:event_InActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Al;
    private javax.swing.JButton In;
    private javax.swing.JButton Mc;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
