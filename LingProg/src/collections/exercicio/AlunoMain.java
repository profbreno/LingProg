package collections.exercicio;

/*
Você foi contratado para fazer o sistema de cadastro de alunos do IFBA.
Modele a classe Aluno com os atributos: nome, cpf, dataNascimento;
leia do teclado os dados de diversos alunos (parar quando o usuário digitar
-1 no nome); armazenando-os em um uma lista; em seguida leia um cpf do teclado
e imprima na tela o nome e a data de nascimento do aluno com o CPF digitado.
 */

import java.util.HashMap;
import java.util.Scanner;

public class AlunoMain {

    public static void main(String args[]){

        HashMap<String, Aluno> alunos = new HashMap<String, Aluno>();
        Scanner leitor = new Scanner(System.in);
        String cpf, nome, dataNascimento;

        int i = 0;
        do{
            System.out.println("Digite o CPF do aluno");
            cpf = leitor.next();
            System.out.println("Digite o Nome do aluno");
            nome = leitor.next();
            System.out.println("Digite a Data de Nascimento do aluno");
            dataNascimento = leitor.next();
            Aluno aluno = new Aluno();
            aluno.setCpf(cpf);
            aluno.setNome(nome);
            aluno.setDataNascimento(dataNascimento);

            alunos.put(aluno.getCpf(), aluno);

            System.out.println("Digite -1 para sair ou qualquer outro número para continuar: ");
            i = leitor.nextInt();

        }while(i != -1);

        System.out.println("Digite o cpf buscado: ");
        String buscaCpf = leitor.next();
        Aluno alunoBuscado = alunos.get(buscaCpf);
        System.out.println("Nome: " + alunoBuscado.getNome());
        System.out.println("Nascimento: " + alunoBuscado.getDataNascimento());

    }

}
