package exercicios;

import java.util.Scanner;

/**
 * Programa que recebe um número inteiro positivo do usuário e realiza uma contagem regressiva até zero.
 * Exibe cada número da contagem e uma mensagem "Fim!" ao final.
 */
public class ContagemRegressiva {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroInicial;  // Armazena o número inicial para a contagem regressiva

        System.out.print("Digite um número inteiro positivo para iniciar a contagem regressiva: ");
        numeroInicial = scanner.nextInt();

        while (numeroInicial >= 0) {
            System.out.println(numeroInicial);  // Exibe o número atual da contagem
            numeroInicial--;  // Decrementa o número
        }

        System.out.println("Fim!");  // Mensagem ao final da contagem
        scanner.close();  // Fecha o scanner
    }
}
