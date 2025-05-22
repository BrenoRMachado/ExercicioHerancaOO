package SistemaDePassagens;

public class VooDomestico extends Voo{

    public VooDomestico(String origem, String destino, Float distancia, String dataDoVoo)
    {
        super(origem, destino, distancia, dataDoVoo);
    }

    @Override
    public float calcularPreco() {
        return 0;
    }
}
