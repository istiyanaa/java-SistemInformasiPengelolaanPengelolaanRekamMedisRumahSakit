/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forms;

/**
 *
 * @author ASUS
 */
public class frameutama extends javax.swing.JFrame {
    
    /**
     * Creates new form frameutama
     */
    public frameutama() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frmdok = new javax.swing.JButton();
        frmpsn = new javax.swing.JButton();
        frmpwt = new javax.swing.JButton();
        frmpmrksa = new javax.swing.JButton();
        frmruang = new javax.swing.JButton();
        frmobat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        frmdok.setText("FORM Dokter");
        frmdok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmdokActionPerformed(evt);
            }
        });

        frmpsn.setText("FORM Pasien");
        frmpsn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmpsnActionPerformed(evt);
            }
        });

        frmpwt.setText("FORM Perawat");
        frmpwt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmpwtActionPerformed(evt);
            }
        });

        frmpmrksa.setText("FORM Pemeriksaaan");
        frmpmrksa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmpmrksaActionPerformed(evt);
            }
        });

        frmruang.setText("FORM Ruang");
        frmruang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmruangActionPerformed(evt);
            }
        });

        frmobat.setText("FORM Obat");
        frmobat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmobatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(frmpmrksa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(frmpwt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(frmpsn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(frmdok, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(frmruang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(frmobat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(frmdok)
                .addGap(18, 18, 18)
                .addComponent(frmpsn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(frmpwt)
                .addGap(18, 18, 18)
                .addComponent(frmpmrksa)
                .addGap(18, 18, 18)
                .addComponent(frmruang)
                .addGap(18, 18, 18)
                .addComponent(frmobat)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void frmdokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmdokActionPerformed

        framedokter frmdok = new framedokter();
        frmdok.setVisible(true);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_frmdokActionPerformed

    private void frmpsnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmpsnActionPerformed

        framepasien frmpsn = new framepasien();
        frmpsn.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_frmpsnActionPerformed

    private void frmpwtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmpwtActionPerformed

        frameperawat frmpwt = new frameperawat();
        frmpwt.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_frmpwtActionPerformed

    private void frmpmrksaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmpmrksaActionPerformed

        framepemeriksaan frmpmrksa = new framepemeriksaan();
        frmpmrksa.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_frmpmrksaActionPerformed

    private void frmruangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmruangActionPerformed

        frameruang frmruang = new frameruang();
        frmruang.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_frmruangActionPerformed

    private void frmobatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmobatActionPerformed

        frameobat frmobat = new frameobat();
        frmobat.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_frmobatActionPerformed

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
            java.util.logging.Logger.getLogger(frameutama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameutama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameutama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameutama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameutama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton frmdok;
    private javax.swing.JButton frmobat;
    private javax.swing.JButton frmpmrksa;
    private javax.swing.JButton frmpsn;
    private javax.swing.JButton frmpwt;
    private javax.swing.JButton frmruang;
    // End of variables declaration//GEN-END:variables
}
