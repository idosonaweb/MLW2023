package Menu;

public class Peca_Importada extends Peca {

	private Double Taxa_Importacao ;
	
	private Double Taxa_Frete ;

	public Double getTaxa_Importacao() {
		
		return Taxa_Importacao;
	}

	public void setTaxa_Importacao(Double Taxa_Importacao) {
		
		this.Taxa_Importacao = Taxa_Importacao;
	}

	public Double getTaxa_Frete() {
		
		return Taxa_Frete;
	}

	public void setTaxa_Frete(Double Taxa_Frete) {
		
		this.Taxa_Frete = Taxa_Frete;
	}
	
	public Double Calcular_Preco()
	{
		return (Taxa_Importacao + Taxa_Frete) ;
	}
	
	@Override
	
	public String Exibir ()
	{
		return super.Exibir() + "\nTaxa Importação:  R$" + String.format("%.2f", Taxa_Importacao) + "\n" + "Taxa de Frete:  R$" + String.format("%.2f", Taxa_Frete); 
	}
}