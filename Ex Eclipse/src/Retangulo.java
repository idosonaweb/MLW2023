public class Retangulo {

	Double Base, Altura ;
	
	Double Area, Perimetro, Diagonal, Soma ; 
	
	public Double Cal_Perimetro ()
	{
		Perimetro = (Base * 2) + (Altura * 2);
		
		return Perimetro ;
	}
	
	public Double Cal_Area ()
	{
		Area = Base * Altura ;
		
		return Area ;
	}
	
	public Double Cal_Diagonal ()
	{
		Soma = Math.pow(Base, 2) + Math.pow(Altura, 2);
				
		Diagonal = Math.sqrt(Soma);
		
		return Diagonal ;
	}
}