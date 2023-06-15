import java.util.Scanner;
import java.util.Random;
 
public class Jogo {
public static void main(String[] args){
 
	Scanner Dados = new Scanner(System.in);
	Random random = new Random();
 
	boolean Acertou = false;
	
	int Vidas = 5 ;
	
	String Resposta, Positivo = "Sim" ;
	
	int Numero_Secreto = random.nextInt(100) ;
	
	long Palpite = 0 ;
	
	System.out.println("Bem-vindo ao ADIVINHE O NÚMERO");
	
	System.out.println("\nREGRAS\n");
	
	System.out.println("1. 5 tentativas para adivinhar um número de 1 a 100");
	
	System.out.println("2. Dicas serão dispostas durante o game");
	
	System.out.println("3. Ao final das vidas, o jogo termina\n");
	
	System.out.println("VAMOS JOGAR???");
	System.out.print("R: ");
	Resposta = Dados.next();
	
	
	if(Resposta.equalsIgnoreCase(Positivo))
	{
		System.out.println(".\n.\n.\n.\n.\n.\n.");
		
		System.out.println("Pronto, pensei em um número.\n");
		
		while(Vidas > 0 && Acertou == false)
		{	
			System.out.println("Qual seu palpite?");
			System.out.print("R: ");
			
			Palpite = Dados.nextLong();
	 
			if(Numero_Secreto == Palpite)
			{
				System.out.println("Você acertou, PARABÉNS!!");
				
				Acertou = true;
			} 
			else 
				
				if(Palpite < Numero_Secreto)
				{
					--Vidas;
					
					System.out.println("\nHmmmm....o número que pensei é maior!"); 
					
					System.out.println(Vidas + " vidas restantes.");
					
					System.out.println("\n");
				} 
				
				else
				{
					--Vidas;
					
					System.out.println("\nHmmmm....o número que pensei é menor!");
					
					System.out.println(Vidas + " vidas restantes.");
					
					System.out.println("\n");
					
				}
			
				if(Vidas == 0)
				{
					System.out.println("O número era o " + Numero_Secreto);
				}
	 
			}
		
		}
		else
		{
			System.out.println("\nTCHAUU...");
		}
 
 	}
}