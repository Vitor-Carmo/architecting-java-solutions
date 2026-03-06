# ☕ Java POO: Mastering Object-Oriented Programming

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://www.oracle.com/java/)
[![OOP](https://img.shields.io/badge/OOP-Principles-blue?style=for-the-badge)](https://en.wikipedia.org/wiki/Object-oriented_programming)

Este repositório contém a jornada completa de especialização em **Programação Orientada a Objetos**, desenvolvida durante o curso da **iTalents**. O projeto evolui de classes fundamentais até a construção de um sistema de concessionária robusto, com tratamento de exceções customizadas e lógica de negócio avançada.

---

## 🏗️ Estrutura do Repositório

### 📍 Unidade 01: Fundamentos e Encapsulamento
O foco inicial foi a transição do pensamento procedural para o orientado a objetos, garantindo que cada classe tenha uma responsabilidade única.
* **Modelagem de Entidades:** Implementação de classes como `Pessoa`, `Livro`, `Animal` e `Funcionario`.
* **Lógica de Estado:** Controle de comportamento (ex: ligar/desligar em `Carro`) e cálculos financeiros em `Produto`.
* **Destaque:** Implementação de métodos com responsabilidades claras e nomenclatura coerente.

### 📍 Unidade 02: O Poder do Polimorfismo
Aqui o projeto ganhou escalabilidade através do uso de herança e interfaces.
* **Hierarquia de Classes:** Criação de estruturas complexas para `Veiculo` (Carro/Moto) e `ContaBancaria`.
* **Sobrescrita (@Override):** Especialização de comportamentos, como o método `emitirSom()` para diferentes tipos de animais.
* **Interfaces e Abstração:** Implementação da interface `Autenticavel` e classes abstratas para `FormaGeometrica`.
* **Coleções Polimórficas:** Uso de `ArrayList<Animal>` para manipular diferentes tipos de objetos de forma genérica.

#### 📊 Comparativo de Implementação
| Conceito | Aplicação Prática | Benefício |
| :--- | :--- | :--- |
| **Herança** | `ContaCorrente` herda de `ContaBancaria` | Reuso de código |
| **Interface** | `Usuario` implementa `Autenticavel` | Padronização de contratos |
| **Sobrecarga** | `Calculadora.soma(int, int)` vs `soma(double, double)` | Flexibilidade de métodos |

---

### 📍 Unidade 03: Robustez e Tratamento de Erros
Foco em tornar o software "à prova de falhas" através do sistema de Exceções do Java.
* **Captura (Try-Catch):** Tratamento de erros comuns como `ArithmeticException` (divisão por zero) e `FileNotFoundException`.
* **Lançamento (Throw):** Validações rigorosas de regras de negócio (ex: idade inválida ou temperatura abaixo do zero absoluto).
* **Custom Exceptions:** Criação de exceções personalizadas como `SaldoInsuficienteException` e `SenhaInvalidaException`.

> **Trecho de Código - Exceção Customizada:**
```java
public class VeiculoIndisponivelException extends Exception {
    public VeiculoIndisponivelException(String mensagem) {
        super(mensagem);
    }
}
```

---


### 📍 Unidade 04: Projeto Final - Sistema de Concessionária
O fechamento do curso consolidou todos os conceitos em um sistema funcional de gestão de veículos e clientes.

* **Business Intelligence**: Método de sugestão de veículo por biotipo do cliente.
* **Análise Financeira**: Relatório refatorado para apresentar lucro ou perda real em cada venda.
* **Refatoração Avançada**: Unificação de métodos de exibição para garantir o princípio DRY (Don't Repeat Yourself).
* * **Refatoração Avançada**: Menu interativo ajustado para navegação intuitiva e exibição de dados cadastrados.

---

## 🏆 Masterpieces: Destaques Técnicos

Neste curso, busquei elevar o nível das implementações para além do básico acadêmico, focando em padrões que tornam o software profissional.

### 1. 🧬 Arquitetura de Herança e Interfaces
A base do projeto final foi construída sobre uma hierarquia sólida. Utilizei **Interfaces** para definir contratos de comportamento (como `Autenticavel`) e **Classes Abstratas** para garantir que subclasses como `Carro` e `Moto` seguissem um molde rigoroso, mas flexível.
* **Benefício:** Facilidade extrema para adicionar novos tipos de veículos sem quebrar o sistema existente.



### 2. 🛡️ Motor de Resiliência (Custom Exceptions)
Em vez de permitir que o Java lançasse erros genéricos, desenvolvi um ecossistema de exceções personalizadas (`SaldoInsuficienteException`, `SenhaInvalidaException`, etc.).
* **Destaque:** Implementação de lógica defensiva que valida regras de negócio antes mesmo da execução do método, garantindo a integridade dos dados.

### 3. 📉 BI: Análise de Lucratividade e Sugestão por Biotipo
No projeto da Concessionária, implementei um motor de decisão:
* **Sugestão Inteligente:** Um algoritmo que cruza dados do perfil/biotipo do cliente para sugerir o veículo ideal.
* **Relatório de Performance:** Refatoração de métodos para calcular em tempo real o lucro ou prejuízo de cada venda, centralizando a lógica financeira e evitando duplicidade de código (DRY).



---

## ⭐ Reconhecimento e Feedback

O projeto foi avaliado com notas máximas, recebendo feedbacks que destacam a preparação para o mercado:

> "Vitor, sua apresentação foi impecável. Você demonstrou domínio consistente de POO, com uma estrutura bem integrada e respeitando os princípios de herança e organização. Seu nível técnico está acima da média." 🚀

**Pontos Fortes destacados pelo Instrutor:**
* **Comunicação Técnica:** Clareza e segurança ao justificar decisões arquiteturais em vídeo.
* **Maturidade de Código:** Uso adequado de encapsulamento (`private` + Getters/Setters) e separação de responsabilidades.
* **Visão Crítica:** Capacidade de vasculhar o código em busca de bugs e refatorar para melhor performance.

---

## 🛠️ Tecnologias e Pilares Aplicados
* **Java 17+**
* **Encapsulamento:** Proteção de dados e estado dos objetos.
* **Herança & Polimorfismo:** Reuso e especialização de comportamento.
* **Abstração:** Modelagem fiel de entidades do mundo real.
* **Tratamento de Exceções:** Fluxos de erro robustos e amigáveis.

---

## 🚀 Como Executar
1. Clone o repositório.
2. Cada Unidade está separada em seu próprio diretório para facilitar o estudo.
3. Para o sistema completo, execute a classe principal na `Unidade_04`.

---
**Desenvolvido por Vitor** - *Construindo sistemas robustos através da Orientação a Objetos.*

