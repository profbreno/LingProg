package excecoes;

public class Circulo {

    private double raio;

    public void setRaio(double novoRaio) throws RaioInvalidoException {
        if (novoRaio >= 0) {
            this.raio = novoRaio;
        } else {
            throw new RaioInvalidoException("O Raio não pode ser negativo");
        }
    }
}
