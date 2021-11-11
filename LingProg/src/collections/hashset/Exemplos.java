package collections.hashset;

import java.util.HashSet;

public class Exemplos {

    public static void main(String args[]){

        HashSet<String> cargos = new HashSet<String>();
        cargos.add("Diretor");
        cargos.add("Secretário");
        cargos.add("Presidente");
        cargos.add("Diretor"); //Não armazena, pois é um valor repetido!

        if(cargos.equals("Presidente")){
            System.out.println("Cargo existente na empresa!");
        }

        for(String cargo : cargos){
            System.out.println(cargo);
        }

    }

}
