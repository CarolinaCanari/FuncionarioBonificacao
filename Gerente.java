package Funcionarios;

public class Gerente extends Funcionario {
	
	public Gerente (String nome, int idade, double salario) {
		super(nome, idade, salario);
		
	}
	
	@Override
	public double Bonificacao() {
		return super.salario + 10000;
	}

}
