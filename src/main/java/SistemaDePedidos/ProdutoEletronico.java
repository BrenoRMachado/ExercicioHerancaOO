package SistemaDePedidos;

public class ProdutoEletronico extends Produto{

    public ProdutoEletronico(String nome, float precoVarejo)
    {
        super(nome,precoVarejo);
    }
    public float obterDesconto(){
        return 0.1f;
    }

    @Override
    public float calcularPreco() {
        return getPrecoBase() - calculaDesconto();
    }
}
