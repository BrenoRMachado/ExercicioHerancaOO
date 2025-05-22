package SistemaDePassagens;

public abstract class Voo {
    private String origem;
    private String destino;
    private Float distancia;
    private String dataDoVoo;
    private float precoBase;

    public Voo(String origem, String destino, Float distancia, String dataDoVoo,float precoBase)
    {
        setOrigem(origem);
        setDestino(destino);
        setDistancia(distancia);
        setDataDoVoo(dataDoVoo);
        setPrecoBase(precoBase);
    }

    public String getOrigem() {
        return this.origem;
    }
    public void setOrigem(String origem) {
        if (origem.trim().isEmpty()) {
            throw new IllegalArgumentException("Origem inválida! Está vazia.");
        }
        this.origem = origem;
    }

    public String getDestino() {
        return this.destino;
    }
    public void setDestino(String destino) {
        if (destino.trim().isEmpty()) {
            throw new IllegalArgumentException("Destino inválido! Está vazio.");
        }
        this.destino = destino;
    }

    public Float getDistancia() {
        return this.distancia;
    }
    public void setDistancia(Float distancia) {
        if(distancia <= 0)
        {
            throw new IllegalArgumentException("Distância inválida! A distância não pode ser nula ou negativa.");
        }
        this.distancia = distancia;
    }

    public String getDataDoVoo() {
        return this.dataDoVoo;
    }
    public void setDataDoVoo(String dataDoVoo) {
        if (dataDoVoo.trim().isEmpty()) {
            throw new IllegalArgumentException("Data inválida! Está vazia.");
        }
        this.dataDoVoo = dataDoVoo;
    }

    public float getPrecoBase() {
        return this.precoBase;
    }
    public void setPrecoBase(float precoBase) {
        if(precoBase <= 0)
        {
            throw new IllegalArgumentException("Preço inválido! O preço não pode ser nulo ou negativo.");
        }
        this.precoBase = precoBase;
    }

    public abstract float calcularPreco();
}
