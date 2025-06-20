/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dashboard;

import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.Icon;

/**
 *
 * @author Admin
 */
public class menu_Item extends javax.swing.JPanel {

    /**
     * @return the subMenu
     */
    public ArrayList<menu_Item> getSubMenu() {
        return subMenu;
    }

    private final ArrayList<menu_Item> subMenu = new ArrayList<>();
    
    private ActionListener act;
    public menu_Item(Icon icon, boolean sbm, Icon iconSub, String menu, ActionListener act, menu_Item... subMenu ) {
        initComponents();
        lb_icon.setIcon(icon);
        lb_menu.setText(menu);
        lb_iconSub.setIcon(iconSub);
        lb_iconSub.setVisible(sbm);
        
        if (act != null) {
            this.act = act;
        }
        
        this.setPreferredSize(new Dimension(250, 40));
        this.setMaximumSize(new Dimension(250, 40));
        this.setMinimumSize(new Dimension(250, 40));
        


        for (int i = 0; i<subMenu.length; i++) {
            this.subMenu.add(subMenu[i]);
            subMenu[i].setVisible(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_icon = new javax.swing.JLabel();
        lb_iconSub = new javax.swing.JLabel();
        lb_menu = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        lb_menu.setText("Menu items...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lb_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(lb_iconSub, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lb_menu, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lb_icon, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(lb_iconSub, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_menu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    private boolean showing = false;
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed

        if (showing) {
            hideMenu();
        }else {
            showMenu();
        }
        if (act != null) {
            act.actionPerformed(null);
        }
    }//GEN-LAST:event_formMousePressed

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        setBackground(new java.awt.Color(211,211,211));
    }//GEN-LAST:event_formMouseEntered

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        setBackground(new java.awt.Color(250,250,250));
    }//GEN-LAST:event_formMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lb_icon;
    private javax.swing.JLabel lb_iconSub;
    private javax.swing.JLabel lb_menu;
    // End of variables declaration//GEN-END:variables

    private void hideMenu() {
        new Thread (new Runnable() {
        @Override
        public void run () {
            for (int i = subMenu.size()-1; i >= 0; i--) {
                sleep();
                subMenu.get(i).setVisible(false);
                subMenu.get(i).hideMenu();
            }
            getParent().repaint();
            getParent().revalidate();
            showing = false;
        }
        }).start();
        }

    private void showMenu() {
         new Thread (new Runnable() {
        @Override
        public void run () {
            for (int i = 0; i < subMenu.size(); i++) {
                sleep();
                subMenu.get(i).setVisible(true);
            }
            showing = true;
            getParent().repaint();
            getParent().revalidate();
        }
        }).start();
    }
    
    private void sleep () {
        try {
            Thread.sleep(20);
        } catch (Exception e) {
        }
    }
}
