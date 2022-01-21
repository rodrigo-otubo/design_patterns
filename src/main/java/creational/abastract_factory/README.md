---
Padrão: Creational
Título: Abstract Factory
Propósito: Estudo
Fonte: Refactoring Guru
---

## Resumo
Permite que você produza famílias de objetos relacionados sem ter que especificar suas classes concretas.

## Aplicabilidade
> * Use o Abstract Factory quando seu código precisa trabalhar com diversas famílias de produtos relacionados, mas que você não quer depender de classes concretas daqueles produtos-eles podem ser desconhecidos de antemão ou você simplesmente quer permitir uma futura escalabilidade.

## Prós
> * Você pode ter certeza que os produtos que você obtém de uma fábrica são compatíveis entre si.
> * Você evita um vínculo forte entre produtos concretos e o código cliente.
> * Princípio de responsabilidade única. Você pode extrair o código de criação do produto para um lugar, fazendo o código ser de fácil manutenção.
> * Princípio aberto/fechado. Você pode introduzir novas variantes de produtos sem quebrar o código cliente existente.

## Contras
> * O código pode tornar-se mais complicado do que deveria ser, uma vez que muitas novas interfaces e classes são introduzidas junto com o padrão.