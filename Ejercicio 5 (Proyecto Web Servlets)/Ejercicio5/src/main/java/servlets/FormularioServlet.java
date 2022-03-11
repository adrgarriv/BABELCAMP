package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Persona;
import java.util.*;
/**
 * Servlet implementation class FormularioServlet
 */
@WebServlet("/FormularioServlet")
public class FormularioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormularioServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Persona p1 = new Persona("babel1","babel1");
		Persona p2 = new Persona("babel2","babel2");
		Persona p3 = new Persona("babel3","babel3");
		ArrayList<Persona> lista = new ArrayList<Persona>();
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		String user = request.getParameter("usuario");
		String pass = request.getParameter("pass");
		RequestDispatcher rd = null;
		for(int i=0;i<lista.size();i++)
		{
			if(lista.get(i).getUsuario().equals(user) && lista.get(i).getPass().equals(pass))
			{
				request.getRequestDispatcher("index.jsp");
				System.out.println("Hay coincidencia con un usuario de la lista");
				request.setAttribute("user", user);
				rd.forward(request, response);
			}
			else
			{
				request.getRequestDispatcher("error.jsp");
				System.out.println("No se ha encontrado coincidencia con ningun usuario");
				rd.forward(request, response);
			}
		}
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
