/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author USER
 */
public class TestConnection {
    public static void main(String args[])
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Driver Loaded");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
            System.out.println("Connection Established");
            //step3 create the statement object  
           Statement stmt=con.createStatement();  
  
           //step4 execute query 
           stmt.executeQuery("insert into student values('rahul','124')");
           ResultSet rs=stmt.executeQuery("select * from student");  
           while(rs.next())  
           System.out.println(rs.getString(1)+"  "+rs.getString(2));  
           con.close();
        }
        catch(ClassNotFoundException e)
        {
          System.out.println("Driver nOt Found Exception");
          
        } catch (SQLException ex) {
            System.out.println("connection error");
        }
    }
    
}
