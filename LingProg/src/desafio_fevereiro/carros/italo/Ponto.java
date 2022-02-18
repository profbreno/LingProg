package desafio_fevereiro.carros.italo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Ponto {
    private Funcionario funcionario;
    private Date horaEntrada;
    private Date horaSaida;

    public Ponto(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Date getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Date horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Date getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(Date horaSaida) {
        this.horaSaida = horaSaida;
    }

    public void baterPontoEntrada(){
        this.setHoraEntrada(new Date());
    }

    public void baterPontoSaida(){
        this.setHoraSaida(new Date());
    }

    public String pontoString(Date ponto){
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String dataFormatada = format.format(ponto);
        return dataFormatada;
    }

    public void horasTrabalhadas(){
        long diff = this.getHoraSaida().getTime() - this.getHoraEntrada().getTime();
        TimeUnit time = TimeUnit.SECONDS;
        long diferenca = time.convert(diff, TimeUnit.MILLISECONDS);
        long hour = diferenca / 3600;
        long segundos = diferenca % 3600;
        long minutos = segundos / 60;
        segundos %= 60;
        System.out.println("Você trabalhou: " + hour + ":" +
                                                minutos + ":" +
                                                segundos);
    }

    public void horaPrevistaSaida(){
        long saida = this.getHoraEntrada().getTime() + 28800000; // somando a hora de entrada com 8 horas
        TimeUnit time = TimeUnit.SECONDS;
        long diferenca = time.convert(saida, TimeUnit.MILLISECONDS);
        long hour = diferenca / 3600;
        long segundos = diferenca % 3600;
        long minutos = segundos / 60;
        segundos %= 60;
        System.out.println("Você deve sair: " + hour + ":" +
                                                minutos + ":" +
                                                segundos);

    }

}