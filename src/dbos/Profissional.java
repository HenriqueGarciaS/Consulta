package dbos;

public class Profissional {
        
	protected Integer id;
	protected String data_contratac;
	protected String nome;
	protected String data_nasc;
	protected Integer rg;
	protected Integer cpf;
	protected String email;
	protected String genero;
	
	public Profissional(Integer id,String data_contratac,String nome,String data_nasc,Integer rg,Integer cpf,String email,String genero) throws Exception
	{
		try {
			this.id=id;
			this.data_contratac=data_contratac;
			this.nome=nome;
			this.data_nasc=data_nasc;
			this.rg=rg;
			this.cpf=rg;
			this.email=email;
			this.genero=genero;
		    }
		catch(Exception erro)
		{
			throw new Exception("valores não fornecidos corretamente");
		}
	}
	
	public void setID(Integer id)throws Exception
	{
		if(id==null)
			throw new Exception("id nulo");
		this.id=id;
	}
	
	public void setData_contratac(String data)
	{
		this.data_contratac=data;
	}
	
	public void setNome(String nome)
	{
		this.nome=nome;
	}
	
	public void setData_nasc(String data)
	{
		this.data_nasc=data;
	}
	
	public void setRG(Integer rg)
	{
		this.rg=rg;
	}
	
	public void setCPF(Integer cpf)
	{
		this.cpf=cpf;
	}
	
	public void setEmail(String email)
	{
		this.email=email;
	}
	
	public void setGenero(String genero)
	{
		this.genero=genero;
	}
	
	public Integer getId()
	{
		return this.id;
	}
	
	public String data_contratac()
	{
		return this.data_contratac;
	}
	
	public String getNome()
	{
		return this.nome;
	}
	
	public String getData_nasc()
	{
		return this.data_nasc;
	}
	
	public Integer getRG()
	{
		return this.rg;
	}
	
	public Integer getCPF()
	{
		return this.cpf;
	}
	
	public String getEmail()
	{
		return this.email;
	}
	
	public String getGenero()
	{
		return this.genero;
	}
	
	public String getData_contratac()
	{
		return this.data_contratac;
	}
	
	
}
