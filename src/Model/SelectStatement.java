package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class SelectStatement {
    static ResultSet result;
    static PreparedStatement pst;

    public static ResultSet displayUser(String query) {
        try {
            PreparedStatement ps = DBConnection.dbConnection().prepareStatement(query);
            result = ps.executeQuery();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return result;
    }
    
    public static PreparedStatement getPreparedStatement(String query) {
        try {
            pst = DBConnection.dbConnection().prepareStatement(query);
                        
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return pst;
    }
    
    
    
    public static void selectCloseCon(){
        DBConnection.closeCon();
    }
}
/*package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class SelectStatement {
    static ResultSet result;
    public static ResultSet displayUser(String query)
    {
        try
        {
            Statement st = DBConnection.dbConnection().createStatement();
            result = st.executeQuery(query);
            
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return result;
    }
}*/
