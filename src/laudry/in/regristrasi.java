/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package laudry.in;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author USER
 */

public class regristrasi extends javax.swing.JFrame {

    /**
     * Creates new form regrestrasi
     */
    public regristrasi() {
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

        jLabel2 = new javax.swing.JLabel();
        txthp = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jdaftar = new javax.swing.JButton();
        txtpass = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jlogin = new javax.swing.JButton();
        cekpass = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Sylfaen", 1, 27)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("REGRISTRASI");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, -1, -1));
        getContentPane().add(txthp, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 320, 40));

        txtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamaActionPerformed(evt);
            }
        });
        getContentPane().add(txtnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 320, 40));

        jLabel3.setText("Nomor HP");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 170, -1));

        jLabel4.setText(" Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 170, -1));

        jLabel5.setText(" Masukkan Username");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 170, -1));

        jdaftar.setBackground(new java.awt.Color(255, 204, 102));
        jdaftar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jdaftar.setText("Daftar");
        jdaftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdaftarActionPerformed(evt);
            }
        });
        getContentPane().add(jdaftar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 100, 30));
        getContentPane().add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 320, 40));

        jLabel6.setText(" Sudah Punya Akun?");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, -1, -1));

        jlogin.setBackground(new java.awt.Color(102, 204, 0));
        jlogin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlogin.setText("Login");
        jlogin.setToolTipText("");
        jlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jloginActionPerformed(evt);
            }
        });
        getContentPane().add(jlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, 100, 30));

        cekpass.setText("Show Password");
        cekpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cekpassActionPerformed(evt);
            }
        });
        getContentPane().add(cekpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 290, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uidesain/Laundry (6).png"))); // NOI18N
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jdaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdaftarActionPerformed
        // TODO add your handling code here:
        String nama,no_hp,password, query;
        String SUrl, SUser, SPass;
        SUrl = "jdbc:MySQL://localhost:3306/laundry_user";
        SUser = "root";
        SPass = "";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            Statement st = con.createStatement();
            if (" ".equals(txtnama.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "username salah", "Erorr", JOptionPane.ERROR_MESSAGE);
            }else if (" ".equals(txthp.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "no_hp salah", "Erorr", JOptionPane.ERROR_MESSAGE);
            }else if (" ".equals(txtpass.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "password salah", "Erorr", JOptionPane.ERROR_MESSAGE);
            } else {
                nama = txtnama.getText();
                no_hp = txthp.getText();
                password = txtpass.getText();
                System.out.println(password);
                
                query = "INSERT INTO user(nama, no_hp, password)" + "VALUES ('"+nama+"','"+no_hp+"','"+password+"')";
                
                st.execute(query);
                txtnama.setText("");
                txthp.setText("");
                txtpass.setText("");
                JOptionPane.showMessageDialog(null, "Akun baru sudah siap!");
                new login().setVisible(true);
                this.dispose();
            }     
        }catch(Exception e){
            System.out.println("Error!" + e.getMessage());
        }
                
    }//GEN-LAST:event_jdaftarActionPerformed

    private void jloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jloginActionPerformed
        // TODO add your handling code here:
        new login().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jloginActionPerformed

    private void cekpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cekpassActionPerformed
        // TODO add your handling code here:
        if (cekpass.isSelected()){
            txtpass.setEchoChar((char)0);
        }else{
            txtpass.setEchoChar('*');

        }
    }//GEN-LAST:event_cekpassActionPerformed

    private void txtnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamaActionPerformed

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
            java.util.logging.Logger.getLogger(regristrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(regristrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(regristrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(regristrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new regristrasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cekpass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jdaftar;
    private javax.swing.JButton jlogin;
    private javax.swing.JTextField txthp;
    private javax.swing.JTextField txtnama;
    private javax.swing.JPasswordField txtpass;
    // End of variables declaration//GEN-END:variables
}
