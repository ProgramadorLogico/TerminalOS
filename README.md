# TerminalOS

O **TerminalOS** é um projeto open-source que simula um sistema operacional baseado em linha de comando (CLI), desenvolvido em Java. 

O objetivo do projeto é oferecer um ambiente interativo totalmente focado em texto — sem a necessidade de emuladores pesados, máquinas virtuais ou formatação de hardware. Ele roda diretamente no terminal, permitindo explorar conceitos de lógica de programação e manipulação de comandos.

---

# Proposta do Projeto

* **Interface 100% CLI:** Operação baseada exclusivamente em comandos digitados pelo usuário.
* **Execução Leve:** Roda diretamente pela JVM (Java Virtual Machine), sem impacto no sistema operacional hospedeiro.
* **Modularidade:** Estruturado em classes para facilitar a adição de novos comandos, aplicativos internos e utilitários.
* **Protótipo Interativo:** Conta com um menu inicial para gerenciar a execução da emulação e o encerramento do sistema.

---

# Estrutura e Arquitetura Inicial

O projeto é organizado em módulos simples para manter a separação de responsabilidades:

1. **Main**: Ponto de entrada do programa que inicializa a aplicação.
2. **Menu**: Gerencia a interface de início do sistema e o direcionamento do fluxo de execução.
3. **Emulador**: O núcleo (*kernel/shell*) do TerminalOS, responsável pelo loop principal de leitura, interpretação e execução dos comandos digitados.

---

# Comandos Básicos (Versão Beta 1.0)

* `listCommands` — Exibe a lista de comandos disponíveis no sistema.
* `version` — Mostra a versão atual do TerminalOS.
* `shutdown` — Finaliza a sessão do emulador e retorna ao menu de controle.

---

# Visão de Futuro

Nas próximas versões, o projeto pretende expandir suas funcionalidades com:
- [ ] Sistema de Arquivos Virtual (VFS) para criar e navegar por diretórios.
- [ ] Um mini editor de código/texto integrado executado no próprio terminal.
- [ ] Suporte a utilitários e jogos baseados em texto.

---

# Como Executar

1. Certifique-se de ter o **JDK (Java Development Kit)** instalado em sua máquina.
2. Clone o repositório em sua máquina local.
3. Compile os arquivos Java:
