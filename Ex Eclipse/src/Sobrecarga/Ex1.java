package Sobrecarga;

public class Ex1 {	
		
		public int Calculo (int Num1)
		{
			return Num1 * Num1 ;
		}
		
		public int Calculo (int Num1, int Num2)
		{
			int Cont, Resultado = 1 ;
			
			for(Cont = 1 ; Cont <= Num2 ; Cont++)
			{
				Resultado = Resultado * Num1 ;
			}
			
			return Resultado ;
		}
		
}