package exercicios;

import java.util.Scanner;

/**
 * Programa que solicita a inserção de uma senha e continua pedindo até que a senha correta seja inserida.
 * Senha correta é "1234".
 */
public class VerificacaoSenha {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senhaInserida;  // Armazena a senha inserida pelo usuário
        final String SENHA_CORRETA = "1234";  // Senha correta para acesso

        while (true) {
            System.out.print("Digite a senha: ");
            senhaInserida = scanner.nextLine();

            if (senhaInserida.equals(SENHA_CORRETA)) {
                System.out.println("Senha correta!");
                break;  // Encerra o laço se a senha estiver correta
            } else {
                System.out.println("Senha incorreta. Tente novamente.");
            }
        }

        scanner.close();  // Fecha o scanner
    }
}

