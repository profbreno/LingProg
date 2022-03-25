package recuperacao3;

public class Main {
    public static void main(String[] args) {
        Instituicao ifba = new Instituicao("IFBA");
        Departamento informatica = new Departamento();
        Professor p1 = new Professor();
        Disciplina lp1 = new Disciplina();
        Aluno al1 = new Aluno();

        ifba.novoDepartamento(informatica);
        ifba.novoAluno(al1);
        informatica.setChefe(p1);
        informatica.novoProfessor(p1);
        informatica.novaDisciplina(lp1);


    }
}
