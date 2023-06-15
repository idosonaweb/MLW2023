public class Funcionario {

	String Nome ;
	
	Double Sal_Bruto, Imposto, Sal_Liq ;
	
	public Double Cal_Sal_Liq ()
	{
		Sal_Liq = Sal_Bruto - Imposto ;
		
		return Sal_Liq ;
	}
	
	public void Aumento_Salario (Double Porcentagem)
	{
		System.out.println("Dados Atualizados: " + Nome + ", R$ " + (((Sal_Bruto * Porcentagem) / 100) + Sal_Liq));
	}
}