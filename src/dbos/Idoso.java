package dbos;

public class Idoso {

	private Integer id;
	private String nome;
	private Integer rg;
	private Integer cpf;
	private String fone;
	private String endereco;
	private String data_nasc;
	
	public Idoso(Integer id,String nome,Integer rg,Integer cpf,String fone,String endereco,String data_nasc) throws Exception
	{
		try 
		{
		this.id=id;
		this.nome=nome;
		this.rg=rg;
		this.cpf=cpf;
		this.fone=fone;
		this.endereco=endereco;
		this.data_nasc=data_nasc;
		}
		catch(Exception erro)
		{
		throw new Exception("valores nao fornecidos corretamente");
		}
		}
	
	
	public void setID(Integer id) throws Exception
	{
		if(id==null)
			throw new Exception("ID n�o fornecido");
		this.id=id;
	}
	
	public void setNome(String nome)
	{
		this.nome=nome;
	}
	
	public void setRG(Integer rg)
	{
		this.rg=rg;
	}
	
	public void setCPF(Integer cpf)
	{
		this.cpf=cpf;
	}
	
	public void setFone(String fone)
	{
		this.fone=fone;
	}
	
	public void setEndereco(String endereco)
	{
		this.endereco=endereco;
	}
	
	public void setData_nasc(String data_nasc)
	{
		this.data_nasc=data_nasc;
	}
	
	public Integer getID()
	{
		return this.id;
	}
	
	public String getNome()
	{
		return this.nome;
	}
	
	public Integer getRG()
	{
		return this.rg;
	}
	
	public Integer getCPF()
	{
		return this.cpf;
	}
	
	public String getFone()
	{
		return this.fone;
	}

	public String getEndereco()
	{
		return this.endereco;
	}
	
	public String getData_nasc()
	{
		return this.data_nasc;
	}

	public String toString(){
		return
				"ID: " + this.id.toString()
				+ "\nNome: " + this.nome
				+ "\nRG: " + this.rg
				+ "\nCPF: " + this.cpf
				+ "\nTelefone: " + this.fone
				+ "\nEndereco: " + this.fone
				+ "\nData de Nascimento: " + this.data_nasc;
	}
}
