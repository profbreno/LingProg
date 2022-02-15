package desafio_fevereiro.carros.italo;

import java.util.ArrayList;

abstract class Funcionario {

    private int cpf;
    private String nome;
    private double salario;
    private String cargo;
    private ArrayList<Ponto> pontos;

    public Funcionario(int cpf, String nome, double salario, String cargo) {
        this.cpf = cpf;
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
        this.pontos = new ArrayList<Ponto>();
    }

    public ArrayList<Ponto> consultarPonto(){
        return this.pontos;
    }
}
