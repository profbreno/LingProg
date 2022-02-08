package desafio_fevereiro.kauan;

import java.util.Scanner;

public class Media {

    Scanner scan = new Scanner(System.in);
    private double nota1 = 0, nota2 = 0, media = 0, x = 0;

    public void calcular(){
        do {
            System.out.println("Digite a primeira nota: ");
            nota1 = scan.nextDouble();
        }while(!checarNOTA(nota1));
        do {
            System.out.println("Digite a segunda nota: ");
            nota2 = scan.nextDouble();
        }while(!checarNOTA(nota2));

        media = (nota1+nota2)/2;
        System.out.printf("Media semestral: %.2f\n", media);

        do{
            System.out.println("Novo calculo (1-sim; 2-não): ");
            x = scan.nextDouble();
        }while(x != 1 && x != 2);

        System.out.println("\nBye!\n");
    }

    public boolean checarNOTA(double checar){
        if(checar < 0 || checar > 10){
            System.out.println("Nota invalida! ");
            System.out.println("Tente novamente!");
            return false;
        }
        return true;
    }
}
