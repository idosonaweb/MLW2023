package Menu;

public class Imovel {
	
	private String Endereco ;
	
	private Double Preco ;

	public String getEndereco() {
		
		return Endereco;
	}

	public void setEndereco(String Endereco) {
		
		this.Endereco = Endereco;
	}

	public Double getPreco() {
		
		return Preco;
	}

	public void setPreco(Double Preco) {
		
		this.Preco = Preco ;
	}
	
	public String Imprime_Dados ()
	{
		return "Endereço:  " + Endereco +  "\n" + "Preço: R$" + Preco ;
	}
	
	public Double Calcular_Preco ()
	{
		return Preco ;
	}
}