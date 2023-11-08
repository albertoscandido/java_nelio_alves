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

// Downcasting
BusinessAccount acc4 = (BusinessAccount) acc2;

if (acc3 instanceof BusinessAccount) {
  BusinessAccount acc5 = (BusinessAccount) acc3;
}
```