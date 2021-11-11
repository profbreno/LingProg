package collections.aula1111.heranca;

public class Principal {

    public static void main (String args[]){

        ContaCorrente cc = new ContaCorrente("123", "1234-5", 1000);
        System.out.println(cc.getSaldo());

        cc.depositar(100);
        System.out.println(cc.getSaldo());

        cc.depositar(400);
        System.out.println(cc.getSaldo());

        cc.saque(200);
        System.out.println(cc.getSaldo());

        ContaPoupanca cp = new ContaPoupanca("123", "1234-5", 5000, "1");
        System.out.println(cp.getSaldo());

        cp.depositar(1000);
        System.out.println(cp.getSaldo());

        cp.setJurosMensais(0.5);
        cp.aplicarJuros();
        System.out.println(cp.getSaldo());
    }
}
