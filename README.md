# Tratamento de exceções

- Uma exceção é qualquer condição de erro ou comportamento inesperado encontrado por um programa em execução
- Em Java, uma exceção é um objeto herdado da classe:
  - java.lang.Exception - o compilador obriga a tratar ou propagar
  - java.lang.RuntimeException - o compilador não obriga a tratar ou propagar
- Quando lançada, uma exceção é propagada na pilha de chamadas de métodos em execução, até que seja capturada (tratada) ou o programa seja encerrado

## Hierarquia de exceções do Java

https://docs.oracle.com/javase/10/docs/api/java/lang/package-tree.html

- Throwable
  - Error
    - OutOfMemoryError
    - VirtualMachineError
  - Exception
    - IOException
    - RuntimeException
      - IndexOfBoundsException
      - NullPointerException

<br/>

- O modelo de tratamento de Exceções permite que erros sejam tratados de uma forma flexível e consistente, usando boas práticas
- Vantagens:
  - Delega a lógica do erro para a classe responsável por conhecer as regras que podem ocasionar esse erro
  - Trata de forma organizada (inclusive hierárquica) exceções de tipos diferentes
  - A exceção pode carregar dados quaisquer

## Estrutura try-catch
- Bloco try
  - Contém o código que representa a execução normal do trecho de código que pode acarretar em uma exceção
- Bloco catch
  - Contém o código a ser executado caso uma exceção ocorra
  - Deve ser especificado o tipo da exceção a ser tratada (upcasting é permitido)

```java
try {

}
catch (ExceptionType e) {

}
catch (ExceptionType e) {

}
catch (ExceptionType e) {

}

```

## Bloco Finaly
- É um bloco que contém código a ser executado independentemente de ter ocorrido ou não uma exceção.
- Exemplo clássico: fechar um arquivo, conexão de banco de dados, ou outro recurso específico ao final do processamento.

```java
try {

}
catch (ExceptionType e) {

}
finally {

}
```

