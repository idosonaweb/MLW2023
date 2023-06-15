package Menu;

public class Peca {
	
	private String Nome ;
	
	private Double Custo ;
	
	private Double Lucro ;

	public String getNome() {
		
		return Nome ;
	}

	public void setNome(String Nome) {
		
		this.Nome = Nome ;
	}

	public Double getCusto() {
		
		return Custo;
	}

	public void setCusto(Double Custo) {
		
		this.Custo = Custo;
	}

	public Double getLucro() {
		
		return Lucro;
	}

	public void setLucro(Double Lucro) {
		
		this.Lucro = Lucro;
	}
	
	public Double Calcular_Preco()
	{
		return Custo + Lucro ;
	}
	
	public String Exibir ()
	{
		return "Nome:  " + Nome + "\n" + "Custo:  R$" + String.format("%.2f", Custo) + "\n" + "Lucro:  R$" + String.format("%.2f", Lucro);
	}

}