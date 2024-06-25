
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
