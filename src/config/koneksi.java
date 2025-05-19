/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

/**
 *
 * @author Admin
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class koneksi {
    Connection cnc;
    public static Connection BukaKoneksi(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cnc = DriverManager.getConnection("jdbc:mysql://localhost/koperasi", "root", "");
            return cnc;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }  
}