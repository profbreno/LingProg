package duvidas.repositorio;

import duvidas.Professor;
import java.util.HashMap;

public class Professores {

    private HashMap<String, Professor> listaProfessores;

    public Professores(){
        listaProfessores = new HashMap<String, Professor>();
    }
    public Professor inserir(Professor professor){
        return listaProfessores.put(professor.getCpf(), professor);
    }
    public boolean alterar(String key, Professor oldData, Professor newData){
        return listaProfessores.replace(key, oldData, newData);
    }
    public Professor deletar(String key){
        return listaProfessores.remove(key);
    }
    public HashMap listAll(){
        return listaProfessores;
    }
    public Professor listOne(String key){
        return listaProfessores.get(key);
    }

}
