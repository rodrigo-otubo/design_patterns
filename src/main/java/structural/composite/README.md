---
Padrão: Structural
Título: Composite
Propósito: Estudo
Fonte: Refactoring Guru
---

## Resumo
Permite que você componha objetos em estruturas de árvores e então trabalhe com essas estruturas como se elas fossem objetos individuais.

## Aplicabilidade
> * Utilize o padrão Composite quando você tem que implementar uma estrutura de objetos tipo árvore.
> * Utilize o padrão quando você quer que o código cliente trate tanto os objetos simples como os compostos de forma uniforme.

## Prós
> * Você pode trabalhar com estruturas de árvore complexas mais convenientemente: utilize o polimorfismo e a recursão a seu favor.
> * Princípio aberto/fechado. Você pode introduzir novos tipos de elemento na aplicação sem quebrar o código existente, o que agora funciona com a árvore de objetos.

## Contras
> * Pode ser difícil providenciar uma interface comum para classes cuja funcionalidade difere muito. Em certos cenários, você precisaria generalizar muito a interface componente, fazendo dela uma interface de difícil compreensão.