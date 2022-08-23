# Introdução

Embora sejam lançadas versões recorrentemente, é preferível usar versões LTS pois são as versões que a Oracle continua oferecendo suporte por longos períodos.

## Java, o que é?

É uma linguagem de programação (regras léxicas)

É uma plataforma de execução e desenvolvimento

- Bibliotecas
- Ambientes de execução

### Aspectos notáveis

- Código compilado para bytecode e executada em máquina virtual (JVM)
- Portável, segura e robusta
- Roda em vários tipos de ambientes
- Domina o mercado corporativo desde o fim do século 20
- Padrão Android por muitos anos (atualmente é o Kotlin)

### Edições

- Java ME - micro edition - dispositivos embarcados e móveis - iot
- Java SE - standard edition - core - desktop e servidores
- Java EE - Enterprise Edition - aplicações corporativas

## Plataforma Java SE

JVM - Java Virtual Machine - máquina virtual do java - necessário para executar sistemas java

Compilação e Interpretação

**Compilador** - transforma código fonte em compilado que pode ser executado pelo computador (mais rápidas na execução pois já foram compiladas e menos suscetíveis a erros) - C, C++

**Interpretador** - pega o código e gradualmente transforma para código executável (mais fexíveis pois são executadas Just-in-time pelo interpretador da plataforma e mais suscetíveis a erros por causa dessa flexibilidade) - PHP, Javascript

**Linguagens pré-compiladas + máquina virtual** - (modelo híbrido aproveitando benefícios dos dois universos - compilação just-in-time - mais rápido do que a interpretação)- Java, C#

Estrutura de Uma aplicação Java

Aplicação composta por classes

Package - agrupamento lógico de classes relacionadas

Módulo (java 9+) - agrupamento de pacotes relacionados

Runtime - agrupamento físico

Aplicação - agrupamento de módulos relacionados

