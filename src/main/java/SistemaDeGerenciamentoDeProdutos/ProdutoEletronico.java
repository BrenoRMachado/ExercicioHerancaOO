package SistemaDeGerenciamentoDeProdutos;

public class ProdutoEletronico extends Produto{

    public ProdutoEletronico(String nome, float precoUnitario, int quantidadeEmEstoque)
    {
        super(nome, precoUnitario, quantidadeEmEstoque);
    }

    @Override
    public float calcularPreco()
    {
        return 0;
    }
}
