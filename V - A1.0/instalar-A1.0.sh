#!bin/bash

# Trava contra falhas
set -e
set -o pipefail

# Variáveis
EXECUTAVEL="java -jar $HOME/.terminalos/TerminalOS.jar"
ICON=""

# Mostra as opções e pega a resposta do usuário
echo "1 - Instalar TerminalOS"
echo "0 - Cancelar"
read -p "Escolha uma opção acima: " opcao

# Válida a resposta
if [[ "$opcao" = "1" ]]; then
	# Caso escolha instalar
	# Pede qual tipo baixar
	echo "1 - Executável Java (Recomendado)"
	echo "2 - Executável Nativo Linux"
	read -p "Escolha uma opção acima: " opcao

	# Válida a opção
	if [[ "$opcao" = "1" ]]; then
		# Baixa o .jar
		
	elif [[ "$opcao" = "2" ]]; then
		# Fazer depois
	else
		# Caso nenhuma seja escolhida
		echo "Nenhuma escolhida, cancelando operação..."
		exit 1
	fi

	

	# Criar o atalho no menu
	cat << EOF > ~/.local/share/applications/terminalos.desktop
[Desktop Entry]
Version=1.0
Type=Application
Name=TerminalOS
Comment=Sistema operacional simulado de texto
Exec=$EXECUTAVEL
Path=$HOME/.terminalos/
Icon=terminal
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
