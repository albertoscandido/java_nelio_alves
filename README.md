# Expressões aritméticas

\+  adição
<br/>
\-  subtração
<br/>
\*  multiplicação
<br/>
\/  divisão
<br/>
\%  mod (resto da divisão)
<br/>

Precedência - sequência em que a expressão é executada

<br><br>

## Vaiáveis e tipos básicos em Java
Em programação, uma variável é uma porção de memória(RAM)_ utilizada para armazenar dados durante a execução dos programas.

### Declaração 
\<tipo\> \<nome\> = \<valor inicial\>

### Tipos primitivos

Descrição | Tipo | Tamanho | Valores | Valor | padrão
----------|------|---------|---------|-------|-------
tipos numéricos inteiros | byte | 8 bits | -128 a 127 | 0
tipos numéricos inteiros | short | 16 bits | -32768 a 32767 | 0
tipos numéricos inteiros | int | 32 bits | -2147483648 a 2147483647 | 0
tipos numéricos inteiros |long | 64 bits | -9223372036854770000  a 9223372036854770000 | 0L
tipos numéricos com ponto flutuante | float | 32 bits | -1,4024E-37 a 3,4028E+38 | 0.0f
tipos numéricos com ponto flutuante | double | 64 bits | -4,94E-307 a 1,79E+308 | 0.0
um caractere Unicode | [char](https://unicode-table.com/en/) | 16 bits | '\u0000' a '\uFFFF' | '\u0000'
valor verdade | boolean | 1 bit | {false, true} | false

### Nomes de variáveis
- não pode começar com dígito
- Não pode ter espaço em branco
- Não usar acentos ou caracteres especiais
- o padrão é o camelCase

<br><br>

## Operações básicas

Há três operações básicas de programação:

- Entrada de dados (leitura) - programa através de variáveis
- Processamento de dados - quando o programa está realizando cálculos
- Saída de dados (também chamada de escrita)- informa dados para o usuário
<br><br>

## Saída de dados
~~~java
System.out.print(renda); // sem quebra de linha
System.out.println(renda); // com quebra de linha
System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda); // printf para format
// %s para string, %d para inteiro %f para ponto flutuante %n para quebra de linha 
~~~
<br><br>

## Processamento de dados em Java Casting
Comando de atribuição

~~~java
float b, B, h, area;
b = 6f;
B = 8f;
h = 5f;
area = (b + B) / 2f * h;
System.out.println(area);
~~~

Casting - É a conversão explícita de um tipo para outro. É necessário quando o compilador não é capaz de “adivinhar” que o resultado de uma expressão deve ser de outro tipo.

~~~java
int a, b;
double resultado;
a = 5;
b = 2;
resultado = (double) a / b;
System.out.println(resultado);
~~~

<br><br>

## Entrada de dados
Scanner
~~~java
Scanner sc = new Scanner(System.in);
x = sc.next(); // string
x = sc.nextInt(); // int
x = sc.nextDouble(); // double
x = sc.next().charAt(0); // character
~~~
<br><br>

## Funções Matemáticas
~~~java
Math.sqrt(x); // raiz quadrada
Math.pow(x, y); // resultado de x elevado a y
Math.abs(x); // valor absoluto de x
~~~