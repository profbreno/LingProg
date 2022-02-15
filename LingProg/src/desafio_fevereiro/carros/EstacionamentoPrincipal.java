package desafio_fevereiro.carros;

public class EstacionamentoPrincipal {

    public static void main(String[] args) {
        Estacionamento estacionamento = new Estacionamento();
        Carro c1 = new Carro("prata", "pca1234", 260);
        Carro c2 = new Carro("preto", "pca1234", 260);
        Carro c3 = new Carro("branco", "pca1234", 260);
        Carro c4 = new Carro("azul", "pca1234", 260);
        Carro c5 = new Carro("vermelho", "pca1234", 260);
        Carro c6 = new Carro("roxo", "pca1234", 260);
        Carro c7 = new Carro("marrom", "pca1234", 260);
        estacionamento.novoCarro(c1);
        estacionamento.novoCarro(c2);
        estacionamento.novoCarro(c3);
        estacionamento.novoCarro(c4);
        estacionamento.novoCarro(c5);
        estacionamento.novoCarro(c6);
        estacionamento.novoCarro(c7);
        for(Carro estacionados : estacionamento.lista()){
            System.out.println(estacionados.getCor());
        }
    }
}
