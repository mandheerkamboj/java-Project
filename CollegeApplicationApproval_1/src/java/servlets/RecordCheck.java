/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author dell
 */
public class RecordCheck {
    
    public int insert(String id,String first,String last,String pass) throws ClassNotFoundException, SQLException, IOException
    { 
         
        Class.forName("com.mysql.jdbc.Driver");  
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","");  
        PreparedStatement ps = con.prepareStatement("insert into students values(?,?,?,?)");
        ps.setString(1, id);
        ps.setString(2, first);
        ps.setString(3, last);
        ps.setString(4,pass);
        int rs=ps.executeUpdate();
        return rs;
    } 
       public String delete(String id,String firstname,String user) throws ClassNotFoundException, SQLException, IOException
    { 
         String rs=null;
        Class.forName("com.mysql.jdbc.Driver");  
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","");  
        if (user.equals("Teacher")){
            PreparedStatement ps = con.prepareStatement("delete from teacher where id='"+id+"' and firstName ='"+firstname+"'");
            ps.executeUpdate();
            rs="teacher";
            
        }
        else if (user.equals("Student"))
        {
         PreparedStatement ps = con.prepareStatement("delete from students where id='"+id+"' and firstName ='"+firstname+"'");
            ps.executeUpdate();
            rs="student";
        }
        return rs;
    }
        public int insertapp(String id,String first,String last,String from,String to,String reason) throws ClassNotFoundException, SQLException, IOException
    { 
        String stat="pending";
        Class.forName("com.mysql.jdbc.Driver");  
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","");  
        PreparedStatement ps = con.prepareStatement("insert into application(id,firstName,lastName,frm,upto,reason,status) values(?,?,?,?,?,?,?)");
        ps.setString(1, id);
        ps.setString(2, first);
        ps.setString(3, last);
        ps.setString(4,from);
        ps.setString(5,to);
        ps.setString(6,reason);
        ps.setString(7,stat);
        int rs=ps.executeUpdate();
        return rs;
    } 
}
