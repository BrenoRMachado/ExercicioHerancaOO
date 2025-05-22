package SistemaDePassagens;

public class VooInternacional extends Voo{

    public VooInternacional(String origem, String destino, Float distancia, String dataDoVoo)
    {
        super(origem, destino, distancia, dataDoVoo);
    }

    @Override
    public float calcularPreco() {
        return 0;
    }
}
