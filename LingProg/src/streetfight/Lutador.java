package streetfight;

public class Lutador {

    String nome;
    int energia;
    int forca;

    public Lutador(String nome, int energia, int forca) {
        this.nome = nome;
        this.energia = energia;
        this.forca = forca;
    }
    public void reduzirEnergia(int forca){
        this.energia = this.energia - forca;
    }
    public void aplicarGolpe(Lutador lutador){
        lutador.reduzirEnergia(this.forca);
    }

}
