---
Padrão: Comportamental
Título: Memento
Propósito: Estudo
Fonte: Refactoring Guru
---

## Resumo
Permite que você salve e restaure o estado anterior de um objeto sem revelar os detalhes de sua implementação.


## Aplicabilidade

> * Utilize o padrão Memento quando você quer produzir retratos do estado de um objeto para ser capaz de restaurar um estado anterior do objeto.
> * Utilize o padrão quando o acesso direto para os campos/getters/setters de um objeto viola seu encapsulamento.

> * Implementação baseada em classes aninhadas
![Captura de Tela 2022-01-20 às 22 34 52](https://user-images.githubusercontent.com/24915267/150449535-5c23e311-afe4-48a4-a41e-4c701018e620.png)


> * Implementação baseada em uma interface intermediária.
![Captura de Tela 2022-01-20 às 22 35 38](https://user-images.githubusercontent.com/24915267/150449602-000db9c5-41b3-48eb-b707-ae09815f0f69.png)


> * Implementação com um encapsulamento ainda mais estrito.
![Captura de Tela 2022-01-20 às 22 36 01](https://user-images.githubusercontent.com/24915267/150449631-ea8f454f-48b4-41df-9c1b-19cd032ac380.png)


## Prós
> * Você pode produzir retratos do estado de um objeto sem violar seu encapsulamento.
> * Você pode simplificar o código da originadora permitindo que a cuidadora mantenha o histórico do estado da originadora.

## Contras
> * A aplicação pode consumir muita RAM se os clientes criarem mementos com muita frequência.
> * Cuidadoras devem acompanhar o ciclo de vida da originadora para serem capazes de destruir mementos obsoletos.
> * A maioria das linguagens de programação dinâmicas, tais como PHP, Python, e JavaScript, não conseguem garantir que o estado dentro do memento permaneça intacto.
