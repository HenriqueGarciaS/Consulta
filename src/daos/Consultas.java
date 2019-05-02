package daos;

import java.sql.SQLException;

import bd.BD;
import core.MeuResultSet;
import dbos.Consulta;

public class Consultas {
	
	public boolean cadastrado(int id) throws Exception
	{
		boolean retorno=false;
		try {
			String sql;
			sql="select * "+"from consultas "+"where id=?";
			BD.COMANDO.prepareStatement(sql);
			BD.COMANDO.setInt(1,id);
			MeuResultSet resultado=(MeuResultSet)BD.COMANDO.executeQuery();
			retorno=resultado.first();
		}
		catch(SQLException erro)
		{
			throw new Exception("erro ao procuar consulta");
		}
		return retorno;
	}

	public void Incluir(Consulta consulta) throws Exception
	{
		if(consulta==null)
			throw new Exception("consulta não informada");
		try {
			String sql;
			sql="insert into consulta "+"(id,data_agenda,observacao,local) "+"values(?,?,?,?)";
		    BD.COMANDO.prepareStatement(sql);
			BD.COMANDO.setInt(1,consulta.getID());
			BD.COMANDO.setString(2,consulta.getData_agenda());
			BD.COMANDO.setString(3,consulta.getObservacao());
			BD.COMANDO.setString(4,consulta.getLocal());
			BD.COMANDO.executeUpdate();
			BD.COMANDO.commit();
		}
		catch(SQLException erro)
		{
			throw new Exception("erro ao inserir consulta");
		}
		
	}
	
	public Consulta getConsulta(int id) throws Exception
	{
		Consulta consulta=null;
		try {
			String sql;
			sql="select * "+"from consulta "+"where consulta=?";
			BD.COMANDO.prepareStatement(sql);
			BD.COMANDO.setInt(1,id);
			MeuResultSet resultado=(MeuResultSet)BD.COMANDO.executeQuery();
			if(!resultado.first())
				throw new Exception("não cadastrado");
			consulta=new Consulta(resultado.getInt("id"),resultado.getString("data_agenda"),resultado.getString("observacao"),resultado.getString("local"));
		}
		catch(SQLException erro)
		{
			throw new Exception("erro ao procurar consulta");
		}
		return consulta;
	}
}
