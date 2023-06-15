package Prova_4;

public class Docente extends Funcionario {

	private String Titulacao ;
	
	private Double Adicional_Nivel ;
	
	public String getTitulacao() {
		
		return Titulacao;
	}

	public void setTitulacao(String Titulacao) {
		
		this.Titulacao = Titulacao;
	}

	public Double getAdicional_Nivel() {
		
		return Adicional_Nivel;
	}

	public void setAdicional_Nivel(Double Adicional_Nivel) {
		
		this.Adicional_Nivel = Adicional_Nivel;
	}

	public String Imprimir_Dados ()
	{
		return "---------- Docente ----------" + "\n\n" + super.Imprimir_Dados() + "\n" + "Titula��o:  " + Titulacao + "\n" + "Adicional por N�vel:  R$" + String.format("%.2f", Adicional_Nivel) 
		+ "\n\n" + "Sal�rio Total:  R$" + String.format("%.2f", Calcular_Salario());
	}
	
	public Double Calcular_Salario ()
	{
		return super.Calcular_Salario() + Adicional_Nivel;
	}
	
} // Jo�o Pedro Vieira Luz Piva