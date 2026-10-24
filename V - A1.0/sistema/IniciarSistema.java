/*
 * Este arquivo trata-se apenas da inicialização fake do sistema, pode parecer exagero criar um novo arquivo
 * inteiro apenas para isso mas é melhor do que ficar sem entender o código Sistema.java pois o método é
 * enorme, é por uma boa causa.
 */
 
package sistema;

import utilidades.Ferramentas;

public class IniciarSistema {

	// Construtor
	public IniciarSistema() {
		log("");
		log("╔══════════════╗");
		log("║     BIOS     ║");
		log("╚══════════════╝");		
		log("Iniciando computador");		
		log("Fazendo verificação de hardware simples...");
		wait(1000);
		log("Status da verificação: Sucesso");
		wait(500);
		log("Conectando-se ao SSD / HD");
		wait(1500);
		log("Status da conexão: Sucesso");
		wait(250);
		log("Chamando arquivo de execução powerOnSystem.binary");
		wait(2000);
		log("Status da chamada: Sucesso");
		wait(500);
		log("");
		log("╔════════════════════╗");
		log("║     TerminalOS     ║");
		log("╚════════════════════╝");	
		log("Bem-vindo(A) ao TerminalOS, seu sistema será iniciado");
		log("Iniciando...");
		log("Carregando dependências...");
		wait(5000);
		log("Dependências carregadas");
		log("Verificando estado do Kernel...");
		wait(10000);
		log("Verificação concluída, Kernel em bom estado");
		log("Chamando arquivo preCarregarGraficos.java para execução da interface gráfica...");
		log("");
		wait(2000);
		log("ERRO! Palavra-chave, argumento, paramêtro, variável ou outro não foi encontrado!");
		log("	fi (servidorGrafico == servidorGrafico.preCarregar()) {");
		log("	↑");
		log("");
		log("Linha: 1567");
		log("Motivo: Argumento não especificado");
		log("Erros: 1");
		log("");
		wait(1000);
		log("A interface gráfica não pode ser carregada devido a um erro");
		log("Entrando em modo de funcionamento via texto");
		log("Por favor tente carregar a interface mais tarde");
		wait(5000);
		log("Seu sistema foi iniciado com êxito");
		log("Aproveite!");
		wait(500);
		log("");
	}

	// Método de print
	private static void log(String log) {
		Ferramentas.log(log);
	}

	// Método de esperar
	private static void wait(int tempo) {
		Ferramentas.wait(tempo);
	}
}
