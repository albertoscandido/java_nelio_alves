# Introdução à Programação Orientada a Objetos

## Classe

- é um tipo estuturado que pode conter membros - atributos e métodos;
- é a definição de um 'tipo' (uma forma para criar objetos);
- objetos são intâncias de uma classe;
- pode prover outros recursos como: construtores, sobrecarga, encapsulamento, herança, polimorfismo.

Tipos | Exemplos
---- | ----
Entidades | Produto, Cliente
Serviços | ProdutoService, ClienteService
Controladores | ProdutoController, Cliente Controller
Utilitários | Calculadora, Compactador
Outros | views, repositórios, gerenciadores, etc


## Instanciação (alocação dinâmica de memória)
Variáveis estáticas declaradas são criadas em uma área da memória que se chama **Stack**. Usando o comando **new**, podemos fazer uma alocação dinâmica de memória. Quando você instancia um objeto, este será criado em uma área da memória chamada **Heap** (área da memória onde são criados os objetos dinâmicos durante a execução). Assim, a variável estática ainda existe na **Stack**, mas vai conter apenas o endereço de memória do objeto que foi criado no **Heap**.

![Instanciação (alocação dinâmica de memória)](./files/Instanciacao.PNG "Instanciação (alocação dinâmica de memória)")

## Object e String

Toda classe em Java é uma subclasse de Object.
Objetc possui os seguintes métodos:
- getClass - retorna o tipo do Objeto
- equals - compara se um objeto é igual ao outro
- hashCode - retorna o código hash do Objeto
- toString - converte o objeto para string

## Membros estáticos

- também chamados membros de classe (em oposição a membros de instância)
- são membros que fazem sentido independentemente de objetos. Não precisam de objeto para serem chamados. São chamados a partir do próprio nome da classe.
- geralmente usados em classes Utilitários e para declarar constantes
- uma classe que tem apenas membros estáticos, pode ser uma classe estática também. Essa Classe não poderá ser instanciada.

## Constantes
Para declarar um valor como constante, basta usar a palavra-chave final. Para esse tipo de variável, a convenção de nomenclatura é usando letras capitalizadas e separando as palavras com underline.
