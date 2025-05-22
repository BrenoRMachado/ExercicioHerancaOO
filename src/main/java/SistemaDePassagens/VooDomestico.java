package SistemaDePassagens;

public class VooDomestico extends Voo{

    public VooDomestico(float origem, float destino, String dataDoVoo)
    {
        super(origem,destino,dataDoVoo);
    }

    @Override
    public float calcularPreco() {
        return getDistancia() * 100;
    }
}
