package excecoes;

public class RaioInvalidoException extends Exception {

    public RaioInvalidoException(){
    }
    public RaioInvalidoException(String mensagem){
        super(mensagem);
    }

}
