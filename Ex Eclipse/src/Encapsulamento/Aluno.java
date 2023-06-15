package Encapsulamento;

public class Aluno {

	private String Nome ;
	
	private Double Nota1, Nota2 ;
	
	public String getNome()
	{
		return Nome ;
	}
	
	public void setNome (String Nome)
	{
		this.Nome = Nome ;
	}
	
	public Double getNota1()
	{
		return Nota1 ;
	}
	
	public void setNota1 (Double Nota1)
	{
		this.Nota1 = Nota1 ;
	}
	
	public Double getNota2()
	{
		return Nota2 ;
	}
	
	public void setNota2 (Double Nota2)
	{
		this.Nota2 = Nota2 ;
	}
	
	public String Imprimir_Dados()
	{
		return "Nome:  " +  Nome + "\n" + "1ª Nota:  " +  Nota1 + "\n" + "2ª Nota:  " +  Nota2;
	}
	
	public Double Calcular_Media ()
	{
		return (Nota1 + Nota2) / 2 ;
	}
}