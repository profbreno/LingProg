package recuperacao3;

import java.util.ArrayList;

public class Aluno extends Pessoa {
    private ArrayList<Instituicao> instituicoes;
    private ArrayList<Disciplina> disciplinas;

    public ArrayList<Instituicao> getInstituicoes() {
        return instituicoes;
    }

    public void setInstituicoes(ArrayList<Instituicao> instituicoes) {
        this.instituicoes = instituicoes;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
}
