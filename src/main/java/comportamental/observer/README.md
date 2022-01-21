---
Padrão: Comportamental
Título: Observer
Propósito: Estudo
Fonte: Refactoring Guru
---

## Resumo
Permite que você defina um mecanismo de assinatura para notificar múltiplos objetos sobre quaisquer eventos que aconteçam com o objeto que eles estão observando.

## Aplicabilidade
> * Utilize o padrão Observer quando mudanças no estado de um objeto podem precisar mudar outros objetos, e o atual conjunto de objetos é desconhecido de antemão ou muda dinamicamente.
> * Utilize o padrão quando alguns objetos em sua aplicação devem observar outros, mas apenas por um tempo limitado ou em casos específicos.

![Captura de Tela 2022-01-20 às 22 40 18](https://user-images.githubusercontent.com/24915267/150450050-367ff7fc-85d1-4b62-aba8-3d481f4fe591.png)


## Prós
> * Princípio aberto/fechado. Você pode introduzir novas classes assinantes sem ter que mudar o código da publicadora (e vice versa se existe uma interface publicadora).
> * Você pode estabelecer relações entre objetos durante a execução.

## Contras
> * Assinantes são notificados em ordem aleatória
> * Cuidadoras devem acompanhar o ciclo de vida da originadora para serem capazes de destruir mementos obsoletos.
