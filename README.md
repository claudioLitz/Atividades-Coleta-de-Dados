# Atividades: Coleta de Dados e Automação Industrial

Este repositório contém uma série de exercícios práticos desenvolvidos em **Java**, focados em lógica de programação aplicada a cenários de automação, como leitura de sensores, controle de tanques e histórico de produção.

## 📂 Estrutura do Projeto

O projeto está dividido em pastas por categorias de exercícios, conforme as atividades realizadas em 03/02:

* **Leitura de Sensores (`Exercicio1.java`)**: Simulação de registro de sensores (ex: PT100) capturando nome e valor de leitura.
* **Controle de Segurança (`Exercicio2.java`)**: Implementação de lógica de intertravamento para nível de tanque com alertas de nível crítico (alto/baixo).
* **Média de Produção (`Exercicio3.java`)**: Cálculo de média horária de produção utilizando loops e geração de dados aleatórios para simulação.
* **Histórico de Estado (`Exercicio4.java`)**: Análise de funcionamento de máquinas através de arrays, contabilizando o tempo em operação.
* **Conversor de Escala (`Exercicio5.java`)**: Função para converter valores brutos de CLP (resolução de 10 bits: 0-1023) para escala percentual (0-100%).

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java 
* **Ambiente:** WSL (Ubuntu) / Windows
* **Ferramentas:** Git, VS Code

## 🚀 Como Executar

Para rodar qualquer um dos exercícios, certifique-se de ter o JDK instalado e utilize os comandos abaixo no terminal:

```bash
# Compilar o arquivo (exemplo com Exercício 1)
javac Exercicio1.java

# Executar o programa
java Exercicio1
