package Encapsulamento;

public class Mercadorias {

	private String Nome ;
	
	private Integer Quantidade ;
	
	private Double Preco ;
	
	public String getNome()
	{
		return Nome ;
	}
	
	public void setNome (String Nome)
	{
		this.Nome = Nome ;
	}
	
	public Integer getQuantidade ()
	{
		return Quantidade ;
	}
	
	public void setQuantidade (Integer Quantidade)
	{
		this.Quantidade = Quantidade ;
	}
	
	public double getPreco ()
	{
		return Preco ;
	}
	
	public void setPreco (Double Preco)
	{
		this.Preco = Preco ;
	}
}