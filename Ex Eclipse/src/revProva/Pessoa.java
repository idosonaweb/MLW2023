package revProva;

public class Pessoa {
	
	public String Nome ;
	
	public Integer Idade ;
	
	public Double Altura, Peso, IMC ;
	
	public Double Cal_IMC ()
	{	
		IMC = Peso / (Altura * Altura) ;
		
		return IMC ;
	}
	
	public String Imprimir_Dados ()
	{
		return Nome + " tem " + Idade + " anos, e tem o IMC de " + IMC ;
	}

}