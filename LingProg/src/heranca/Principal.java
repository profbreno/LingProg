package heranca;

public class Principal {

    public static void main(String[] args){

        PessoaFisica cliente1 = new PessoaFisica();
        cliente1.setNome("Italo");
        cliente1.setEndereco("Rua XV");
        cliente1.setCpf("1234567890");

        PessoaJuridica pj1 = new PessoaJuridica();
        pj1.setNome("Merceria bombom");
        pj1.setEndereco("Avenida Sertão");
        pj1.setCnpj("123456789465103");

        System.out.println(cliente1.nome);
        System.out.println(cliente1.endereco);
        System.out.println(cliente1.cpf);

        cliente1.nome = "Mariane";
        cliente1.endereco = "Rua XVI";
        cliente1.cpf = "9876454321";

        System.out.println(cliente1.nome);
        System.out.println(cliente1.endereco);
        System.out.println(cliente1.cpf);

//        System.out.println(pj1.getNome());
//        System.out.println(pj1.getEndereco());
//        System.out.println(pj1.getCnpj());

    }
}
