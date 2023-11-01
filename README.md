# Enumerações, composição

## Enumerações
- É um tipo especial que serve para especificar de forma literal umconjunto de constantes relacionadas
- Palavra chave em Java: enum
- Vantagem: melhor semântica, código mais legível e auxiliado pelo compilador
- [Documentação Oracle](https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html)

```java
// Enum
public enum OrderStatus {
    PENDING_PAYMENT,
    PROCESSING,
    SHIPPED,
    DELIVERED;
}

// Conversão de String para enum
OrderStatus os1 = OrderStatus.DELIVERED;
OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
```

# Design

- Categorias de classes
  - Em um sistema orientado a objetos, de modo geral "tudo" é objeto.
  - Por questões de design tais como organização, flexibilidade, reuso, delegação, etc.
  - há várias categorias de classes:
    - Controllers
    - Entities
    - Services
    - Views
    - Repositories

<br/>
<br/>


## Composição

- É um tipo de associação que permite que um objeto contenha outro
- Relação "tem-um" ou "tem-vários"
- Vantagens
  - Organização: divisão de responsabilidades
  - Coesão
  - Flexibilidade
  - Reuso