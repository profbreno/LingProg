package recuperacao2;

/*
Cadastrar Funcionários, que pode ser Professor ou Técnico ok
(apenas o nome, cpf, cargo e salário); ok
Editar Funcionários;
Remover Funcionários;
Ver um Funcionário (Todos os dados);
Consultar um Funcionário pelo cpf;
Listar todos os funcionários (nome e cpf);

Observações:

Uso de pelo menos uma colletions obrigatório (HashMap, ArrayList, HashSet); ok
O uso de try-catch é aconselhado nos locais certos;
Uso de encapsulamento ok, herança ok, abstração ok e polimorfismo são recomendados;
Não deve haver métodos na classe principal, com excessão do main (único método!); ok
 */


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Principal {

    public static void main(String args[]){

        ArrayList<HashMap> todosFuncionarios = new ArrayList<HashMap>();
        HashMap<String, Professor> professores = new HashMap<String, Professor>();
        HashMap<String, Tecnico> tecnicos = new HashMap<String, Tecnico>();
        Scanner leitor = new Scanner(System.in);

        int op;
        do {
            System.out.println("Digite uma opção:");
            System.out.println("(1) Cadastrar novo Professor");
            System.out.println("(2) Cadastrar novo Tecnico");
            System.out.println("(3) Editar Funcionario");
            System.out.println("(4) Excluir Funcionário");
            System.out.println("(5) Listar todos os funcionários");
            System.out.println("(6) Consultar funcionário pelo cpf");
            System.out.println("(-1) Encerrar");
            op = leitor.nextInt();

            switch (op){
                case 1:
                    Professor prof = new Professor();
                    System.out.println("Digite seu nome: ");
                    prof.setNome(leitor.next());
                    System.out.println("Digite seu cpf: ");
                    prof.setCpf(leitor.next());
                    System.out.println("Digite seu cargo: ");
                    prof.setCargo(leitor.next());
                    System.out.println("Digite seu salário: ");
                    prof.setSalario(leitor.nextDouble());
                    professores.put(prof.getCpf(), prof);
                    todosFuncionarios.add(professores);
                    break;
                case 2:
                    Tecnico tecnico = new Tecnico();
                    System.out.println("Digite seu nome: ");
                    tecnico.setNome(leitor.next());
                    System.out.println("Digite seu cpf: ");
                    tecnico.setCpf(leitor.next());
                    System.out.println("Digite seu cargo: ");
                    tecnico.setCargo(leitor.next());
                    System.out.println("Digite seu salário: ");
                    tecnico.setSalario(leitor.nextDouble());
                    tecnicos.put(tecnico.getCpf(), tecnico);
                    todosFuncionarios.add(tecnicos);
                    break;
                case 6:
                    System.out.println("Digite seu cpf: ");
                    String cpf = leitor.next();
                    Funcionario busca = professores.get(cpf);
                    System.out.println(busca.getNome());
                    System.out.println(busca.getCpf());
                    System.out.println(busca.getCargo());
                    System.out.println(busca.getSalario());
                    break;

            }

        }while(op!=-1);
    }
}
