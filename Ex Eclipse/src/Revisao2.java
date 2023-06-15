import java.util.Scanner;

public class Revisao2 {

	private static Scanner Dados ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dados = new Scanner (System.in);

		Pet P1 = new Pet() ;
		
        Pet P2 = new Pet() ;
        
        System.out.println("Qual a espécie de seu 1° pet?");
        System.out.print("R: ");
        P1.Especie = Dados.next();
        
        System.out.println("\n");
        
        System.out.println("Qual a sua raça?");
        System.out.print("R: ");
        P1.Raca = Dados.next();
        
        System.out.println("\n");
        
        System.out.println("Qual o preço?");
        System.out.print("R$ ");
        P1.Preco = Dados.nextDouble();
        
        System.out.println("\n");
        
        P1.Classificar_Pet();
        
        Dados.nextLine();
        
        System.out.println("\n");
        
        System.out.println("Qual a espécie de seu 2° pet?");
        System.out.print("R: ");
        P2.Especie = Dados.next();
        
        System.out.println("\n");
        
        System.out.println("Qual a sua raça?");
        System.out.print("R: ");
        P2.Raca = Dados.next();
        
        System.out.println("\n");
        
        System.out.println("Qual o preço?");
        System.out.print("R$ ");
        P2.Preco = Dados.nextDouble();
        
        System.out.println("\n");
        
        P2.Classificar_Pet();

	}

}//Joaõ Pedro Vieira Luz Piva