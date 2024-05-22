package loja;

public class Produto {
    private String nome;
    private double quantidade;
    private double preco;

    public Produto(String nome, double quantidade, double preco) {
        if (quantidade < 0 || preco < 0) {
            throw new IllegalArgumentException("Quantidade e preço devem ser positivos.");
        }
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        if (quantidade < 0) {
            throw new IllegalArgumentException("Quantidade deve ser positiva.");
        }
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            throw new IllegalArgumentException("Preço deve ser positivo.");
        }
        this.preco = preco;
    }
}
