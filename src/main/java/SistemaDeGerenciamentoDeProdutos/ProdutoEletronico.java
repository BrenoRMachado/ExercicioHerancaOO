package SistemaDeGerenciamentoDeProdutos;

public class ProdutoEletronico extends Produto{

    public ProdutoEletronico(String nome, double precoUnitario, double quantidadeEstoque)
    {
        super(nome, precoUnitario, quantidadeEstoque);
    }

    @Override
    public double calcularPreco(double quantidadeComprada)
    {
        verificarTipoEstoque();
        verificarTipoCompra(quantidadeComprada);
        return getPrecoUnitario() * quantidadeComprada;
    }
}