/*
Faça um programa em Java para ler o preço de um produto em cada um dos meses do ano e
depois imprimir a média do valor do produto no ano. Utilize Lists e ArrayLists.
 */
package collections.aula1111;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao1 {

    public static void main(String args[]){

        List<Double> precos = new ArrayList<Double>();
        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < 12; i++){
            System.out.println("Digite o preço no mês " + (i+1));
            precos.add(leitor.nextDouble());
        }

        double somaPrecos = 0;
        for (double preco : precos) {
            somaPrecos += preco;
        }
        double media = somaPrecos / precos.size();

        System.out.println("A média de preços no ano é " + media);
    }
}