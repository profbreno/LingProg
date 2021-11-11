package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exemplos {

    public static void main(String args[]){

        ArrayList<String> nomes = new ArrayList<String>();
        List<String> sobrenomes = new ArrayList<String>();

        nomes.add("Magnum");
        nomes.add("Maria Eduarda");
        nomes.add("Guilherme");

        System.out.println("Tamanho do ArrayList: " + nomes.size());

        System.out.println("Retornando a posição 2 do ArrayList: " + nomes.get(2));

        Collections.sort(nomes);

        System.out.println("Retornando a posição 2 do ArrayList ordenado: " + nomes.get(2));

        sobrenomes.add("Carmezin");
        sobrenomes.add("Soares");
        sobrenomes.add("Santos");

        System.out.println("Tamanho do ArrayList: " + sobrenomes.size());

        System.out.println("Retornando a posição 2 do ArrayList: " + sobrenomes.get(2));

    }

}
