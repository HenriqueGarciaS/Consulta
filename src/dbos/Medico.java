package dbos;

public class Medico extends Profissional {

	private Integer id;
	private String especialidade;
	private Integer crm;
	private Integer Profissional_i;
	
	
	public Medico(Integer id,String data_contratac,String nome,String data_nasc,Integer cpf,Integer rg,String email,String genero,String especialidade,Integer profissional_i,Integer crm) throws Exception
	{
		super(id, data_contratac, nome, data_nasc, rg, cpf, email,genero);
		try {
			this.especialidade=especialidade;
			this.Profissional_i=profissional_i;
			this.crm=crm;
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
		this.especialidade=Especialidade;
	}
	
	public void SetProfissional_i(int Profissional)
	{
		this.Profissional_i=Profissional;
	}
	
	public void setCrm(Integer crm)
	{
		this.crm=crm;
	}
	
	public Integer getID()
	{
		return this.id;
	}
	
	public String getEspecialidade()
	{
		return this.especialidade;
	}
	
	public Integer getProfissional_i()
	{
		return this.Profissional_i;
	}
	
	public Integer getCrm() 
	{
		return this.crm;
	}
	
	
}
