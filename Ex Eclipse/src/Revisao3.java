import java.util.Scanner;

public class Revisao3 {
	
	private static Scanner Dados ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dados = new Scanner (System.in);
		
		Retangulo R1 = new Retangulo() ;
        
        System.out.println("Qual o valor da base?");
        System.out.print("R: ");
        R1.Base = Dados.nextDouble();
        
        System.out.println("\n");
        
        System.out.println("Qual o valor da altura?");
        System.out.print("R: ");
        R1.Altura = Dados.nextDouble();
        
        System.out.println("\n");
        
        System.out.println("Valor do Perímetro = " + R1.Cal_Perimetro());
        
        System.out.println("Valor da Área = " + R1.Cal_Area());
        
        System.out.println("Valor da Diagonal  = " + R1.Diagonal);

	}
}