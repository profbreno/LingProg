package collections.aula1111.heranca;

public class ContaPoupanca extends Conta{

    private String variacao;
    private double jurosMensais;

    public ContaPoupanca(String agencia, String numeroConta, double saldo, String variacao) {
        super(agencia, numeroConta, saldo);
        this.variacao = variacao;
    }

    public String getVariacao() {
        return variacao;
    }

    public void setVariacao(String variacao) {
        this.variacao = variacao;
    }

    public double getJurosMensais() {
        return jurosMensais;
    }

    public void setJurosMensais(double jurosMensais) {
        this.jurosMensais = jurosMensais;
    }

    public void aplicarJuros() {

        this.setSaldo(this.getSaldo() + (this.getSaldo() * (this.jurosMensais/100)));

    }
}
