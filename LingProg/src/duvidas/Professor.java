package duvidas;

public class Professor extends Pessoa {
    private int siape;

    public Professor(String nome, String cpf, int siape) {
        super(nome, cpf);
        this.siape = siape;
    }

    public int getSiape() {
        return siape;
    }

    public void setSiape(int siape) {
        this.siape = siape;
    }
}
