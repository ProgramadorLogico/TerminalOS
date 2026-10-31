#!/bin/bash

set -e
set -o pipefail

echo "1 - Instalar o TerminalOS"
echo "0 - Abortar"
read -p "Escolha uma opção acima: " opcao

case "$opcao" in
	"1")
		DIR="$HOME/.terminalos"
		versao="P"

		# Verifica se a pasta existe
		if [[ -d "$DIR" ]]; then
			echo "O diretório que precisa ser criado pelo TerminalOS já existe, o que deseja fazer?"
			echo "1 - Substituir a pasta existente e continuar a instalação"
			echo "0 - Cancelar operação"
			read -p "Escolha uma opção acima: " opcao_dir
			if [[ "$opcao_dir" = "1" ]]; then
				read -p "Sem volta! Certeza que deseja excluir aquele diretório? [S / N] " confirm
				if [[ "$confirm" = "S" || "$confirm" = "s" ]]; then
					rm -rf "$DIR"
					mkdir -p "$DIR"
					cd "$DIR"
				else
					echo "Abortando"
					exit 0
				fi
			else
				echo "Abortando"
				exit 0
			fi
		else
			mkdir -p "$DIR"
			cd "$DIR"
		fi

		# Se a pasta for criada, baixa os arquivos de VERSOES.md e a Logo.png
		curl -L -o "Logo.png" "https://github.com/ProgramadorLogico/TerminalOS/raw/main/Arquivos%20para%20publica%C3%A7%C3%A3o/Fotos%20do%20jogo/PNG/Logo.png"
		curl -L -o "VERSOES.md" "https://github.com/ProgramadorLogico/TerminalOS/raw/refs/heads/main/VERSOES.md"

		# Pede qual versão
		echo "1 - Protótipo"
		echo "2 - Alpha 1.0"
		read -p "Digite o número correspondente à versão desejada: " versao_opcao

		case "$versao_opcao" in
			"1")
				versao="P"
				;;
			"2")
				versao="A1.0"
				;;
			*)
				versao="P"
				;;
		esac

		# Caso seja versãóo protótipo
		if [[ "$versao" == "P" ]]; then
			# Pede qual baixar
			echo "1 - Baixar o executável Java"
			echo "2 - Baixar o executável Linux"
			read -p "Escolha uma opção acima: " opcao_exec
			
			# Baixa o .jar
			if [[ "$opcao_exec" = "1" ]]; then
				curl -L -o "TerminalOS V - P.jar" "https://github.com/ProgramadorLogico/TerminalOS/raw/refs/heads/main/V%20-%20P1.0/TerminalOS%20V%20-%20P1.0.jar" 2>/dev/null || \
				curl -L -o "TerminalOS V - P.jar" "https://github.com/ProgramadorLogico/TerminalOS/raw/refs/heads/main/V%20-%20P1.0/TerminalOS%20V%20-%20P.jar"
				chmod +x "TerminalOS V - P.jar"
				EXEC_CMD="java -jar \"$DIR/TerminalOS V - P.jar\""
			
			# Baixa o nativo
			else
				curl -L -o "TerminalOS V - P" "https://github.com/ProgramadorLogico/TerminalOS/raw/refs/heads/main/V%20-%20P1.0/TerminalOS%20V%20-%20P"
				chmod +x "TerminalOS V - P"
				EXEC_CMD="\"$DIR/TerminalOS V - P\""
			fi
		elif [[ "$versao" = "A1.0" ]]; then

			# Baixa o .jar
			curl -L -o "TerminalOS V - A1.0.jar" "https://github.com/ProgramadorLogico/TerminalOS/raw/refs/heads/main/V%20-%20A1.0/TerminalOS.jar"
			chmod +x "TerminalOS V - A1.0.jar"
			EXEC_CMD="java -jar \"$DIR/TerminalOS V - A1.0.jar\""
		else
			echo "Nenhuma versão válida encontrada"
			exit 1
		fi

		# Cria o arquivo do menu
		mkdir -p ~/.local/share/applications
		cat << EOF > ~/.local/share/applications/terminalos.desktop
[Desktop Entry]
Version=1.0
Type=Application
Name=TerminalOS
Comment=Sistema operacional simulado de texto
Exec=$EXEC_CMD
Icon=$DIR/Logo.png
Terminal=true
Categories=Game;
EOF
		
		chmod +x ~/.local/share/applications/terminalos.desktop
		echo ""
		echo "Instalação concluída com sucesso!"
		;;
	"0")
		echo "Encerrando..."
		exit 0
		;;
	*)
		echo "Nada escolhido, encerrando..."
		exit 0
		;;
esac
