# Comportamentos de memória, arrays e listas

## Tipos referência vs. tipos valor

Classe | Tipo primitivo
---- | ----
Vantagem: usufrui de todos os recursos da OO | Vantagem: é simples e mais performático
Variáveis são ponteiros | Variáveis são caixas
Objetos precisam ser instanciados usando new, ou apontar para um objeto já existente | Não instancia. Uma vez declarados, estão prontos pra uso
Aceita valor null | Não aceita valor null
Y = X = "Y passa a apontar para onde X aponta" | Y = X = "Y recebe uma cópia de X"
Objetos instanciados no heap | "Objetos" são instanciados no HEAP
Objetos não utilizados são desalocados em um momento próximo pelo garbage collector | "Objetos" são desalocados imediatamente quando seu escopo de execução é finalizado 

<br/>
<br/>

## Garbage collector
• É um processo que automatiza o gerenciamento de memória de um programa em execução
• O garbage collector monitora os objetos alocados dinamicamente pelo programa (no heap), desalocando aqueles que não estão mais sendo utilizados.