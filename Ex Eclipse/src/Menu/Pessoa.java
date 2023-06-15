package Menu;

public class Pessoa {
	
	private String Nome ;
	
	private int Idade ;

	public String getNome() {
		
		return Nome;
	}

	public void setNome(String Nome) {
		
		this.Nome = Nome;
	}

	public int getIdade() {
		
		return Idade;
	}

	public void setIdade(int Idade) {
		
		this.Idade = Idade;
	}
	
	
	public String Imprimir()
	{
		return "Nome:  " + Nome + "\n" + "Idade:  " + Idade ;
	}
}