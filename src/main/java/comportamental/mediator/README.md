---
Padrão: Comportamental
Título: Mediator
Propósito: Estudo
Fonte: Refactoring Guru
---

## Resumo
Permite que você reduza as dependências caóticas entre objetos. O padrão restringe comunicações diretas entre objetos e os força a colaborar apenas através do objeto mediador.


## Aplicabilidade

> * Utilize o padrão Mediator quando é difícil mudar algumas das classes porque elas estão firmemente acopladas a várias outras classes.
> * Utilize o padrão quando você não pode reutilizar um componente em um programa diferente porque ele é muito dependente de outros componentes.
> * Utilize o Mediator quando você se encontrar criando um monte de subclasses para componentes apenas para reutilizar algum comportamento básico em vários contextos.

![Captura de Tela 2022-01-19 às 23 53 00](https://user-images.githubusercontent.com/24915267/150263656-8275f28c-3ccf-449f-bf0b-735b7eae9b9b.png)



## Prós
> * Princípio de responsabilidade única. Você pode extrair as comunicações entre vários componentes para um único lugar, tornando as de mais fácil entendimento e manutenção.
> * Princípio aberto/fechado. Você pode introduzir novos mediadores sem ter que mudar os próprios componentes.
> * Você pode reduzir o acoplamento entre os vários componentes de um programa.
> * Você pode reutilizar componentes individuais mais facilmente.

## Contras
> * Com o tempo um mediador pode evoluir para um Objeto Deus.
