package SistemaDeGerenciamentoDeProdutos;

public class ProdutoRoupa extends ProdutoEstoqueInteiro{

    private int desconto;

    public ProdutoRoupa(String nome, double precoUnitario, double quantidadeEstoque)
    {
        super(nome, precoUnitario, quantidadeEstoque);
    }

    public int getDesconto() {
        return this.desconto;
    }
    public void setDesconto(int desconto) {
        if (desconto < 0 || desconto > 100) {
            throw new IllegalArgumentException("Desconto deve ser entre 0 e 100%!");
        }
        this.desconto = desconto;
    }

    @Override
    public double calcularPreco(double quantidadeComprada)
    {
        verificarQuantidades(quantidadeComprada);
        verificarEstoque(quantidadeComprada);
        if(this.desconto == 0 )
        {
            return  getPrecoUnitario() * quantidadeComprada;
        }
        return getPrecoUnitario() * quantidadeComprada - (getPrecoUnitario() * this.desconto/100);
    }
}