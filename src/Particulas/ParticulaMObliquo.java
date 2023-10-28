package Particulas;

public class ParticulaMObliquo extends Particula{
    private double posicaoInicialHorizontal;
    private double posicaoInicialVertical;
    private double velocidadeInicial;
    private double anguloLancamento;
    private double altura;
    
    public double getPosicaoInicialHorizontal() {
        return posicaoInicialHorizontal;
    }
    public void setPosicaoInicialHorizontal(double posicaoInicialHorizontal) {
        this.posicaoInicialHorizontal = posicaoInicialHorizontal;
    }
    public double getPosicaoInicialVertical() {
        return posicaoInicialVertical;
    }
    public void setPosicaoInicialVertical(double posicaoInicialVertical) {
        this.posicaoInicialVertical = posicaoInicialVertical;
    }
    public double getVelocidadeInicial() {
        return velocidadeInicial;
    }
    public void setVelocidadeInicial(double velocidadeInicial) {
        this.velocidadeInicial = velocidadeInicial;
    }
    public double getAnguloLancamento() {
        return anguloLancamento;
    }
    public void setAnguloLancamento(double anguloLancamento) {
        this.anguloLancamento = anguloLancamento;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
}
