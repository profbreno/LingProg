package desafio_fevereiro.carros.italo;

public class Carro {
    private String cor;
    private String placa;
    private float velocidade;


    public Carro(String cor, String placa, float velocidade) {
        this.cor = cor;
        this.placa = placa;
        this.velocidade = velocidade;
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

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }
}
