/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RAFLI NUR FAUZI P
 */
public class latihan3 extends javax.swing.JFrame {

    /**
     * Creates new form latihan3
     */
    public latihan3() {
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

        bilangan1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        hasil = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnkurang = new javax.swing.JButton();
        btnkali = new javax.swing.JButton();
        btnbagi = new javax.swing.JButton();
        btntambah = new javax.swing.JButton();
        bilangan2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(bilangan1);
        bilangan1.setBounds(130, 60, 110, 40);

        jLabel1.setText("operator");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(160, 160, 110, 30);

        hasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasilActionPerformed(evt);
            }
        });
        getContentPane().add(hasil);
        hasil.setBounds(150, 250, 80, 40);

        jLabel2.setText("hasil");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 260, 50, 20);

        jLabel3.setText("bilangan 2");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 120, 70, 20);

        btnkurang.setText("-");
        btnkurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkurangActionPerformed(evt);
            }
        });
        getContentPane().add(btnkurang);
        btnkurang.setBounds(270, 190, 50, 40);

        btnkali.setText("X");
        btnkali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkaliActionPerformed(evt);
            }
        });
        getContentPane().add(btnkali);
        btnkali.setBounds(50, 190, 50, 40);

        btnbagi.setText(":");
        btnbagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbagiActionPerformed(evt);
            }
        });
        getContentPane().add(btnbagi);
        btnbagi.setBounds(120, 190, 50, 40);

        btntambah.setText("+");
        btntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahActionPerformed(evt);
            }
        });
        getContentPane().add(btntambah);
        btntambah.setBounds(190, 190, 50, 40);
        getContentPane().add(bilangan2);
        bilangan2.setBounds(130, 110, 110, 40);

        jLabel4.setText("bilangan 1");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 70, 70, 20);

        jLabel5.setText("calculator");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(140, 20, 110, 30);

        setBounds(0, 0, 416, 339);
    }// </editor-fold>//GEN-END:initComponents

    private void hasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hasilActionPerformed

    private void btnkurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkurangActionPerformed
        int bil1 = Integer.parseInt(bilangan1.getText());
        int bil2 = Integer.parseInt(bilangan2.getText());
        int Hasil = bil1-bil2;
        hasil.setText(String.valueOf(Hasil));// TODO add your handling code here:
    }//GEN-LAST:event_btnkurangActionPerformed

    private void btnkaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkaliActionPerformed
        int bil1 = Integer.parseInt(bilangan1.getText());
        int bil2 = Integer.parseInt(bilangan2.getText());
        int Hasil = bil1*bil2;
        hasil.setText(String.valueOf(Hasil));
    }//GEN-LAST:event_btnkaliActionPerformed

    private void btnbagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbagiActionPerformed
        double bil1 = Double.parseDouble(bilangan1.getText());
        double bil2 = Double.parseDouble(bilangan2.getText());
        double Hasil = bil1/bil2;
        hasil.setText(String.valueOf(Hasil));// TODO add your handling code here:
    }//GEN-LAST:event_btnbagiActionPerformed

    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
        int bil1 = Integer.parseInt(bilangan1.getText());
        int bil2 = Integer.parseInt(bilangan2.getText());
        int Hasil = bil1+bil2;
        hasil.setText(String.valueOf(Hasil));// TODO add your handling code here:
    }//GEN-LAST:event_btntambahActionPerformed

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
            java.util.logging.Logger.getLogger(latihan3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(latihan3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(latihan3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(latihan3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new latihan3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bilangan1;
    private javax.swing.JTextField bilangan2;
    private javax.swing.JButton btnbagi;
    private javax.swing.JButton btnkali;
    private javax.swing.JButton btnkurang;
    private javax.swing.JButton btntambah;
    private javax.swing.JTextField hasil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
