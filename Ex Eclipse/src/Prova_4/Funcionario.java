package Prova_4;

public class Funcionario {

	private String Nome ;
	
	private Double Salario ;

	public String getNome() {
		
		return Nome;
	}

	public void setNome(String Nome) {
		
		this.Nome = Nome;
	}

	public Double getSalario() {
		
		return Salario;
	}

	public void setSalario(Double Salario) {
		
		this.Salario = Salario;
	}
	
	public String Imprimir_Dados ()
	{
		return "Nome:  " + Nome +  "\n" + "Salário:  R$" + String.format("%.2f", Salario) ;
	}
	
	public Double Calcular_Salario ()
	{
		return Salario ;
	}
	
} //João Pedro Vieira Luz Piva