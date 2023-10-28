package Calculos;

import Particulas.ParticulaMRU;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MRU {
    
    public static void executarMRU() {
        ParticulaMRU particulaMRU = new ParticulaMRU();
        definirEntradasParticulaMRU(particulaMRU);
        calcularMRU(particulaMRU);
        
    }

    public static void definirEntradasParticulaMRU(ParticulaMRU particula) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite a posição inicial da partícula em m:");
            double posicaoInicial = scanner.nextDouble();

            System.out.println("Digite a posição final da partícula em m:");
            double posicaoFinal = scanner.nextDouble();

            System.out.println("Digite a velocidade da partícula em m/s:");
            double velocidade = scanner.nextDouble();

            System.out.println("Digite o tempo em s:");
            double tempo = scanner.nextDouble();

            particula.setPosicaoInicial(posicaoInicial);
            particula.setPosicaoFinal(posicaoFinal);
            particula.setVelocidade(velocidade);
            particula.setTempo(tempo);
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Certifique-se de inserir números válidos.");
        }
    }

    public static void calcularMRU(ParticulaMRU particula) {
        double posicaoInicial = particula.getPosicaoInicial();
        double velocidade = particula.getVelocidade();
        double tempoFinal = particula.getTempo();
    
        System.out.println("Tempo(s)\tPosição(m)\tVelocidade(m/s)\tAceleração(m/s²)");

        for (double tempo = 0; tempo <= tempoFinal; tempo++) {// Intervalo de tempo de 1 segundo (pode ser ajustado).
            double aceleracao = 0; // No MRU, a aceleração é sempre zero.
            double posicao = posicaoInicial + (velocidade * tempo);
            System.out.printf("%.2f\t%.2f\t%.2f\t%.2f\n", tempo, posicao, velocidade, aceleracao);
        }
    }
}

