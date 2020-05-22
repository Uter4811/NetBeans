
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class NewServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
          
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        
        String[] body = request.getParameterValues("body");
         
        try {
            writer.print("<h2>Numbers: ");
            for(String n:  body)
                writer.print(n + " ");
            writer.println("</h2>");
        } finally {
            writer.close();  
        }
    }
}
