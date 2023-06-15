import java.util.Scanner;
/**
 * Repeticao6
 */
public class Repeticao6 {

    private static Scanner Vendas ;
    public static void main(String[] args) {
  
        Vendas = new Scanner (System.in);

        int Num, Cont, Valor, Quantidade, Valor_Item, Valor_Total ;
        
        Valor_Item = 0 ;
        
        Valor_Total = 0 ;
        
        Cont = 1 ;
        
        do 
        {
            System.out.print("\nDigite o número do " + Cont + "° item : ");
            Num = Vendas.nextInt();
            
            if (Num != 0)
            {
                System.out.print("Agora, digite o valor unitário desse  item : R$ ");
                Valor = Vendas.nextInt();
        
                System.out.print("Por fim, digite a quantidade comprada desse item : ");
                Quantidade = Vendas.nextInt();
            
                Valor_Item = Valor * Quantidade ;
            
                Valor_Total = Valor_Total + Valor_Item ; 
            
                Cont++;   
            }
            
        }while(Num != 0);
        
        System.out.println("\nO valor total desta venda é igual a R$ " + Valor_Total);
    }
}