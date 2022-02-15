package desafio_fevereiro.carros;

//1-criar uma classe Carro que contem cor, placa, e velocidade maxima
//2-criar uma classe estacionamento que possua varios carros
//3-criar 7 carros
//4-coloca-los no estacionamento
//5-imprimir uma lista com todos os carros estacionados contendo(cor, placa e velocidade maxima)

import java.util.ArrayList;

public class Estacionamento {

    private ArrayList<Carro> carros;

    public Estacionamento(){
        carros = new ArrayList<Carro>();
    }
    public void novoCarro(Carro carro){
        this.carros.add(carro);
    }
    public void sairCarro(Carro carro){
        this.carros.remove(carro);
    }
    public ArrayList<Carro> lista(){
        return carros;
    }
}
