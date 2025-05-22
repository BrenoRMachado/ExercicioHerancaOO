package SistemaDePassagens;

public class VooDomestico extends Voo{


    public VooDomestico(String origem, String destino, Float distancia, String dataDoVoo, float precoBase)
    {
        super(origem, destino, distancia, dataDoVoo, precoBase);
    }

    @Override
    public float calcularPreco() {
        return getDistancia() * getPrecoBase();
    }
}
