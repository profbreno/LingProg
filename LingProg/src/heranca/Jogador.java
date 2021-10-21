package heranca;

public class Jogador {

    //Atributos
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void euEscolhoVc(Pokemon pokemon){

        System.out.println("Nome: " + pokemon.getNome());
        System.out.println("HP: " + pokemon.getHp());
        System.out.println("Atk: " + pokemon.getAtk());
        System.out.println("Def: " + pokemon.getDef());

    }

}
