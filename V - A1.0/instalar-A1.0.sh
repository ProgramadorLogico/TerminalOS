# Trava contra falhas
set -e
set -o pipefail

# Variáveis
EXECUTAVEL="java -jar $HOME/.terminalos/TerminalOS.jar"
ICON="$HOME/.terminalos/Logo.png"
PASTA=".terminalos"

# Mostra as opções e pega a resposta do usuário
echo "1 - Instalar TerminalOS"
echo "0 - Cancelar"
read -p "Escolha uma opção acima: " opcao

# Válida a resposta
if [[ "$opcao" = "1" ]]; then
	# Caso escolha instalar

	if [[ -d "$PASTA" ]]; then
		echo "1 - Substituir pasta (SEM VOLTA!)"
		echo "0 - Cancelar instalação"
		read -p "O projeto precisa de uma pasta que já existe na pasta atual, escolha um opção acima: " opcao
		
		if [[ "$opcao" = "1" ]]; then
			rm -rf "$PASTA"
			mkdir "$PASTA"
			cd "$PASTA"
		elif [[ "$opcao" = "0" ]]; then
			echo "Cancelando operação..."
			exit 0
		else
			echo "Nenhuma opção válida escolhida, cancelando..."
			exit 1
		fi
	else
		mkdir "$PASTA"
		cd "$PASTA"
	fi
	
	# Pede qual tipo baixar
	echo "1 - Executável Java (Recomendado)"
	echo "2 - Executável Nativo Linux"
	read -p "Escolha uma opção acima: " opcao

	# Válida a opção
	if [[ "$opcao" = "1" ]]; then
		# Baixa o .jar
		curl -L -o "TerminalOS.zip" "https://github.com/ProgramadorLogico/TerminalOS/raw/refs/heads/main/V%20-%20A1.0/TerminalOS-Java.zip"
		unzip "TerminalOS.zip"
		rm -rf "TerminalOS.zip"
		chmod +x "TerminalOS.jar"
	elif [[ "$opcao" = "2" ]]; then
		# Baixa o nativo
		curl -L -o "TerminalOS.zip" "https://github.com/ProgramadorLogico/TerminalOS/raw/refs/heads/main/V%20-%20A1.0/TerminalOS-nativo.zip"
		unzip "TerminalOS.zip"
		rm -rf "TerminalOS.zip"
		chmod +x "TerminalOS.jar"
	else
		# Caso nenhuma seja escolhida
		echo "Nenhuma escolhida, cancelando operação..."
		exit 1
	fi

	# Baixa a logo
	curl -L -o Logo.png "https://github.com/ProgramadorLogico/TerminalOS/raw/refs/heads/main/Recursos/Logo.png"

	# Baixa o arquivo de versões (VERSOES.md)
	curl -L -o VERSOES.md "https://github.com/ProgramadorLogico/TerminalOS/raw/refs/heads/main/VERSOES.md"

	# Criar o atalho no menu
	cat << EOF > ~/.local/share/applications/terminalos.desktop
[Desktop Entry]
Version=1.0
Type=Application
Name=TerminalOS
Comment=Sistema operacional simulado de texto
Exec=$EXECUTAVEL
Path=$HOME/.terminalos/
Icon=$ICON
Terminal=true
Categories=Game;
EOF
	chmod +x ~/.local/share/applications/terminalos.desktop
elif [[ "$opcao" = "0" ]]; then
	# Caso escolha cancelar
	echo "Cancelando operação..."
	exit 0
else
	# Caso não digite algo válido
	echo "Nenhuma opção válida escolhida, cancelando operação..."
	exit 1
fi
