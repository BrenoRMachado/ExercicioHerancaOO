package SistemaDeGerenciamentoDeProdutos;

public class ProdutoAlimento extends Produto{

    public ProdutoAlimento(String nome, float precoUnitario, int quantidadeEmEstoque)
    {
        super(nome, precoUnitario, quantidadeEmEstoque);
    }

    @Override
    public float calcularPreco()
    {
        return 0;
    }
}
