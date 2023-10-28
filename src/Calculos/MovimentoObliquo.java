package Calculos;

import java.util.Scanner;
import Particulas.ParticulaMObliquo;

public class MovimentoObliquo {
    public static void main(String[] args) {
        ParticulaMObliquo particulaMObliquo = new ParticulaMObliquo();
        definirEntradasParticulaMObliquo(particulaMObliquo);    
    }

    public static void definirEntradasParticulaMObliquo(ParticulaMObliquo particula) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite a posição inicial da partícula:");
            double posicaoInicial = scanner.nextDouble();
            
            System.out.println("Digite a posição final da partícula:");
            double posicaoFinal = scanner.nextDouble();

            System.out.println("Digite a velocidade inicial da partícula:");
            double velocidadeInicial = scanner.nextDouble();

            System.out.println("Digite o tempo:");
            double tempo = scanner.nextDouble();

            particula.setPosicaoInicial(posicaoInicial);
            particula.setPosicaoFinal(posicaoFinal);
            particula.setVelocidadeInicial(velocidadeInicial);
            particula.setTempo(tempo);
        }
    }
}
