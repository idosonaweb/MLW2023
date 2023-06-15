package Menu;

public class Velho extends Imovel {
	
	private Double Desconto ;

	public Double getDesconto() {
		
		return Desconto;
	}

	public void setDesconto(Double Desconto) {
		
		this.Desconto = Desconto;
	} 
	
	public String Imprime_Dados ()
	{
		return super.Imprime_Dados() + "\n" + "Desconto: R$ " + String.format("%.2f", Desconto) + 
										"\n\n" + "Preço Final: R$" + String.format("%.2f", Calcular_Preco());
	}
	
	public Double Calcular_Preco ()
	{
		return super.Calcular_Preco() - Desconto ;
	}
}