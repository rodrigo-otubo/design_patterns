---
Padrão: Structural
Título: Flyweight
Propósito: Estudo
Fonte: Refactoring Guru
---

## Resumo
Permite a você colocar mais objetos na quantidade de RAM disponível ao compartilhar partes comuns de estado entre os múltiplos objetos ao invés de manter todos os dados em cada objeto.

## Aplicabilidade
> * Utilize o padrão Flyweight apenas quando seu programa deve suportar um grande número de objetos que mal cabem na RAM disponível.

## Prós
> * Você pode economizar muita RAM, desde que seu programa tenha muitos objetos similares.

## Contras
> * Você pode estar trocando RAM por ciclos de CPU quando parte dos dados de contexto precisa ser recalculado cada vez que alguém chama um método flyweight.
> * O código fica muito mais complicado. Novos membros de equipe sempre se perguntarão por que o estado de uma entidade foi separado de tal forma.