package Menu;

public class Professor extends Pessoa {
	
	private Double Salario ;

	public Double getSalario() {
		
		return Salario ;
	}

	public void setSalario(Double Salario) {
		
		this.Salario = Salario ;
	}
	
	@Override
	
	public String Imprimir ()
	{
		return super.Imprimir() + "\nSalário:  R$" + Salario ; 
	}
}