/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tampilan_Menu;

import static Tampilan_Menu.Dashboard_Member.jlnohp;
import static Tampilan_Menu.Dashboard_Member.jlsaldo_member;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.NumberFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.New_ConnectDB;

/**
 *
 * @author user
 */
public class FormResult extends javax.swing.JFrame {
    private Connection conn = new New_ConnectDB().connect();
    private DefaultTableModel tabmode;

    
    protected void dataTable() {
        Object[]baris = {"No Handphone","Nama","Alamat"};
        tabmode = new DefaultTableModel(null, baris);
        tabelout.setModel(tabmode);
        String sql = "select No_Handphone,Nama,Alamat from member where No_Rec !='-' && Nama_Bank !='-'";
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String no_hp = hasil.getString("No_Handphone");
                String snama = hasil.getString("Nama");
                String salamat = hasil.getString("Alamat");
                String[] data = {no_hp, snama, salamat};
                tabmode.addRow(data);

            }
        } catch (Exception e) {
        }
    }
    
    protected void output() {
        try {
            String sql = "select Nama_Bank,No_Rec from member where Nama = '" + jlnama.getText()+"'";
            PreparedStatement stat = conn.prepareStatement(sql);
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String snama_bank = hasil.getString("Nama_Bank");
                String snorec = hasil.getString("No_Rec");
                jlnama_bank.setText(""+snama_bank);
                jlnorec.setText(""+snorec);
            }
        } catch (SQLException e) {
        }
    }
    
    protected void saldo() {
        try {
            String sql = "select sum(Saldo_Total) from member where No_Handphone = '" + jlnohp.getText()+"'";
            PreparedStatement stat = conn.prepareStatement(sql);
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                
                String stotal_saldo = hasil.getString("sum(Saldo_Total)");
                //editan baru
                tumbal.setText(stotal_saldo);
                int a = Integer.parseInt(tumbal.getText());
                if (a>50000) {
                    int cair = a-50000;
                    NumberFormat nf = NumberFormat.getInstance();
                    jlpencairan.setText(""+nf.format(cair));
                    jlpencairan.setVisible(true);
                } else {
                    jlpencairan.setVisible(false);
                }
                
                int total = Integer.parseInt(tumbal.getText());
                NumberFormat nf = NumberFormat.getInstance();
                jltotal_saldo.setText(""+nf.format(total));
            }
        } catch (SQLException e) {
        }
    }
    
    protected void reset() {
            try {
                String sql = "delete from sampah where Rupiah_Sampah !='0' && No_Handphone='"+jlnohp.getText()+"'";
                PreparedStatement stat = conn.prepareStatement(sql);
                stat.executeUpdate();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null,
                        "Data gagal direset" +e);
            }
    }
    
    protected void Update_Saldo() {
        try {
            String sql = "update member set Saldo_Total='0' where No_Handphone='"+jlnohp.getText()+"'";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.executeUpdate();
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                    "Total Saldo gagal diperbarui" +e);
        }
    }
    
    
    
    public void setTanggal(){
    java.util.Date skrg = new java.util.Date();
    java.text.SimpleDateFormat kal = new
    java.text.SimpleDateFormat("dd/MM/yyyy");
    jltanggal.setText(kal.format(skrg));
    }
    
    protected void inputDB() {
        try {
            String sql = "insert into result (Tanggal,No_Handphone,Nama,Nama_Bank,No_Rek,Pencairan,Status) value (?,?,?,?,?,?,'Sukses');";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, jltanggal.getText());
            stat.setString(2, jlnohp.getText());
            stat.setString(3, jlnama.getText());
            stat.setString(4, jlnama_bank.getText());
            stat.setString(5, jlnorec.getText());
            stat.setString(6, jlpencairan.getText());
            stat.executeUpdate();
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                    "Data gagal disimpan" +e);
        }
    }
    
    protected void kosong() {
        jltotal_saldo.setText("");
    }
    /**
     * Creates new form FormResult
     */
    public FormResult() {
        initComponents();
        dataTable();
        output();
        setTanggal();
        setLocationRelativeTo(this);
        latar.setEnabled(false);
        latar1.setEnabled(false);
        latar2.setEnabled(false);
        latar3.setEnabled(false);
        latar4.setEnabled(false);
        latar5.setEnabled(false);
        tftanggal.setEnabled(false);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jlnama = new javax.swing.JLabel();
        jlnama_bank = new javax.swing.JLabel();
        jlnorec = new javax.swing.JLabel();
        jlnohp = new javax.swing.JLabel();
        latar = new javax.swing.JTextField();
        latar1 = new javax.swing.JTextField();
        latar2 = new javax.swing.JTextField();
        latar3 = new javax.swing.JTextField();
        jltotal_saldo = new javax.swing.JLabel();
        jlpencairan = new javax.swing.JLabel();
        latar5 = new javax.swing.JTextField();
        latar4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelout = new javax.swing.JTable();
        proses = new javax.swing.JButton();
        jltanggal = new javax.swing.JLabel();
        tftanggal = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        background = new javax.swing.JLabel();
        tumbal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nama");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(150, 265, 70, 19);

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nama Bank");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(150, 305, 110, 19);

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("No Rekening");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(150, 345, 120, 19);

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("No Handphone");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(150, 225, 140, 19);

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Pencairan");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(550, 265, 100, 19);

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Total Saldo");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(550, 225, 110, 19);
        jPanel1.add(jlnama);
        jlnama.setBounds(320, 260, 190, 30);

        jlnama_bank.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jlnama_bankAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel1.add(jlnama_bank);
        jlnama_bank.setBounds(320, 300, 190, 30);
        jPanel1.add(jlnorec);
        jlnorec.setBounds(320, 340, 190, 30);
        jPanel1.add(jlnohp);
        jlnohp.setBounds(320, 220, 190, 30);
        jPanel1.add(latar);
        latar.setBounds(300, 300, 210, 30);
        jPanel1.add(latar1);
        latar1.setBounds(300, 340, 210, 30);
        jPanel1.add(latar2);
        latar2.setBounds(300, 260, 210, 30);
        jPanel1.add(latar3);
        latar3.setBounds(300, 220, 210, 30);

        jltotal_saldo.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jltotal_saldoAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel1.add(jltotal_saldo);
        jltotal_saldo.setBounds(680, 220, 140, 30);
        jPanel1.add(jlpencairan);
        jlpencairan.setBounds(680, 260, 140, 30);

        latar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                latar5ActionPerformed(evt);
            }
        });
        jPanel1.add(latar5);
        latar5.setBounds(660, 260, 160, 30);
        jPanel1.add(latar4);
        latar4.setBounds(660, 220, 160, 30);

        tabelout.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "No Handphone", "Nama", "Alamat"
            }
        ));
        tabelout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabeloutMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelout);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(250, 400, 452, 100);

        proses.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        proses.setText("Proses");
        proses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prosesActionPerformed(evt);
            }
        });
        jPanel1.add(proses);
        proses.setBounds(640, 310, 70, 30);
        jPanel1.add(jltanggal);
        jltanggal.setBounds(810, 150, 90, 30);
        jPanel1.add(tftanggal);
        tftanggal.setBounds(800, 150, 90, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Form Broker");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(810, 560, 110, 30);

        background.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tampilan_Menu/FormDashboard.png"))); // NOI18N
        jPanel1.add(background);
        background.setBounds(0, 0, 970, 622);

        tumbal.setText("jLabel7");
        jPanel1.add(tumbal);
        tumbal.setBounds(720, 200, 34, 14);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 966, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabeloutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabeloutMouseClicked
        // TODO add your handling code here:
        int bar = tabelout.getSelectedRow();
        String a = tabmode.getValueAt (bar, 0).toString();
        String b = tabmode.getValueAt (bar, 1).toString();
        
        jlnohp.setText(a);
        jlnama.setText(b);
        output();
        saldo();
    }//GEN-LAST:event_tabeloutMouseClicked

    private void jlnama_bankAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jlnama_bankAncestorAdded
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jlnama_bankAncestorAdded

    private void jltotal_saldoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jltotal_saldoAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jltotal_saldoAncestorAdded

    private void prosesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prosesActionPerformed
        // TODO add your handling code here:
        
            int a = Integer.parseInt(tumbal.getText());
            if (a>50000) {
                javax.swing.JOptionPane.showMessageDialog(null,"Dana "+jlnama.getText()+"\nSebesar Rp "+jlpencairan.getText()+"\nBerhasil dicairkan",
                    "Konfirmasi",javax.swing.JOptionPane.INFORMATION_MESSAGE);
                reset();
                Update_Saldo();
                inputDB();
                kosong();
            }else {
                javax.swing.JOptionPane.showMessageDialog(null, 
                    "Dana gagal dicairkan",
                    "Kesalahan",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
            }
            dataTable();
        
        
        
    }//GEN-LAST:event_prosesActionPerformed

    private void latar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_latar5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_latar5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new Dashboard_Brokers().setVisible(true);
        dispose();
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
            java.util.logging.Logger.getLogger(FormResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormResult().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlnama;
    private javax.swing.JLabel jlnama_bank;
    private javax.swing.JLabel jlnohp;
    private javax.swing.JLabel jlnorec;
    private javax.swing.JLabel jlpencairan;
    private javax.swing.JLabel jltanggal;
    private javax.swing.JLabel jltotal_saldo;
    private javax.swing.JTextField latar;
    private javax.swing.JTextField latar1;
    private javax.swing.JTextField latar2;
    private javax.swing.JTextField latar3;
    private javax.swing.JTextField latar4;
    private javax.swing.JTextField latar5;
    private javax.swing.JButton proses;
    private javax.swing.JTable tabelout;
    private javax.swing.JTextField tftanggal;
    private javax.swing.JLabel tumbal;
    // End of variables declaration//GEN-END:variables
}
