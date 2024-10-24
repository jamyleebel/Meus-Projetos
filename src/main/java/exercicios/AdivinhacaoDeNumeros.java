package exercicios;

import java.util.Random;
import java.util.Scanner;

/**
 * Exercicio1: Jogo de adivinhação de números.
 * O usuário deve adivinhar um número entre 1 e 100.
 */
public class AdivinhacaoDeNumeros {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1; // Gera um número aleatório entre 1 e 100
        int palpite = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adivinhe um número entre 1 e 100:");

        // Loop até que o palpite esteja correto
        while (palpite != numeroAleatorio) {
            palpite = scanner.nextInt();
            if (palpite < numeroAleatorio) {
                System.out.println("O número é maior. Tente novamente:");
            } else if (palpite > numeroAleatorio) {
                System.out.println("O número é menor. Tente novamente:");
            } else {
                System.out.println("Parabéns! Você acertou!");
            }
        }
        scanner.close();
    }
}

