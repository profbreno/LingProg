package desafio_fevereiro;

import java.util.Scanner;

public class Notas {

    Scanner scan = new Scanner(System.in);
    private double nota1;
    private double nota2;
    private double media;

    public Notas(){

    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getMedia() {
        return media;
    }

    public void media(){
        this.media = (this.getNota1() + this.getNota2()) / 2;
    }

    //MÉTODOS PERSONALIZADOS

    public boolean verificaNota(double nota){
        if (nota < 0 || nota > 10) {
            System.out.println("Nota inválida!");
            return false;
        }
        return true;
    }

    public void menu(){
        System.out.println("\n\n::::::< NOVO CÁLCULO >::::::");
        System.out.println("[1] SIM");
        System.out.println("[2] NÃO");
        System.out.print("OPÇÃO ESCOLHIDA: ");
    }

    public void receberNotas(){
        boolean v1, v2;
        double n1, n2;
        int x;
        do {
            do {
                System.out.print("Digite a primeira nota: ");
                n1 = scan.nextDouble();
                v1 = verificaNota(n1);
                this.setNota1(n1);
            } while (v1 == false);

            do {
                System.out.print("Digite a segunda nota: ");
                n2 = scan.nextDouble();
                v2 = verificaNota(n2);
                this.setNota2(n2);
            } while (v2 == false);

            media();
            System.out.printf("media = %.2f", getMedia());
            do {
                menu();
                x = scan.nextInt();
            } while(x < 1 || x > 2);

        } while (x == 1);
    }
}
