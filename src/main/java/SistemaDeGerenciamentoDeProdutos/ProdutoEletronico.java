package SistemaDeGerenciamentoDeProdutos;

public class ProdutoEletronico extends Produto{

    public ProdutoEletronico(String nome, float precoUnitario, float quantidadeEstoque)
    {
        super(nome, precoUnitario, quantidadeEstoque);
    }

    @Override
    public float calcularPreco()
    {
        verificarQuantidadeEstoque();

        return 0;
    }
}
