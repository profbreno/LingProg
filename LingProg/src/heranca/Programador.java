package heranca;

public class Programador extends Funcionario implements Professor {
	
	private String linguagem;
	
	public Programador(String nome, String cpf, double salario, String linguagem) {
		super(nome, cpf, salario);
		this.linguagem = linguagem;
	}
	
	public Programador() {
		super();
	}

	public String getLinguagem() {
		return linguagem;
	}

	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}
	
	@Override
	public double calcularBonificacao() {
		this.setSalario(this.getSalario() * 1.2);
		return this.getSalario();
	}

	@Override
	public void darAula() {
		System.out.println("Estou na sala de aula");
		
	}
	
}
