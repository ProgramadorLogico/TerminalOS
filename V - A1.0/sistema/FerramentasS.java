package sistema;

import utilidades.Ferramentas;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class FerramentasS {
	public FerramentasS() {}

	public static void verificarComando(String entrada) {
		switch (entrada) {
			case "help":
				Comandos.help();
				break;
			case "ver":
				Comandos.ver();
				break;
			case "rand":
				Comandos.rand();
				break;
			case "shutdown":
				Comandos.desligar();
				break;
			case "about":
				Comandos.about();
				break;
			case "":
				break;
			default:
				Ferramentas.log("Comando inválido! Digite help para listar os comandos");
				break;
		}
	}

	public static void lerArquivo(String caminho, String nome) {
		try {
			String conteudo = Files.readString(Path.of(caminho));
			System.out.print(conteudo);
		} catch (IOException e) {
			System.out.println("Erro ao ler o arquivo " + nome);
		}
	}
}
