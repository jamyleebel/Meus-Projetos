import java.util.Scanner;
	

public class SistemaReservas {

	// Constantes para configuração
		    static int numSalas = 3;       // Número de salas disponíveis
		    static int numHorarios = 5;   // Número de horários por sala

		    // Matriz para armazenar reservas (linhas = salas, colunas = horários)
		    static String[][] reservas = new String[numSalas][numHorarios];

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        inicializarReservas(); // Inicializa matriz de reservas com valores padrão

		        int opcao;

		        do {
		            exibirMenu();
		            System.out.print("Escolha uma opção: ");
		            opcao = scanner.nextInt();
		            scanner.nextLine(); // Consumir nova linha

		            switch (opcao) {
		                case 1: visualizarHorarios();
		                break;
		                case 2: reservarHorario(scanner);
		                break;
		                case 3: cancelarReserva(scanner);
		                break;
		                case 4: consultarReservas(scanner);
		                break;
		                case 5: System.out.println("Encerrando o sistema...");
		                break;
		                default : System.out.println("Opção inválida, tente novamente.");
		            }
		        } while (opcao != 5);

		        scanner.close();
		    }

		    // Inicializa a matriz de reservas com "Disponível"
		    static void inicializarReservas() {
		        for (int i = 0; i < numSalas; i++) {
		            for (int j = 0; j < numHorarios; j++) {
		                reservas[i][j] = "Disponível";
		            }
		        }
		    }

		    // Exibe o menu principal
		    static void exibirMenu() {
		        System.out.println("\n=== Sistema de Gerenciamento de Salas de Reunião ===");
		        System.out.println("1. Visualizar horários disponíveis");
		        System.out.println("2. Reservar um horário");
		        System.out.println("3. Cancelar uma reserva");
		        System.out.println("4. Consultar minhas reservas");
		        System.out.println("5. Sair");
		    }

		    // Visualiza os horários disponíveis para todas as salas
		    static void visualizarHorarios() {
		        System.out.println("\nHorarios: ");
		        for (int i = 0; i < numSalas; i++) {
		            System.out.println("Sala " + (i + 1) + ":");
		            for (int j = 0; j < numHorarios; j++) {
			            if(j == 0) {
			            	System.out.println("Manhã:");
		            	}
			            else if(j == 2) {
			            	System.out.println("Tarde:");
			            }		            
		            	if(j < 2) {
		            		System.out.println("Horário "+(j+1)+": "+(j+8)+":00 horas = " + reservas[i][j]);
		            	}
		            	else if(j > 1) {
		            		System.out.println("Horário "+(j+1)+": "+(j+12)+":00 horas = " + reservas[i][j]);
		            	}
		            }
		        }
		    }

		    // Permite ao usuário reservar um horário
		    static void reservarHorario(Scanner scanner) {
		        System.out.print("\nDigite o número da sala (1 a " + numSalas + "): ");
		        int sala = scanner.nextInt() - 1;
		        System.out.print("Digite o número do horário (1 a " + numHorarios + "): ");
		        int horario = scanner.nextInt() - 1;
		        scanner.nextLine(); // Consumir nova linha

		        if (reservas[sala][horario].equals("Disponível")) {
		            System.out.print("Digite seu nome para a reserva: ");
		            String nome = scanner.nextLine();
		            reservas[sala][horario] = nome;
		            System.out.println("Reserva realizada com sucesso!");
		        } else {
		            System.out.println("Horário já reservado por: " + reservas[sala][horario]);
		        }
		    }

		    // Permite cancelar uma reserva
		    static void cancelarReserva(Scanner scanner) {
		        System.out.print("\nDigite o número da sala (1 a " + numSalas + "): ");
		        int sala = scanner.nextInt() - 1;
		        System.out.print("Digite o número do horário (1 a " + numHorarios + "): ");
		        int horario = scanner.nextInt() - 1;

		        if (!reservas[sala][horario].equals("Disponível")) {
		            reservas[sala][horario] = "Disponível";
		            System.out.println("Reserva cancelada com sucesso!");
		        } else {
		            System.out.println("Esse horário já está disponível.");
		        }
		    }

		    // Consulta reservas de um usuário específico
		    static void consultarReservas(Scanner scanner) {
		        System.out.print("\nDigite seu nome para consulta: ");
		        String nome = scanner.nextLine();
		        boolean encontrou = false;

		        System.out.println("Suas reservas:");
		        for (int i = 0; i < numSalas; i++) {
		            for (int j = 0; j < numHorarios; j++) {
		                if (reservas[i][j].equalsIgnoreCase(nome)) {
		                    System.out.println("  Sala " + (i + 1) + ", Horário " + (j + 1));
		                    encontrou = true;
		                }
		            }
		        }

		        if (!encontrou) {
		            System.out.println("Nenhuma reserva encontrada.");
		        }
		    }
		
	}
	
