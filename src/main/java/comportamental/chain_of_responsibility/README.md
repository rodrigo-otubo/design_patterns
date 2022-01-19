---
Padrão: Comportamental
Título: Chain of responsibility
Propósito: Estudo
Fonte: Refactoring Guru
---

## Resumo

Permite que o objeto passe por uma cadeia de handlers, ou seja, ao receber a requisição
cada handler decide se processa ou passa para outro handler da cadeia.


<img width="430" alt="Captura de Tela 2022-01-18 às 22 39 00" src="https://user-images.githubusercontent.com/24915267/150047395-8ad128c8-000a-46e8-b34e-650d35b69e96.png">


## Aplicabilidade

> * Utilize o padrão Chain of Responsability quando você espera que seu programa
> processe diferentes tipos de pedidos em várias maneiras, não obrigatoriamente
> todos passando por todos os handlers.
> * Utilize quando for necessário executar diversos handlers em uma ordem específica.

![Captura de Tela 2022-01-18 às 22 40 58](https://user-images.githubusercontent.com/24915267/150047634-639765f3-b85b-491f-8cdb-cea77163c229.png)

## Prós
> * Pode controlar os handlers na ordem que quiser
> * Princípio de responsabilidade única, podendo desacoplar classes que invocam
> operações de classes que realizam operações.
> * Princípio aberto/fechado, podendo adicionar ou remover um handle em qualquer momento sem quebrar o código.

## Contras
> * Alguns pedidos podem acabar sem tratamento
