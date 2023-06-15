import java.util.Scanner;
/**
 * Ex3
 */
public class Ex3 {

    private static Scanner Estudantes ;
    public static void main(String[] args) {
  
        Estudantes = new Scanner (System.in);

        int Idade, Cont_Aluno = 0, Cont_Alunos = 0, Cont_Soma ;

        Double Soma = 0.0 ;

        double Altura, Media ;

        do
        {
            Cont_Aluno++;

            System.out.println("\nAluno " + Cont_Aluno + "\n");

            System.out.print("Digite a altura desse aluno: ");
            Altura = Estudantes.nextDouble();

            if(Altura != 0)
            {
                System.out.print("Digite a idade desse aluno: ");
                Idade = Estudantes.nextInt();

                if (Idade > 13) 
                {
                    if (Altura < 1.5) 
                    {
                        Cont_Alunos++;
                    }   
                }

                Soma = Soma + Idade ;
            }

        }while(Altura != 0.0);

        Cont_Soma  = Cont_Aluno - 1 ;

        Media = Soma / Cont_Soma ;
        
        System.out.println("\nTemos " + Cont_Alunos + " aluno(s) que tem mais de 13 anos e com a altura menor que 1.5");

        System.out.println("\nA média das idades desses alunos é igual a " + Media);
    }
}