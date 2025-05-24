package SistemaDeGerenciamentoDeProdutos;

public class ProdutoAlimento extends Produto{

    public ProdutoAlimento(String nome, float precoUnitario, int quantidadeEstoque)
    {
        super(nome, precoUnitario, quantidadeEstoque);
    }

    @Override
    public float calcularPreco()
    {
        return getPrecoUnitario();
    }
}
