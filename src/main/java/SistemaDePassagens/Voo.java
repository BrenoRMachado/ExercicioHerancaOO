package SistemaDePassagens;

public abstract class Voo {
    private String origem;
    private float distancia;
    private String destino;
    private String dataDoVoo;

    public Voo(String origem, float distancia, String destino, String dataDoVoo)
    {
        setOrigem(origem);
        setDistancia(distancia);
        setDestino(destino);
        setDataDoVoo(dataDoVoo);
    }

    public String getOrigem() {
        return this.origem;
    }

    public void setOrigem(String origem) {
        if (origem.trim().isEmpty()) {
            throw new IllegalArgumentException("A Origem não pode ser nula!");
        }
        this.origem = origem;
    }

    public float getDistancia() {
        return this.distancia;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }

    public String getDestino() {
        return this.destino;
    }

    public void setDestino(String destino) {
        if (destino.trim().isEmpty()) {
            throw new IllegalArgumentException("O Destino não pode ser nulo!");
        }
        this.destino = destino;
    }

    public String getDataDoVoo() {
        return this.dataDoVoo;
    }

    public void setDataDoVoo(String dataDoVoo) {
        if (dataDoVoo.trim().isEmpty()) {
            throw new IllegalArgumentException("A Data do voo não pode ser nula!");
        }
        this.dataDoVoo = dataDoVoo;
    }

    public void definirDistancia()
    {
        this.distancia = 0;
    }
    public abstract float calcularDistancia();
    public abstract float calcularPreco();

}
