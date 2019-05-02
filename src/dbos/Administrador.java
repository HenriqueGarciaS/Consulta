package dbos;

public class Administrador extends Profissional {
 
	private Integer id;
	private String cargo;
	private Integer profissional_i;
	
	
	public Administrador(Integer id,String data_contratac,String nome,String data_nasc,Integer cpf,Integer rg,String email,String genero,String cargo,Integer profissional_i) throws Exception
	{
		super(id, data_contratac, nome, data_nasc, rg, cpf, email,genero);
		try {
			this.cargo=cargo;
			this.profissional_i=profissional_i;
		    }
		catch(Exception erro)
		{
			throw new Exception("valores não fornecidos corretamente");
		}
	}
	
	public void setID(Integer id)
	{
		this.id=id;
	}
	
	public void setCargo(String Cargo)
	{
		this.cargo=Cargo;
	}
	
	public void SetProfissional_i(int Profissional)
	{
		this.profissional_i=Profissional;
	}
	
	public Integer getID()
	{
		return this.id;
	}
	
	public String getCargo()
	{
		return this.cargo;
	}
	
	public Integer getProfissional_i()
	{
		return this.profissional_i;
	}
	
}
