package avatar.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import avatar.model.Usuario;
import avatar.service.UsuarioService;
import avatar.service.impl.UsuarioServiceImpl;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType( "text/html; charset=iso-8859-1" );
		PrintWriter out = response.getWriter();
		
		String login = request.getParameter("login");
		String clave = request.getParameter("clave");
		
		UsuarioService usuarioService = new UsuarioServiceImpl();
		Usuario usuario = usuarioService.obtenerPorLogin(login);
		
        String mensaje = null;
        
        if (usuario != null) {
        	if (usuario.getClave().equals(clave)) {
            	mensaje = "Bienvenido "+ usuario.getNombre() + ".";
            	
            	mensaje = "<div class=\"alert alert-success\">" + mensaje + "</div>";
            	
            } else {
            	mensaje = "Usuario no encontrado.";
            	
            	mensaje = "<div class=\"alert alert-danger\">" + mensaje + "</div>";
            }
        	
        } else {
        	mensaje = "Usuario no encontrado.";
        	
        	mensaje = "<div class=\"alert alert-danger\">" + mensaje + "</div>";
        }

        out.println(mensaje);
	}

}
