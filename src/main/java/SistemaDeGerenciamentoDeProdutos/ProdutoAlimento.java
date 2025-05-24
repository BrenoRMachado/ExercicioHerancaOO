package SistemaDeGerenciamentoDeProdutos;

public class ProdutoAlimento extends Produto{

    public ProdutoAlimento(String nome, double precoKg, double quantidadeEstoque)
    {
        super(nome, precoKg, quantidadeEstoque);
    }

    @Override
    public double calcularPreco(double quantidadeComprada)
    {
        verificarEstoque(quantidadeComprada);
        return getPrecoUnitario() * getQuantidadeEstoque();
    }
}