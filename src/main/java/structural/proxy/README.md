---
Padrão: Structural
Título: Proxy
Propósito: Estudo
Fonte: Refactoring Guru
---

## Resumo
Permite que você forneça um substituto ou um espaço reservado para outro objeto. Um proxy controla o acesso ao objeto original, permitindo que você faça algo ou antes ou depois do pedido chegar ao objeto original.

## Aplicabilidade
> * Inicialização preguiçosa (proxy virtual). Este é quando você tem um objeto do serviço peso-pesado que gasta recursos do sistema por estar sempre rodando, mesmo quando você precisa dele de tempos em tempos.
> * Controle de acesso (proxy de proteção). Este é quando você quer que apenas clientes específicos usem o objeto do serviço; por exemplo, quando seus objetos são partes cruciais de um sistema operacional e os clientes são várias aplicações iniciadas (incluindo algumas maliciosas).
> * Execução local de um serviço remoto (proxy remoto). Este é quando o objeto do serviço está localizado em um servidor remoto.
> * Registros de pedidos (proxy de registro). Este é quando você quer manter um histórico de pedidos ao objeto do serviço.
> * Cache de resultados de pedidos (proxy de cache). Este é quando você precisa colocar em cache os resultados de pedidos do cliente e gerenciar o ciclo de vida deste cache, especialmente se os resultados são muito grandes.
> * Referência inteligente. Este é para quando você precisa ser capaz de se livrar de um objeto peso-pesado assim que não há mais clientes que o usam.

## Prós
> * Você pode controlar o objeto do serviço sem os clientes ficarem sabendo.
> * Você pode gerenciar o ciclo de vida de um objeto do serviço quando os clientes não se importam mais com ele.
> * O proxy trabalha até mesmo se o objeto do serviço ainda não está pronto ou disponível.
> * Princípio aberto/fechado. Você pode introduzir novos proxies sem mudar o serviço ou clientes.

## Contras
> * O código pode ficar mais complicado uma vez que você precisa introduzir uma série de novas classes.
> * A resposta de um serviço pode ter atrasos.