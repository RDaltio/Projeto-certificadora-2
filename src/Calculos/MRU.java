package Calculos;

import Particulas.ParticulaMRU;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MRU {
    
    public static void executarMRU(Scanner scanner) {
        ParticulaMRU particulaMRU = new ParticulaMRU(0, 0, 0);
        definirEntradasParticulaMRU(particulaMRU, scanner);
        calcularMRU(particulaMRU);
    }

    public static void definirEntradasParticulaMRU(ParticulaMRU particula, Scanner scanner) {
        System.out.println("\nDigite a posição inicial da partícula em m:");
        double posicaoInicial = 0;
        try {
            posicaoInicial = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("\nEntrada inválida para a posição inicial. Certifique-se de inserir um número válido.");
            scanner.nextLine(); // Limpa a entrada inválida
            definirEntradasParticulaMRU(particula, scanner);
            return;
        }

        System.out.println("\nDigite a velocidade da partícula em m/s:");
        double velocidade = 0;
        try {
            velocidade = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("\nEntrada inválida para a velocidade. Certifique-se de inserir um número válido.");
            scanner.nextLine();
            definirEntradasParticulaMRU(particula, scanner);
            return;
        }

        System.out.println("\nDigite o tempo em s:");
        double tempo = 0;
        try {
            tempo = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("\nEntrada inválida para o tempo. Certifique-se de inserir um número válido.");
            scanner.nextLine();
            definirEntradasParticulaMRU(particula, scanner);
            return;
        }

        particula.setPosicaoInicial(posicaoInicial);
        particula.setVelocidade(velocidade);
        particula.setTempo(tempo);
    }

    public static void calcularMRU(ParticulaMRU particula) {
        double posicaoInicial = particula.getPosicaoInicial();
        double velocidade = particula.getVelocidade();
        double tempoFinal = particula.getTempo();
    
        System.out.println("\nTempo(s)\tPosição(m)\tVelocidade(m/s)\tAceleração(m/s²)");

        for (double tempo = 0; tempo <= tempoFinal; tempo++) {
            double aceleracao = 0;
            double posicao = posicaoInicial + (velocidade * tempo);
            System.out.printf("\n%.2f\t%.2f\t%.2f\t%.2f\n", tempo, posicao, velocidade, aceleracao);
        }
    }
}
