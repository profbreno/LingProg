package excecoes;

public class Exemplo {

    public static void main(String[] args) {
        metodo1();
        System.out.println("passei do metodo 1");
    }

    private static void metodo1() {
        metodo2();
        System.out.println("passei do metodo 2");
    }

    private static void metodo2() {
        try {
            int numero = 20 / 0;
        }catch (Exception e){
            System.out.println("Você tentou dividir um número por 0!");
        }
    }

}
