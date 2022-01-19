---
Padrão: Comportamental
Título: Command
Propósito: Estudo
Fonte: Refactoring Guru
---

## Resumo
<dt>
Permite transformar um pedido em um objeto independente que contém toda a informação sobre o pedido. Essa transformação 
permite que você parametrize métodos com diferentes pedidos, atrase ou coloque a execução do pedido em uma fila, e 
suporte operações que não podem ser feitas.
</dt>


<img width="452" alt="Captura de Tela 2022-01-18 às 23 41 12" src="https://user-images.githubusercontent.com/24915267/150053588-4b56096a-4b60-45c0-b781-de647bc66390.png">


## Aplicabilidade

> * Utilize o padrão Command quando você quer parametrizar objetos com operações.
> * Utilize o padrão Command quando você quer colocar operações em fila, agendar sua execução, ou executá-las remotamente.
> * Utilize o padrão Command quando você quer implementar operações reversíveis.

<img width="923" alt="Captura de Tela 2022-01-18 às 23 42 20" src="https://user-images.githubusercontent.com/24915267/150053723-a67f1673-be39-49d1-b8ce-6b0ba30691a9.png">


## Prós
> * Princípio de responsabilidade única. Você pode desacoplar classes que invocam operações de classes que fazem 
    > essas operações.
> * Princípio aberto/fechado. Você pode introduzir novos comandos na aplicação sem quebrar o código cliente existente.
> * Você pode implementar desfazer/refazer.
> * Você pode implementar a execução adiada de operações.
> * Você pode montar um conjunto de comandos simples em um complexo.

## Contras
> * O código pode ficar mais complicado uma vez que você está introduzindo uma nova camada entre remetentes e destinatários.
