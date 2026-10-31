/*
 * Este arquivo se dedica a guardar os comandos utilizados pelo sistema, sendo importante por executar várias tarefas
 * que o próprio sistema, essa é a peça que falta para tudo andar
 */

package sistema;

import utilidades.Ferramentas;
import java.util.Random;

public class Comandos {
	public Comandos() {}

	public static void help() {
		Ferramentas.log("HELP");
		for (int i = 0; i < Sistema.comandos.size(); i++) {
			System.out.println((i + 1) + " - " + Sistema.comandos.get(i));
		}
	}

	public static void ver() {
		Ferramentas.log("VER");
		FerramentasS.lerArquivo("../VERSOES.md", "Versões");

		System.out.print("Versão atual: ");
		FerramentasS.lerArquivo("versaoAtual.txt", "Versão atual");
	}

	public static void rand() {
		Ferramentas.log("RAND");
		Random random = new Random();
		int numeroAleatorio = random.nextInt(999999);
		System.out.println(numeroAleatorio);
	}

	public static void desligar() {
		Ferramentas.log("SHUTDOWN");
		Sistema.setLigado(false);
	}

	public static void about() {
		Ferramentas.log("ABOUT");
		FerramentasS.lerArquivo("README.md", "README");
	}
}
