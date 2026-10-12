# Sistema Bancário

Simulador de banco desenvolvido em Java, com interface de janelas (`JOptionPane`), para praticar organização de código em classes, tratamento de erros e validação de entrada. O projeto está **em desenvolvimento**.

## Funcionalidades

- Login com senha
- Menu com seis opções:
  1. Consultar saldo
  2. Sacar dinheiro
  3. Depositar
  4. Investir (transfere valor do saldo para o investimento)
  5. Ver investimento com rendimento de 0,5%
  6. Sair
- Validação de entradas:
  - letras no lugar de números não fecham o programa
  - valores negativos ou zero são recusados
  - saque ou investimento maior que o saldo é negado
  - o botão Cancelar e opções inválidas são tratados

## Tecnologias

- Java
- Swing (`JOptionPane`) para as janelas de entrada e mensagens

## Como executar

### Pré-requisito

Ter o [JDK](https://adoptium.net/) instalado. Para conferir, rode no terminal:

```bash
java -version
```

### Passo a passo

1. Clone o repositório:

```bash
git clone https://github.com/Rafael4antunes/NOME-DO-REPOSITORIO.git
cd NOME-DO-REPOSITORIO
```

2. Compile:

```bash
javac -d out Banco.java Conta.java
```

3. Execute:

```bash
java -cp out project.Banco
```

> Também é possível abrir a pasta em uma IDE (NetBeans, IntelliJ, Eclipse) e rodar a classe `Banco`.

A senha de acesso está definida no código, no método `login` da classe `Banco`.

## Estrutura do projeto

```
├── Banco.java    # login e menu principal
├── Conta.java    # saldo, investimento e operações da conta
├── .gitignore
└── README.md
```

- **`Banco`:** conversa com o usuário (senha e menu) e chama as operações.
- **`Conta`:** guarda o saldo e o investimento e executa depósito, saque, investimento e rendimento.

## O que estou praticando

- Separação de responsabilidades entre classes
- Laço `while` e `switch` para menus
- Tratamento de exceções com `try/catch`
- Validação de entrada do usuário
- Janelas simples com `JOptionPane`

## Próximos passos

- [ ] Tornar `saldo` e `investimento` atributos privados, com uma conta criada como objeto
- [ ] Criar `ContaPoupanca` herdando de `Conta`, para o investimento e o rendimento
- [ ] Criar uma exceção própria para saldo insuficiente
- [ ] Permitir várias contas, cada uma com a sua senha, guardadas em um `ArrayList`
- [ ] Adicionar transferência entre contas
- [ ] Limitar as tentativas de login
- [ ] Guardar a senha de forma segura (hash), em vez de texto fixo no código
- [ ] Criar extrato das operações
- [ ] Escrever testes com JUnit

## Autor

Feito por **Rafael Antunes** — estudante de Ciência da Computação.

[GitHub](https://github.com/Rafael4antunes)
