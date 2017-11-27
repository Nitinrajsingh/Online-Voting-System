/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nitin
 */
import java.sql.*;
import javax.swing.*;
public class Javaconnect {
    Connection conn = null;
    public static Connection dbConnector()
    {
        try
        {  
            Class.forName("org.sqlite.JDBC");
            Connection conn  = DriverManager.getConnection("jdbc:sqlite:C:/Users/Nitin/Documents/NetBeansProjects/OomProject/VoterId.sqlite");
            //JOptionPane.showMessageDialog(null, "connection established");
            return conn;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
