package aula_11_08;

public class Escalacao {
    private Time time;
    private String formacao;
    private Jogador[] titulares = new Jogador[11], reservas = new Jogador[11];

    public Escalacao(Time time, String formacao) {
        this.time = time;
        this.formacao = formacao;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Jogador[] getTitulares() {
        return titulares;
    }

    public void setTitulares(Jogador[] titulares) {
        this.titulares = titulares;
    }

    public Jogador[] getReservas() {
        return reservas;
    }

    public void setReservas(Jogador[] reservas) {
        this.reservas = reservas;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public void addTitular(Jogador jogador) {
        for (int i = 0; i < titulares.length; i++) {
            if (titulares[i] != null && titulares[i].equals(jogador)) {
                System.out.println("Jogador " + jogador.getNome() + " já está escalado como titular.");
                return;
            } else if (reservas[i] != null && reservas[i].equals(jogador)) {
                System.out.println("Jogador " + jogador.getNome() + " já está escalado como reserva.");
                return;
            }

            if (titulares[i] == null) {
                titulares[i] = jogador;
                return;
            }
        }
        System.out.println("Não foi possível adicionar o jogador " + jogador.getNome() + " aos titulares pois a escalação já está completa.");
    }

    public void addReserva(Jogador jogador) {
        for (int i = 0; i < reservas.length; i++) {
            if (reservas[i] != null && reservas[i].equals(jogador)) {
                System.out.println("Jogador " + jogador.getNome() + " já está escalado como reserva.");
                return;
            } else if (titulares[i] != null && titulares[i].equals(jogador)) {
                System.out.println("Jogador " + jogador.getNome() + " já está escalado como titular.");
                return;
            }

            if (reservas[i] == null) {
                reservas[i] = jogador;
                return;
            }
        }
        System.out.println("Não foi possível adicionar o jogador " + jogador.getNome() + " aos reservas pois a escalação já está completa.");
    }

    public void removeTitular(Jogador jogador) {
        if (jogador == null) {
            System.out.println("Jogador inválido.");
            return;
        }
        for (int i = 0; i < titulares.length; i++) {
            if (titulares[i] != null && titulares[i].equals(jogador)) {
                titulares[i] = null;
                return;
            }
        }
        System.out.println("Não foi possível remover o jogador " + jogador.getNome() + " dos titulares pois ele não está escalado.");
    }

    public void removeReserva(Jogador jogador) {
        if (jogador == null) {
            System.out.println("Jogador inválido.");
            return;
        }
        for (int i = 0; i < reservas.length; i++) {
            if (reservas[i] != null && reservas[i].equals(jogador)) {
                reservas[i] = null;
                return;
            }
        }
        System.out.println("Não foi possível remover o jogador " + jogador.getNome() + " dos reservas pois ele não está escalado.");
    }

    public void exibirJogadores() {
        System.out.println("Time: " + time.getNome());
        System.out.println("Treinador: " + time.getTreinador().getNome());
        System.out.println("Formação: " + formacao);

        System.out.println("-");

        System.out.println("Titulares:");
        if (titulares == null) {
            System.out.println("Nenhum jogador escalado.");
        } else {
            for (Jogador jogador : titulares) {
                if (jogador != null) {
                    System.out.println(jogador.getNome() + ". Camisa " + jogador.getNumeroCamisa() + ". Posição: " + jogador.getPosicao());
                }
            }
        }

        System.out.println("-");

        System.out.println("Reservas:");
        if (reservas == null) {
            System.out.println("Nenhum jogador escalado.");
        } else {
            for (Jogador jogador : reservas) {
                if (jogador != null) {
                    System.out.println(jogador.getNome() + ". Camisa " + jogador.getNumeroCamisa() + ". Posição: " + jogador.getPosicao());
            }
            }
        }
    }
}
