// Imports
import java.util.Scanner;

// Classe que fornece recursos
public class Ferramentas {

	// Construtor
	public Ferramentas() {
		/*
		* Este é a classe que fornece recursos ao projeto
		*/
	}

	// Método de log
	public static void log(String log) {
		System.out.println(log);
	}

	// Método que pega a entrada
	public static String captarEntrada(String texto) {
		Scanner scanner = new Scanner(System.in);
		System.out.print(texto);
		String entrada = scanner.nextLine();
		return entrada;
	}

	// Método de espera
	public static void wait(int tempo) {
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
