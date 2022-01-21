---
Padrão: Comportamental
Título: Visitor
Propósito: Estudo
Fonte: Refactoring Guru
---

## Resumo
Permite que você separe algoritmos dos objetos nos quais eles operam.

## Aplicabilidade
> * Utilize o Visitor quando você precisa fazer uma operação em todos os elementos de uma estrutura de objetos complexa (por exemplo, uma árvore de objetos).
> * Utilize o Visitor para limpar a lógica de negócio de comportamentos auxiliares.
> * Utilize o padrão quando um comportamento faz sentido apenas dentro de algumas classes de uma uma hierarquia de classe, mas não em outras.

![Captura de Tela 2022-01-20 às 23 00 46](https://user-images.githubusercontent.com/24915267/150452183-1e151d0c-222d-46da-831e-891aff9b51ba.png)


## Prós
> * Princípio aberto/fechado. Você pode introduzir um novo comportamento que pode funcionar com objetos de diferentes classes sem mudar essas classes.
> * Princípio de responsabilidade única. Você pode mover múltiplas versões do mesmo comportamento para dentro da mesma classe.
> * Um objeto visitante pode acumular algumas informações úteis enquanto trabalha com vários objetos. Isso pode ser interessante quando você quer percorrer algum objeto de estrutura complexa, tais como um objeto árvore, e aplicar o visitante para cada objeto da estrutura.

## Contras
> * Você precisa atualizar todos os visitantes a cada vez que a classe é adicionada ou removida da hierarquia de elementos.
> * Visitantes podem não ter seu acesso permitido para campos e métodos privados dos elementos que eles deveriam estar trabalhando.
