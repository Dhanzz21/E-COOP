/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main3;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import java.util.Date;


public class form_simpanan extends javax.swing.JPanel {
    
    Statement  stat;
    ResultSet  res;
    Connection cn = config.koneksi.BukaKoneksi();
    DefaultTableModel tabModel;
    String sql;

    public form_simpanan() {
        initComponents();
        bersih();
        TampilData();
        
    }
    
   
    private void bersih() {
        tx_Id.setText("");
        tx_namaGuru.setText("");
        tx_Jumlah.setText("");
        
        Date tanggal = new Date(); 
        JCalendar1.setDate(tanggal);

        jComboJenis.setSelectedIndex(0); 
        tx_Id.setEditable(true);
        btn_tambah.setText("TAMBAH");
        tbldataSimpanan.clearSelection();
    }
    
    
    public void TampilData() {
        try {
            DefaultTableModel model = new DefaultTableModel(
                new String[]{"Id", "Nama Guru", "Jenis Simpanan",
                             "Jumlah Simpanan", "Tanggal Simpanan"}, 0);

            stat = cn.createStatement();
            ResultSet rs = stat.executeQuery("SELECT * FROM simpanan_guru");
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("kode_guru"),
                    rs.getString("nama_guru"),
                    rs.getString("jenis_simpanan"),
                    rs.getInt("jumlah_simpanan"),
                    rs.getDate("tanggal_simpanan")
                });
            }
            tbldataSimpanan.setModel(model);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this,
                "Gagal menampilkan data: " + e.getMessage());
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main_panel = new javax.swing.JPanel();
        data_simpanan = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbldataSimpanan = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btn_tambah = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        btn_batal = new javax.swing.JButton();
        form_simpanan = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_simpan = new javax.swing.JButton();
        btn_batal2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tx_namaGuru = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tx_Jumlah = new javax.swing.JTextField();
        tx_Id = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboJenis = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        JCalendar1 = new com.toedter.calendar.JCalendar();

        setLayout(new java.awt.CardLayout());

        main_panel.setLayout(new java.awt.CardLayout());

        data_simpanan.setBackground(new java.awt.Color(255, 255, 255));

        tbldataSimpanan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tbldataSimpanan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Nama Guru", "Jenis Simpanan", "Jumlah Simpanan", "Tanggal Simpanan"
            }
        ));
        tbldataSimpanan.setGridColor(new java.awt.Color(153, 153, 153));
        tbldataSimpanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbldataSimpananMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbldataSimpanan);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Data Simpanan");

        btn_tambah.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_tambah.setText("TAMBAH");
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });

        btn_hapus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_hapus.setText("HAPUS");
        btn_hapus.setPreferredSize(new java.awt.Dimension(81, 25));
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });

        btn_batal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_batal.setText("BATAL");
        btn_batal.setPreferredSize(new java.awt.Dimension(81, 25));
        btn_batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout data_simpananLayout = new javax.swing.GroupLayout(data_simpanan);
        data_simpanan.setLayout(data_simpananLayout);
        data_simpananLayout.setHorizontalGroup(
            data_simpananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(data_simpananLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(data_simpananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 990, Short.MAX_VALUE)
                    .addGroup(data_simpananLayout.createSequentialGroup()
                        .addGroup(data_simpananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(data_simpananLayout.createSequentialGroup()
                                .addComponent(btn_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_batal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        data_simpananLayout.setVerticalGroup(
            data_simpananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(data_simpananLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(14, 14, 14)
                .addGroup(data_simpananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_batal, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
                .addContainerGap())
        );

        main_panel.add(data_simpanan, "card2");

        form_simpanan.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("Tambah Data Simpanan");

        btn_simpan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_simpan.setText("SIMPAN");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });

        btn_batal2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_batal2.setText("BATAL");
        btn_batal2.setPreferredSize(new java.awt.Dimension(81, 25));
        btn_batal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batal2ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Nama Guru ");

        tx_namaGuru.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Jenis Simpanan");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Jumlah Simpanan");

        tx_Jumlah.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        tx_Id.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Id ");

        jComboJenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pokok", "Wajib", "Sukarela" }));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Tanggal Simpan");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tx_namaGuru)
            .addComponent(tx_Jumlah)
            .addComponent(tx_Id)
            .addComponent(jComboJenis, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(JCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 793, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tx_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tx_namaGuru, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jComboJenis, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tx_Jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(JCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout form_simpananLayout = new javax.swing.GroupLayout(form_simpanan);
        form_simpanan.setLayout(form_simpananLayout);
        form_simpananLayout.setHorizontalGroup(
            form_simpananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(form_simpananLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(form_simpananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(form_simpananLayout.createSequentialGroup()
                        .addGroup(form_simpananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(form_simpananLayout.createSequentialGroup()
                                .addComponent(btn_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_batal2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 589, Short.MAX_VALUE)))
                .addContainerGap())
        );
        form_simpananLayout.setVerticalGroup(
            form_simpananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(form_simpananLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(14, 14, 14)
                .addGroup(form_simpananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_batal2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        main_panel.add(form_simpanan, "card2");

        add(main_panel, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void tbldataSimpananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbldataSimpananMouseClicked
        int row = tbldataSimpanan.getSelectedRow();
        if (row != -1) {
        
        tx_Id.setText(tbldataSimpanan.getValueAt(row,0).toString());
        tx_namaGuru.setText(tbldataSimpanan.getValueAt(row,1).toString());
        tx_Jumlah.setText(tbldataSimpanan.getValueAt(row,3).toString());
        jComboJenis.setSelectedItem(
        tbldataSimpanan.getValueAt(row, 4).toString());
        tx_Id.setEditable(true);
        
        btn_tambah.setText("UBAH");
        }

    }//GEN-LAST:event_tbldataSimpananMouseClicked

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        btn_simpan.setText(btn_tambah.getText().equals("UBAH") ? "UBAH" : "SIMPAN");
        main_panel.removeAll(); main_panel.add(form_simpanan); main_panel.revalidate(); main_panel.repaint();

    }//GEN-LAST:event_btn_tambahActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        if (tx_Id.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this,"Silahkan pilih data!");
            return;
        }
        int jawab = JOptionPane.showConfirmDialog(this,"Hapus data?","Konfirmasi",JOptionPane.YES_NO_OPTION);
        if (jawab==JOptionPane.YES_OPTION) {
            try {
                stat = cn.createStatement();
                stat.executeUpdate("DELETE FROM simpanan_guru WHERE kode_guru='"+tx_Id.getText().trim()+"'");
                JOptionPane.showMessageDialog(this,"Data terhapus!");
                TampilData(); bersih();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this,"Gagal hapus! "+e.getMessage());
            }
        }
    }//GEN-LAST:event_btn_hapusActionPerformed
    
    
    private void btn_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalActionPerformed
        tbldataSimpanan.clearSelection();
    }//GEN-LAST:event_btn_batalActionPerformed

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        try {
            stat = cn.createStatement();

            if (tx_Id.getText().trim().isEmpty() ||
                tx_namaGuru.getText().trim().isEmpty() ||
                tx_Jumlah.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this,"Data tidak boleh kosong!");
                return;
            }

            String kode  = tx_Id.getText().trim();
            String nama  = tx_namaGuru.getText().trim();
            String jenis = jComboJenis.getSelectedItem().toString();
            int    jumlah= Integer.parseInt(tx_Jumlah.getText().trim());
            java.util.Date selectedDate = JCalendar1.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String tanggal = sdf.format(selectedDate);
            

            if (btn_simpan.getText().equals("SIMPAN")) {        // INSERT
                res = stat.executeQuery("SELECT * FROM simpanan_guru WHERE kode_guru='"+kode+"'");
                if (res.next()) {
                    JOptionPane.showMessageDialog(this,"Kode sudah ada!");
                    return;
                }
                String sql = "INSERT INTO simpanan_guru VALUES ('"+kode+"','"+nama+"','"
                           + jenis+"',"+jumlah+",'"+tanggal+"')";
                stat.executeUpdate(sql);
                JOptionPane.showMessageDialog(this,"Data tersimpan!");
            } else {                                            // UPDATE
                String sql = "UPDATE simpanan_guru SET nama_guru='"+nama+"', "
                           + "jenis_simpanan='"+jenis+"', jumlah_simpanan="+jumlah+", "
                           + "tanggal_simpanan='"+tanggal+"' WHERE kode_guru='"+kode+"'";
                stat.executeUpdate(sql);
                JOptionPane.showMessageDialog(this,"Data terubah!");
            }

            TampilData();
            main_panel.removeAll(); main_panel.add(data_simpanan); main_panel.revalidate(); main_panel.repaint();
            bersih();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"Terjadi kesalahan: "+e.getMessage());
        }
    
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void btn_batal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batal2ActionPerformed
        main_panel.removeAll();
        main_panel.repaint();
        main_panel.revalidate();

        main_panel.add(data_simpanan);
        main_panel.repaint();
        main_panel.revalidate();
        tbldataSimpanan.clearSelection();
        bersih();
    }//GEN-LAST:event_btn_batal2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JCalendar JCalendar1;
    private javax.swing.JButton btn_batal;
    private javax.swing.JButton btn_batal2;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JPanel data_simpanan;
    private javax.swing.JPanel form_simpanan;
    private javax.swing.JComboBox<String> jComboJenis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel main_panel;
    private javax.swing.JTable tbldataSimpanan;
    private javax.swing.JTextField tx_Id;
    private javax.swing.JTextField tx_Jumlah;
    private javax.swing.JTextField tx_namaGuru;
    // End of variables declaration//GEN-END:variables
}
