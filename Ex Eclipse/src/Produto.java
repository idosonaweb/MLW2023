public class Produto {

	
	String Nome ;
	
	int Quantidade ;
	
	double Preco_Unitario_Vista, Preco_Unitario_Prazo ;
	
	public String Imprimir_Dados ()
	
	{
		
		return "Produto: " + Nome + "\n" + "Quantidade: " + Quantidade + "\n" + "Preço Unitário à vista: " + "\n" + Preco_Unitario_Vista + "Preço Unitário à prazo: " +  Preco_Unitario_Prazo ;		
	}
}//João Pedro Vieira Luz Piva