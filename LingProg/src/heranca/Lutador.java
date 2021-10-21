package heranca;

public class Lutador extends Funcionario {
	
	private String arte;
	
	public Lutador(String nome, String cpf, double salario, String arte) {
		super(nome, cpf, salario);
		this.arte = arte;
	}
	
	public Lutador() {
		super();
	}

	@Override
	public double calcularBonificacao() {
		this.setSalario(this.getSalario() * 1.1);
		return this.getSalario();
	}
	
}
