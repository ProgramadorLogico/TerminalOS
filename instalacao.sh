#!/bin/bash
set -e
set -o pipefail

echo "1 - Instalar o TerminalOS"
echo "0 - Abortar"
read -p "Escolha uma opção acima: " opcao

if [[ "$opcao" = "1" ]]; then
	DIR="$HOME/.terminalos"

	if [[ -d ".terminalos" ]]; then
		echo "O diretório que precisa ser criado pelo TerminalOS já existe, o que deseja fazer?"
		echo "1 - Substituir a pasta existente e continuar a instalação"
		echo "0 - Cancelar operação"
		read -p "Escolha uma opção acima: " opcao
		if [[ "$opcao" = "1" ]]; then
			read -p "Sem volta! Certeza que deseja excluir aquele diretório? [S / N]" opcao
			if [[ "$opcao" = "S" || "$opcao" = "s" ]]; then
				rm -rf "$DIR"
				mkdir "$DIR"
				cd "$DIR"
			else
				echo "Abortando"
				exit 0
			fi 
		fi 
	else
		mkdir "$DIR"
		cd "$DIR"
	fi
	
	curl -L -o "Logo.png" "https://github.com/ProgramadorLogico/TerminalOS/raw/main/Arquivos%20para%20publica%C3%A7%C3%A3o/Fotos%20do%20jogo/PNG/Logo.png"

	echo "1 - Baixar o executável Java"
	echo "2 - Baixar o executável Linux"
	read -p "Escolha uma opção acima: " opcao
	
	if [[ "$opcao" = "1" ]]; then
		curl -L -o "TerminalOS V - P.jar" "https://github.com/ProgramadorLogico/TerminalOS/raw/refs/heads/main/V%20-%20P1.0/TerminalOS%20V%20-%20P.jar"
		chmod +x "TerminalOS V - P.jar"
		EXEC_CMD="java -jar \"$DIR/TerminalOS V - P.jar\""
	else
		curl -L -o "TerminalOS V - P" "https://github.com/ProgramadorLogico/TerminalOS/raw/refs/heads/main/V%20-%20P1.0/TerminalOS%20V%20-%20P"
		chmod +x "TerminalOS V - P"
		EXEC_CMD="\"$DIR/TerminalOS V - P\""
	fi
	
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
elif [[ "$opcao" = "0" ]]; then
	echo "Abortando"
	exit 0
else
	echo "Opção inválida, abortando"
	exit 0
fi
