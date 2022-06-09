package Funcionarios;

public class Main {

	

	public static void main(String[] args) {
		Gerente gerente = new Gerente("Ana", 26, 10000);
		System.out.println("Gerente: " + gerente.nome);
		System.out.print("Bonificação: " + gerente.Bonificacao());
	
		Supervisor supervisor = new Supervisor("João", 30, 5000.00);
		System.out.println("\nSupervisor: " + supervisor.nome);
		System.out.print("Bonificação: "+ supervisor.Bonificacao());
		
		Vendedor vendedor = new Vendedor("Bia", 28, 3000.00);
		System.out.println("\nVendedor: " + vendedor.nome);
		System.out.print("Bonificação: " + vendedor.Bonificacao());
		
		
	}


}
