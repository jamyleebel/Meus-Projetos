package exercicios;

import java.util.Scanner;

public class SomaNumerosPositivos {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        int somaTotal = 0;  // Armazena a soma total dos números positivos
        int numeroAtual;    // Armazena o número inserido pelo usuário

        System.out.println("Digite números inteiros positivos. Para encerrar, insira um número negativo.");

        while (true) {
            System.out.print("Digite um número: ");
            numeroAtual = scanner.nextInt();

            if (numeroAtual < 0) {
                break;  // Encerra o laço se o número for negativo
            }
            somaTotal += numeroAtual;  // Adiciona o número à soma total
        }

        System.out.println("A soma dos números positivos é: " + somaTotal);
        scanner.close();  // Fecha o scanner


	}

}
