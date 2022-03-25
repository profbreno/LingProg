package recuperacao3;

import java.util.HashMap;

public class AlunosDB {

    private HashMap<String, Aluno> listaAlunos;

    public AlunosDB(){
        listaAlunos = new HashMap<String, Aluno>();
    }
    public Aluno inserir(Aluno aluno){
        return listaAlunos.put(aluno.getNome(), aluno);
    }
    public boolean alterar(String key, Aluno oldData, Aluno newData){
        return listaAlunos.replace(key, oldData, newData);
    }
    public Aluno deletar(String key){
        return listaAlunos.remove(key);
    }
    public HashMap listAll(){
        return listaAlunos;
    }
    public Aluno listOne(String key){
        return listaAlunos.get(key);
    }

}
