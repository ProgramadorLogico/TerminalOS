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

// Classe que emula o sistema operacional falso
class Emulador {
	
	// Variáveis
	private static boolean sistemaRodando = true;
	private static boolean usuarioLogado = false;
	public static Scanner scanner = new Scanner(System.in);
	private static String entrada = null;
	private static boolean sistemaInstalado = false;
	private static List<String> comandos = new ArrayList<> (Arrays.asList("listCommands", "version", "shotdown"));
	
	// Construtor do sistema
	public Emulador() {
		
		// Inicialização falsa do sistema
		inicializar(1);
		
		// Loop de instalação
		while (!sistemaInstalado) {
			
			// Pede a entrada inicial
			captarEntrada("system-install");
			
			// Verifica a entrada
			verificarEntrada(2);
		}
		
		// Loop principal
		while (sistemaRodando) {
			
			// Pede o comando
			captarEntrada("~");
			verificarEntrada(1);
		}
	}
	
	// Método de inicialização falsa
	public static void inicializar(int estadoDoSistema) {
		
		// Aqui começa a falsa inicialização
		waitTime(500);
		print(1, "╭──────────────────────────╮");
		print(1, "│      BIOS - PLACA MÃE    │");
		print(1, "╰──────────────────────────╯");
		waitTime(2000);
		print(1, "Bem-vindo(A) a o TerminalOS, seu sistema está sendo iniciado...");
		waitTime(2000);
		print(1, "Versão do kernel: 1.4-relativo");
		print(1, "CPU: CPU-genérica");
		print(1, "GERENCIADOR-DE-DISCOS: Novo dispositivo conectado, Pendrive-fotos-da-familia");
		print(1, "GERENCIADOR-DE-DISCOS: Partição SSD Sata montada");
		waitTime(2000 + (estadoDoSistema * 100));
		print(1, "GERENCIADOR-DE-USUARIOS: Entrando como root, primeira inicialização");
		waitTime(1000 + (estadoDoSistema * 100));
		print(1, "GERENCIADOR-DE-REDE: Configurando rede...");
		waitTime(800 + (estadoDoSistema * 100));
		print(1, "GERENCIADOR-DE-REDE: Endereço IP local atribuído: 999.999.9.99");
		print(1, "GERENCIADOR-DE-SEGURANÇA: Carregando sistema de segurança...");
		waitTime(1200 + (estadoDoSistema * 100));
		print(1, "GERENCIADOR-DE-SEGURANÇA: Sistema de segurança ativado e em modo de instabilidade");
		print(1, "GERENCIADOR-DE-ARQUIVOS: Verificando integridade do sistema...");
		waitTime(1000 + (estadoDoSistema * 100));
		print(1, "GERENCIADOR-DE-ARQUIVOS: Diretórios essenciais carregados");
		print(1, "SISTEMA: Seu sistema está pronto para funcionar");
		waitTime(2500 + (estadoDoSistema * 100));
	}
	
	// Método que recebe um valor e espera o valor recebido
	public static void waitTime(int tempo) {
		try {
			Thread.sleep(tempo); 
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			System.err.println("A espera foi interrompida.");
		}
	}
	
	// Método para captar a entrada do usuário
	public static void captarEntrada(String local) {
		
		// Verifica qual escolher
		if (!sistemaInstalado) {
		
			// Printa a mensagem e pede a entrada
			print(0, "root@EMULADOR:/" + local + "/# ");
			String entradaRecebida = scanner.nextLine();
			entrada = entradaRecebida;
		
		// Senão
		} else {
			
			// Printa a mensagem e pede a entrada
			print(0, "admin1@EMULADOR:" + local + "$ ");
			String entradaRecebida = scanner.nextLine();
			entrada = entradaRecebida;
		}
	}
	
	// Método de print
	public static void print(int tipo, String mensagem) {
		
		// Verifica o tipo
		if (tipo == 0) {
			System.out.print(mensagem);
		} else if (tipo == 1) {
			System.out.println(mensagem);
		} else if (tipo == 2) {
			System.err.println(mensagem);
		}
	}
	
