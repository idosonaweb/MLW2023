package Heranca;

public class Boneca extends Brinquedo {
	
	private String Nome, Cor_Cabelo ;
	
	private Double Tamanho ;

	public String getNome() 
	{
		return Nome;
	}

	public void setNome(String Nome) 
	{
		this.Nome = Nome;
	}

	public String getCor_Cabelo() 
	{
		return Cor_Cabelo;
	}

	public void setCor_Cabelo(String Cor_Cabelo) 
	{
		this.Cor_Cabelo = Cor_Cabelo;
	}

	public Double getTamanho() 
	{
		return Tamanho;
	}

	public void setTamanho(Double Tamanho) 
	{
		this.Tamanho = Tamanho;
	}
}