package collections.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Exemplo2 {

    public static void main(String args[]) {

        //Usando HashMap
        HashMap<String, String> cadastroUsuariosMap = new HashMap<String, String>();
        cadastroUsuariosMap.put("nome", "Livia Beatriz");
        cadastroUsuariosMap.put("login", "livia@gmail.com");
        cadastroUsuariosMap.put("senha", "123456");

        System.out.println("O login é: " + cadastroUsuariosMap.get("login"));
        System.out.println("A senha é: " + cadastroUsuariosMap.get("senha"));

        //Usando ArrayList
        ArrayList<String> cadastroUsuariosList = new ArrayList<String>();
        cadastroUsuariosList.add("Livia Beatriz");
        cadastroUsuariosList.add("livia@gmail.com");
        cadastroUsuariosList.add("123456");

        System.out.println("O login é: " + cadastroUsuariosList.get(1));
        System.out.println("A senha é: " + cadastroUsuariosList.get(2));

        //Usando HashSet
        HashSet<String> cadastroUsuariosSet = new HashSet<>();
        cadastroUsuariosSet.add("Livia Beatriz");
        cadastroUsuariosSet.add("livia@gmail.com");
        cadastroUsuariosSet.add("123456");

        for (String cadastroUsuario : cadastroUsuariosSet) {
            System.out.println(cadastroUsuario);
        }
    }

}
