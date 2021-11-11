package collections.hashmap;

import java.util.HashMap;

public class Exemplo {

    public static void main(String args[]){

        HashMap<String, String> cargos = new HashMap<String, String>();
        cargos.put("aluno", "Italo Carvalho");
        cargos.put("professor", "Breno Leonardo");

        System.out.println("O aluno é " + cargos.get("aluno"));
        System.out.println("O professor é " + cargos.get("professor"));

    }

}