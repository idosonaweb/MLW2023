package Menu;

public class Aluno extends Pessoa {
	
	private Double Nota ;

	public Double getNota() {
		
		return Nota;
	}

	public void setNota(Double Nota) 
	{
		this.Nota = Nota;
	}
	
	@Override
	
	public String Imprimir ()
	{
		return super.Imprimir() + "\nNota:  " + Nota ; 
	}
}