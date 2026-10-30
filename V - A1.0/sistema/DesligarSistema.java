/*
 * Este arquivo apenas executa a tarefa da inicialização falsa do sistema
 */
 
package sistema;

import utilidades.Ferramentas;

public class DesligarSistema {

	// Construtor
	public DesligarSistema() {
		log("");
		log("╔════════════════════╗");
		log("║     TerminalOS     ║");
		log("╚════════════════════╝");	
		log("O sistema está encerrando...");
		log("Verificando se há dependências soltas...");
		wait(2500);
		log("Dependências soltas encontradas");
		log("Eliminando dependências...");
		wait(1000);
		log("Dependências eliminadas");
		log("Desligando servidor gráfico...");
		wait(1000);
		log("");
		log("descarregarServidorGrafico: AVISO O servidor gráfico não foi iniciado");
		log("");
		wait(3000);
		log("Processando...");
		wait(1000);

		animacao();
		
		log("");
		log("Pronto, problema resolvido");
		log("Sistema totalmente pronto para o encerramento");
		log("Sistema encerrado");
		log("");
		log("╔══════════════╗");
		log("║     BIOS     ║");
		log("╚══════════════╝");
		log("Sinal de desligamento recebido");
		log("Desconectando do SSD / HD");
		wait(1000);
		log("Cortando energia de circuitos...");
		wait(500);
		log("Cortando a energia da fonte");
		wait(1500);
		log("Computador desligado");
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

	private static void animacao() {
		char[] frames = {'|', '/', '-', '\\'};
        
        for (int i = 0; i < 30; i++) {
            char atual = frames[i % frames.length];
            System.out.print("\rProcessando... " + atual);
            System.out.flush();
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("");
        System.out.println("Processamento concluido");
	}
}
