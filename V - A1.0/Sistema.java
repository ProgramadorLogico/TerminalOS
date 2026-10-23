/*
 * Este arquivo é responsável pela parte principal do programa
 * ele é o arquivo de execução fake do sistema, sem ele o
 * TerminalOS não existe
 */

public class Sistema {

	// Construtor
	public Sistema() {
		new IniciarSistema();
		new Menu();
	}

	// Método de encurtamento da ferramenta de log
	private static void log(String texto) {
		Ferramentas.log(texto);
	}

	// Método de encurtamento da ferramenta wait
	private static void wait(int tempo) {
		Ferramentas.wait(tempo);
	}
}
