package SistemaDeGerenciamentoDeProdutos;

public class ProdutoRoupa extends Produto{

    private int desconto;

    public ProdutoRoupa(String nome, double precoUnitario, double quantidadeEstoque)
    {
        super(nome, precoUnitario, quantidadeEstoque);
    }

    public int getDesconto() {
        return this.desconto;
    }
    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    @Override
    public double calcularPreco(double quantidadeComprada)
    {
        verificarQuantidades(quantidadeComprada);
        verificarEstoque(quantidadeComprada);
        return getPrecoUnitario() * quantidadeComprada - (getPrecoUnitario() * this.desconto);
    }
}