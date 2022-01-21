---
Padrão: Structural
Título: Bridge
Propósito: Estudo
Fonte: Refactoring Guru
---

## Resumo
Permite que você divida uma classe grande ou um conjunto de classes intimamente ligadas em duas hierarquias separadas—abstração e implementação—que podem ser desenvolvidas independentemente umas das outra

## Aplicabilidade
> * Utilize o padrão Bridge quando você quer dividir e organizar uma classe monolítica que tem diversas variantes da mesma funcionalidade (por exemplo, se a classe pode trabalhar com diversos servidores de base de dados).
> * Utilize o padrão quando você precisa estender uma classe em diversas dimensões ortogonais (independentes).
> * Utilize o Bridge se você precisar ser capaz de trocar implementações durante o momento de execução.

## Prós
> * Você pode criar classes e aplicações independentes de plataforma.
> * O código cliente trabalha com abstrações em alto nível. Ele não fica exposto a detalhes de plataforma.
> * Princípio aberto/fechado. Você pode introduzir novas abstrações e implementações independentemente uma das outras.
> * Princípio de responsabilidade única. Você pode focar na lógica de alto nível na abstração e em detalhes de plataforma na implementação.

## Contras
> * Você pode tornar o código mais complicado ao aplicar o padrão em uma classe altamente coesa.