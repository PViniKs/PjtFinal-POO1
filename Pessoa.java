package aula_11_08;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Pessoa {

    private String nome, cpf;
    private LocalDate dataNascimento;

    public Pessoa(String nome, String dataNascimento, String cpf) {
        this.nome = nome;
        this.dataNascimento = convertData(dataNascimento);
        this.cpf = cpf;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + dataNascimento.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
    }

    private LocalDate convertData(String data) {
        String[] dataSplit = data.split("-");
        int dia = Integer.parseInt(dataSplit[0]);
        int mes = Integer.parseInt(dataSplit[1]);
        int ano = Integer.parseInt(dataSplit[2]);

        return LocalDate.of(ano, mes, dia);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getdataNascimento() {
        return dataNascimento;
    }

    public void setdataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
