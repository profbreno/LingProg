package teste;

import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class DIO {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double nota1, nota2, media, flag = 1;

        do{

            nota1 = leitor.nextDouble();
            nota2 = leitor.nextDouble();

            while (nota1 < 0 || nota1 > 10) {
                System.out.println("nota invalida");
                nota1 = leitor.nextDouble();
            }
            while (nota2 < 0 || nota2 > 10) {
                System.out.println("nota invalida");
                nota2 = leitor.nextDouble();
            }

            media = (nota1 + nota2) / 2;
            System.out.println("media = " + new DecimalFormat(".##").format(media));
            flag = 0;

            while (flag != 1 && flag !=2) {
                System.out.println("novo calculo (1-sim 2-nao)");
                flag = leitor.nextDouble();
            }


        }while(flag==1);

    }
}