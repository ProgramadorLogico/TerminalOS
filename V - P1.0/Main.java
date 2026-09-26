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
	public static List<Integer> listaDeComandos = new ArrayList<> ();
	public static Scanner scanner = new Scanner(System.in);
	public static String entradaDoUsuario = null;
	public static boolean entradaValida = false;
	public static int entradaDoUsuarioNumero = 0;
	
	// Construtor da classe
	public Menu() {
		
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
		
		// Atualiza a lista de comandos
		listaDeComandos.clear();
		listaDeComandos.add(0);
		listaDeComandos.add(1);
		
		// Exibe as opcões
		System.out.println("----------------------");
		System.out.println("");
		System.out.println("Bem-vindo a TerminalOS");
		System.out.println("");
		System.out.println("----------------------");
		System.out.println("");
		System.out.println("0 - Iniciar emulador");
		System.out.println("1 - Sair");
		System.out.println("");
	}
	
	// Método para pegar a entrada do usuário
	public static void pegarEntrada() {
		
		// Loop de tentativa
		while (!entradaValida) {
			
			// Pede ao usuário digitar algo
			System.out.println("Digite um opção e aperte enter");
			System.out.println("");
			System.out.println("------------------------------");
			
			// Pega a entrada do usuário
			System.out.println("");
			entradaDoUsuario = scanner.nextLine();
			System.out.println("");
			System.out.println("----------------------");
			
			// Bloco de tentativa 
			try {
				
				// Tenta converter a String para um número
				entradaDoUsuarioNumero = Integer.parseInt(entradaDoUsuario);
				entradaValida = true;
				
			// Roda se dar erro
			} catch (NumberFormatException e) {
				
				// Trata o erro
				System.out.println("Você tem que digitar um número inteiro");
				System.out.println("");
				System.out.println("--------------------------------------");
			}
		}
		
		// Muda entrada válida para false
		entradaValida = false;
	}
}
