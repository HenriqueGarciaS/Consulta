package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bd.BD;
import dbos.Consulta;

/**
 * Servlet implementation class Cadastrar_Consulta
 */
@WebServlet("/Cadastrar_Consulta")
public class Cadastrar_Consulta extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Cadastrar_Consulta() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        try {
        	Integer id=Integer.parseInt(request.getParameter("id"));
        	String  data_agenda=request.getParameter("data_agenda");
        	String observacao=request.getParameter("observacao");
        	String local=request.getParameter("local");
			Consulta consulta=new Consulta(id,data_agenda,observacao,local);
        	BD.CONSULTAS.Incluir(consulta);
        	response.sendRedirect("sucesso.html");
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
