package Calculos;

import java.util.Scanner;
import Particulas.ParticulaMRUV;

public class MRUV {
    public static void main(String[] args) {
        ParticulaMRUV particulaMRUV = new ParticulaMRUV();
        definirEntradasParticulaMRUV(particulaMRUV);
    }

    public static void definirEntradasParticulaMRUV(ParticulaMRUV particula) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite a posição inicial da partícula:");
            double posicaoInicial = scanner.nextDouble();
            
            System.out.println("Digite a posição final da partícula:");
            double posicaoFinal = scanner.nextDouble();

            System.out.println("Digite a velocidade inicial da partícula:");
            double velocidadeInicial = scanner.nextDouble();

            System.out.println("Digite a velocidade da partícula:");
            double velocidade = scanner.nextDouble();
            
            System.out.println("Digite a aceleração da partícula:");
            double aceleracao = scanner.nextDouble();

            System.out.println("Digite o tempo:");
            double tempo = scanner.nextDouble();

            particula.setPosicaoInicial(posicaoInicial);
            particula.setPosicaoFinal(posicaoFinal);
            particula.setVelocidadeInicial(velocidadeInicial);
            particula.setVelocidade(velocidade);
            particula.setAceleracao(aceleracao);
            particula.setTempo(tempo);
        }
    }
}
