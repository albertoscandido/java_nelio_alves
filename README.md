# Expressões Comparativas 

São expressões que comparam dois valores e cujo resultado é um valor verdade (bool)

### Operadores Comparativos

Operador   | Significado
--------- | ------
\> | Maior
< | Menor
\>= | Maior ou igual
<= | Menor ou igual
== | Igual
!= | Diferente


### Expressões Lógicas

São também expressões que comparam dois valores e cujo resultado é um valor verdade (bool)

Operador   | Significado
--------- | ------
&& | E
\|\| | OU
! | Não

# Estruturas Comparativas

Estrutura de controle que permite definir que um certo bloco de comandos somente será executado dependendo de uma condição.

## if-else 

~~~java
if (condicao1) {
    <comando1>
    <comando2>
} else if (condicao2) {
    <comando3>
    <comando4>
} else {
    <comando5>
    <comando6>
}
// true executa bloco if e false executa bloco else
~~~

## Operadores de atribuição Cumulativa

Operador   | Significado
--------- | ------
a += b | a = a + b; 
a -= b | a = a - b; 
a *= b | a = a * b; 
a /= b | a = a / b; 
a %= b | a = a % b;

## switch-case

Usada quando se tem várias opções de fluxo a serem tratadas com base no valor de uma variável

~~~java
switch (expressao) {
    case valor1:
        comando1;
        comando2;
        break;
    case valor2:
        comando1;
        comando2;
        break;
    case valor3:
        comando1;
        comando2;
        break;
    default:
        comando5;
        break;
}
~~~
