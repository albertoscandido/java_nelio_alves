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

## Sobrecarga

- é um recurso que uma classe possui de oferecer mais de uma operação com o mesmo nome, porém com lista de parâmetros diferentes

~~~java
public class Product() {
    String name;
    double price;
    int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        quantity = 0;
    }
}
~~~

## Encapsulamento

- princípio que consiste em esconde detalhes de implementação de uma classe, expondo apenas operações seguras e que mantenham os objetos em um estado consistente.
- regra de ouro: o objeto sempre deve estar em um estado consistente, e a própria classe deve garantir isso.
- regra geral básica - um objeto não deve expor nenhum atributo (usar sempre o modificar de acesso private)