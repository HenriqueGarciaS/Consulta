package dbos;

public class Motorista extends Profissional {

	private Integer id;
	private Integer  cnh;
	private Integer Profissional_i;
	
	
	public Motorista(Integer id,String data_contratac,String nome,String data_nasc,Integer cpf,Integer rg,String email,String genero,Integer cnh,Integer profissional_i) throws Exception
	{
		super(id, data_contratac, nome, data_nasc, rg, cpf, email,genero);
		try {
			this.cnh=cnh;
			this.Profissional_i=profissional_i;
			
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
	
	public void setCnh(Integer cnh)
	{
		this.cnh=cnh;
	}
	
	public void SetProfissional_i(int Profissional)
	{
		this.Profissional_i=Profissional;
	}
	
	public Integer getID()
	{
		return this.id;
	}
	
	public Integer getCnh()
	{
		return this.cnh;
	}
	
	public Integer getProfissional_i()
	{
		return this.Profissional_i;
	}
	
}


