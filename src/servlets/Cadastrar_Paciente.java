package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bd.BD;
import dbos.Idoso;

/**
 * Servlet implementation class Cadastrar_Paciente
 */
@WebServlet("/Cadastrar_Paciente")
public class Cadastrar_Paciente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Cadastrar_Paciente() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try
		{
			Integer id=Integer.parseInt(request.getParameter("id"));
			String  nome=request.getParameter("nome");
			Integer rg=Integer.parseInt(request.getParameter("rg"));
			Integer cpf=Integer.parseInt(request.getParameter("cpf"));
			String fone=request.getParameter("fone");
			String endereco=request.getParameter("endereco");
			String data_nasc=request.getParameter("data_nasc");
			Idoso idoso=new Idoso(id,nome,rg,cpf,fone,endereco,data_nasc);
			BD.IDOSO.incluir(idoso);
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
