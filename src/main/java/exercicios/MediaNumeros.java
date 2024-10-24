package exercicios;

import java.util.Scanner;

/**
 * Exercicio3: Cálculo da média de números positivos.
 * O usuário pode inserir números inteiros até que um número negativo seja digitado.
 */
public class MediaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int contador = 0;
        int numero;

        System.out.println("Digite números inteiros (número negativo para parar):");

        // Loop para receber números até um negativo
        while (true) {
            numero = scanner.nextInt();
            if (numero < 0) {
                break; // Encerra o loop se o número for negativo
            }
            soma += numero; // Soma os números
            contador++; // Conta os números
        }

        // Calcula e exibe a média se houver números positivos
        if (contador > 0) {
            double media = (double) soma / contador;
            System.out.println("A média dos números positivos é: " + media);
        } else {
            System.out.println("Nenhum número positivo foi digitado.");
        }
        scanner.close();
    }
}
