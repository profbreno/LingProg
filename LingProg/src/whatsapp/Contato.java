package whatsapp;

/*
Você foi contratado para desenvolver um aplicativo que irá concorrer com o WhatsApp.
Modele a classe “Contato” usando os conceitos de abstração e encapsulamento. Após modelar a classe siga os seguintes passos:
-Instanciar um objeto Contato com o nome do contato
-Enviar uma mensagem para o contato
-Mostrar na tela a quantidade de mensagens não lidas com o contato
-Receber 5 mensagens do contato
-Mostrar na tela a quantidade de mensagens não lidas com o contato
-Mostrar na tela as mensagens não lidas do contato
-Mostrar na tela a quantidade de mensagens não lidas com o contato
 */

public class Contato {

    String nome;
    int mensagensNaoLidas;
    String[] mensagens;

    public Contato(String nome) {
        this.nome = nome;
        this.mensagensNaoLidas = 0;
        this.mensagens = new String[10];
    }

    public void enviarMensagem(String mensagem, Contato destinatario) {
        destinatario.receberMensagem(mensagem);
    }

    public void receberMensagem(String mensagem) {
        mensagens[mensagensNaoLidas] = mensagem;
        mensagensNaoLidas++;
    }

    public int getMensagensNaoLidas() {
        return mensagensNaoLidas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void mostrarMensagensNaoLidas() {
        for (int i = 0; i < mensagensNaoLidas; i++) {
            System.out.println(mensagens[i]);
            mensagens[i] = "";
        }
        mensagensNaoLidas = 0;
    }
}
