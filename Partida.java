package aula_11_08;

import java.time.LocalDate;
import java.time.LocalTime;

public class Partida {

    private LocalDate data;
    private LocalTime horario;
    private String local;
    private Time timeCasa, timeVisitante;
    private Escalacao escalacaoCasa, escalacaoVisitante;
    private int golsCasa, golsVisitante;

    public Partida(String data, String horario, String local, Time timeCasa, Time timeVisitante, Escalacao escalacaoCasa, Escalacao escalacaoVisitante) {
        if (data == null || horario == null || local == null || timeCasa == null || timeVisitante == null || escalacaoCasa == null || escalacaoVisitante == null) {
            throw new IllegalArgumentException("Todos os campos são obrigatórios.");
        }
        String[] dataSplit = data.split("-");
        this.data = LocalDate.of(Integer.parseInt(dataSplit[2]), Integer.parseInt(dataSplit[1]), Integer.parseInt(dataSplit[0]));
        String[] horarioSplit = horario.split(":");
        this.horario = LocalTime.of(Integer.parseInt(horarioSplit[0]), Integer.parseInt(horarioSplit[1]));
        this.local = local;
        this.timeCasa = timeCasa;
        this.timeVisitante = timeVisitante;
        this.escalacaoCasa = escalacaoCasa;
        this.escalacaoVisitante = escalacaoVisitante;
        this.golsCasa = 0;
        this.golsVisitante = 0;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Time getTimeCasa() {
        return timeCasa;
    }

    public void setTimeCasa(Time timeCasa) {
        this.timeCasa = timeCasa;
    }

    public Time getTimeVisitante() {
        return timeVisitante;
    }

    public void setTimeVisitante(Time timeVisitante) {
        this.timeVisitante = timeVisitante;
    }

    public Escalacao getEscalacaoCasa() {
        return escalacaoCasa;
    }

    public void setEscalacaoCasa(Escalacao escalacaoCasa) {
        this.escalacaoCasa = escalacaoCasa;
    }

    public Escalacao getEscalacaoVisitante() {
        return escalacaoVisitante;
    }

    public void setEscalacaoVisitante(Escalacao escalacaoVisitante) {
        this.escalacaoVisitante = escalacaoVisitante;
    }

    public void golCasa(String nome, String horario) {
        this.golsCasa++;
        System.out.println("GOOOOL!" + nome + " marcou um gol para " + timeCasa.getNome() + " no minuto " + horario);
    }

    public void golVisitante(String nome, String horario) {
        this.golsVisitante++;
        System.out.println("GOOOOL!" + nome + " marcou um gol para " + timeVisitante.getNome() + " no minuto " + horario);
    }

    public int getGolsCasa() {
        return golsCasa;
    }

    public void setGolsCasa(int golsCasa) {
        this.golsCasa = golsCasa;
    }

    public int getGolsVisitante() {
        return golsVisitante;
    }

    public void setGolsVisitante(int golsVisitante) {
        this.golsVisitante = golsVisitante;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        String[] horarioSplit = horario.split(":");
        this.horario = LocalTime.of(Integer.parseInt(horarioSplit[0]), Integer.parseInt(horarioSplit[1]));
    }

    public void exibirDadosPartida() {
        int dia = this.data.getDayOfMonth();
        int mes = this.data.getMonthValue();
        int ano = this.data.getYear();

        System.out.println("Data: " + dia + "/" + mes + "/" + ano);
        System.out.println("Horario: " + this.horario);
        System.out.println("Local: " + this.local);
        System.out.println("Time da casa: " + this.timeCasa.getNome());
        System.out.println("Time visitante: " + this.timeVisitante.getNome());
        System.out.println("Escalacao do time da casa:\n-");
        this.escalacaoCasa.exibirJogadores();
        System.out.println("-");
        System.out.println("Escalacao do time visitante:\n-");
        this.escalacaoVisitante.exibirJogadores();
    }
}