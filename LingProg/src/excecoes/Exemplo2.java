package excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo2 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");

        try{
            int numero = leitor.nextInt();
            System.out.println(numero);
        }catch (InputMismatchException e){
            e.printStackTrace();
        } finally {
            System.out.println("Sempre é executado!");
        }

    }
}
