---
Padrão: Comportamental
Título: State
Propósito: Estudo
Fonte: Refactoring Guru
---

## Resumo
Permite que um objeto altere seu comportamento quando seu estado interno muda. Parece como se o objeto mudasse de classe.

## Aplicabilidade
> * Utilize o padrão State quando você tem um objeto que se comporta de maneira diferente dependendo do seu estado atual, quando o número de estados é enorme, e quando o código estado específico muda com frequência.
> * Utilize o padrão quando você tem uma classe populada com condicionais gigantes que alteram como a classe se comporta de acordo com os valores atuais dos campos da classe.
> * Utilize o State quando você tem muito código duplicado em muitos estados parecidos e transições de uma máquina de estado baseada em condições.

![Captura de Tela 2022-01-20 às 22 52 49](https://user-images.githubusercontent.com/24915267/150451378-100de15c-f6b0-491e-a578-af1ccd6fd398.png)


## Prós
> * Princípio de responsabilidade única. Organiza o código relacionado a estados particulares em classes separadas.
> * Princípio aberto/fechado. Introduz novos estados sem mudar classes de estado ou contexto existentes.
> * Simplifica o código de contexto ao eliminar condicionais de máquinas de estado pesadas.

## Contras
> * Aplicar o padrão pode ser um exagero se a máquina de estado só tem alguns estados ou raramente muda eles.
