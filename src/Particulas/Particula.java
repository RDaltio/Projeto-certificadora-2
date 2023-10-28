package Particulas;

public class Particula {
    private double posicaoInicial;
    private double posicaoFinal;
    private double velocidade;
    private double tempo;

    public double getPosicaoInicial() {
        return posicaoInicial;
    }
    public void setPosicaoInicial(double posicaoInicial) {
        this.posicaoInicial = posicaoInicial;
    }
    public double getPosicaoFinal() {
        return posicaoFinal;
    }
    public void setPosicaoFinal(double posicaoFinal) {
        this.posicaoFinal = posicaoFinal;
    }
    public double getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
    public double getTempo() {
        return tempo;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }
}
