package SistemaDePassagens;

public abstract class Voo {
    private float origem;
    private float distancia;
    private float destino;
    private String dataDoVoo;

    public Voo(float origem, float distancia, float destino, String dataDoVoo)
    {
        setOrigem(origem);
        setDistancia(distancia);
        setDestino(destino);
        setDataDoVoo(dataDoVoo);
    }

    public float getOrigem() {
        return this.origem;
    }
    public void setOrigem(float origem) {
        if (origem <= 0) {
            throw new IllegalArgumentException("A Origem não pode ser nula ou negativa!");
        }
        this.origem = origem;
    }

    public float getDistancia() {
        return this.distancia;
    }
    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }

    public float getDestino() {
        return this.destino;
    }
    public void setDestino(float destino) {
        if (destino <= 0) {
            throw new IllegalArgumentException("O Destino não pode ser nulo ou negativo!");
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


    //preciso configurar
    public void definirDistancia()
    {
        this.distancia = 0;
    }
    public abstract float calcularDistancia();
    public abstract float calcularPreco();

}
