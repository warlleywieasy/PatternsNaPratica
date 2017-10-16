# PatternsNaPratica
Trabalho Professor Felipe Guelber

Estacionamento trata-se de um sistema que auxilia o gerenciamento de uma empresa que visa tratar diferentes públicos, (rotativo, e os clientes vips). Foi usado para o desenvolvimento deste projeto 4 patterns sendo estes:

Observer: Foi implantando este pattern no projeto do estacionamento para que ele faça a contagem de entrada/saída de veículos do estacionamento, alertando em um painel de propagandas o fluxo de veículos. Este padrão notifica o painel assim que tem alguma alteração na cancela de entrada ou saída.
 
Template:  O template por trabalhar com uma forma de definir os passos a serem seguidos foi implantado na parte da saída do cliente, fazendo com que ele não consiga sair sem que seja calculado o tempo estacionado, multiplicando assim o valor a ser pago pelo tempo consumido.
 
Proxy: O proxy por sua vez faz a validação do meio de pagamento do cliente, dependendo de sua forma de pagamento a cancela muda seu status para aberta, ou permanece fechada e informa ao cliente que ele deve realizar outra forma de pagamento.
 
State:  O state viabiliza o controle de que se o estacionamento está vazio ou lotado. E necessário este tipo de tratamento pois se tem dois tipos de clientes, necessitando assim estados diferentes de execução de ações para clientes de diferentes classificações. Se o cliente for vip, o estacionamento estando lotado, ele e direcionado a uma área onde poderá estacionar seu veículo, caso o cliente seja rotativo (diário) e o estacionamento estiver lotado, ele e abortado com uma mensagem de desculpas e logo informa que está lotado no momento.
