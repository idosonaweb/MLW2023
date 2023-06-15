package Menu;

public class Novo extends Imovel {
	
	private Double Adicional ;

	public Double getAdicional() {
		
		return Adicional;
	}

	public void setAdicional(Double Adicional) {
		
		this.Adicional = Adicional;
	} 
	
	public String Imprime_Dados ()
	{
		return super.Imprime_Dados() + "\n" + "Adicional: R$" + String.format("%.2f", Adicional) + 
										"\n\n" + "Preço Total: R$" + String.format("%.2f", Calcular_Preco());
	}
	
	public Double Calcular_Preco ()
	{
		return super.Calcular_Preco() + Adicional ;
	}
	
}