/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dashboard;

import java.awt.BorderLayout;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import masterData.form_barang;
import masterData.form_guru;
import masterData.form_pinjaman;
import masterData.form_simpanan;
import masterTransaksi.peminjaman1;
import masterTransaksi.penjualan;
import report.report_barang;
import report.report_guru;
import report.report_pinjaman;
import report.report_simpanan;



/**
 *
 * @author raflyandhikaraswan
 */
public class menu_Utama extends javax.swing.JFrame {

    /**
     * Creates new form menu_Utama
     */
    public menu_Utama() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        execute();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_navbar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pn_sidebar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        menus = new javax.swing.JPanel();
        pn_content = new javax.swing.JPanel();
        pn_utama = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pn_navbar.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo_Sekolah.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("KOPERASI SMP NEGERI 23 DEPOK");

        javax.swing.GroupLayout pn_navbarLayout = new javax.swing.GroupLayout(pn_navbar);
        pn_navbar.setLayout(pn_navbarLayout);
        pn_navbarLayout.setHorizontalGroup(
            pn_navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_navbarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(487, Short.MAX_VALUE))
        );
        pn_navbarLayout.setVerticalGroup(
            pn_navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_navbarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pn_navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(pn_navbarLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel2)))
                .addContainerGap())
        );

        getContentPane().add(pn_navbar, java.awt.BorderLayout.PAGE_START);

        pn_sidebar.setBackground(new java.awt.Color(255, 255, 255));
        pn_sidebar.setPreferredSize(new java.awt.Dimension(250, 515));

        jScrollPane1.setBorder(null);

        menus.setBackground(new java.awt.Color(255, 255, 255));
        menus.setLayout(new javax.swing.BoxLayout(menus, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(menus);

        javax.swing.GroupLayout pn_sidebarLayout = new javax.swing.GroupLayout(pn_sidebar);
        pn_sidebar.setLayout(pn_sidebarLayout);
        pn_sidebarLayout.setHorizontalGroup(
            pn_sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_sidebarLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                .addContainerGap())
        );
        pn_sidebarLayout.setVerticalGroup(
            pn_sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        getContentPane().add(pn_sidebar, java.awt.BorderLayout.LINE_START);

        pn_content.setBackground(new java.awt.Color(255, 255, 255));

        pn_utama.setBackground(new java.awt.Color(255, 255, 255));
        pn_utama.setLayout(new java.awt.GridBagLayout());

        javax.swing.GroupLayout pn_contentLayout = new javax.swing.GroupLayout(pn_content);
        pn_content.setLayout(pn_contentLayout);
        pn_contentLayout.setHorizontalGroup(
            pn_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_contentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pn_utama, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE))
        );
        pn_contentLayout.setVerticalGroup(
            pn_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_utama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(pn_content, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(974, 632));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        pn_utama.setLayout(new BorderLayout());
        pn_utama.add(new homepage(), BorderLayout.CENTER);
        pn_utama.repaint();
        pn_utama.revalidate();


        
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(menu_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
        javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
} catch (Exception ex) {
    ex.printStackTrace();
}

                new menu_Utama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel menus;
    private javax.swing.JPanel pn_content;
    private javax.swing.JPanel pn_navbar;
    private javax.swing.JPanel pn_sidebar;
    private javax.swing.JPanel pn_utama;
    // End of variables declaration//GEN-END:variables

    
      private void execute() {
    ImageIcon iconData = new ImageIcon(getClass().getResource("/img/data.png"));
    ImageIcon iconTrans = new ImageIcon(getClass().getResource("/img/trans.png"));
    ImageIcon iconReport = new ImageIcon(getClass().getResource("/img/Report.png"));
    ImageIcon iconHome = new ImageIcon(getClass().getResource("/img/iconHome.png"));
    ImageIcon iconGuru = new ImageIcon(getClass().getResource("/img/iconGuru.png"));
    ImageIcon iconBarang = new ImageIcon(getClass().getResource("/img/iconBarang.png"));
    ImageIcon iconSimpanan = new ImageIcon(getClass().getResource("/img/iconSimpanan.png"));
    ImageIcon iconPinjaman = new ImageIcon(getClass().getResource("/img/iconPinjaman.png"));
    ImageIcon iconPenjualan = new ImageIcon(getClass().getResource("/img/iconPenjualan.png"));

    menu_Item dataGuru = new menu_Item(null, true, iconGuru, "Data Guru", new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            form_guru fg = new form_guru();  // // form_barang itu diubah nanti jadi nama file form yang sedang dibuat, misal yang belum form_simpanan dan form pinjaman
            pn_utama.removeAll();
            pn_utama.add(fg);                // tampilkan panel
            pn_utama.repaint();
            pn_utama.revalidate();
            fg.TampilData();                 // tampilkan datanya
        }
    });

        
            // Tambahkan inisialisasi dataBarang dan dataGuru di sini
        menu_Item dataBarang = new menu_Item(null, true, iconBarang, "Data Barang", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                form_barang fb = new form_barang();  // form_barang itu diubah nanti jadi nama file form yang sedang dibuat, misal yang belum form_simpanan dan form pinjaman
                pn_utama.removeAll();
                pn_utama.add(fb);                // tampilkan panel
                pn_utama.repaint();
                pn_utama.revalidate();
                fb.TampilData();            // tampilkan datanya
            }
        });
        
        //menu data simpanan
        menu_Item dataSimpanan = new menu_Item(null, true, iconSimpanan, "Data Simpanan", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                form_simpanan fs = new form_simpanan();  // form_barang itu diubah nanti jadi nama file form yang sedang dibuat, misal yang belum form_simpanan dan form pinjaman
                pn_utama.removeAll();
                pn_utama.add(fs);                // tampilkan panel
                pn_utama.repaint();
                pn_utama.revalidate();
                fs.TampilData();            // tampilkan datanya
            }
        });
        
        //menu data pinjaman
        menu_Item dataPinjaman = new menu_Item(null, true, iconPinjaman, "Data Pinjaman", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                form_pinjaman fp = new form_pinjaman();  // form_barang itu diubah nanti jadi nama file form yang sedang dibuat, misal yang belum form_simpanan dan form pinjaman
                pn_utama.removeAll();
                pn_utama.add(fp);                // tampilkan panel
                pn_utama.repaint();
                pn_utama.revalidate();
                fp.TampilData();            // tampilkan datanya
            }
        });
        



        // Inisialisasi menu
        menu_Item penjualan = new menu_Item(null, true, iconPenjualan, "Penjualan", new ActionListener() {
        @Override
             public void actionPerformed(ActionEvent ae) {
                penjualan pen = new penjualan();  // form_barang itu diubah nanti jadi nama file form yang sedang dibuat, misal yang belum form_simpanan dan form pinjaman
                pn_utama.removeAll();
                pn_utama.add(pen);                // tampilkan panel
                pn_utama.repaint();
                pn_utama.revalidate();
                //fp.TampilData();            // tampilkan datanya
            }
        
       });
        
        
        
        menu_Item pinjaman = new menu_Item(null, true, iconPinjaman, "Pinjaman", new ActionListener() {
        @Override
             public void actionPerformed(ActionEvent ae) {
                peminjaman1 pin = new peminjaman1();  // form_barang itu diubah nanti jadi nama file form yang sedang dibuat, misal yang belum form_simpanan dan form pinjaman
                pn_utama.removeAll();
                pn_utama.add(pin);                // tampilkan panel
                pn_utama.repaint();
                pn_utama.revalidate();
                //fp.TampilData();            // tampilkan datanya
            }
    });
        
         menu_Item re_dg = new menu_Item(null, true, iconReport, "Data Guru", new ActionListener() {
        @Override
         public void actionPerformed(ActionEvent ae) {
                report_guru rg = new report_guru();  // form_barang itu diubah nanti jadi nama file form yang sedang dibuat, misal yang belum form_simpanan dan form pinjaman
                pn_utama.removeAll();
                pn_utama.add(rg);                // tampilkan panel
                pn_utama.repaint();
                pn_utama.revalidate();
                //fp.TampilData();            // tampilkan datanya
            }
    });
         menu_Item re_db = new menu_Item(null, true, iconReport, "Data Barang", new ActionListener() {
        @Override
       public void actionPerformed(ActionEvent ae) {
                report_barang rb = new report_barang();  // form_barang itu diubah nanti jadi nama file form yang sedang dibuat, misal yang belum form_simpanan dan form pinjaman
                pn_utama.removeAll();
                pn_utama.add(rb);                // tampilkan panel
                pn_utama.repaint();
                pn_utama.revalidate();
                //fp.TampilData();            // tampilkan datanya
            }
    });
         menu_Item re_ds = new menu_Item(null, true, iconReport, "Data Simpan", new ActionListener() {
        @Override
         public void actionPerformed(ActionEvent ae) {
                report_simpanan rs = new report_simpanan();  // form_barang itu diubah nanti jadi nama file form yang sedang dibuat, misal yang belum form_simpanan dan form pinjaman
                pn_utama.removeAll();
                pn_utama.add(rs);                // tampilkan panel
                pn_utama.repaint();
                pn_utama.revalidate();
                //fp.TampilData();            // tampilkan datanya
            }
    });
         menu_Item re_dp = new menu_Item(null, true, iconReport, "Data Pinjaman", new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
                report_pinjaman rp = new report_pinjaman();  // form_barang itu diubah nanti jadi nama file form yang sedang dibuat, misal yang belum form_simpanan dan form pinjaman
                pn_utama.removeAll();
                pn_utama.add(rp);                // tampilkan panel
                pn_utama.repaint();
                pn_utama.revalidate();
                //fp.TampilData();            // tampilkan datanya
            }
    });

        menu_Item menuHome = new menu_Item(iconHome, false, null, "Home", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                pn_utama.removeAll();
                pn_utama.add(new homepage());
                pn_utama.repaint();
                pn_utama.revalidate();
            }
        });

        // Gunakan dataGuru dan dataBarang di sini
        menu_Item menuMaster = new menu_Item(iconData, false, null, "Master Data", null, dataGuru, dataBarang, dataSimpanan, dataPinjaman);
        menu_Item transaksi = new menu_Item(iconTrans, false, null, "Transaksi", null, penjualan, pinjaman);
        menu_Item report = new menu_Item(iconReport, false, null, "Laporan", null, re_dg, re_db, re_ds, re_dp);

        // Tambahkan menu ke panel
        addMenu(menuHome, menuMaster, transaksi, report);
    }
    private void addMenu(menu_Item... menu) {
          for (int i = 0; i < menu.length; i++) {
              menus.add(menu[i]);
              ArrayList<menu_Item> subMenu = menu[i].getSubMenu();
              for (menu_Item m : subMenu) {
              addMenu(m);
                }
             }
        menus.revalidate();
        
        }
}
