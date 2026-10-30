/*
 * Este arquivo é responsável pela parte principal do programa
 * ele é o arquivo de execução fake do sistema, sem ele o
 * TerminalOS não existe
 */

package sistema;

import utilidades.Ferramentas;
import menu.Menu;
import java.util.ArrayList;
import java.util.Arrays;

public class Sistema {

	// Variáveis privadas
	private static String input = null;
	private static boolean ligado = false;

	// Listas públicas
	public static ArrayList<String> comandos = new ArrayList<> (Arrays.asList("help", "ver", "rand", "shutdown", "about"));

	// Construtor
	public Sistema() {
		new IniciarSistema();
		while (ligado) {
			input = Ferramentas.captarEntrada("Usuario1@MeuPC-$: ");
			FerramentasS.verificarComando(input);
		}
		new DesligarSistema();
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

	public static void setLigado(boolean novoValor) {
		ligado = novoValor;
	}
}
