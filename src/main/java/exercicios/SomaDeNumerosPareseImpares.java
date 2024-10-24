package exercicios;

import java.util.Scanner;

/**
 * Exercicio2: Soma de números pares e ímpares.
 * O usuário deve inserir um número inteiro positivo,
 * e o programa calculará a soma dos pares e ímpares até esse número.
 */
public class SomaDeNumerosPareseImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro positivo:");
        int numero = scanner.nextInt();
        
        int somaPares = 0;
        int somaImpares = 0;
        int i = 1;

        // Loop até o número informado
        while (i <= numero) {
            if (i % 2 == 0) {
                somaPares += i; // Soma os números pares
            } else {
                somaImpares += i; // Soma os números ímpares
            }
            i++;
        }

        System.out.println("Soma dos números pares: " + somaPares);
        System.out.println("Soma dos números ímpares: " + somaImpares);
        scanner.close();
    }
}

