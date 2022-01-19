---
Padrão: Comportamental
Título: Chain of responsibility
Propósito: Estudo
Fonte: Refactoring Guru
---

## Resumo

Permite que o objeto passe por uma cadeia de handlers, ou seja, ao receber a requisição
cada handler decide se processa ou passa para outro handler da cadeia.

![Captura de Tela 2022-01-18 às 23 02 45](https://user-images.githubusercontent.com/24915267/150049670-08fcf45b-53c8-4f84-9d92-8b1d1f00125b.png)


## Aplicabilidade

> * Utilize o padrão Chain of Responsability quando você espera que seu programa
> processe diferentes tipos de pedidos em várias maneiras, não obrigatoriamente
> todos passando por todos os handlers.
> * Utilize quando for necessário executar diversos handlers em uma ordem específica.

![Captura de Tela 2022-01-18 às 23 10 07](https://user-images.githubusercontent.com/24915267/150050378-c06f1323-8eaf-48b4-a436-934cf16c8aa2.png)


## Prós
> * Pode controlar os handlers na ordem que quiser
> * Princípio de responsabilidade única, podendo desacoplar classes que invocam
> operações de classes que realizam operações.
> * Princípio aberto/fechado, podendo adicionar ou remover um handle em qualquer momento sem quebrar o código.

## Contras
> * Alguns pedidos podem acabar sem tratamento
