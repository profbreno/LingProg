package App;

import heranca.Programador;

public class Principal {

	public static void main(String[] args) {
		
		Programador programador1 = new Programador();
		
		programador1.setNome("Joedson");
		programador1.setCpf("123.456.789-78");
		programador1.setSalario(20000);
		programador1.setLinguagem("Java");
		
		System.out.println("Nome: " 
				+ programador1.getNome());
		System.out.println("CPF: " 
				+ programador1.getCpf());
		System.out.println("Salário anterior: " + programador1.getSalario());
		System.out.println("Salário com bonificação: " + programador1.calcularBonificacao());
		System.out.println("Linguagem: " + programador1.getLinguagem());
		programador1.darAula();
	}

}
