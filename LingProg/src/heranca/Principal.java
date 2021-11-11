package heranca;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args){

        PessoaFisica cliente1 = new PessoaFisica();
        cliente1.setNome("Italo");
        cliente1.setEndereco("Rua XV");
        cliente1.setCpf("1234567890");

        PessoaFisica cliente2 = new PessoaFisica();
        cliente2.setNome("Livia");
        cliente2.setEndereco("Rua XVI");
        cliente2.setCpf("9876543210");

        PessoaFisica cliente3 = new PessoaFisica();
        cliente3.setNome("Breno");
        cliente3.setEndereco("Rua XVII");
        cliente3.setCpf("654587132");

        ArrayList<PessoaFisica> pessoas = new ArrayList<PessoaFisica>();

        pessoas.add(cliente1);
        pessoas.add(cliente2);
        pessoas.add(cliente3);

        for (PessoaFisica pessoa : pessoas) {
            System.out.println(pessoa.getNome());
        }

        System.out.println();
        pessoas.remove(1);

        System.out.println(pessoas.get(1).getNome());

        for (PessoaFisica pessoa : pessoas) {
            System.out.println(pessoa.getNome());
        }














//        PessoaJuridica pj1 = new PessoaJuridica();
//        pj1.setNome("Merceria bombom");
//        pj1.setEndereco("Avenida Sertão");
//        pj1.setCnpj("123456789465103");
//
//        System.out.println(cliente1.nome);
//        System.out.println(cliente1.endereco);
//        System.out.println(cliente1.cpf);
//
//        cliente1.nome = "Mariane";
//        cliente1.endereco = "Rua XVI";
//        cliente1.cpf = "9876454321";
//
//        System.out.println(cliente1.nome);
//        System.out.println(cliente1.endereco);
//        System.out.println(cliente1.cpf);

//        System.out.println(pj1.getNome());
//        System.out.println(pj1.getEndereco());
//        System.out.println(pj1.getCnpj());

    }
}
