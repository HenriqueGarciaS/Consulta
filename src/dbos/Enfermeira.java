package dbos;

public class Enfermeira extends Profissional {

	private Integer id;
	private String  Especialidade;
	private Integer Profissional_i;
	
	
	public Enfermeira(Integer id,String data_contratac,String nome,String data_nasc,Integer cpf,Integer rg,String email,String genero,String especialidade,Integer profissional_i) throws Exception
	{
		super(id, data_contratac, nome, data_nasc, rg, cpf, email,genero);
		try {

			this.Especialidade=especialidade;
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
	
	public void setEspecialidade(String Especialidade)
	{
		this.Especialidade=Especialidade;
	}
	
	public void SetProfissional_i(int Profissional)
	{
		this.Profissional_i=Profissional;
	}
	
	public Integer getID()
	{
		return this.id;
	}
	
	public String getEspecialidade()
	{
		return this.Especialidade;
	}
	
	public Integer getProfissional_i()
	{
		return this.Profissional_i;
	}
	
}
