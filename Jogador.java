package aula_11_08;

public class Jogador extends Pessoa {

    private int numeroCamisa;
    private String posicao;

    public Jogador(String nome, String dataNascimento, String cpf) {
        super(nome, dataNascimento, cpf);
        this.numeroCamisa = -1;
        this.posicao = null;
    }

    public int getNumeroCamisa() {
        return numeroCamisa;
    }

    public void setNumeroCamisa(int numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }

    public void setNumeroCamisa(String numeroCamisa) {
        try {
            this.numeroCamisa = Integer.parseInt(numeroCamisa);
        } catch (NumberFormatException e) {
            System.out.println("Número de camisa inválido. Insira apenas números.");
        }
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

}
