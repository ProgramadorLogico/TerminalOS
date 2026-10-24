/*
 * Este arquivo se dedica a criar o Menu do projeto, onde futuramente poderá haver outros sistemas
 * mas por enquanto é o que temos, ele serve para servir de barreira entre o sistema e o usuário
 * pedindo se ele quer realmente iniciar o sistema ou sair.
 */

package menu;

// Imports
import java.util.Scanner;
import sistema.Sistema;
import utilidades.Ferramentas;

public class Menu {

	// Variáveis públicas
	public static Scanner scanner = new Scanner(System.in);

	// Variáveis privadas
	private static boolean rodando = true;
	private static String entrada = null;

	// Construtor
	public Menu() {

		// Exibe os logs iniciais
		log("Bem-vindo(A) ao menu de emulação do TerminalOS");
		log("O menu está carregando...");
		log("Nenhuma dependência a resolver");

		// Exibe o título
		log("");
		log("╔═══════════════════════════╗");
		log("║     Menu - TerminalOS     ║");
		log("╚═══════════════════════════╝");
		log("");
		log("1 - Iniciar sistema");
		log("0 - Sair");

		while(rodando) {

			// Pega a entrada
			log("");
			entrada = Ferramentas.captarEntrada("Escolha uma opção acima: ");

			// Verifica a entrada
			switch(entrada) {
				case "1":
					log("Opção 1 escolhida");
					log("Procurando o arquivo de BIOS simulada...");
					Ferramentas.wait(1000);
					log("BIOS simulada encontrada");
					log("Iniciando emulação...");
					Ferramentas.wait(5000);
					new Sistema();
					break;

				case "0":
					log("Encerrando o menu...");
					log("Nenhuma dependência a resolver");
					log("Menu encerrado");
					rodando = false;
					System.exit(0);
					break;

				default:
					log("ERRO: Nenhuma opção válida encontrada");
					log("Tente novamente");
					break;
			}
		}
	}

	// Método de exibição de logs
	public static void log(String texto) {
		Ferramentas.log(texto);
	}
}
