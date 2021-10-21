package whatsapp;

public class ContatoPrincipal {

    public static void main(String args[]) {

        //Instanciar um objeto Contato com o nome do contato
        Contato contato1 = new Contato("Joedson");
        Contato contato2 = new Contato("Guilherne");

        //Enviar uma mensagem para o contato
        contato1.enviarMensagem("Olá, tudo bem?", contato2);

        //Mostrar na tela a quantidade de mensagens não lidas com o contato
        System.out.println("Quantidade de mensagens não lidas: " + contato1.getMensagensNaoLidas());

        //Receber 5 mensagens do contato (ou seja, o contato2 envia para o contato1)
        contato2.enviarMensagem("Tudo bem, obrigado!", contato1);
        contato2.enviarMensagem("Tudo bem, obrigado!", contato1);
        contato2.enviarMensagem("Tudo bem, obrigado!", contato1);
        contato2.enviarMensagem("Tudo bem, obrigado!", contato1);
        contato2.enviarMensagem("Tudo bem, obrigado!", contato1);

        //Mostrar na tela a quantidade de mensagens não lidas com o contato
        System.out.println("Quantidade de mensagens não lidas: " + contato1.getMensagensNaoLidas());

        //Mostrar na tela as mensagens não lidas do contato
        contato1.mostrarMensagensNaoLidas();

        //Mostrar na tela a quantidade de mensagens não lidas com o contato
        System.out.println("Quantidade de mensagens não lidas: " + contato1.getMensagensNaoLidas());
    }
}
