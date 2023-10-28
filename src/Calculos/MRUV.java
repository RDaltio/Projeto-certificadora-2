package Calculos;

import Particulas.ParticulaMRUV;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MRUV {
    
    public static void executarMRUV(Scanner scanner) {
        ParticulaMRUV particulaMRUV = new ParticulaMRUV(0, 0, 0, 0);
        definirEntradasParticulaMRUV(particulaMRUV, scanner);
        calcularMRUV(particulaMRUV);
    }

    public static void definirEntradasParticulaMRUV(ParticulaMRUV particula, Scanner scanner) {
        System.out.println("\nDigite a posição inicial da partícula em m:");
        double posicaoInicial = 0;
        try {
            posicaoInicial = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("\nEntrada inválida para a posição inicial. Certifique-se de inserir um número válido.");
            scanner.nextLine();
            definirEntradasParticulaMRUV(particula, scanner);
            return;
        }

        System.out.println("\nDigite a velocidade incial da partícula em m/s:");
        double velocidade = 0;
        try {
            velocidade = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("\nEntrada inválida para a velocidade. Certifique-se de inserir um número válido.");
            scanner.nextLine();
            definirEntradasParticulaMRUV(particula, scanner);
            return;
        }

        System.out.println("\nDigite a aceleração em m/s²:");
        double aceleracao = 0;
        try {
            aceleracao = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("\nEntrada inválida para a aceleração. Certifique-se de inserir um número válido.");
            scanner.nextLine();
            definirEntradasParticulaMRUV(particula, scanner);
            return;
        }

        System.out.println("\nDigite o tempo em s:");
        double tempo = 0;
        try {
            tempo = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("\nEntrada inválida para o tempo. Certifique-se de inserir um número válido.");
            scanner.nextLine();
            definirEntradasParticulaMRUV(particula, scanner);
            return;
        }

        particula.setPosicaoInicial(posicaoInicial);
        particula.setVelocidade(velocidade);
        particula.setAceleracao(aceleracao);
        particula.setTempo(tempo);
    }

    public static void calcularMRUV(ParticulaMRUV particula) {
        double posicaoInicial = particula.getPosicaoInicial();
        double velocidade = particula.getVelocidade();
        double aceleracao = particula.getAceleracao();
        double tempoFinal = particula.getTempo();
    
        System.out.println("\nTempo(s)\tPosição(m)\tVelocidade(m/s)\tAceleração(m/s²)");

        for (double tempo = 0; tempo <= tempoFinal; tempo++) {
            double velocidadeAtual = velocidade + (aceleracao * tempo);
            double posicaoAtual = posicaoInicial + (velocidade * tempo) + ((aceleracao * (tempo * tempo))/2);
            System.out.printf("\n%.2f\t%.2f\t%.2f\t%.2f\n", tempo, posicaoAtual, velocidadeAtual, aceleracao);
        }
    }
}
