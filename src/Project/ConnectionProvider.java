
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
import java.sql.*;

/**
 *
 * @author hp
 */
public class ConnectionProvider {
    public static Connection getConn()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");
            //System.out.println("Connection established");
            return conn;
        }
        catch(Exception e)
        {
            //System.out.println(e);
            return null;
        }
    }
}
