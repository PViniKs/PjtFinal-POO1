package aula_11_08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Time {
    private String nome;
    private Treinador treinador;
    private List<Jogador> jogadores = new ArrayList<>();
    
    public Time(String nome) {
        this.nome = nome;
        this.jogadores = new ArrayList<>();
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Treinador getTreinador() {
        return treinador;
    }

    public void setTreinador(Treinador treinador) {
        this.treinador = treinador;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = new ArrayList<>(Arrays.asList(jogadores));
    }

    public void addJogador(Jogador jogador, int numeroCamisa, String posicao) {
        for (Jogador j : jogadores) {
            if (j.getNumeroCamisa() == numeroCamisa) {
                System.out.println("Número de camisa já é utilizado pelo jogador " + j.getNome());
                return;
            }
            if (j.getCpf().equals(jogador.getCpf())) {
                System.out.println("Jogador " + jogador.getNome() + " já cadastrado no time.");
                return;
            }
        }
        jogador.setNumeroCamisa(numeroCamisa);
        jogador.setPosicao(posicao);
        jogadores.add(jogador);
    }

    public void removeJogador(Jogador jogador) {
        for (Jogador j : jogadores) {
            if (j.equals(jogador)) {
                jogadores.remove(jogador);
                return;
            }
        }
        System.out.println("Jogador " + jogador.getNome() + " não encontrado no time.");
    }
}
