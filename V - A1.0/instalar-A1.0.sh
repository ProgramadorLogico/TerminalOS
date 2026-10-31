#!bin/bash

set -e
set -o pipefail

echo "1 - Instalar TerminalOS"
echo "0 - Cancelar"
read -p "Escolha uma opção acima: " opcao

if [[ "$opcao" = "1" ]]; then
	# Escrever depois
elif [[ "$opcao" = "0" ]]; then
	# Escrever depois
fi
