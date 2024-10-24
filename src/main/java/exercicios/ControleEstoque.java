package exercicios;

import java.util.Scanner;

/**
 * Exercicio5: Controle simples de estoque.
 * O usuário pode informar o número de unidades em estoque
 * e registrar vendas até que o estoque acabe.
 */
public class ControleEstoque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de unidades em estoque:");
        int estoque = scanner.nextInt();
        
        // Loop para registrar vendas até que o estoque acabe
        while (estoque > 0) {
            System.out.println("Quantas unidades foram vendidas?");
            int vendas = scanner.nextInt();
            
            if (vendas > estoque) {
                System.out.println("Não há unidades suficientes em estoque.");
            } else {
                estoque -= vendas; // Atualiza o estoque
                System.out.println("Estoque atual: " + estoque);
            }
        }

        System.out.println("Estoque zerado.");
        scanner.close();
    }
}


