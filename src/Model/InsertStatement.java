package Model;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class InsertStatement {
    public int insertUpdateDelete(String query)
    {
        int result = 0;
        try 
        {
            PreparedStatement pst = DBConnection.dbConnection().prepareStatement(query);
            result = pst.executeUpdate();
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return result;
    }
}
        
        


/*package Model;

import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class InsertStatement {
    public int insertUpdateDelete(String query)
    {
        int result=0;
        try 
        {
            Statement st = DBConnection.dbConnection().createStatement();
            result= st.executeUpdate(query);
            
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
            return result;
        
    }
}*/
