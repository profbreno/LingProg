package collections.aula1111.heranca;

abstract class Conta {

    private String agencia;
    private String numeroConta;
    private double saldo;

    public Conta(String agencia, String numeroConta, double saldo) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public double saque(double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
        }
        return this.saldo;
    }

}
