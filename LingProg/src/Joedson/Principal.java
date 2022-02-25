package Joedson;

import java.util.HashMap;
import java.util.Map;

public class Principal {
    public static void main(String[] args) {
        Livro livro = new Livro("Harry Potter", "Joedson");
        Livro livro1 = new Livro("O Senhor dos Aneis", "Tolkien");

        Map<String, Livro> livros = new HashMap<String, Livro>();
        livros.put(livro.getAutor(), livro);
        livros.put(livro1.getAutor(), livro1);

        System.out.println("\n\n::::::< LIVROS DISPONÍVEIS >:::::: \n");
        //foreach
        for(Map.Entry<String, Livro> entrada : livros.entrySet()){
            String autor = entrada.getKey();
            System.out.println(entrada.getValue().getNome());
        }
    }
}
