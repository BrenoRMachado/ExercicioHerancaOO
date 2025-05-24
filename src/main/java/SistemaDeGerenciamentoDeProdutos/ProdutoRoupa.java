package SistemaDeGerenciamentoDeProdutos;

public class ProdutoRoupa extends Produto{
    private int desconto;

    public ProdutoRoupa(String nome, float precoUnitario, int quantidadeEstoque)
    {
        super(nome, precoUnitario, quantidadeEstoque);
    }

    @Override
    public float calcularPreco()
    {
        verificarQuantidadeEstoque();
        if(desconto == 0){
            return getPrecoUnitario();
        }
        return getPrecoUnitario() - (getPrecoUnitario() * (this.desconto)/100);
    }
}
