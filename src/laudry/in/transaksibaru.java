/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package laudry.in;

import java.sql.Connection;
import java.awt.Color;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;


/**
 *
 * @author USER
 */
public class transaksibaru extends javax.swing.JFrame {

    /**
     * Creates new form menu
     */
    public transaksibaru() {
        initComponents();
    }
    
    private Connection conn = new koneksi().Connect();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnkembali = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnriwayat = new javax.swing.JButton();
        btntransaksi = new javax.swing.JButton();
        btnpesanan = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txttelp = new javax.swing.JTextField();
        txtalamat = new javax.swing.JTextField();
        txtpelanggan = new javax.swing.JTextField();
        btnselanjutnya = new javax.swing.JButton();
        btnbatal = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                formMouseWheelMoved(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnkembali.setBackground(new java.awt.Color(255, 204, 0));
        btnkembali.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        btnkembali.setText("Kembali");
        btnkembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkembaliActionPerformed(evt);
            }
        });
        getContentPane().add(btnkembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 90, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("LAUNDRY.IN");
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        btnriwayat.setBackground(new java.awt.Color(204, 204, 204));
        btnriwayat.setText("Riwayat Transaksi");
        btnriwayat.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(204, 204, 204), null, null));
        btnriwayat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnriwayatMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnriwayatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnriwayatMouseExited(evt);
            }
        });
        btnriwayat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnriwayatActionPerformed(evt);
            }
        });
        getContentPane().add(btnriwayat, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 160, 30));

        btntransaksi.setBackground(new java.awt.Color(156, 195, 223));
        btntransaksi.setText("Transaksi Baru");
        btntransaksi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(204, 204, 204), null, null));
        btntransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btntransaksiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btntransaksiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btntransaksiMouseExited(evt);
            }
        });
        btntransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntransaksiActionPerformed(evt);
            }
        });
        getContentPane().add(btntransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 160, 30));

        btnpesanan.setBackground(new java.awt.Color(204, 204, 204));
        btnpesanan.setText("Pesanan");
        btnpesanan.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(204, 204, 204), null, null));
        btnpesanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnpesananMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnpesananMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnpesananMouseExited(evt);
            }
        });
        btnpesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpesananActionPerformed(evt);
            }
        });
        getContentPane().add(btnpesanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 160, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("TRANSAKSI BARU");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Nama Pelanggan");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 130, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("No Telepon");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 130, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Alamat");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 130, 30));
        getContentPane().add(txttelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 340, 30));
        getContentPane().add(txtalamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 340, 90));
        getContentPane().add(txtpelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 340, 30));

        btnselanjutnya.setBackground(new java.awt.Color(51, 255, 51));
        btnselanjutnya.setText("Selanjutnya");
        btnselanjutnya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnselanjutnyaActionPerformed(evt);
            }
        });
        getContentPane().add(btnselanjutnya, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 110, -1));

        btnbatal.setBackground(new java.awt.Color(255, 51, 51));
        btnbatal.setText("Batal");
        btnbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbatalActionPerformed(evt);
            }
        });
        getContentPane().add(btnbatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, 110, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uidesain/menu.png"))); // NOI18N
        jLabel1.setDoubleBuffered(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseDragged

    private void formMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_formMouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseWheelMoved

    private void btnkembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkembaliActionPerformed
        // TODO add your handling code here:
        new menu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnkembaliActionPerformed

    private void btnriwayatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnriwayatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnriwayatActionPerformed

    private void btnriwayatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnriwayatMouseEntered
        // TODO add your handling code here:
        btnriwayat.setBackground(new Color(156,195,223));
    }//GEN-LAST:event_btnriwayatMouseEntered

    private void btntransaksiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntransaksiMouseEntered
        // TODO add your handling code here:
        btntransaksi.setBackground(new Color(156,195,223));
    }//GEN-LAST:event_btntransaksiMouseEntered

    private void btntransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntransaksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btntransaksiActionPerformed

    private void btnpesananMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnpesananMouseEntered
        // TODO add your handling code here:
        btnpesanan.setBackground(new Color(156,195,223));
    }//GEN-LAST:event_btnpesananMouseEntered

    private void btnpesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpesananActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnpesananActionPerformed

    private void btntransaksiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntransaksiMouseExited

    }//GEN-LAST:event_btntransaksiMouseExited

    private void btnpesananMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnpesananMouseExited
        // TODO add your handling code here:
        btnpesanan.setBackground(new Color(217,217,217));
    }//GEN-LAST:event_btnpesananMouseExited

    private void btnriwayatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnriwayatMouseExited
        // TODO add your handling code here:
        btnriwayat.setBackground(new Color(217,217,217));
    }//GEN-LAST:event_btnriwayatMouseExited

    private void btntransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntransaksiMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btntransaksiMouseClicked

    private void btnpesananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnpesananMouseClicked
        // TODO add your handling code here:
        btnpesanan.setBackground(new Color(156,195,223));
        new pesanan().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnpesananMouseClicked

    private void btnriwayatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnriwayatMouseClicked
        // TODO add your handling code here:
        btnriwayat.setBackground(new Color(156,195,223));
        new riwayat().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnriwayatMouseClicked

    private void btnselanjutnyaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnselanjutnyaActionPerformed
        // TODO add your handling code here
        String nama_pelanggan,no_telp,alamat, query, query1;
        String SUrl, SUser, SPass;
        SUrl = "jdbc:MySQL://localhost:3306/laundry_user";
        SUser = "root";
        SPass = "";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            Statement st = con.createStatement();
            
            nama_pelanggan = txtpelanggan.getText();
            no_telp = txttelp.getText();
            alamat = txtalamat.getText();
            
            query = "INSERT INTO pelanggan(nama_pelanggan, no_telp, alamat)" + "VALUES ('"+nama_pelanggan+"','"+no_telp+"','"+alamat+"')";
                
                st.execute(query);
                txtpelanggan.setText("");
                txttelp.setText("");
                txtalamat.setText("");
            
            JOptionPane.showMessageDialog(null, "Pelanggan Siap!");
                new pesanan().setVisible(true);
                this.dispose();

            }     
        catch(Exception e){
            System.out.println("Error!" + e.getMessage());
            
        }
    }//GEN-LAST:event_btnselanjutnyaActionPerformed

    private void btnbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbatalActionPerformed
        // TODO add your handling code here:
        txtpelanggan.setText("");
        txttelp.setText("");
        txtalamat.setText("");
        new menu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnbatalActionPerformed

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
            java.util.logging.Logger.getLogger(transaksibaru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(transaksibaru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(transaksibaru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(transaksibaru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new transaksibaru().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbatal;
    private javax.swing.JButton btnkembali;
    private javax.swing.JButton btnpesanan;
    private javax.swing.JButton btnriwayat;
    private javax.swing.JButton btnselanjutnya;
    private javax.swing.JButton btntransaksi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtalamat;
    private javax.swing.JTextField txtpelanggan;
    private javax.swing.JTextField txttelp;
    // End of variables declaration//GEN-END:variables

    void setUser(String nama) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
