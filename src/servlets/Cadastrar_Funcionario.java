package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bd.BD;
import dbos.Profissional;

/**
 * Servlet implementation class Cadastrar_Funcionario
 */
@WebServlet("/Cadastrar_Funcionario")
public class Cadastrar_Funcionario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Cadastrar_Funcionario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Integer id=Integer.parseInt(request.getParameter("id"));
			String data_contratac=request.getParameter("data_contratac");
			String nome=request.getParameter("nome");
			String data_nasc=request.getParameter("data_nasc");
			Integer rg=Integer.parseInt(request.getParameter("rg"));
			Integer cpf=Integer.parseInt(request.getParameter("cpf"));
			String email=request.getParameter("email");
			String genero=request.getParameter("genero");
			Profissional profissional= new Profissional(id,data_contratac,nome,data_nasc,rg,cpf,email,genero);
			BD.FUNCIONARIOS.incluir(profissional);
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
