package SistemaDeGerenciamentoDeProdutos;

public class ProdutoRoupa extends Produto{

    public ProdutoRoupa(String nome, float precoUnitario, int quantidadeEmEstoque)
    {
        super(nome, precoUnitario, quantidadeEmEstoque);
    }

    @Override
    public float calcularPreco()
    {
        return 0;
    }
}
