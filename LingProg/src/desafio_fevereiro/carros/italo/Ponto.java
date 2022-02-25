package desafio_fevereiro.carros.italo;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Ponto {
    private Funcionario funcionario;
    private Calendar horaEntrada;
    private Calendar horaSaida;

    public Ponto(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Calendar getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Calendar horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Calendar getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(Calendar horaSaida) {
        this.horaSaida = horaSaida;
    }

    public void baterPontoEntrada(){
        this.setHoraEntrada(Calendar.getInstance());
    }

    public void baterPontoSaida(){
        this.setHoraSaida(Calendar.getInstance());
    }

    public String pontoString(Date ponto){
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String dataFormatada = format.format(ponto);
        return dataFormatada;
    }

//    public void horasTrabalhadas(){
//        long diff = this.getHoraSaida().getTime() - this.getHoraEntrada().getTime();
//        TimeUnit time = TimeUnit.SECONDS;
//        long diferenca = time.convert(diff, TimeUnit.MILLISECONDS);
//        long hour = diferenca / 3600;
//        long segundos = diferenca % 3600;
//        long minutos = segundos / 60;
//        segundos %= 60;
//        System.out.println("Você trabalhou: " + hour + ":" +
//                                                minutos + ":" +
//                                                segundos);
//    }

    public void horaPrevistaSaida(){
        this.getHoraEntrada().add(Calendar.DATE, 1);

    }

}