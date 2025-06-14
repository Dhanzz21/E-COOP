/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package report;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.io.File;
import java.io.IOException;
import masterData.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;


public class report_simpanan extends javax.swing.JPanel {
    
    Statement  stat;
    ResultSet  res;
    Connection cn = config.koneksi.BukaKoneksi();
    DefaultTableModel tabModel;
    String sql;

    public report_simpanan() {
        initComponents();
        TampilData();
        
        JTableHeader header = tbldataSimpanan.getTableHeader();
    header.setDefaultRenderer(new DefaultTableCellRenderer() {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int column) {

        JLabel label = (JLabel) super.getTableCellRendererComponent(
                table, value, isSelected, hasFocus, row, column);
        
        label.setBackground(new Color(32, 136, 203)); // biru
        label.setForeground(Color.WHITE); // teks putih
        label.setFont(new Font("Segoe UI", Font.BOLD, 15));
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setOpaque(true); // WAJIB supaya background tampil

        return label;
    }
});
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
                    rs.getString("Id"),
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

        setLayout(new java.awt.CardLayout());

        main_panel.setLayout(new java.awt.CardLayout());

        data_simpanan.setBackground(new java.awt.Color(255, 255, 255));

        tbldataSimpanan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tbldataSimpanan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nama Guru", "Jenis Simpanan", "Jumlah Simpanan", "Tanggal Simpanan"
            }
        ));
        tbldataSimpanan.setFocusable(false);
        tbldataSimpanan.setGridColor(new java.awt.Color(153, 153, 153));
        tbldataSimpanan.setRowHeight(25);
        tbldataSimpanan.setSelectionBackground(new java.awt.Color(232, 57, 95));
        jScrollPane1.setViewportView(tbldataSimpanan);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Laporan Data Simpanan");

        btn_tambah.setBackground(new java.awt.Color(0, 153, 255));
        btn_tambah.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_tambah.setForeground(new java.awt.Color(255, 255, 255));
        btn_tambah.setText("CETAK");
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout data_simpananLayout = new javax.swing.GroupLayout(data_simpanan);
        data_simpanan.setLayout(data_simpananLayout);
        data_simpananLayout.setHorizontalGroup(
            data_simpananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(data_simpananLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(data_simpananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 987, Short.MAX_VALUE)
                    .addGroup(data_simpananLayout.createSequentialGroup()
                        .addGroup(data_simpananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(btn_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        data_simpananLayout.setVerticalGroup(
            data_simpananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(data_simpananLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(14, 14, 14)
                .addComponent(btn_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)
                .addContainerGap())
        );

        main_panel.add(data_simpanan, "card2");

        add(main_panel, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        // TODO add your handling code here:
        String jdbc_driver = "com.mysql.jdbc.Driver";
        String user = "root";
        String pswd = "";
        String url = "jdbc:mysql://localhost/koperasi";
        File reportTotalSimpanan = new File(".");
        String dirr = "";
        
        try {
        Class.forName(jdbc_driver);
            Connection cnc = (Connection) DriverManager.getConnection(url, user, pswd);
            stat = cnc.createStatement();
            String sql = "SELECT * FROM simpanan_guru";
            dirr = reportTotalSimpanan.getCanonicalPath() + "/src/report/totalSimpanan/";
            JasperDesign design =  JRXmlLoader.load(dirr + "reportTotalSimpanan.jrxml");
            JasperReport rep = JasperCompileManager.compileReport(design);
            res = stat.executeQuery(sql);
            JRResultSetDataSource resDataSource = new JRResultSetDataSource(res);
            JasperPrint jp = JasperFillManager.fillReport(rep, new HashMap(), resDataSource);
            JasperViewer.viewReport(jp, false); // false biar gak nge-block aplikasi
            JasperExportManager.exportReportToPdfFile(jp, dirr + "reportTotalSimpanan.pdf");

        } catch (ClassNotFoundException | SQLException | IOException |
                JRException ex) {
            JOptionPane.showMessageDialog(null, "\n Gagal Mencetak\n" + 
                    ex, "Kesalahan", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_tambahActionPerformed
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_tambah;
    private javax.swing.JPanel data_simpanan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel main_panel;
    private javax.swing.JTable tbldataSimpanan;
    // End of variables declaration//GEN-END:variables
}
