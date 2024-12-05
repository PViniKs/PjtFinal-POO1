package aula_11_08;

public class Main {
    private static Time flamengo, atleticoMG;
    private static Treinador filipeLuis, gabrielMilito;
    private static Jogador agustinRossi, wesleyFranca, leoOrtiz, leoPereira, alexSandro, gerson, evertonAraujo,
            gonzaloPlata, arrascaeta, michael, gabrielBarbosa, givanildo, guilhermeArana, pauloHenrique, rubensAntonio,
            alanFranco, otavioHenrique, gustavoScarpa, juniorAlonso, rodrigoBattaglia, lyanco, everson, guillermoVarela,
            ayrtonLucas, fabricioBruno, carlosAlcaraz, lorranLucas, matheusGoncalves, davidLuiz, matheusCunha,
            allanRodrigues, cleitonSantana, franciscoDyogo, alanKardec, matiasZaracho, renzoSaravia, alissonSantana,
            brunoFuchs, eduardoVargas, igorRabello, igorGomes, marianoFerreira, pauloVitor, brahianPalacios;
    private static Escalacao escFlamengo, escAtleticoMG;
    private static Partida partidaIda, partidaVolta;

    public static void main(String[] args) {
        criaTime();
        criaTreinador();
        criaJogador();
        adicionaJogador();
        criaEscalacao();
        escalaJogador();
        criaPartida();

        System.out.println("\nPartida de Ida\n-");
        partidaIda.exibirDadosPartida();
        System.out.println("\n------------------------------------------");
        System.out.println("\nPartida de Volta\n-");
        partidaVolta.exibirDadosPartida();
    }

    public static void criaTime() {
        flamengo = new Time("Flamengo");
        atleticoMG = new Time("Atlético MG");
    }

    public static void criaTreinador() {
        filipeLuis = new Treinador("Filipe Luis", "09-08-1985", "01234567890");
        gabrielMilito = new Treinador("Gabriel Milito", "07-09-1980", "06548662498");

        flamengo.setTreinador(filipeLuis);
        atleticoMG.setTreinador(gabrielMilito);
    }

    public static void criaJogador() {
        agustinRossi = new Jogador("Agustin Rossi", "21-08-1995", "12345678901");
        wesleyFranca = new Jogador("Wesley França", "06-09-2003", "12345678902");
        leoOrtiz = new Jogador("Leo Ortiz", "03-01-1996", "12345678903");
        leoPereira = new Jogador("Leo Pereira", "31-01-1996", "12345678904");
        alexSandro = new Jogador("Alex Sandro Lobo Silva", "26-01-1991", "12345678905");
        gerson = new Jogador("Gerson Santos da Silva", "20-05-1997", "12345678906");
        evertonAraujo = new Jogador("Evertton Araujo", "28-02-2003", "12345678907");
        gonzaloPlata = new Jogador("Gonzalo Plata", "01-11-2000", "12345678908");
        arrascaeta = new Jogador("Giorgian De Arrascaeta", "01-06-1994", "12345678909");
        michael = new Jogador("Michael Richard Delgado de Oliveira", "12-03-1996", "12345678910");
        gabrielBarbosa = new Jogador("Gabriel Barbosa", "30-08-1996", "12345678911");
        givanildo = new Jogador("Givanildo Vieira de Sousa", "25-07-1986", "23456789012");
        guilhermeArana = new Jogador("Guilherme Arana", "14-04-1997", "23456789013");
        pauloHenrique = new Jogador("Paulo Henrique Sampaio Filho", "15-07-2000", "23456789014");
        rubensAntonio = new Jogador("Rubens Antonio Dias", "21-06-2001", "23456789015");
        alanFranco = new Jogador("Alan Franco Palma", "21-08-1998", "23456789016");
        otavioHenrique = new Jogador("Otavio Henrique Passos Santos", "04-05-1994", "23456789017");
        gustavoScarpa = new Jogador("Gustavo Scarpa", "05-01-1994", "23456789018");
        juniorAlonso = new Jogador("Junior Alonso", "09-02-1993", "23456789019");
        rodrigoBattaglia = new Jogador("Rodrigo Battaglia", "12-07-1991", "23456789020");
        lyanco = new Jogador("Lyanco Evangelista Silveira Neves Vojnovic", "01-02-1997", "23456789021");
        everson = new Jogador("Everson Felipe Marques Pires", "22-07-1990", "23456789022");
        guillermoVarela = new Jogador("Guillermo Varela", "24-03-1993", "34567890123");
        ayrtonLucas = new Jogador("Ayrton Lucas Dantas de Medeiros", "19-06-1997", "34567890124");
        fabricioBruno = new Jogador("Fabrício Bruno", "12-02-1996", "34567890125");
        carlosAlcaraz = new Jogador("Carlos Alcaraz", "30-11-2002", "34567890126");
        lorranLucas = new Jogador("Lorran Lucas Pereira de Sousa", "04-07-2006", "34567890127");
        matheusGoncalves = new Jogador("Matheus Gonçalves", "18-08-2005", "34567890128");
        davidLuiz = new Jogador("David Luiz", "22-04-1987", "34567890129");
        matheusCunha = new Jogador("Matheus Cunha Queiroz", "24-05-2001", "34567890130");
        allanRodrigues = new Jogador("Allan Rodrigues de Souza", "03-03-1997", "34567890131");
        cleitonSantana = new Jogador("Cleiton Santana", "25-04-2003", "34567890132");
        franciscoDyogo = new Jogador("Francisco Dyogo Bento Alves", "09-01-2004", "34567890133");
        alanKardec = new Jogador("Alan Kardec", "12-01-1989", "45678901234");
        matiasZaracho = new Jogador("Matías Zaracho", "10-03-1998", "45678901235");
        renzoSaravia = new Jogador("Renzo Saravia", "16-06-1993", "45678901236");
        alissonSantana = new Jogador("Alisson Santana", "21-09-2005", "45678901237");
        brunoFuchs = new Jogador("Bruno Fuchs", "01-04-1999", "45678901238");
        eduardoVargas = new Jogador("Eduardo Vargas", "20-11-1989", "45678901239");
        igorRabello = new Jogador("Igor Rabello", "28-04-1995", "45678901240");
        igorGomes = new Jogador("Igor Gomes", "17-03-1999", "45678901241");
        marianoFerreira = new Jogador("Mariano Ferreira Filho", "23-06-1986", "45678901242");
        pauloVitor = new Jogador("Paulo Vitor Monteiro", "26-08-2004", "45678901243");
        brahianPalacios = new Jogador("Brahian Palacios", "24-11-2002", "45678901244");
    }

