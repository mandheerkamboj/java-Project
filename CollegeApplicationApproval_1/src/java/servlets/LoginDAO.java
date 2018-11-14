/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class LoginDAO {
    String user;
    String url;
    String password;
    Connection con;
    Statement st;
    LoginDAO() throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.jdbc.Driver");
        this.user="root";
        this.url="jdbc:mysql://localhost:3306/user";
        this.password="";
    
        this.con=DriverManager.getConnection(url, user, password);
        this.st=con.createStatement();
    }
   
    public String checkInfo(String username,String password) throws SQLException
    {
         String query="Select * from students where id='"+username+"' and password ='"+password+"'";
        ResultSet rs=st.executeQuery(query);
        while(rs.next())
        {
            return "Login successfull";
        }
        return "invalid login details";
    }

}
