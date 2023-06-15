package Heranca;

public class Gerente extends Funcionario {
	
	private String Senha ;
	
	private int Num_Funcionarios_Gerenciados ;

	public String getSenha() 
	{
		return Senha;
	}

	public void setSenha(String Senha) 
	{
		this.Senha = Senha;
	}

	public int getNum_Funcionarios_Gerenciados() 
	{
		return Num_Funcionarios_Gerenciados;
	}

	public void setNum_Funcionarios_Gerenciados(int Num_Funcionarios_Gerenciados) 
	{
		this.Num_Funcionarios_Gerenciados = Num_Funcionarios_Gerenciados;
	}
}