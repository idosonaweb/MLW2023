package revProva;

public class Moeda {
	
	Double Valor_Reais, Valor_Convertido ;
	
	String Nome ; 
	
	public void Calcular_Conversao ()
	{
		if(Nome == "Euro")
		{
			Valor_Convertido = Valor_Reais / 6.15 ;
		}
		else
		{
			if(Nome == "Dólar")
			{
				Valor_Convertido = Valor_Reais / 5.50 ;
			}
			else
			{
				if(Nome == "Libra")
				{
					Valor_Convertido = Valor_Reais / 7.20 ;
				}
			}
		}
	}
}
