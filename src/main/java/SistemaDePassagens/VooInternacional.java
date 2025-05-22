package SistemaDePassagens;

public class VooInternacional extends Voo {

    public VooInternacional(String origem, float distancia, String destino, String dataDoVoo)
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
        return 0;
    }
}
