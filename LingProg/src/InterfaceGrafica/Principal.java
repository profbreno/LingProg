package InterfaceGrafica;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {

        String primeiroNumero; //primeira string digitada pelo usuário
        String segundoNumero; //segunda string digitada pelo usuário
        int numero1; //primeiro número
        int numero2; //segundo número
        int soma; //soma

        primeiroNumero = JOptionPane.showInputDialog("Entre " +
                "com o primeiro inteiro");
        segundoNumero = JOptionPane.showInputDialog("Entre" +
                " com o segundo número");

        numero1 = Integer.parseInt(primeiroNumero);
        numero2 = Integer.parseInt(segundoNumero);
        soma = numero1 + numero2;

        JOptionPane.showMessageDialog(null, "A soma é " + soma,
                "Resultado", JOptionPane.PLAIN_MESSAGE);

    }
}
