package SistemaDeGerenciamentoDeProdutos;

public abstract class ProdutoEstoqueInteiro extends Produto{

    public ProdutoEstoqueInteiro(String nome, double precoUnitario, double quantidadeEstoque)
    {
        super(nome, precoUnitario, quantidadeEstoque);
        verificarTipoEstoque();
    }

    public void verificarTipoEstoque()
    {
        if( getQuantidadeEstoque() % 1 != 0)
        {
            throw new IllegalArgumentException("A quantidade em estoque deve ser um numero inteiro!");
        }

    }
    public void verificarTipoCompra(double quantidadeComprada)
    {
        if(quantidadeComprada % 1 != 0)
        {
            throw new IllegalArgumentException("É necessário comprar uma quantidade inteira de itens.");
        }

    }

    public void verificarQuantidadeComprada(double quantidadeComprada)
    {
        if (quantidadeComprada <= 0) {
            throw new IllegalArgumentException("Quantidade deve ser positiva!");
        }
    }

    public void verificarQuantidades(double quantidadeComprada)
    {
        verificarTipoCompra(quantidadeComprada);
        verificarQuantidadeComprada(quantidadeComprada);
    }
}
