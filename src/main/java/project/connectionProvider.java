/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;

/**
 *
 * @author shash
 */
public class connectionProvider {
    public static Connection getcon() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bms", "root", "shashwat7017");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}