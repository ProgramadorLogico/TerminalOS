set -e
set -o pipefail

clear
echo "Iniciando execução do TerminalOS..."
echo "Limpando arquivos de copilação..."
find . -name "*.class" -type f -delete
echo "Arquivos limpos"
echo "Iniciando copilação do projeto..."
javac Main.java
echo "Projeto copilado"
echo "Executando o projeto..."
echo ""
java Main
echo""
echo "Projeto executado"
