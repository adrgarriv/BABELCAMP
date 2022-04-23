package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.JsonObject;

import entidad.Usuario;
import negocio.GestorUsuario;

/**
 * Servlet implementation class ValidarUsuarioServlet
 */
@WebServlet("/usuarios/login")
public class ValidarUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValidarUsuarioServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GestorUsuario gs = new GestorUsuario();
		Usuario u = new Usuario(request.getParameter("nombre"),request.getParameter("password"));
		if(gs.validarUsuario(u))
		{
			System.out.println("Usuario validado preparando objeto JSON");
			response.setContentType("application/json");
			response.setCharacterEncoding("utf-8");
			PrintWriter out = response.getWriter();

			  //create Json Object
			  JsonObject json = new JsonObject();

			    // put some value pairs into the JSON object .
			    json.addProperty("validado", true);

			    // finally output the json string       
			    out.print(json.toString());
		}
		else
		{
			System.out.println("Usuario no validado preparando objeto JSON");
			response.setContentType("application/json");
			response.setCharacterEncoding("utf-8");
			PrintWriter out = response.getWriter();

			  //create Json Object
			  JsonObject json = new JsonObject();

			    // put some value pairs into the JSON object .
			    json.addProperty("validado", false);

			    // finally output the json string       
			    out.print(json.toString());
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
