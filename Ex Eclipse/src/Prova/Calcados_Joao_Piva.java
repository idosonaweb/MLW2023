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
		return "CAL�ADO CADASTRADO COM SUCESSO" + "\n\n" 
				+ "Marca:  " + Marca + "\n"
				+ "Modelo:  " + Modelo + "\n"
				+ "Numera��o:  " + Numeracao + "\n"
				+ "Pre�o:  R$ " + String.format("%.2f", Preco) + "\n"
				+ "Pre�o � Vista:  R$ " + String.format("%.2f", calcular_Preco_Vista());
	}

}//Jo�o Pedro Vieira Luz Piva