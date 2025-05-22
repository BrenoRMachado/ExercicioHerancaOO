package SistemaDePedidos;

public class ProdutoLivro extends Produto{

    public ProdutoLivro(String nome, float precoCapa)
    {
        super(nome,precoCapa);
    }

    @Override
    public float obterDesconto() {
        return 0.05f;
    }

    @Override
    public float calcularPreco() {
        return getPrecoBase() - calculaDesconto();
    }
}
