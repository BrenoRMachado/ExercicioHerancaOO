package SistemaDePassagens;

public class VooInternacional extends Voo {

    public VooInternacional(float origem, float destino, String dataDoVoo)
    {
        super(origem,destino,dataDoVoo);
    }

    @Override
    public float calcularPreco() {
        return 0;
    }
}
