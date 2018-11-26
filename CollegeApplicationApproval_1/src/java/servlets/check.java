
package servlets;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class check extends HttpServlet {
    public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
    {
         res.setContentType("text/html;charset=UTF-8");
        PrintWriter out = res.getWriter();
        String id = req.getParameter("id");
        String fname=req.getParameter("firstname");
        String lname=req.getParameter("lastname");
        String pass = req.getParameter("pass");
        String re_pass = req.getParameter("re-pass");
        RecordCheck rs = new RecordCheck();
        int ad;
        try {
            if(pass.equals(re_pass)){
             ad=rs.insert(id, fname, lname, pass);
             RequestDispatcher rd=req.getRequestDispatcher("signup.html");  
             rd.forward(req,res);
            }
            else{
                out.println("Passwords donot match");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(check.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(check.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
