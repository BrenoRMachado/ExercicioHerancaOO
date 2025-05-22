package SistemaDePedidos;

public class ProdutoRoupa extends Produto{

    public ProdutoRoupa(String nome, float precoEtiqueta)
    {
        super(nome,precoEtiqueta);
    }

    @Override
    public float obterDesconto() {
        return 0.2f;
    }

    @Override
    public float calcularPreco() {
        return getPrecoBase() - calculaDesconto();
    }
}
