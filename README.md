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
