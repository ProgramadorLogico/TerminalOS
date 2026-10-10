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

# 💻 TerminalOS

Bem-vindo(a) ao **TerminalOS**! 

O **TerminalOS** é uma simulação de sistema operacional em linha de comando (CLI), desenvolvida inteiramente em Java para ambientes **Linux**. O projeto tem como objetivo proporcionar uma experiência leve, modular e interativa diretamente no terminal, priorizando aprendizado prático e estética limpa sem a necessidade de máquinas virtuais ou emuladores pesados.

---

> [!NOTE]
> **Fase Atual — Alpha 1.0:** O sistema inclui novos utilitários de comandos curtos, simulação de hardware via loteamento aleatório de discos e um assistente interativo de instalação.

> [!TIP]
> **Dica de Uso:** Ao iniciar o emulador, digite `help` ou `cmds` para visualizar todos os comandos disponíveis no sistema.

---

## 🚀 Funcionalidades da Versão Alpha 1.0

* **Comandos Concisos (Regra de 5 Letras):** Interface otimizada com nomes de comandos rápidos e intuitivos (`help`, `ver`, `cls`, `echo`, `app`, `meme`).
* **Instalador Interativo:** Assistente de instalação que identifica partições e dispositivos conectados antes de configurar o sistema.
* **Gestão de Dispositivos Simulada:** Sorteio dinâmico de hardware conectado (Pendrives, HDs, SSDs) via `ArrayList` e `Random`.
* **Central de Aplicativos (`app`):** Menu de acesso aos utilitários e miniaplicativos do TerminalOS.
* **Interface Unicode Suave:** Layout estruturado com molduras e cantos arredondados (`╭ ─ ╮`).

---

## 📌 Comandos Disponíveis

| Comando | Descrição |
| :--- | :--- |
| `help` / `cmds` | Lista todos os comandos disponíveis no TerminalOS. |
| `ver` / `about` | Exibe os detalhes da versão Alpha 1.0 e do Kernel virtual. |
| `cls` | Limpa a tela do terminal. |
| `echo <texto>` | Repete a mensagem informada na tela. |
| `app` | Abre o menu e seletor de aplicativos simulados. |
| `meme` | Exibe uma arte ASCII / meme no terminal. |
| `shutdown` | Encerra a sessão com segurança e finaliza os serviços. |

---

## 🛠️ Estrutura do Código-Fonte

* **`Main.java`**: Ponto de entrada que chama o boot e o menu principal.
* **`Menu.java`**: Controla o fluxo de entrada, instalação inicial e seleção de opções.
* **`Emulador.java`**: O *kernel/shell* do sistema, responsável pelo loop de leitura e execução de comandos.

---

## ⚙️ Compilação e Execução (Linux)

### 1. Compilar os arquivos `.java`:
```bash
javac Main.java Menu.java Emulador.java