    public static void adicionaJogador() {
        flamengo.addJogador(agustinRossi, 1, "Goleiro");
        flamengo.addJogador(wesleyFranca, 43, "Lateral");
        flamengo.addJogador(leoOrtiz, 3, "Zagueiro");
        flamengo.addJogador(leoPereira, 4, "Zagueiro");
        flamengo.addJogador(alexSandro, 26, "Lateral");
        flamengo.addJogador(gerson, 8, "Meio de Campo");
        flamengo.addJogador(evertonAraujo, 52, "Meio de Campo");
        flamengo.addJogador(gonzaloPlata, 45, "Ponta");
        flamengo.addJogador(arrascaeta, 14, "Meio de Campo");
        flamengo.addJogador(michael, 30, "Ponta");
        flamengo.addJogador(gabrielBarbosa, 99, "Atacante");

        atleticoMG.addJogador(givanildo, 7, "Atacante");
        atleticoMG.addJogador(guilhermeArana, 13, "Ponta");
        atleticoMG.addJogador(pauloHenrique, 10, "Ponta");
        atleticoMG.addJogador(rubensAntonio, 44, "Lateral");
        atleticoMG.addJogador(alanFranco, 23, "Meio de Campo");
        atleticoMG.addJogador(otavioHenrique, 5, "Meio de Campo");
        atleticoMG.addJogador(gustavoScarpa, 6, "Lateral");
        atleticoMG.addJogador(juniorAlonso, 8, "Lateral");
        atleticoMG.addJogador(rodrigoBattaglia, 21, "Zagueiro");
        atleticoMG.addJogador(lyanco, 2, "Lateral");
        atleticoMG.addJogador(everson, 22, "Goleiro");

        flamengo.addJogador(guillermoVarela, 2, "Lateral");
        flamengo.addJogador(ayrtonLucas, 6, "Lateral");
        flamengo.addJogador(fabricioBruno, 15, "Zagueiro");
        flamengo.addJogador(carlosAlcaraz, 37, "Meio de Campo");
        flamengo.addJogador(lorranLucas, 19, "Meio de Campo");
        flamengo.addJogador(matheusGoncalves, 20, "Ponta");
        flamengo.addJogador(davidLuiz, 23, "Zagueiro");
        flamengo.addJogador(matheusCunha, 25, "Goleiro");
        flamengo.addJogador(allanRodrigues, 29, "Meio de Campo");
        flamengo.addJogador(cleitonSantana, 33, "Zagueiro");
        flamengo.addJogador(franciscoDyogo, 49, "Goleiro");

        atleticoMG.addJogador(alanKardec, 18, "Atacante");
        atleticoMG.addJogador(matiasZaracho, 15, "Meio de Campo");
        atleticoMG.addJogador(renzoSaravia, 26, "Lateral");
        atleticoMG.addJogador(alissonSantana, 45, "Meio de Campo");
        atleticoMG.addJogador(brunoFuchs, 3, "Zagueiro");
        atleticoMG.addJogador(eduardoVargas, 11, "Atacante");
        atleticoMG.addJogador(igorRabello, 16, "Zagueiro");
        atleticoMG.addJogador(igorGomes, 17, "Meio de Campo");
        atleticoMG.addJogador(marianoFerreira, 25, "Lateral");
        atleticoMG.addJogador(pauloVitor, 27, "Zagueiro");
        atleticoMG.addJogador(brahianPalacios, 30, "Lateral");
    }

    public static void criaEscalacao() {
        escFlamengo = new Escalacao(flamengo, "4-4-2");
        escAtleticoMG = new Escalacao(atleticoMG, "4-3-3");
    }

    public static void escalaJogador() {
        escFlamengo.addTitular(agustinRossi);
        escFlamengo.addTitular(wesleyFranca);
        escFlamengo.addTitular(leoOrtiz);
        escFlamengo.addTitular(leoPereira);
        escFlamengo.addTitular(alexSandro);
        escFlamengo.addTitular(gerson);
        escFlamengo.addTitular(evertonAraujo);
        escFlamengo.addTitular(gonzaloPlata);
        escFlamengo.addTitular(arrascaeta);
        escFlamengo.addTitular(michael);
        escFlamengo.addTitular(gabrielBarbosa);

        escAtleticoMG.addTitular(givanildo);
        escAtleticoMG.addTitular(guilhermeArana);
        escAtleticoMG.addTitular(pauloHenrique);
        escAtleticoMG.addTitular(rubensAntonio);
        escAtleticoMG.addTitular(alanFranco);
        escAtleticoMG.addTitular(otavioHenrique);
        escAtleticoMG.addTitular(gustavoScarpa);
        escAtleticoMG.addTitular(juniorAlonso);
        escAtleticoMG.addTitular(rodrigoBattaglia);
        escAtleticoMG.addTitular(lyanco);
        escAtleticoMG.addTitular(everson);

        escFlamengo.addReserva(guillermoVarela);
        escFlamengo.addReserva(ayrtonLucas);
        escFlamengo.addReserva(fabricioBruno);
        escFlamengo.addReserva(carlosAlcaraz);
        escFlamengo.addReserva(lorranLucas);
        escFlamengo.addReserva(matheusGoncalves);
        escFlamengo.addReserva(davidLuiz);
        escFlamengo.addReserva(matheusCunha);
        escFlamengo.addReserva(allanRodrigues);
        escFlamengo.addReserva(cleitonSantana);
        escFlamengo.addReserva(franciscoDyogo);

        escAtleticoMG.addReserva(alanKardec);
        escAtleticoMG.addReserva(matiasZaracho);
        escAtleticoMG.addReserva(renzoSaravia);
        escAtleticoMG.addReserva(alissonSantana);
        escAtleticoMG.addReserva(brunoFuchs);
        escAtleticoMG.addReserva(eduardoVargas);
        escAtleticoMG.addReserva(igorRabello);
        escAtleticoMG.addReserva(igorGomes);
        escAtleticoMG.addReserva(marianoFerreira);
        escAtleticoMG.addReserva(pauloVitor);
        escAtleticoMG.addReserva(brahianPalacios);
    }

    public static void criaPartida() {
        partidaIda = new Partida("03-11-2024", "16:00", "Maracanã", flamengo, atleticoMG, escFlamengo, escAtleticoMG);
        partidaVolta = new Partida("10-11-2024", "16:00", "Arena MRV", atleticoMG, flamengo, escAtleticoMG, escFlamengo);
    }

}