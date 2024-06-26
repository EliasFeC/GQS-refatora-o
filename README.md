
((2))
InterfaceRelatorio - permitindo maior flexibilidade e a possibilidade de múltiplas implementações de relatórios.
Relatorio - promovendo a separação de responsabilidades e facilitando a manutenção do código.
Principal - Simplicidade: a lógica principal agora apenas instancia objetos e chama métodos da interface, promovendo clareza e simplificação do método main.
Validação de entrada - Adicionar validações para os valores de Produto para evitar inconsistências (por exemplo, quantidade negativa, preço negativo).)

((6))
O método calcularDesconto foi definido como private na classe Produto para manter a lógica interna e evitar acesso externo desnecessário. 
ArrayList na classe CadastroVendas para armazenar os produtos, permitindo fácil adição e iteração.
A classe Produto é responsável por armazenar e gerenciar os dados de um produto individual, enquanto a classe CadastroVendas é responsável pelo gerenciamento de múltiplos produtos e pelos cálculos totais.
O loop while permite a entrada contínua de produtos até que o usuário decida parar, garantindo que o algoritmo possa cadastrar quantos produtos forem necessários.
Métodos separados calcularTotalSemDesconto e calcularTotalComDesconto na classe CadastroVendas para calcular os totais, mantendo a lógica de cálculo organizada e fácil de entender.

((7))
(1)
O código foi estruturado em uma classe única (NomeCompleto) para manter tudo relacionado à funcionalidade de imprimir o nome completo.
Utilização do JOptionPane.showInputDialog para obter os nomes do usuário de forma interativa, em vez de usar entrada padrão.
O nome completo é mostrado em uma caixa de diálogo JOptionPane.showMessageDialog.
(2)
O código foi organizado em uma classe única (Calculadora) para encapsular toda a funcionalidade relacionada às operações matemáticas.
Utilização de JOptionPane.showInputDialog para obter os números e a escolha do usuário de forma interativa.
Inclusão de blocos try-catch para capturar e tratar exceções, como NumberFormatException (caso o usuário não insira um número inteiro) e ArithmeticException (caso de divisão por zero).
Criação de um método privado realizarOperacao para separar a lógica de cálculo do fluxo principal do programa, melhorando a organização e a legibilidade.

