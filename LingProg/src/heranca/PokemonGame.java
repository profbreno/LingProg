package heranca;

public class PokemonGame {

    public static void main(String args[]){

        Jogador jogador = new Jogador();
        jogador.setNome("Ash");

        Pokemon p1 = new Pokemon("Squirtle", "200", "20", "50");
        Pokemon p2 = new Pokemon("Pikachu", "250", "25", "55");
        Pokemon p3 = new Pokemon("Bulbasaur", "300", "30", "60");

        jogador.euEscolhoVc(p1);
        System.out.println("Escolhendo outro pokemon");
        jogador.euEscolhoVc(p2);
        System.out.println("Escolhendo outro pokemon");
        jogador.euEscolhoVc(p3);

    }

}
