# Outros tópicos básicos sobre Java

## Restrições e convenções para nomes

- não pode começar com dígito: use letra ou _
- não usar acentos ou til
- não pode ter espaço em branco

~~~java
int _5minutos;
int salario;
int salarioDoFuncionario;
~~~

### Convenções

- CamelCase para pacotes, atributos, métodos, variáveis e parâmetros;
- PascalCase para classes - Ex: "ProductService"


## Operadores bitwise

Operadores que realizam operações lógicas bit a bitem valores

Operador | Significado
--- | ---
& | Operador "E" bit a bit
\| | Operador "OU" bit a bit
^ | Operação "OU-exclusivo" ou "XOR" bit a bit (quando apenas uma das condições é verdadeira)