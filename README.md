# Herança e polimorfismo

## Herança
- é um tipo de associação que permite que uma classe herde todos os dados e comportamentos de outra
- Vantagens
  - Reuso
  - Polimorfismo

```java
class A extends B
```

- Relação "é um"
- Superclasse/Subclasse
- Generalização/Especialização

<br/>

## Upcasting e downcasting

- Upcasting
  - Casting da subclasse para superclasse
  - Uso comum: polimorfismo


- Downcasting
  - Casting da superclasse para subclasse
  - Palavra instanceof
  Uso comum: métodos que recebem parâmetros genéricos (Ex: Equals)

```java
// UPCASTING
Account acc1 = new Account();
Account acc2 = new BusinessAccount();
Account acc3 = new SavingsAccount();

// DOWNCASTING
BusinessAccount acc4 = (BusinessAccount) acc2;

if (acc3 instanceof BusinessAccount) {
  BusinessAccount acc5 = (BusinessAccount) acc3;
}
```

<br/>

## Sobreposição, palavra super, anotação @Override

### Sobreposição ou sobrescrita

- é a implementação de um método de uma superclasse na subclasse
- é recomendado usar a anotação @Override em um método sobrescrito

### Super

- é possível chamar a implementação da superclasse usando a palavra super

```java
public void withdraw(Double ammount) {
  super.withdraw(ammount);
  balance -= 2.0;
}
```

### Classes e métodos final

- palavra chave final
- Classe: evita que a classe seja herdada
- Método: evita que o método seja sobreposto
- performance: atributos de tipo final são analisados de forma mais rápida em tempo de execução.

### Introdução ao polimorfismo
Em POO, polimorfismo é o recurso que permite que variáveis de um mesmo tipo mais genérico possam apontar para objetos de tipos específicos diferentes, tendo assum comportamentos diferentes conforme cada tipo específico.


```java
Account x = new Account();
Account y = new SavingsAccount();

x.withdraw(50.0);
y.withdraw(50.0);
```

- A associação do tipo específico com o tipo genérico é feita em tempo de execução (upcasting).
- O compilador não sabe para qual tipo específico a chamada do método withdraw está sendo feita (ele só sabe que são duas variáveis do tipo Account).

### Classes abstratas

- são classes que não podem ser instanciadas
- é uma forma de garantir herança total: somente subclasses não abstratas podem ser instanciadas, mas nunca a superclasses abstrata

### Métodos abstratos

- são métodos que não possuem implementação
- métodos precisamd ser abstratos quando a classe é genérica demais para conter sua implementação
- se uma classe possuir pelo menos um método abstrato. então essa classe também é abstrata
