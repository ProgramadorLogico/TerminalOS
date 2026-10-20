// Imports
import java.util.Scanner;

public class Menu {

	// Variáveis públicas
	public static Scanner scanner = new Scanner(System.in);

	// Variáveis privadas
	private static boolean rodando = true;
	private static String entrada = null;

	// Construtor
	public Menu() {

		// Exibe os logs iniciais
		log("Bem-vindo(A) ao menu de emulação do TerminalOS, o menu está carregando...");
		log("Nenhuma dependência a resolver");
		log("Programa iniciado");

		// Exibe o título
		log("╔═══════════════════════════╗");
		log("║     Menu - TerminalOS     ║");
		log("╚═══════════════════════════╝");
		log("");
		log("1 - Iniciar sistema");
		log("2 - Sair");

		while(rodando) {

			// Pega a entrada
			entrada = Ferramentas.captarEntrada("Escolha uma opção acima: ");

			// Verifica a entrada
			switch(entrada) {
				case "1":
					log("Opção 1 escolhida");
					log("O menu está sendo encerrado");
					log("Todas as dependências resolvidas");
					Ferramentas.wait(5000);
					new Sistema();
					break;

				case "2":
					log("Encerrando o menu");
					log("Volte sempre!");
					rodando = false;
					System.exit(0);
					break;
			}
		}
	}

	// Método de exibição de logs
	public static void log(String texto) {
		Ferramentas.log(texto);
	}
}
