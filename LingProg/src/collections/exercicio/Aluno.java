package collections.exercicio;

/*
Você foi contratado para fazer o sistema de cadastro de alunos do IFBA.
Modele a classe Aluno com os atributos: nome, cpf, dataNascimento;
leia do teclado os dados de diversos alunos (parar quando o usuário digitar
-1 no nome); armazenando-os em um uma lista; em seguida leia um cpf do teclado
e imprima na tela o nome e a data de nascimento do aluno com o CPF digitado.
 */

public class Aluno {

    private String nome;
    private String cpf;
    private  String dataNascimento;

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

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
