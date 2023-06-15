public class Pet {

	String Especie, Raca ;
	
	Double Preco ;
	
	public void Classificar_Pet ()
	{
		if(Preco < 300)
		{
			System.out.println("Seu preço está classificado como Barato");
		}
		else
		{
			if(Preco >= 300 && Preco <= 800)
			{
				System.out.println("Seu preço está classificado como Médio");
			}
			else
			{
				if(Preco > 800)
				{
					System.out.println("Seu preço está classificado como Caro");
				}
			}
		}
	}
}
