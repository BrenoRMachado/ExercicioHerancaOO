package SistemaDePassagens;

public class VooInternacional extends Voo{
    private float taxaDeConversao;

    public VooInternacional(String origem, String destino, Float distancia, String dataDoVoo, float precoBase)
    {
        super(origem, destino, distancia, dataDoVoo, precoBase);
        this.taxaDeConversao = 0;
    }

    public float getTaxaDeConversao() {
        return this.taxaDeConversao;
    }

    public void setTaxaDeConversao(float taxaDeConversao) {
        if(taxaDeConversao <= 0)
        {
            throw new IllegalArgumentException("Taxa de conversão inválida! A taxa de conversão não pode ser nula ou negativa.");
        }
        this.taxaDeConversao = taxaDeConversao;
    }

    @Override
    public float calcularPreco() {
        return getDistancia() * getPrecoBase() + this.taxaDeConversao;
    }
}
