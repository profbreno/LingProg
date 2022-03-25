package recuperacao3;

//As instituições de ensino são divididas em um ou mais departamentos
// (Letras, Matemática, etc.). Um departamento é chefiado por um de seus
// professores, mas há casos em que esse cargo está vago. Não há acúmulo
// de chefia. Os professores podem estar alocados em um ou mais
// departamentos. Um departamento pode ser criado sem que haja
// professores alocados a ele. Um aluno pode estar matriculado em mais de
// uma instituição de ensino e pode frequentar mais de uma disciplina na
// mesma instituição. As instituições podem não ter alunos matriculados.
// Cada departamento tem seu conjunto específico de disciplinas
// (pelo menos uma). Cada disciplina pode ser ministrada por um ou mais
// professores. Cada professor pode ministrar qualquer número de
// disciplinas.

import java.util.ArrayList;

public class Instituicao {
    private String nome;
    private ArrayList<Departamento> departamentos;
    private ArrayList<Aluno> alunos;

    public Instituicao(String nome) {
        this.nome = nome;
        this.departamentos = new ArrayList<Departamento>();
        this.alunos = new ArrayList<Aluno>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(ArrayList<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void novoDepartamento(Departamento dp){
        departamentos.add(dp);
    }
    public void novoAluno(Aluno al){
        alunos.add(al);
    }
}
