package Ex2;

import java.util.Scanner;


import Ex1.Funcionario;

public class Principal {
	
	public static void main (String[] args)
	{
		Funcionario F1 = new Funcionario();
		
		Scanner Dados = new Scanner (System.in);
		
		System.out.println("Qual o nome do funcionário?");
		System.out.print("R: ");
		F1.Nome = Dados.nextLine();
		
		System.out.println("\nTem dependentes? (Sim / Não) ");
		System.out.print("R: ");
		F1.Dependentes = Dados.nextLine();
		
		System.out.println("\nQual o sexo? (Masculino/Feminino) ");
		System.out.print("R: ");
		F1.Sexo = Dados.nextLine();
	
		System.out.println("\nDados do funcionário\n\n"
				+ "Nome: " + F1.Nome + "\n\n"
				+ "Dependentes: " + F1.Dependentes + "\n\n"
				+ "Sexo: " + F1.Sexo + "\n\n");
		
	}
}