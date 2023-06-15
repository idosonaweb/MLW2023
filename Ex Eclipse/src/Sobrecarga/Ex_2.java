package Sobrecarga;

public class Ex_2 {
	
	public double calcularMedia(double Nota1, double Nota2)
	{	
		return (Nota1 + Nota2) / 2 ;
	}
	
	double calcularMedia(double Nota1, double Nota2, int Peso1, int Peso2)
	{	
		return (Peso1 * Nota1) + (Peso2 * Nota2) / (Peso1 + Peso2) ;
	}

}
