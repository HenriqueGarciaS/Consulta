package daos;

import java.sql.SQLException;

import bd.BD;
import core.MeuResultSet;
import dbos.Profissional;

public class Funcionarios {

	public boolean cadastrado(int id) throws Exception
	{
		boolean retorno=false;
		try {
			String sql;
			sql="Select * "+"from funcionarios "+"where ra=?";
			BD.COMANDO.prepareStatement(sql);
			BD.COMANDO.setInt(1,id);
			MeuResultSet resultado=(MeuResultSet)BD.COMANDO.executeQuery();
			retorno=resultado.first();
		}
		catch(SQLException erro)
		{
			throw new Exception("erro ao procurar funcionario");
		}
		return retorno;
	}
	
	public void incluir(Profissional profissional) throws Exception
	{
		if(profissional==null)
			throw new Exception("profissional não informado");
		try {
			String sql;
			sql="insert into funcionario "+"(id,data_contratac,nome,data_nasc,rg,cpf,email,genero)"+"values(?,?,?,?,?,?,?,?)";
			BD.COMANDO.prepareStatement(sql);
			BD.COMANDO.setInt(1,profissional.getId());
			BD.COMANDO.setString(2,profissional.getData_contratac());
			BD.COMANDO.setString(3,profissional.getNome());
			BD.COMANDO.setString(4,profissional.getData_nasc());
			BD.COMANDO.setInt(5,profissional.getRG());
			BD.COMANDO.setInt(6,profissional.getCPF());
			BD.COMANDO.setString(7,profissional.getEmail());
			BD.COMANDO.setString(8,profissional.getGenero());
			BD.COMANDO.executeUpdate();
			BD.COMANDO.commit();
		}
		catch(SQLException erro)
		{
			throw new Exception("erro ao inserir no banco");
		}
	}
	
	public Profissional getProfissional(int id) throws Exception
	{
		Profissional profissional=null;
		try {
			String sql;
			sql="select * "+"from funcionario"+"where id=?";
			BD.COMANDO.prepareStatement(sql);
			BD.COMANDO.setInt(1,id);
			MeuResultSet resultado=(MeuResultSet)BD.COMANDO.executeQuery();
			if(!resultado.first())
				throw new Exception("não cadastrado");
			profissional=new Profissional(resultado.getInt("id"),resultado.getString("data_contratac"),resultado.getString("nome"),resultado.getString("data_nasc"),resultado.getInt("rg"),resultado.getInt("cpf"),resultado.getString("email"),resultado.getString("genero"));
		}
		catch(SQLException erro)
		{
			throw new Exception("erro ao procurar funcionario");
		}
		return profissional;
	}
}
