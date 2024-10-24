package exercicios;

import java.util.Scanner;


public class Sistema {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int resposta = 0;
		double geral = 0;
		
		System.out.println("Sistema de Caixa Automatizado");

		while (true) {
		System.out.println("\n\nEscolha o número produto que você gostaria de comprar:\n"
				+ "1. Arroz - R$ 20.00\r\n"
				+ "2. Feijão - R$ 10.00\r\n"
				+ "3. Açúcar - R$ 5.00\r\n"
				+ "4. Café - R$ 15.00\r\n"
				+ "5. Sair");
        resposta = scanner.nextInt();
        
        switch (resposta) {
		case 1:
			System.out.println("O produto selecionado é arroz");
			geral += 20.00;
			break;
		case 2:
			System.out.println("O produto selecionado é feijão");
			geral += 10.00;
			break;
		case 3:
			System.out.println("O produto selecionado é açúcar");
			geral += 5.00;
			break;
		case 4:
			System.out.println("O produto selecionado é café");
			geral += 15.00;
			break;			
		}
		
		if (resposta == 5) {
			break;	
		}
		

		}
		System.out.printf("A soma total dos produtos é: %.2f",geral);
		 scanner.close();  // Fecha o scanner

	}

}
