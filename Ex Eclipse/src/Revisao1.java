import java.util.Scanner;
/**
 * Revisao1
 */
public class Revisao1 {

    private static Scanner Dados ;
    public static void main(String[] args) {
  
        Dados = new Scanner (System.in);

        Produto P1 = new Produto() ;
        
        System.out.println("Qual o nome do produto?");
        System.out.print("R: ");
        P1.Nome = Dados.next();
        
        System.out.println("\n");
        
        System.out.println("Quanto � a quantidade do produto?");
        System.out.print("R: ");
        P1.Quantidade = Dados.nextInt();
        
        System.out.println("\n");
        
        System.out.println("Qual o pre�o unit�rio � vista do produto: ");
        System.out.print("R$ ");
        P1.Preco_Unitario_Vista = Dados.nextDouble();
        
        System.out.println("\n");
        
        System.out.println("Qual o pre�o unit�rio � prazo do produto: ");
        System.out.print("R$ ");
        P1.Preco_Unitario_Prazo = Dados.nextDouble();
        
        System.out.println("\n");
        
        System.out.println(P1.Imprimir_Dados());
        
        System.out.println("Total � vista : " + (P1.Preco_Unitario_Vista * P1.Quantidade));
        
        System.out.println("Total � prazo : " + (P1.Preco_Unitario_Prazo * P1.Quantidade));
        
    }
    
}//Jo�o Pedro Vieira Luz Piva