package Prova;

public class Calcados_Joao_Piva {
	
	int Numeracao ;
	
	double Preco ;
	
	String Marca, Modelo ;
	
	public double calcular_Preco_Vista ()
	{
		Preco = Preco - (Preco * 0.10) ; 
		
		return Preco ;
	}
	
	public String mostrar_Dados ()
	{
		return "CALÇADO CADASTRADO COM SUCESSO" + "\n\n" 
				+ "Marca:  " + Marca + "\n"
				+ "Modelo:  " + Modelo + "\n"
				+ "Numeração:  " + Numeracao + "\n"
				+ "Preço:  R$ " + String.format("%.2f", Preco) + "\n"
				+ "Preço à Vista:  R$ " + String.format("%.2f", calcular_Preco_Vista());
	}

}//João Pedro Vieira Luz Piva