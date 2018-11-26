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
     public int update(String id,String action) throws ClassNotFoundException, SQLException, IOException
    { 
         
        Class.forName("com.mysql.jdbc.Driver");  
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","");  
        PreparedStatement ps = con.prepareStatement("update application set status='"+action+"'where id='"+id +"'");
        int rs=ps.executeUpdate();
        return rs;
    } 
      public int updatePass(String id,String pass) throws ClassNotFoundException, SQLException, IOException
    { 
       
        Class.forName("com.mysql.jdbc.Driver");  
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","");  
        PreparedStatement ps = con.prepareStatement("update students set password='"+pass+"'where id='"+id +"'");
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
         public String forpass(String id,String sque,String ans) throws ClassNotFoundException, SQLException, IOException
    { 
         
        Class.forName("com.mysql.jdbc.Driver");   
        System.out.print(id+" "+sque+" "+ans);
        Statement stmt = null;
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root",""); 
        stmt = con.createStatement();
        if(sque.equals("sque1")){
          ResultSet rs = stmt.executeQuery("select * from students where id='"+id +"'");
          while(rs.next()){

            String answer = rs.getString("ans1");
         if(answer.equals(ans)){
            return "done";
         
         }
        }
        }
        else if(sque.equals("sque2")){
          ResultSet rs = stmt.executeQuery("select * from students where id='"+id +"'");
          while(rs.next()){

         String answer = rs.getString("ans2");
          if (answer.equals(ans))
         {
            return "done";
         }
         
        }
        }
        else if(sque.equals("sque3")){
          ResultSet rs = stmt.executeQuery("select * from students where id='"+id +"'");
         
          while(rs.next()){

         String answer = rs.getString("ans3");
          if (answer.equals(ans))
         {
            return "done";
         }
        }
        }
        
      return "error";
    } 
        
    public static void main(String args[]) throws ClassNotFoundException, SQLException, IOException{
      RecordCheck n=new RecordCheck();
      
    }
}
