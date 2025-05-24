package SistemaDeGerenciamentoDeProdutos;

public class ProdutoRoupa extends Produto{

    public ProdutoRoupa(String nome, double precoUnitario, double quantidadeEstoque)
    {
        super(nome, precoUnitario, quantidadeEstoque);
    }

    @Override
    public double calcularPreco()
    {
        return 0;
    }
}