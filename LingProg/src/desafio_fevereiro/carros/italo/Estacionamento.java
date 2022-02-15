package desafio_fevereiro.carros.italo;

import java.util.ArrayList;

public class Estacionamento {

    private ArrayList<Carro> carros;
    private double valorPorHora;

    public Estacionamento() {
        this.carros = new ArrayList<Carro>();
    }
    public void novoCarro(Carro carro){
        if(this.carros.size() < 7) {
            this.carros.add(carro);
        }else{
            System.out.println("Estacionamento cheio");
            System.out.println("Não foi possível estacionar" +
                    "o carro " + carro.getPlaca());
        }
    }
    public void sairCarro(Carro carro){
        this.carros.remove(carro);
    }

    public ArrayList<Carro> listar(){
        return this.carros;
    }

}
