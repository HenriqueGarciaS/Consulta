package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bd.BD;
import dbos.Consulta;

/**
 * Servlet implementation class Visualizar_Consulta
 */
@WebServlet("/Visualizar_Consulta")
public class Visualizar_Consulta extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Visualizar_Consulta() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			PrintWriter out=response.getWriter();
			Integer id=Integer.parseInt(request.getParameter("id"));
			Consulta consulta=BD.CONSULTAS.getConsulta(id);
			out.println("<html>");
			out.println("<head>");
			out.println("<meta charset=ISO-8859-1");
			out.println("<title>Consulta pesquisadas<title/>");
			out.println("<head/>");
			out.println("<body>");
            out.println("<h1>Consulta Pesquisada<h1/>");
            out.println("<p>");
            out.println("ID: ");
            out.println(consulta.getID());
            out.println("data agendada:");
            out.println(consulta.getData_agenda());
            out.println("local: ");
            out.println(consulta.getLocal());
            out.println("observação:");
            out.println(consulta.getObservacao());
            out.println("<p/>");
			out.println("<body/>");
			out.println("<html/>");
			
		}
		catch(Exception erro)
		{
			response.sendRedirect("erro.html");
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
