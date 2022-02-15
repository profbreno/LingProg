package desafio_fevereiro.carros;

//1-criar uma classe Carro que contem cor, placa, e velocidade maxima
//2-criar uma classe estacionamento que possua varios carros
//3-criar 7 carros
//4-coloca-los no estacionamento
//5-imprimir uma lista com todos os carros estacionados contendo(cor, placa e velocidade maxima)

public class Carro {

    private String cor;
    private String placa;
    private int velocidadeMaxima;

    public Carro(String cor, String placa, int velocidadeMaxima) {
        this.cor = cor;
        this.placa = placa;
        this.velocidadeMaxima = velocidadeMaxima;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }
    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
