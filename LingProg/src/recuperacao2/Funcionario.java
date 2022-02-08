package recuperacao2;

abstract class Funcionario {

    private String nome;
    private String cpf;
    private String cargo;
    private Double salario;

    public Funcionario(String nome, String cpf, String cargo, Double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
        this.salario = salario;
    }

    public Funcionario() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

//    public Funcionario cadastrar(Funcionario novoFuncionario){
//
//    }
//
//    public Funcionario editar(String cpf, Funcionario dtoFuncionario){
//
//
//    }
//    public void deletar(String cpf){
//
//    }
//    public Funcionario consultar(String cpf){
//
//    }
//    public Funcionario[] consultarTodos(){
//
//    }
}
