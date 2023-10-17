package Controller;

import Model.InsertStatement;
import Model.SelectStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StatementController {
    public int insertUpdateDeleteData(String query)
    {
        InsertStatement insert = new InsertStatement();
        return insert.insertUpdateDelete(query);
    }
    
    public ResultSet selectData(String query)
    {
        SelectStatement display = new SelectStatement();
        ResultSet result = display.displayUser(query);
        return result;
    }
    
    public PreparedStatement selectPreparedStatement(String query)
            
    {
        SelectStatement display = new SelectStatement();
        return display.getPreparedStatement(query);
        
    }
    
    public void selectCloseCon(){
        SelectStatement display = new SelectStatement();
        display.selectCloseCon();
    }
}
