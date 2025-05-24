package SistemaDeGerenciamentoDeProdutos;

public class ProdutoRoupa extends Produto{

    public ProdutoRoupa(String nome, float precoUnitario, int quantidadeEstoque)
    {
        super(nome, precoUnitario, quantidadeEstoque);
    }

    @Override
    public float calcularPreco()
    {
        return 0;
    }
}
