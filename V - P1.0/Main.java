// Importa recursos
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

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
	
	// Construtor da classe
	public Menu() {
		
		// Loop do menu
		while (menuRodando) {
			
			// Exibi as opções ao usuário
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
		System.out.println("Bem-vindo a TerminalOS");
		System.out.println("----------------------");
		System.out.println("");
		System.out.println("0 - Iniciar emulador");
		System.out.println("1 - Sair");
		System.out.println("");
	}
}
