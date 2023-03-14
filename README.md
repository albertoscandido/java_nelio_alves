# Estruturas repetitivas

## while

Estrutura de controle que repete um bloco de comandos enquanto uma condição for verdadeira. Recomendada quando não se sabe previamente a quantidade de repetições.

~~~java
while(condicao) {
    comando1;
    comando2;
}
// executa enquanto a condição for atendida.
~~~

## for

Estrutura de controle que repete um bloco de comandos para um certo intervalo de valores. Recomendado quando se sabe previamente a quantidade de repetições ou intervalo de valores.

~~~java
for (inicio; condicao; incremento) {
    comando1;
    comando2;
}
~~~

## do-while

Quando você precisa que um bloco de comandos seja executado pelo menos uma vez, já que a condição é verificada apenas no final.

~~~java
do {
    comando1;
    comando2;
} while (condicao);
~~~