---
Padrão: Comportamental
Título: Chain of responsibility
Propósito: Estudo
Fonte: Refactoring Guru
---

## Resumo

Permite que o objeto passe por uma cadeia de handlers, ou seja, ao receber a requisição
cada handler decide se processa ou passa para outro handler da cadeia.

## Aplicabilidade

> * Utilize o padrão Chain of Responsability quando você espera que seu programa
> processe diferentes tipos de pedidos em várias maneiras, não obrigatoriamente
> todos passando por todos os handlers.
> * Utilize quando for necessário executar diversos handlers em uma ordem específica.

## Prós
> * Pode controlar os handlers na ordem que quiser
> * Princípio de responsabilidade única, podendo desacoplar classes que invocam
> operações de classes que realizam operações.
> * Princípio aberto/fechado, podendo adicionar ou remover um handle em qualquer momento sem quebrar o código.

## Contras
> * Alguns pedidos podem acabar sem tratamento