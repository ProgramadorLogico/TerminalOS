package sistema;

import utilidades.Ferramentas;
import java.util.Random;

public class Comandos {
	public Comandos() {
		System.out.println("Comandos");
	}

	public static void help() {
		Ferramentas.log("HELP");
		for (int i = 0; i < Sistema.comandos.size(); i++) {
			System.out.println((i + 1) + " - " + Sistema.comandos.get(i));
		}
	}

	public static void ver() {
		FerramentasS.lerArquivo("../VERSOES.md", "Versões");

		System.out.print("Versão atual: ");
		FerramentasS.lerArquivo("versaoAtual.txt", "Versão atual");
	}

	public static void rand() {
		Random random = new Random();
		int numeroAleatorio = random.nextInt(999999);
		System.out.println(numeroAleatorio);
	}

	public static void desligar() {
		Sistema.setLigado(false);
	}

	public static void about() {
		FerramentasS.lerArquivo("README.md", "README");
	}
}
