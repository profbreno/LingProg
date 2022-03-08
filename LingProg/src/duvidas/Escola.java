package duvidas;

import duvidas.repositorio.Professores;

public class Escola {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Breno", "123", 123);
        Aluno aluno1 = new Aluno("Italo", "1234", 1234);
        Professores repProfessores = new Professores();
        repProfessores.inserir(professor1);
        Professor inserido = repProfessores.listOne(professor1.getCpf());
        System.out.println(inserido.getNome());

    }
}
