package revProva;

public class Funcionario {
	
	Double Salario, Sal_Reajustado ;
	
	String Nome ;
	
	public void Reajustar_Salario ()
	{
		Sal_Reajustado = Salario + (Salario * 0.10);
	}
}