package desafio_fevereiro.carros.italo;

// - Tarefinha de casa
// Temporizador
// Preço por hora
// Funcionário
// Gerador de senhas

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Estacionamento estacionamento = new Estacionamento();
        Carro c1 = new Carro("preto", "1", 250);
        Carro c2 = new Carro("vermelho", "2", 350);
        Carro c3 = new Carro("rosa", "3", 350);
        Carro c4 = new Carro("prata", "4", 150);
        Carro c5 = new Carro("Cinza", "5", 250);
        Carro c6 = new Carro("verde", "6", 550);
        Carro c7 = new Carro("marrom", "7", 450);
        Carro c8 = new Carro("roxo", "8", 250);

        estacionamento.novoCarro(c1);
        estacionamento.novoCarro(c2);
        estacionamento.novoCarro(c3);
        estacionamento.novoCarro(c4);
        estacionamento.novoCarro(c5);
        estacionamento.novoCarro(c6);
        estacionamento.novoCarro(c7);
        estacionamento.novoCarro(c8);
        // Retirar o carro do estacionamento
        estacionamento.sairCarro(c5);
        // Inserir carro na vaga do estacionamento
        estacionamento.novoCarro(c8);

        for (Carro carro : estacionamento.listar()){
            System.out.println(carro.getCor());
        }

        Funcionario italoDiretor = new Diretor(123, "Italo", 10000, "Diretor");
        Ponto pontoDiretor = new Ponto(italoDiretor);

        //O funcionário acabou de chegar
        pontoDiretor.baterPontoEntrada();
        System.out.println(pontoDiretor.getHoraEntrada().getTime());

    }

}