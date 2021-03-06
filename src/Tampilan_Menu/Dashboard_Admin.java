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
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.New_ConnectDB;

/**
 *
 * @author user
 */
public class Dashboard_Admin extends javax.swing.JFrame {
    private Connection conn = new New_ConnectDB().connect();
    private DefaultTableModel tabmode;

    protected void Reset_Saldo() {
        try {
            String sql = "update member set Saldo_Total='0' where No_Handphone='"+jlnohp.getText()+"'";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.executeUpdate();
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                    "Total Saldo gagal diperbarui" +e);
        }
    }
    
    protected void dataTable() {
        Object[]baris = {"No Handphone","Nama","Saldo Total"};
        tabmode = new DefaultTableModel(null, baris);
        tabelout.setModel(tabmode);
        String sql = "select No_Handphone,Nama,Saldo_Total from member order by Saldo_Total desc";
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String no_hp = hasil.getString("No_Handphone");
                String snama = hasil.getString("Nama");
                String salamat = hasil.getString("Saldo_Total");
                String[] data = {no_hp, snama, salamat};
                tabmode.addRow(data);

            }
        } catch (Exception e) {
        }
    }
    /**
     * Creates new form Dashboard_Admin
     */
    public Dashboard_Admin() {
        initComponents();
        setLocationRelativeTo(this);
        tflatar1.setEnabled(false);
        tflatar2.setEnabled(false);
        tflatar3.setEnabled(false);
        tflatar4.setEnabled(false);
        dataTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfinkaca = new javax.swing.JTextField();
        tfinbesi = new javax.swing.JTextField();
        tfintembaga = new javax.swing.JTextField();
        tfinplastic = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        taberita = new javax.swing.JTextArea();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jlberat_besi = new javax.swing.JLabel();
        jlberat_tembaga = new javax.swing.JLabel();
        jlberat_plastic = new javax.swing.JLabel();
        jlberat_kaca = new javax.swing.JLabel();
        jltembaga = new javax.swing.JLabel();
        jlplastic = new javax.swing.JLabel();
        jlkaca = new javax.swing.JLabel();
        jlbesi = new javax.swing.JLabel();
        tflatar1 = new javax.swing.JTextField();
        tflatar4 = new javax.swing.JTextField();
        tflatar3 = new javax.swing.JTextField();
        tflatar2 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelout = new javax.swing.JTable();
        background = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel1.setText("Top Akumulasi (Saldo)");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(490, 380, 230, 20);

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel2.setText("Pengumuman");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(510, 180, 140, 20);

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Harga Kaca(J4)");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(90, 540, 120, 17);

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Harga Besi(J1)");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(90, 420, 110, 17);

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Harga Tembaga(J2)");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(90, 460, 150, 17);

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Harga Plastic(J3)");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(90, 500, 130, 17);
        jPanel2.add(tfinkaca);
        tfinkaca.setBounds(250, 530, 90, 30);
        jPanel2.add(tfinbesi);
        tfinbesi.setBounds(250, 410, 90, 30);
        jPanel2.add(tfintembaga);
        tfintembaga.setBounds(250, 450, 90, 30);
        jPanel2.add(tfinplastic);
        tfinplastic.setBounds(250, 490, 90, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(360, 530, 80, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(360, 410, 80, 30);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(360, 450, 80, 30);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setText("Update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(360, 490, 80, 30);

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel7.setText("Ubah Harga Sampah (Rp/KG)");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(60, 380, 290, 20);

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel8.setText("Jumlah Sampah (KG)");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(60, 180, 210, 20);

        taberita.setColumns(20);
        taberita.setRows(5);
        taberita.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                taberitaAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane3.setViewportView(taberita);

        jPanel2.add(jScrollPane3);
        jScrollPane3.setBounds(510, 220, 270, 100);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setText("Posting");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);
        jButton5.setBounds(800, 220, 80, 30);

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton6.setText("Logout");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6);
        jButton6.setBounds(825, 553, 80, 30);

        jlberat_besi.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 11)); // NOI18N
        jlberat_besi.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jlberat_besiAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel2.add(jlberat_besi);
        jlberat_besi.setBounds(230, 210, 60, 30);

        jlberat_tembaga.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 11)); // NOI18N
        jlberat_tembaga.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jlberat_tembagaAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel2.add(jlberat_tembaga);
        jlberat_tembaga.setBounds(230, 250, 60, 30);

        jlberat_plastic.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 11)); // NOI18N
        jlberat_plastic.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jlberat_plasticAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel2.add(jlberat_plastic);
        jlberat_plastic.setBounds(230, 290, 60, 30);

        jlberat_kaca.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 11)); // NOI18N
        jlberat_kaca.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jlberat_kacaAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel2.add(jlberat_kaca);
        jlberat_kaca.setBounds(230, 330, 60, 30);

        jltembaga.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jltembaga.setForeground(new java.awt.Color(255, 255, 255));
        jltembaga.setText("Sampah Tembaga");
        jPanel2.add(jltembaga);
        jltembaga.setBounds(80, 258, 140, 17);

        jlplastic.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jlplastic.setForeground(new java.awt.Color(255, 255, 255));
        jlplastic.setText("Sampah Plastic");
        jPanel2.add(jlplastic);
        jlplastic.setBounds(80, 298, 120, 17);

        jlkaca.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jlkaca.setForeground(new java.awt.Color(255, 255, 255));
        jlkaca.setText("Sampah Kaca");
        jPanel2.add(jlkaca);
        jlkaca.setBounds(80, 338, 110, 17);

        jlbesi.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jlbesi.setForeground(new java.awt.Color(255, 255, 255));
        jlbesi.setText("Sampah Besi");
        jPanel2.add(jlbesi);
        jlbesi.setBounds(80, 218, 120, 17);
        jPanel2.add(tflatar1);
        tflatar1.setBounds(226, 210, 60, 30);
        jPanel2.add(tflatar4);
        tflatar4.setBounds(226, 330, 60, 30);
        jPanel2.add(tflatar3);
        tflatar3.setBounds(226, 290, 60, 30);
        jPanel2.add(tflatar2);
        tflatar2.setBounds(226, 250, 60, 30);

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton7.setText("Format");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7);
        jButton7.setBounds(520, 553, 80, 30);

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton8.setText("Report");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8);
        jButton8.setBounds(610, 553, 80, 30);

        tabelout.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "No Handphone", "Nama", "Saldo Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelout);
        if (tabelout.getColumnModel().getColumnCount() > 0) {
            tabelout.getColumnModel().getColumn(0).setHeaderValue("No Handphone");
            tabelout.getColumnModel().getColumn(1).setHeaderValue("Nama");
            tabelout.getColumnModel().getColumn(2).setHeaderValue("Saldo Total");
        }

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(490, 420, 452, 100);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tampilan_Menu/FormDashboard.png"))); // NOI18N
        jPanel2.add(background);
        background.setBounds(0, 0, 970, 620);

        jTextField1.setText("jTextField1");
        jPanel2.add(jTextField1);
        jTextField1.setBounds(800, 380, 59, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 967, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        dispose();
        new FormLoginUtama().setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jlberat_besiAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jlberat_besiAncestorAdded
        // TODO add your handling code here:
        try {
            String sql = "select sum(Berat_Sampah) from sampah where Jenis_Sampah = '" + jlbesi.getText()+"'";
            PreparedStatement stat = conn.prepareStatement(sql);
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String stotal_sampah = hasil.getString("sum(Berat_Sampah)");
                jlberat_besi.setText(stotal_sampah);
            }
        } catch (SQLException e) {
        }
    }//GEN-LAST:event_jlberat_besiAncestorAdded

    private void jlberat_tembagaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jlberat_tembagaAncestorAdded
        // TODO add your handling code here:
        try {
            String sql = "select sum(Berat_Sampah) from sampah where Jenis_Sampah = '" + jltembaga.getText()+"'";
            PreparedStatement stat = conn.prepareStatement(sql);
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String stotal_sampah = hasil.getString("sum(Berat_Sampah)");
                jlberat_tembaga.setText(stotal_sampah);
            }
        } catch (SQLException e) {
        }
    }//GEN-LAST:event_jlberat_tembagaAncestorAdded

    private void jlberat_plasticAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jlberat_plasticAncestorAdded
        // TODO add your handling code here:
        try {
            String sql = "select sum(Berat_Sampah) from sampah where Jenis_Sampah = '" + jlplastic.getText()+"'";
            PreparedStatement stat = conn.prepareStatement(sql);
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String stotal_sampah = hasil.getString("sum(Berat_Sampah)");
                jlberat_plastic.setText(stotal_sampah);
            }
        } catch (SQLException e) {
        }
    }//GEN-LAST:event_jlberat_plasticAncestorAdded

    private void jlberat_kacaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jlberat_kacaAncestorAdded
        // TODO add your handling code here:
        try {
            String sql = "select sum(Berat_Sampah) from sampah where Jenis_Sampah = '" + jlkaca.getText()+"'";
            PreparedStatement stat = conn.prepareStatement(sql);
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String stotal_sampah = hasil.getString("sum(Berat_Sampah)");
                jlberat_kaca.setText(stotal_sampah);
            }
        } catch (SQLException e) {
        }
    }//GEN-LAST:event_jlberat_kacaAncestorAdded

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "update admin set Harga_Besi='"+tfinbesi.getText()+"'";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null,
                    "Data berhasil di ubah");
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                    "Data gagal diubah" +e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "update admin set Harga_Tembaga='"+tfintembaga.getText()+"'";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null,
                    "Data berhasil di ubah");
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                    "Data gagal diubah" +e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "update admin set Harga_Plastic='"+tfinplastic.getText()+"'";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null,
                    "Data berhasil di ubah");
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                    "Data gagal diubah" +e);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "update admin set Harga_Besi='"+tfinkaca.getText()+"'";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null,
                    "Data berhasil di ubah");
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                    "Data gagal diubah" +e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "update admin set Berita='"+taberita.getText()+"'";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null,
                    "Berita berhasil di update");
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                    "Berita gagal di update "+e);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void taberitaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_taberitaAncestorAdded
        // TODO add your handling code here:
        try {
            String sql = "select Berita from Admin ";
            PreparedStatement stat = conn.prepareStatement(sql);
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String sberita = hasil.getString("Berita");
                taberita.setText(sberita);
            }
        } catch (SQLException e) {
        }
    }//GEN-LAST:event_taberitaAncestorAdded

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        int ok = JOptionPane.showConfirmDialog(null,
                "Anda yakin ingin mereset history ?",
                "Konfirmasi",
                JOptionPane.YES_NO_OPTION);
        if (ok==0) {
            try {
                String sql = "delete from sampah where Rupiah_Sampah !='0' ";
                PreparedStatement stat = conn.prepareStatement(sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null,
                        "Data berhasil direset");
                Reset_Saldo();
                dispose();
                new FormLoginUtama().setVisible(true);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null,
                        "Data gagal direset" +e);
            }
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        new FormResult().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel jlberat_besi;
    private javax.swing.JLabel jlberat_kaca;
    private javax.swing.JLabel jlberat_plastic;
    private javax.swing.JLabel jlberat_tembaga;
    private javax.swing.JLabel jlbesi;
    private javax.swing.JLabel jlkaca;
    private javax.swing.JLabel jlplastic;
    private javax.swing.JLabel jltembaga;
    private javax.swing.JTable tabelout;
    private javax.swing.JTextArea taberita;
    public static javax.swing.JTextField tfinbesi;
    public static javax.swing.JTextField tfinkaca;
    public static javax.swing.JTextField tfinplastic;
    public static javax.swing.JTextField tfintembaga;
    private javax.swing.JTextField tflatar1;
    private javax.swing.JTextField tflatar2;
    private javax.swing.JTextField tflatar3;
    private javax.swing.JTextField tflatar4;
    // End of variables declaration//GEN-END:variables
}
