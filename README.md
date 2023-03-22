# Construtores, palavra this, sobrecarga e encapsulamento

## Construtores

- operação especial da classe que é executado no momento da instanciação do objeto
- inicia valores dos atributos / permite ou obriga que o objetos receba dados / dependências no momento da instanciação (injeção de dependência)
- se um construtor customizado não for declarado, a classe disponibiliza o construtor padrão 
~~~java
public class Product() {
    public Product() {

    }
}

Product p = new Product()
~~~
- é possível especificar mais de um construtor na mesma classe (sobrecarga)

## This

- é uma referência para o próprio objeto.
- usado para diferenciar atributos de variáveis locais / passar o próprio objeto como argumento na chamada de um método ou construtor