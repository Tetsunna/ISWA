/**
 * Created by orion on 16/03/2017.
 */
package ServletPack;

import myBeanPack.Coyote;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletTest extends HttpServlet
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String paramAuteur = request.getParameter("user");
        String message = "java mess: NUTELLA HARIBO ACTIMEL BASMATI!" + paramAuteur;

        Coyote premierBean = new Coyote();
        premierBean.setNom("Nutella");
        premierBean.setPrenom("BubbleTea");

        request.setAttribute("mess_firstjsp", message);
        request.setAttribute("Coyote", premierBean);
        this.getServletContext().getRequestDispatcher("/WEB-INF/chatroom.jsp").forward(request, response);
    }
}