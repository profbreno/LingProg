package streetfight;

public class LutadorPrincipal {

    public static void main(String args[]){

        Lutador ryu = new Lutador("Ryu", 100, 10);
        Lutador bison = new Lutador("Byson", 100, 12);
        for(int i=0; i<3; i++) {
            ryu.aplicarGolpe(bison);
        }
        System.out.println(bison.energia);

        for(int i=0; i<8; i++) {
            bison.aplicarGolpe(ryu);
        }
        System.out.println(ryu.energia);
    }
}
