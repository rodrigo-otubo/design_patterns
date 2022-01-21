---
Padrão: Creational
Título: Prototype
Propósito: Estudo
Fonte: Refactoring Guru
---

## Resumo
Permite copiar objetos existentes sem fazer seu código ficar dependente de suas classes.

## Aplicabilidade
> * Utilize o padrão Prototype quando seu código não deve depender de classes concretas de objetos que você precisa copiar.
> * Utilize o padrão quando você precisa reduzir o número de subclasses que somente diferem na forma que inicializam seus respectivos objetos. Alguém pode ter criado essas subclasses para ser capaz de criar objetos com uma configuração específica.

## Prós
> * Você pode clonar objetos sem acoplá-los a suas classes concretas.
> * Você pode se livrar de códigos de inicialização repetidos em troca de clonar protótipos pré-construídos.
> * Você pode produzir objetos complexos mais convenientemente.
> * Você tem uma alternativa para herança quando lidar com configurações pré determinadas para objetos complexos.

## Contras
> * Clonar objetos complexos que têm referências circulares pode ser bem complicado.