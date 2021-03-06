/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tampilan_Menu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.New_ConnectDB;

/**
 *
 * @author user
 */
public class FormRegister extends javax.swing.JFrame {
    private Connection conn = new New_ConnectDB().connect();
    private DefaultTableModel tabmode;
    
    protected void dataTable() {
        //Object[]baris = {"Username","Nama","No Handphone","Password","Alamat"};
        
    }

    /**
     * Creates new form FormRegister
     */
    public FormRegister() {
        initComponents();
        setLocationRelativeTo(this);
        tfberat_sampah.setEnabled(false);
        setTanggal();
        tftanggal.setEnabled(false);
        cbjenis_sampah.setEnabled(false);
        tfberat_sampah.setEnabled(false);
        cbverif.setEnabled(false);
    }
    
    protected void kosong() {
        tfregist_user.setText("");
        tfregist_nama.setText("");
        tfregist_nohp.setText("");
        pfregist_pass.setText("");
        taregist_alamat.setText("");
    }
    public void setTanggal(){
    java.util.Date skrg = new java.util.Date();
    java.text.SimpleDateFormat kal = new
    java.text.SimpleDateFormat("dd/MM/yyyy");
    jltanggal.setText(kal.format(skrg));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logo_regist = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfregist_user = new javax.swing.JTextField();
        tfregist_nama = new javax.swing.JTextField();
        tfregist_nohp = new javax.swing.JTextField();
        pfregist_pass = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        taregist_alamat = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        btregist_submit = new javax.swing.JButton();
        jltanggal = new javax.swing.JLabel();
        tftanggal = new javax.swing.JTextField();
        background = new javax.swing.JLabel();
        cbjenis_sampah = new javax.swing.JComboBox<>();
        tfberat_sampah = new javax.swing.JTextField();
        cbverif = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        logo_regist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tampilan_Menu/register.png"))); // NOI18N
        jPanel1.add(logo_regist);
        logo_regist.setBounds(80, 200, 250, 250);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Alamat");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(370, 400, 70, 19);

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(370, 240, 90, 19);

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nama");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(370, 280, 50, 19);

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("No Handphone");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(370, 320, 130, 19);

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(370, 360, 90, 19);
        jPanel1.add(tfregist_user);
        tfregist_user.setBounds(530, 230, 270, 30);
        jPanel1.add(tfregist_nama);
        tfregist_nama.setBounds(530, 270, 270, 30);

        tfregist_nohp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfregist_nohpKeyTyped(evt);
            }
        });
        jPanel1.add(tfregist_nohp);
        tfregist_nohp.setBounds(530, 310, 270, 30);
        jPanel1.add(pfregist_pass);
        pfregist_pass.setBounds(530, 350, 270, 30);

        taregist_alamat.setColumns(20);
        taregist_alamat.setRows(5);
        jScrollPane1.setViewportView(taregist_alamat);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(530, 390, 270, 110);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(610, 530, 80, 30);

        btregist_submit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btregist_submit.setText("Submit");
        btregist_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btregist_submitActionPerformed(evt);
            }
        });
        jPanel1.add(btregist_submit);
        btregist_submit.setBounds(510, 530, 80, 30);
        jPanel1.add(jltanggal);
        jltanggal.setBounds(810, 150, 90, 30);
        jPanel1.add(tftanggal);
        tftanggal.setBounds(800, 150, 90, 30);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tampilan_Menu/FormDashboard.png"))); // NOI18N
        jPanel1.add(background);
        background.setBounds(0, 0, 968, 622);

        cbjenis_sampah.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "System Register", "Sampah Besi", "Sampah Tembaga", "Sampah Plastic", "Sampah Kaca" }));
        cbjenis_sampah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbjenis_sampahActionPerformed(evt);
            }
        });
        jPanel1.add(cbjenis_sampah);
        cbjenis_sampah.setBounds(540, 290, 150, 30);

        tfberat_sampah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfberat_sampahMouseClicked(evt);
            }
        });
        tfberat_sampah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfberat_sampahActionPerformed(evt);
            }
        });
        jPanel1.add(tfberat_sampah);
        tfberat_sampah.setBounds(540, 330, 60, 30);

        cbverif.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "System Register", " " }));
        jPanel1.add(cbverif);
        cbverif.setBounds(540, 370, 150, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 967, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btregist_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btregist_submitActionPerformed
        // TODO add your handling code here:
        String sql = "insert into member (Tanggal,Username,Nama,No_Handphone,"
                + "Password,Alamat,No_Rec,Nama_Bank,Saldo_Total,Status) values (?,?,?,?,?,?,'-','-','0',?);";
        try {
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, jltanggal.getText());
            stat.setString(2, tfregist_user.getText());//
            stat.setString(3, tfregist_nama.getText());
            stat.setString(4, tfregist_nohp.getText());
            stat.setString(5, pfregist_pass.getText());
            stat.setString(6, taregist_alamat.getText());
            //stat.setString(8,tfberat_sampah.getText());
            stat.setString(7, (String) cbverif.getSelectedItem());
            
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Selamat anda berhasil membuat akun");
            kosong();
            new FormLoginUtama().setVisible(true);
            tfregist_user.requestFocus();
            dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan " + e);
        }
    }//GEN-LAST:event_btregist_submitActionPerformed

    private void cbjenis_sampahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbjenis_sampahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbjenis_sampahActionPerformed

    private void tfberat_sampahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfberat_sampahMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_tfberat_sampahMouseClicked

    private void tfregist_nohpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfregist_nohpKeyTyped
        // TODO add your handling code here:
        char enter=evt.getKeyChar();

        if(!(Character.isDigit(enter))){

            evt.consume();
        }
    }//GEN-LAST:event_tfregist_nohpKeyTyped

    private void tfberat_sampahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfberat_sampahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfberat_sampahActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
        new FormLoginUtama().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FormRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btregist_submit;
    private javax.swing.JComboBox<String> cbjenis_sampah;
    private javax.swing.JComboBox<String> cbverif;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jltanggal;
    private javax.swing.JLabel logo_regist;
    private javax.swing.JPasswordField pfregist_pass;
    private javax.swing.JTextArea taregist_alamat;
    private javax.swing.JTextField tfberat_sampah;
    private javax.swing.JTextField tfregist_nama;
    private javax.swing.JTextField tfregist_nohp;
    private javax.swing.JTextField tfregist_user;
    private javax.swing.JTextField tftanggal;
    // End of variables declaration//GEN-END:variables
}
