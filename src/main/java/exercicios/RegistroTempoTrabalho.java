package exercicios;

import java.util.Scanner;

/**
 * Exercicio4: Registro de horas trabalhadas.
 * O usuário pode inserir as horas trabalhadas em um dia,
 * e o programa calculará o total.
 */
public class RegistroTempoTrabalho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalHoras = 0;
        int horas;

        System.out.println("Digite as horas trabalhadas em um dia (digite 0 para parar):");

        // Loop para registrar horas até que 0 seja digitado
        while (true) {
            horas = scanner.nextInt();
            if (horas == 0) {
                break; // Encerra o loop se 0 for digitado
            }
            totalHoras += horas; // Soma as horas
        }

        System.out.println("Total de horas trabalhadas: " + totalHoras);
        scanner.close();
    }
}

