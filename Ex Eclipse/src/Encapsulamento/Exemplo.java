package Encapsulamento;

public class Exemplo {

	private String Nome ;
	
	private int Idade ;
	
	private double Salario ;
	
	public String getNome()
	{
		return Nome ;
	}
	
	public void setNome (String Nome)
	{
		this.Nome = Nome ;
	}
	
	public int getIdade ()
	{
		return Idade ;
	}
	
	public void setIdade (int Idade)
	{
		this.Idade = Idade ;
	}
	
	public double getSalario ()
	{
		return Salario ;
	}
	
	public void setSalario (double Salario)
	{
		this.Salario = Salario ;
	}
	
	public String Imprimir_Dados()
	{
		return "Nome:  " +  Nome + "\n" + "Idade:  " +  Idade + "\n" + "Salário:  R$" +  String.format("2f.%", Salario);
	}

}