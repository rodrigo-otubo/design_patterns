---
Padrão: Comportamental
Título: Strategy
Propósito: Estudo
Fonte: Refactoring Guru
---

## Resumo
Permite que você defina uma família de algoritmos, coloque-os em classes separadas, e faça os objetos deles intercambiáveis.

## Aplicabilidade
> * Utilize o padrão Strategy quando você quer usar diferentes variantes de um algoritmo dentro de um objeto e ser capaz de trocar de um algoritmo para outro durante a execução.
> * Utilize o Strategy quando você tem muitas classes parecidas que somente diferem na forma que elas executam algum comportamento.
> * Utilize o padrão para isolar a lógica do negócio de uma classe dos detalhes de implementação de algoritmos que podem não ser tão importantes no contexto da lógica.
> * Utilize o padrão quando sua classe tem um operador condicional muito grande que troca entre diferentes variantes do mesmo algoritmo.

![Captura de Tela 2022-01-20 às 22 49 15](https://user-images.githubusercontent.com/24915267/150450992-d4b13975-d54e-41a5-993c-b318b09fd354.png)


## Prós
> * Você pode trocar algoritmos usados dentro de um objeto durante a execução.
> * Você pode isolar os detalhes de implementação de um algoritmo do código que usa ele.
> * Você pode substituir a herança por composição.
> * Princípio aberto/fechado. Você pode introduzir novas estratégias sem mudar o contexto.

## Contras
> * Se você só tem um par de algoritmos e eles raramente mudam, não há motivo real para deixar o programa mais complicado com novas classes e interfaces que vêm junto com o padrão.
> * Os Clientes devem estar cientes das diferenças entre as estratégias para serem capazes de selecionar a adequada.
> * Muitas linguagens de programação modernas tem suporte do tipo funcional que permite que você implemente diferentes versões de um algoritmo dentro de um conjunto de funções anônimas. Então você poderia usar essas funções exatamente como se estivesse usando objetos estratégia, mas sem inchar seu código com classes e interfaces adicionais.
