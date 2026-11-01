// Declaração de variáveis
const botaoIrParaInstalacao = document.getElementById("irParaInstalacao");
const botaoIrParaDocumentacao = document.getElementById("irParaDocumentacao");

// Verifica se algum botão foi clicado
botaoIrParaInstalacao.addEventListener("click", irParaInstalacao);
botaoIrParaDocumentacao.addEventListener("click", irParaDocumentacao);

// Função para ir para área de instalação
function irParaInstalacao() {
	const destino = document.getElementById("instalacao");
	destino.scrollIntoView({ behavior: 'smooth' });
}

// Função que leva a tela para a sessão de documentação
function irParaDocumentacao() {
	const destino = document.getElementById("documentacao");
	destino.scrollIntoView({ behavior: 'smooth' });
}
