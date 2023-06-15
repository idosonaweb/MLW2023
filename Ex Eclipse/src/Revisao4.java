import java.util.Scanner;

public class Revisao4 {
	
	private static Scanner Dados ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dados = new Scanner (System.in);
		
		Funcionario F1 = new Funcionario () ;
		
		Double Porcentagem ;
        
        System.out.println("Qual o nome do funcionário?");
        System.out.print("R: ");
        F1.Nome = Dados.next();
        
        System.out.println("\n");
        
        System.out.println("Qual o valor do salário do(a) " + F1.Nome + "?");
        System.out.print("R$ ");
        F1.Sal_Bruto = Dados.nextDouble();
        
        System.out.println("\n");
        
        System.out.println("Qual o valor atual do imposto?");
        System.out.print("R$ ");
        F1.Imposto = Dados.nextDouble();
        
        System.out.println("\n");
		
        System.out.println("Funcionário: " + F1.Nome + ", R$ " + F1.Cal_Sal_Liq());
        
        System.out.println("\n");
    
        System.out.println("Qual a porcentagem para o aumento salarial?");
        System.out.print("R: ");
        Porcentagem = Dados.nextDouble();
        
        F1.Aumento_Salario(Porcentagem);
	}

}
