package revProva;

public class Estudante {
	
	String Nome ;
	
	Double Nota1, Nota2, Nota3, Nota4, Media ;
	
	public void Calcular_Media ()
	{
		Media = (Nota1 * 2) + (Nota2 * 1) + (Nota3 * 2) + (Nota4 * 5) ;
		
		Media = Media / (2 + 1 + 2 + 5) ;
	}

}
