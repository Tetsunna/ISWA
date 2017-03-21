package ServletPack;

/**
 * Created by orion on 21/03/2017.
 */

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletForms extends HttpServlet
{
     public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        this.getServletContext().getRequestDispatcher("/WEB-INF/formulaire.jsp").forward(request, response);
    }
}
