public class Pet {

	String Especie, Raca ;
	
	Double Preco ;
	
	public void Classificar_Pet ()
	{
		if(Preco < 300)
		{
			System.out.println("Seu pre�o est� classificado como Barato");
		}
		else
		{
			if(Preco >= 300 && Preco <= 800)
			{
				System.out.println("Seu pre�o est� classificado como M�dio");
			}
			else
			{
				if(Preco > 800)
				{
					System.out.println("Seu pre�o est� classificado como Caro");
				}
			}
		}
	}
}
