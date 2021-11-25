package collections.exercicio;

/*
Faça um programa em Java que leia o CPF e a nota de 50 alunos de uma disciplina
e imprima a nota do do aluno com CPF “764.605.203-56”. Utilize Maps e HashMaps.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Disciplina {

    public static void main(String args[]){

        Map<String, Double> notas = new HashMap<String, Double>();
        Scanner leitor = new Scanner(System.in);

        String cpf;
        Double nota;

        for(int i=0; i < 5; i++){
            System.out.println("Digite cpf: ");
            cpf = leitor.next();
            System.out.println("Digite nota: ");
            nota = leitor.nextDouble();

            notas.put(cpf, nota);
            System.out.println("Nota cadastrada com sucesso!");
        }
        System.out.println(notas.get("764.605.203-56"));
    }
}
