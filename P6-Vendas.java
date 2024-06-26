import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroVendas {
    private List<Produto> produtos;

    public CadastroVendas() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public double calcularTotalSemDesconto() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getValor();
        }
        return total;
    }

    public double calcularTotalComDesconto() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getValorComDesconto();
        }
        return total;
    }

    public static void main(String[] args) {
        CadastroVendas cadastro = new CadastroVendas();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Digite o código do produto (ou 'sair' para terminar): ");
            String codigo = scanner.nextLine();
            if (codigo.equalsIgnoreCase("sair")) break;

            System.out.println("Digite o nome do produto: ");
            String nome = scanner.nextLine();

            System.out.println("Digite o tipo do produto (roupas, calçados, casa): ");
            String tipo = scanner.nextLine();

            System.out.println("Digite o valor do produto: ");
            double valor = scanner.nextDouble();
            scanner.nextLine();

            Produto produto = new Produto(codigo, nome, tipo, valor);
            cadastro.adicionarProduto(produto);
        }

        scanner.close();

        System.out.println("Total sem desconto: " + cadastro.calcularTotalSemDesconto());
        System.out.println("Total com desconto: " + cadastro.calcularTotalComDesconto());
    }
}
