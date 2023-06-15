package Prova_4;

public class Tecnico extends Funcionario {
	
	private String Funcao ;
	
	private Double ValorH_Extra ;

	public String getFuncao() {
		
		return Funcao;
	}

	public void setFuncao(String Funcao) {
		
		this.Funcao = Funcao;
	}

	public Double getValorH_Extra() {
		
		return ValorH_Extra;
	}

	public void setValorH_Extra(Double ValorH_Extra) {
		
		this.ValorH_Extra = ValorH_Extra ;
	}
	
	public String Imprimir_Dados ()
	{
		return "----------T�cnico----------" + "\n\n" + super.Imprimir_Dados() + "\n" + "Fun��o:  " + Funcao + "\n" + "Valor da Hora Extra:  R$" + String.format("%.2f", ValorH_Extra) 
									+ "\n\n" + "Sal�rio Total:  R$" + String.format("%.2f", Calcular_Salario());
	}
	
	public Double Calcular_Salario ()
	{
		return super.Calcular_Salario() + ValorH_Extra ;
	}

} // Jo�o Pedro Vieira Luz Piva