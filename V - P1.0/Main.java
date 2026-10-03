// Importa recursos
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// Classe do arquivo
public class Main {
	
	// Método da classe
	public static void main(String[] args) {
		
		// Cria um novo menu
		new Menu();
	}
}

// Classe que emula o sistema operacional
class Emulador {
	
	// Construtor do sistema
	public Emulador() {
		
	}
}

// Classe do menu
class Menu {
	
	// Variáveis globais da classe
	public static boolean menuRodando = true;
	public static Scanner scanner = new Scanner(System.in);
	public static String entradaDoUsuario = null;
	public static boolean entradaValida = false;
	public static int entradaDoUsuarioNumero = 0;
	public static int erros = 0;
	
	// Construtor da classe
	public Menu() {
		
		// Faz a inicialização
		inicializacao();
				
		// Loop do menu
		while (menuRodando) {
			
			// Exibe as opções ao usuário
			exibirOpcoes();
			
			// Pega a entrada
			pegarEntrada();
		}
	}
	
	// Método para exibir as opções
	public static void exibirOpcoes() {
		
		// Exibe as opcões
		System.out.println("Bem-vindo a TerminalOS");
		System.out.println("0 - Iniciar emulador");
		System.out.println("1 - Sair");
	}
	
	// Método para pegar a entrada do usuário
	public static void pegarEntrada() {
		
		// Loop de tentativa
		while (!entradaValida) {
			
			// Pede ao usuário digitar algo
			System.out.print("Digite um opção e aperte enter ");
			
			// Pega a entrada do usuário
			entradaDoUsuario = scanner.nextLine();
			
			// Bloco de tentativa 
			try {
				
				// Tenta converter a String para um número
				entradaDoUsuarioNumero = Integer.parseInt(entradaDoUsuario);
				entradaValida = true;
				
			// Roda se dar erro
			} catch (NumberFormatException e) {
				
				// Trata o erro
				System.out.println("Erro: um número válido não foi inserido");
				erros++;
			}
		}
		
		// Verifica a entrada 
		switch (entradaDoUsuarioNumero) {
			case 0: 
				new Emulador();
				break;
			case 1:
				System.out.println("Encerrando o programa...");
				waitTime(2000);
				System.out.println("Erros durante a execução: " + erros);
				System.out.println("Programa encerrado");
				System.exit(0);
			default:
				System.out.println("Erro: opção inválida escolhida");
				erros++;
				break;
		}
		
		// Muda entrada válida para false
		entradaValida = false;
	}
	
	public static void waitTime(int tempo) {
		try {
			Thread.sleep(tempo); 
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			System.err.println("A espera foi interrompida.");
		}
	}
	
	// Método de inicialização falsa
	public static void inicializacao() {
		
		// Inicialização falsa do programa
		System.out.println("O sistema está iniciando...");
		System.out.println("Carregando dados...");
		waitTime(1500);
		System.out.println("Dados carregados");
		System.out.println("Verificando cache...");
		waitTime(2000);
		System.out.println("Cache verificado");
		System.out.println("Criando cache anteriormente não criado...");
		waitTime(500);
		System.out.println("Cache criado");
		System.out.println("Programa iniciado");
	}
}







