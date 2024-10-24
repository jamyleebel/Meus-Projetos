package exercicios;

import java.util.Scanner;

public class PesquisaNomes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// declaração de variáveis
		String vetNomes[] = new String[3];
		// entrada de dados
		for (int i = 0; i < 3; i++) {
			System.out.println("Informe o nome do aluno:");
			vetNomes[i] = sc.next();
			
		}
		System.out.println("Vetores atuais:");
		// listar conteudo do array
		for (int i = 0; i < 3; i++) {
			System.out.println(vetNomes[i]);
		}
		// pesquisar um elemento no array
		System.out.println("Informe o nome a pesquisar:");
		var nomeInformado = sc.next();
		boolean acheiArgumento = false;
		for (int i = 0; i < 3; i++) {
			if (vetNomes[i].equals(nomeInformado)) {
				System.out.println("Achei " + nomeInformado + " na posição " + i + " do seu vetor");
				acheiArgumento = true;
				break;
			}
		}
		if (!acheiArgumento) {
			System.out.println("Não achei " + nomeInformado + " no seu vetor");
		}
		// alterar um elemento no array
		System.out.println("Informe o nome a alterar:");
		nomeInformado = sc.next();
		acheiArgumento = false;
		for (int i = 0; i < 3; i++) {
			if (vetNomes[i].equals(nomeInformado)) {
				System.out.println("Informe o novo nome:");
				vetNomes[i] = sc.next();
				acheiArgumento = true;
				System.out.println("O vetor atualizado é: ");
				break;
			}
		}
		if (!acheiArgumento) {
			System.out.println("Não achei " + nomeInformado + " para ser alterado");
		}
		//lista conteudo do arrays
		for (int i = 0; i < 3; i++) {
			System.out.println(vetNomes[i]);
		}
		sc.close();
	}
}
