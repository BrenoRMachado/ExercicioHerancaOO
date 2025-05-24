package SistemaDeGerenciamentoDeProdutos;

public class ProdutoAlimento extends Produto{

    public ProdutoAlimento(String nome, double precoKg, double quantidadeKg)
    {
        super(nome, precoKg, quantidadeKg);
    }

    @Override
    public double calcularPreco(double quantidadeComprada)
    {
        if (quantidadeComprada <= 0) {
            throw new IllegalArgumentException("Quantidade deve ser positiva!");
        }
        verificarEstoque(quantidadeComprada);
        return getPrecoUnitario() * quantidadeComprada;
    }
}