	// Método que verifica a entrada
	public static void verificarEntrada(int entradaAVerificar) {
		
		// Se for 1
		if (entradaAVerificar == 1) {
			
			// Verifica a entrada
			switch (entrada) {
				
				// Caso seja listComands
				case "listCommands":
					listarComandos();
					break;
				
				// Caso seja version
				case "version":
					exibirVersao();
					break;
					
				// Caso seja shutdown
				case "shutdown":
					desligarSistema();
					break;
			}
		
		// Se for 2
		} else if (entradaAVerificar == 2 && !sistemaInstalado) {
			
			// Verifica a entrada
			switch (entrada) {
				
				// Caso seja installSystem
				case "installSystem":
					instalacaoFalsa();
					break;
				
				// Caso não seja nenhum
				default:
					print(2, "ROOT: Comando inválido!");
					print(1, "SISTEMA: Foi detectado que o sistema inteiro não foi instalado execute installSystem para instalar o sistema completo");
					break;
			}
		}
	}
	
	// Método que cria uma instalação falsa
	public static void instalacaoFalsa() {
		
		// Aqui começa a falsa instalação do sistema
		waitTime(1500);
		print(1, "Iniciando a instalação do TerminalOS...");
		waitTime(2000);
		print(1, "INSTALADOR: Localizando dispositivo de destino...");
		waitTime(1200);
		print(1, "INSTALADOR: Criando tabela de partições GPT...");
		waitTime(2000);
		print(1, "INSTALADOR: Formatando partição de sistema em ext4...");
		waitTime(2000);
		print(1, "INSTALADOR: Copiando arquivos do sistema base...");
		waitTime(1000);
		print(1, "  ↳ [█░░░░░░░░░] 10% - Extraindo pacotes do kernel...");
		waitTime(5000);
		print(1, "  ↳ [████░░░░░░] 40% - Configurando utilitários de linha de comando...");
		waitTime(1800);
		print(1, "  ↳ [███████░░░] 70% - Instalando dependências e bibliotecas Java...");
		waitTime(1500);
		print(1, "  ↳ [██████████] 100% - Arquivos copiados com sucesso!");
		print(1, "INSTALADOR: Gerando arquivos...");
		waitTime(1200);
		print(1, "INSTALADOR: Instalando carregador de inicialização em /dev/sda...");
		waitTime(1500);
		print(1, "GERENCIADOR-DE-USUARIOS: Criando usuário administrador...");
		waitTime(100);
		print(1, "GERENCIADOR-DE-ARQUIVOS: Criando diretórios padrão (/bin, /etc, /usr, /home)...");
		waitTime(1000);
		print(1, "INSTALADOR: Limpando arquivos temporários da instalação...");
		waitTime(800);
		print(1, "SISTEMA: Instalação do TerminalOS concluída com sucesso!");
		print(1, "SISTEMA: O TerminalOS está se preparando para a primeira inicialização, isso pode levar um tempo...");
		waitTime(10000);
		sistemaInstalado = true;
	}
	
	// Método para exibir a versão
	public static void exibirVersao() {
		
		// Exibição do comando version
		waitTime(700);
		print(1, "╭──────────────────────────╮");
		print(1, "│    INFORMAÇÕES DE VERSÃO │");
		print(1, "╰──────────────────────────╯");
		print(1, "SISTEMA: TerminalOS");
		print(1, "VERSÃO: Protótico");
		print(1, "ARQUITETURA: ext4");
		print(1, "KERNEL: 1.4-relativo");
	}
	
	// Método para desligar o sistema
	public static void desligarSistema() {
		
		// Aqui começa a sequência de desligamento do sistema
		waitTime(1500);
		print(1, "SISTEMA: Sistema está encerrando...");
		waitTime(1000);
		print(1, "GERENCIADOR-DE-ARQUIVOS: Salvando dados no disco...");
		waitTime(3000);
		print(1, "GERENCIADOR-DE-USUARIOS: Encerrando sessões de usuários...");
		waitTime(1200);
		print(1, "GERENCIADOR-DE-REDE: Desconectando da rede...");
		waitTime(1000);
		print(1, "GERENCIADOR-DE-SEGURANÇA: Desativando subsistemas...");
		waitTime(1000);
		print(1, "GERENCIADOR-DE-DISCOS: Desmontando partições do sistema...");
		waitTime(1800);
		print(1, "SISTEMA: Todos os serviços foram finalizados com segurança.");
		print(1, "BIOS: Sistema desligado.");
		waitTime(1500);
		
		// Encerra de verdade
		sistemaRodando = false;
		
		// Cria um novo Menu
		new Menu();
	}
	
	// Método que lista todos os comandos
	public static void listarComandos() {
		
		// Loop para listagem
		for(int i = 0; i < comandos.size(); i++) {
			System.out.println(comandos.get(i));
		}
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
	
	// Método que recebe um valor e espera o valor recebido
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
