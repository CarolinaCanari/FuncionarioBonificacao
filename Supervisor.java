package Funcionarios;

public class Supervisor extends Funcionario {
	
	public Supervisor (String nome, int idade, double salario) {
		super(nome, idade, salario);
		
	}
	
	@Override
	public double Bonificacao() {
		return super.salario + 5000;
	}
}