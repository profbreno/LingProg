package excecoes;

public class CirculoPrincipal {

    public static void main(String[] args) {

        try{
            Circulo circulo = new Circulo();
            circulo.setRaio(-5);
        }catch (RaioInvalidoException e){
            e.printStackTrace();
        }

    }

}
