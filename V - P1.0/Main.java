// Importa recursos importantes
import java.util.Scanner;

// Classe Main
public class Main {
	
	// main
	public static void main(String[] args) {
		
		// Chama o código principal
		new SistemaOperacional(true);
	}
}

// Classe principal
class SistemaOperacional {
	
	// Variáveis globais
	public static boolean programaRodando = false;
	public static String entradaDoUsuario = null;
	
	// Construtor
	public SistemaOperacional(boolean iniciar) {
		
		// Muda programaRodando para a entrada recebida
		programaRodando = iniciar;
	}
	
	// Método de print
	public static void print(int tipo, String texto) {
		
		// Printa uma mensagem padrao
		if (tipo == 1) {
			System.out.println(texto);
			
		// Printa um erro
		} else if (tipo == 2) {
			System.err.println(texto);
		}
	}
}
