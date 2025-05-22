package SistemaDePassagens;

public class VooDomestico extends Voo{

    public VooDomestico(String origem, float distancia, String destino, String dataDoVoo)
    {
        super(origem,distancia,destino,dataDoVoo);
    }

    @Override
    public float calcularDistancia()
    {
        return 0;
    }

    @Override
    public float calcularPreco() {
        return 100;
    }
}
