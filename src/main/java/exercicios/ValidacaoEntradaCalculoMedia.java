package exercicios;

import java.util.Scanner;

/**
 * Programa que solicita notas de estudantes (valores entre 0 e 10), calcula a média e exibe a média das notas válidas.
 * O processo de entrada continua até que o usuário insira um valor inválido (menor que 0 ou maior que 10).
 */
public class ValidacaoEntradaCalculoMedia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int somaNotas = 0;  // Armazena a soma das notas válidas
        int quantidadeNotas = 0;  // Conta o número de notas válidas
        int notaAtual;  // Armazena a nota inserida pelo usuário

        System.out.println("Digite notas de estudantes entre 0 e 10. Para encerrar, insira um valor inválido.");

        while (true) {
            System.out.print("Digite uma nota: ");
            notaAtual = scanner.nextInt();

            if (notaAtual < 0 || notaAtual > 10) {
                System.out.println("Nota inválida. O programa será encerrado.");
                break;  // Encerra o laço se a nota for inválida
            }

            somaNotas += notaAtual;  // Adiciona a nota à soma das notas
            quantidadeNotas++;  // Incrementa o contador de notas válidas
        }

        if (quantidadeNotas > 0) {
            double mediaNotas = (double) somaNotas / quantidadeNotas;  // Calcula a média das notas válidas
            System.out.println("A média das notas válidas é: " + mediaNotas);
        } else {
            System.out.println("Nenhuma nota válida foi inserida.");
        }

        scanner.close();  // Fecha o scanner
    }
}
