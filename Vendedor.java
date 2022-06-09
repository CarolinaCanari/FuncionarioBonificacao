package Funcionarios;

public class Vendedor extends Funcionario {
	
	public Vendedor (String nome, int idade, double salario) {
		super(nome, idade, salario);
		
	}
	

	@Override
	public double Bonificacao() {
		return super.salario + 3000;
		
	}


}
