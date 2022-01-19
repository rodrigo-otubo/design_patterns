---
Padrão: Comportamental
Título: Command
Propósito: Estudo
Fonte: Refactoring Guru
---

## Resumo
Permite transformar um pedido em um objeto independente que contém toda a informação sobre o pedido. Essa transformação 
permite que você parametrize métodos com diferentes pedidos, atrase ou coloque a execução do pedido em uma fila, e 
suporte operações que não podem ser feitas.

## Aplicabilidade

> * Utilize o padrão Command quando você quer parametrizar objetos com operações.
> * Utilize o padrão Command quando você quer colocar operações em fila, agendar sua execução, ou executá-las remotamente.
> * Utilize o padrão Command quando você quer implementar operações reversíveis.

## Prós
> * Princípio de responsabilidade única. Você pode desacoplar classes que invocam operações de classes que fazem 
    > essas operações.
> * Princípio aberto/fechado. Você pode introduzir novos comandos na aplicação sem quebrar o código cliente existente.
> * Você pode implementar desfazer/refazer.
> * Você pode implementar a execução adiada de operações.
> * Você pode montar um conjunto de comandos simples em um complexo.

## Contras
> * O código pode ficar mais complicado uma vez que você está introduzindo uma nova camada entre remetentes e destinatários.