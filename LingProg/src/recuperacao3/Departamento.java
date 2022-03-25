package recuperacao3;

import java.util.ArrayList;

public class Departamento {
    private String nome;
    private Professor chefe;
    private ArrayList<Professor> professors;
    private ArrayList<Disciplina> disciplinas;

    public Departamento() {
        this.professors = new ArrayList<Professor>();
        this.disciplinas = new ArrayList<Disciplina>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getChefe() {
        return chefe;
    }

    public void setChefe(Professor chefe) {
        this.chefe = chefe;
    }

    public ArrayList<Professor> getProfessors() {
        return professors;
    }

    public void setProfessors(ArrayList<Professor> professors) {
        this.professors = professors;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public void novoProfessor(Professor prof){
        professors.add(prof);
    }
    public void novaDisciplina(Disciplina disc){
        disciplinas.add(disc);
    }

}
