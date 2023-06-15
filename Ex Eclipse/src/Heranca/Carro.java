package Heranca;

public class Carro extends MeioTransporte {
	
	private Double Preco ;
	
	private Double Quilometragem ;

	public Double getPreco() {
		
		return Preco;
	}

	public void setPreco(Double Preco) {
		
		this.Preco = Preco;
	}

	public Double getQuilometragem() {
		
		return Quilometragem;
	}

	public void setQuilometragem(Double Quilometragem) {
		
		this.Quilometragem = Quilometragem;
	}
}