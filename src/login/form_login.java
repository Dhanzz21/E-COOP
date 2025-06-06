package login;


import javax.swing.JOptionPane;


/**
 *
 * @author Rafly Andhika Raswan
 */
public class form_login extends javax.swing.JFrame {
    int xx, xy;
    /**
     * Creates new form form_login
     */
    public form_login() {
        initComponents();
    }

    void bersih(){
        t_username.setText("Username");
        t_password.setText("Password");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        logosmp = new javax.swing.JLabel();
        ButtonExit = new javax.swing.JLabel();
        teacher = new javax.swing.JLabel();
        logouser = new javax.swing.JLabel();
        t_username = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        warnabiru = new javax.swing.JLabel();
        logopass = new javax.swing.JLabel();
        bt_login = new javax.swing.JButton();
        gambarmurid = new javax.swing.JLabel();
        t_password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logosmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img2/Logo SMP 23.png"))); // NOI18N
        jPanel1.add(logosmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, -1, 70));

        ButtonExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img2/no.png"))); // NOI18N
        ButtonExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonExitMouseClicked(evt);
            }
        });
        jPanel1.add(ButtonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, 50, -1));

        teacher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img2/teacher.png"))); // NOI18N
        jPanel1.add(teacher, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, -1, -1));

        logouser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img2/Logo User.png"))); // NOI18N
        jPanel1.add(logouser, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, -1, -1));

        t_username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_username.setText("Username");
        t_username.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255), 3));
        t_username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                t_usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                t_usernameFocusLost(evt);
            }
        });
        t_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_usernameActionPerformed(evt);
            }
        });
        jPanel1.add(t_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 230, 50));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SMP Negeri 23 Depok");
        jLabel3.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jLabel3.setInheritsPopupMenu(false);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 250, 30));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        jLabel5.setText("SELAMAT DATANG");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 210, -1));

        warnabiru.setBackground(new java.awt.Color(204, 204, 255));
        warnabiru.setForeground(new java.awt.Color(204, 204, 255));
        warnabiru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img2/warna biru.jpg"))); // NOI18N
        jPanel1.add(warnabiru, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 70));

        logopass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img2/Logo Password.png"))); // NOI18N
        jPanel1.add(logopass, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, -1, 30));

        bt_login.setText("Login");
        bt_login.setBorder(new javax.swing.border.MatteBorder(null));
        bt_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_loginActionPerformed(evt);
            }
        });
        jPanel1.add(bt_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 450, 100, 40));

        gambarmurid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img2/Murid Belajar.jpg"))); // NOI18N
        gambarmurid.setText("jLabel4");
        jPanel1.add(gambarmurid, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 970, -1));

        t_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_password.setText("Password");
        t_password.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 3, true));
        t_password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                t_passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                t_passwordFocusLost(evt);
            }
        });
        t_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_passwordActionPerformed(evt);
            }
        });
        jPanel1.add(t_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, 230, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
       int x = evt.getXOnScreen();
       int y = evt.getYOnScreen();
       this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_formMouseDragged

    private void ButtonExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonExitMouseClicked
        dispose();
    }//GEN-LAST:event_ButtonExitMouseClicked

    private void t_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_usernameActionPerformed

    private void bt_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_loginActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        String username = t_username.getText();
        String pass = t_password.getText();

            if (username.equals("") && pass.equals("")) {
              JOptionPane.showMessageDialog(null, "username/password tidak boleh kosong", "Kesalahan", JOptionPane.ERROR_MESSAGE);
                } else {
            if (username.equals("admin") && pass.equals("12345")) {
              JOptionPane.showMessageDialog(null, "Selamat Anda Berhasil Login");
          // Panggil Menu_Utama setelah login berhasil
        main.menu_Utama menu = new main.menu_Utama();
        menu.setVisible(true);
        
        this.dispose(); // Tutup form login
             } else {
        JOptionPane.showMessageDialog(null, "Username / Password SALAH!");
    }
}

    }//GEN-LAST:event_bt_loginActionPerformed

    private void t_usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t_usernameFocusGained
       String username = t_username.getText();
        if(username.equals("Username")){
             t_username.setText("");
   }
    }//GEN-LAST:event_t_usernameFocusGained

    private void t_usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t_usernameFocusLost
        String username=t_username.getText();
        if(username.equals("")||username.equals("Username")){
            t_username.setText("Username");
        }
    }//GEN-LAST:event_t_usernameFocusLost

    private void t_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_passwordActionPerformed

    private void t_passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t_passwordFocusGained
        // TODO add your handling code here:
         String pass = t_password.getText();
    if(pass.equals("Password")){
        t_password.setText("");
        }
    }//GEN-LAST:event_t_passwordFocusGained

    private void t_passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t_passwordFocusLost
        // TODO add your handling code here:
        String pass = t_password.getText();
    if(pass.equals("") || pass.equals("Password")){
        t_password.setText("Password");
        }
    }//GEN-LAST:event_t_passwordFocusLost

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
            java.util.logging.Logger.getLogger(form_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new form_login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ButtonExit;
    private javax.swing.JButton bt_login;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel gambarmurid;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logopass;
    private javax.swing.JLabel logosmp;
    private javax.swing.JLabel logouser;
    private javax.swing.JPasswordField t_password;
    private javax.swing.JTextField t_username;
    private javax.swing.JLabel teacher;
    private javax.swing.JLabel warnabiru;
    // End of variables declaration//GEN-END:variables
}