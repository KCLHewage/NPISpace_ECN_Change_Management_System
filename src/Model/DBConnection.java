package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DBConnection {
    static Connection con;
    
    public static Connection dbConnection()//static method can be called directly without needing to create an object of the class
    {
        String dbpath = "jdbc:mysql://localhost:3306/npi";
        try {
            con = DriverManager.getConnection(dbpath,"root","");
        } 
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return con;
    }
    public static void closeCon(){
    
    try {
            con.close();
        } 
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
}
