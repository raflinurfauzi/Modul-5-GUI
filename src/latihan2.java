/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RAFLI NUR FAUZI P
 */
public class latihan2 extends javax.swing.JFrame {

    /**
     * Creates new form latihan2
     */
    public latihan2() {
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

        jLabel1 = new javax.swing.JLabel();
        alamat = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        absen = new javax.swing.JTextField();
        kelas = new javax.swing.JTextField();
        proses = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        hasil = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("alamat");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 170, 50, 14);
        getContentPane().add(alamat);
        alamat.setBounds(120, 160, 190, 30);
        getContentPane().add(nama);
        nama.setBounds(120, 40, 190, 30);
        getContentPane().add(absen);
        absen.setBounds(120, 80, 190, 30);
        getContentPane().add(kelas);
        kelas.setBounds(120, 120, 190, 30);

        proses.setText("proses");
        proses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prosesActionPerformed(evt);
            }
        });
        getContentPane().add(proses);
        proses.setBounds(20, 240, 73, 23);

        hasil.setColumns(20);
        hasil.setRows(5);
        jScrollPane1.setViewportView(hasil);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(120, 200, 190, 140);

        jLabel2.setText("formulir");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(160, 20, 36, 20);

        jLabel3.setText("nama");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 50, 50, 14);

        jLabel4.setText("absen");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 90, 60, 14);

        jLabel5.setText("kelas");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 130, 50, 14);

        setBounds(0, 0, 416, 395);
    }// </editor-fold>//GEN-END:initComponents

    private void prosesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prosesActionPerformed
    String Nama = nama.getText();
        String Absen = absen.getText();
        String Kelas = kelas.getText();
        String Alamat = alamat.getText();
        
        hasil.setText("Nama siswa       :  "+Nama+"\n"+
                      "Absen siswa      :  "+Absen+"\n"+
                      "Kelas siswa      :  "+Kelas+"\n"+
                      "Alamat siswa     :  "+Alamat);        // TODO add your handling code here:
    }//GEN-LAST:event_prosesActionPerformed

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
            java.util.logging.Logger.getLogger(latihan2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(latihan2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(latihan2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(latihan2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new latihan2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField absen;
    private javax.swing.JTextField alamat;
    private javax.swing.JTextArea hasil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kelas;
    private javax.swing.JTextField nama;
    private javax.swing.JButton proses;
    // End of variables declaration//GEN-END:variables
}