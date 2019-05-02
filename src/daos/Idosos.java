package daos;

import java.sql.SQLException;

import bd.BD;
import core.MeuResultSet;
import dbos.Idoso;

public class Idosos {

	public boolean cadastrado(int id) throws Exception
	{
		boolean retorno=false;
		try {
			String sql;
			sql="select * "+"from alunos "+"where ra=?";
			BD.COMANDO.prepareStatement(sql);
			BD.COMANDO.setInt(1,id);
			MeuResultSet resultado=(MeuResultSet)BD.COMANDO.executeQuery();
			retorno=resultado.first();
		}
		catch(SQLException erro)
		{
			throw new Exception("erro ao procurar idoso");
		}
		return retorno;
	}
	
	
	public void incluir(Idoso idoso) throws Exception
	{
		if(idoso==null)
			throw new Exception("idoso não informadado");
	
	try {
		String sql;
		sql="insert into idoso"+"(id,nome,rg,cpg,fone,endereco,data_nasc) "+"values(?,?,?,?,?,?,?,?)";
		BD.COMANDO.prepareStatement(sql);
		BD.COMANDO.setInt(1,idoso.getID());
		BD.COMANDO.setString(2,idoso.getNome());
		BD.COMANDO.setInt(3,idoso.getRG());
		BD.COMANDO.setInt(4,idoso.getCPF());
		BD.COMANDO.setString(5,idoso.getFone());
		BD.COMANDO.setString(6,idoso.getEndereco());
		BD.COMANDO.setString(7,idoso.getData_nasc());
		BD.COMANDO.executeUpdate();
		BD.COMANDO.commit();
	}	
	catch(SQLException erro)
	{
		throw new Exception("erro ao inserir idoso");
	}
	}
	
	public Idoso getIdoso(int id) throws Exception
	{
		Idoso idoso=null;
		try
		{
			String sql;
			sql="select * "+"from idoso "+"where id=?";
			BD.COMANDO.prepareStatement(sql);
			BD.COMANDO.setInt(1,id);
			MeuResultSet resultado=(MeuResultSet)BD.COMANDO.executeQuery();
			if(!resultado.first())
				throw new Exception("não cadastrado");
			idoso=new Idoso(resultado.getInt("id"),resultado.getString("nome"),resultado.getInt("rg"),resultado.getInt("cpf"),resultado.getString("fone"),resultado.getString("endereco"),resultado.getString("data_nasc"));
		}
		catch(SQLException erro)
		{
			throw new Exception("erro ao procurar idoso");
		}
		return idoso;
	}
	
	public MeuResultSet getIdosos() throws Exception
	{
		MeuResultSet resultado=null;
		try {
			String sql;
			sql="select * "+"from idosos";
			BD.COMANDO.prepareStatement(sql);
            resultado=(MeuResultSet)BD.COMANDO.executeQuery();
		}
		catch(SQLException erro)
		{
			throw new Exception("erro ao recuperar idosos");
		}
		return resultado;
	}
	
	
}
