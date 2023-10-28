package Particulas;

public class ParticulaMRUV extends Particula {
    private double velocidadeInicial;
    private double aceleracao;

    public double getVelocidadeInicial() {
        return velocidadeInicial;
    }

    public void setVelocidadeInicial(double velocidadeInicial) {
        this.velocidadeInicial = velocidadeInicial;
    }

    public double getAceleracao() {
        return aceleracao;
    }

    public void setAceleracao(double aceleracao) {
        this.aceleracao = aceleracao;
    }

    public ParticulaMRUV(double posicaoInicial, double velocidadeInicial, double aceleracao, double tempo) {

    }
}
